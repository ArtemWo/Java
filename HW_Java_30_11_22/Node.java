package HW_Java.HW_Java_30_11_22;

public class Node<Type> {
    private Type data;
    private Node<Type> nextElement;

    public Node(Type data) {
        this.data = data;
    }

    public Type getData() {
        return data;
    }

    public void setData(Type data) {
        this.data = data;
    }

    public Node<Type> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<Type> nextElement) {
        this.nextElement = nextElement;
    }


    @Override
    public String toString() {
        return "Node " +
                " data= " + data +
                "| nextElement = " + nextElement;
    }
}


