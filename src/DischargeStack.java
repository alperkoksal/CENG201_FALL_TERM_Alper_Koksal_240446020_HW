public class DischargeStack {
    private class Node{
        DischargeRecord data;
        Node next;

        public Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    private int size;

    public DischargeStack(){
        top =null;
        size =0;

    }

    public void push(DischargeRecord record){
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        size++;


    }
    public DischargeRecord pop(){
        if (top == null){
            return null;
        }
        DischargeRecord deleted = top.data;
        top = top.next;
        size--;
        return deleted;

    }
    public DischargeRecord peek(){
        if (top ==null){
            return null;
        }
        return top.data;
    }

    public int size(){
        return size;
    }
    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
