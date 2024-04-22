package chapter.quiz.tree.BinarySearchTree;

import chapter.quiz.queue.linkedlist.LinkedListQueue;

public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 너비 우선 탐색
     * 큐를 이용하여 탐색
     */
    public void bfs(Node root) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(root);

        while (!queue.empty()) {
            Node node = (Node) queue.dequeue();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }

            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }

    }

    /**
     * 재귀 함수를 사용하는 방법
     */
    public Node search(Node node, int value) {
        // 같을때
        if (node == null) {
            return null;
        } else if (node.getValue() == value) {
            return node;
        // 클때(왼)
        } else if (node.getValue() > value) {
            return search(node.getLeftChild(), value);
        // 작을때(오)
        } else {
            return search(node.getRightChild(), value);
        }
    }


    /**
     * 반복문을 사용하는 방법
     */
    public Node search(int value) {
        if (this.root == null) {
            return null;
        }

        Node target = this.root;
        while (target != null && target.getValue() != value) {;
            if (target.getValue() > value) {
                target = target.getLeftChild();
            } else {
                target = target.getRightChild();
            }
        }
        return target;
    }

    /**
     * 삽입
     * 1. 루트가 null인 경우
     * 2. 삽입 할 값이 루트보다 작은 경우
     * 3. 삽입 할 값이 루트보다 클 경우
     * -> 삽입 할 위치를 구한 다음 target이 null이면 삽입 할 위치이므로 부모의 노드에서 target을 연결한다.
     * @param value
     */
    public void insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            return;
        }


        // 두개의 포인터
        Node target = this.root;

        // target의 부모를 parent 포인터로 사용함
        // 그리고 root 의 부모는 null 이기도 함
        Node parent = null;


        while (target != null) {
            // 현재의 타겟 포인터를 parent 대입
            parent = target;

            //! 중복 체크
            if (value == target.getValue()) {
                System.out.println(String.format("%s는(은) 중복된 값입니다. 삽입을 중단합니다.", value));
                break;
            }

            //! 입력값이 더 작을때, 타겟의 왼쪽으로 배치
            if (value < target.getValue()) {
                // 타겟의 왼쪽 노드를 타겟으로 지정
                // 이때 parent의 target의 부모 노드
                target = target.getLeftChild();

                // 타겟이 null이면 parent의 읜쪽에 새로운 노드 생성
                if (target == null) {
                    parent.setLeftChild(new Node(value));
                }

            //! 입력값이 더 클때, 타켓의 오른쪽으로 배치
            } else {
                // 타겟의 오른쪽 노드를 타겟으로 지정
                // 이때 parent의 target의 부모 노드
                target = target.getRightChild();

                // 타겟이 null이면 parent의 오른쪽에 새로운 노드 생성
                if (target == null) {
                    parent.setRightChild(new Node(value));
                }
            }
        }
    }

    /**
     * 최소값 노드 찾기
     */
    public Node getMinimumNode(Node node) {
        if (node == null) {
            return null;
        }

        if (node.getLeftChild() != null) {
            return getMinimumNode(node.getLeftChild());
        }

        return node;
    }

    /**
     *
     * @param root 기준 노드
     * @param deleteValue 삭제할 값
     * @return 삭제할 노드의 자식 노드 또는 기준 노드를 리턴한다, 재귀적 특정
     */
    public Node delete(Node root, int deleteValue) {
        // 기저조건
        if (root == null) {
            return null;
        }

        // * 삭제할 값 찾았을때
        if (root.getValue() == deleteValue) {

            // 자식 노드가 없음
            if (root.getLeftChild() == null && root.getRightChild() == null) {
                root = null;
                return null;


            // 왼쪽 자식 노드만 있음
            } else if(root.getLeftChild() != null && root.getRightChild() == null) {
                // 삭제할 노드의 왼쪽 자식 노드를 꺼내둠
                Node left = root.getLeftChild();
                root = null;
                //! 삭제할 노드의 자식 노드 리턴
                return left;


            // 오른쪽 자식 노드만 있음
            } else if(root.getLeftChild() == null && root.getRightChild() != null) {
                Node right = root.getRightChild();
                root = null;
                //! 삭제할 노드의 자식 노드 리턴
                return right;


            // 자식 노드가 2개 있음
            } else {
                Node children = getMinimumNode(root.getRightChild());
                //! 여기서 루트의 값을 바꿧으니까
                //! 아래의 조건중 왼쪽의 경우로 걸리게될거다
                //! "99 > 94" 조건이 될거다 (94 삭제 로직시)
                root.setValue(children.getValue());

                Node deleteNode = delete(root.getRightChild(), children.getValue());
                // 오른쪽 날개 재귀
                root.setRightChild(deleteNode);

            }
        }


        // * 현재 노드가 삭제할값보다 클때
        if (root.getValue() > deleteValue) {
            // 왼쪽 자식에 배치
            Node deleteNode = delete(root.getLeftChild(), deleteValue);
            // 왼쪽 날개 재귀
            root.setLeftChild(deleteNode);

        // * 현재 노드가 삭제할값보다 작을때
        } else {
            // 오른쪽 자식에 배치
            Node deleteNode = delete(root.getRightChild(), deleteValue);
            // 오른쪽 날개 재귀
            root.setRightChild(deleteNode);
        }

        //? 기준 노드를 리턴
        return root;

    }

}




















