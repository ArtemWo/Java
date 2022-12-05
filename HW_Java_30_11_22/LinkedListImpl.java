package HW_Java.HW_Java_30_11_22;

class LinkedListImpl<Type> {
    private int size;
    private Node<Type> head;
    private Node<Type> tail;

    public LinkedListImpl() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean add(Type elem) {
        Node<Type> newNode = new Node<Type>(elem);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNextElement(newNode);
        }
        tail = newNode;
        size++;
        return false;

    }

    public void add(int index, Type elem) {
        Node<Type> newNode = new Node<Type>(elem);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNextElement(newNode);
        }
        tail = newNode;
        size++;
    }
    public void remove(int index) {
        Node<Type> newNode = (Node<Type>) new Node<Integer>(index);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNextElement(newNode);
        }
        tail = newNode;
        size--;
    }


        @Override
    public String toString() {
        return "LinkedListImpl " +
                "| size= " + size +
                "| head= " + head +
                "| tail= " + tail;
    }

    public void printData() {
        if (head == null) {
            System.out.println("LinkedList is empty. " + size);
        } else {
            Node<Type> currentNode = head;
            while (currentNode != null) {
                System.out.print(((Node<Type>) currentNode).getData() + " ");
                currentNode = currentNode.getNextElement();
            }
            System.out.println();
            System.out.println("============================================");
        }
    }
}


