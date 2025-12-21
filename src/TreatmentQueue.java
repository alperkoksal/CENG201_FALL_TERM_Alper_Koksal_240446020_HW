public class TreatmentQueue {
    private class  Node{
        TreatmentRequest data;
        Node next;

        public Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public TreatmentQueue(){
        front = rear = null;
        size =0;
    }

    public void enqueue(TreatmentRequest request){
        Node newNode = new Node(request);

        if(rear == null){
            front =  newNode;
            rear= newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }
    public TreatmentRequest dequeue(){
        if (front == null){
            return null;
        }
        TreatmentRequest removed = front.data; // Burada chatgpt kullandım çünkü "front = front.next;
        // " yapmaya çalıştığımda return edecek bir şey olmadığı için hata alıyorum Çözüm olarak değişkene atamamam gerekmiş
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

    public int size() {
        return size;
    }


    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
