public class TreatmentQueue {
        private class  Node{
            TreatmentRequest data;
            Node next;

            Node(TreatmentRequest data){
                this.data = data;
                this.next = null;

            }


        }
        private int acilSize;
        private int normalSize;
        private  Node normalFront , normalRear;
        private Node acilFront, acilRear;

        public TreatmentQueue(){
            acilFront= acilRear = null;
            normalFront =normalRear = null;
            acilSize =0;
            normalSize =0;
        }

        public void enqueue(TreatmentRequest request){
            Node newNode =new Node(request);

            if ( request.priority){
                if(acilRear ==null){
                    acilFront=acilRear=newNode;
                }
                else{
                    acilRear.next = newNode;
                    acilRear = newNode;
                }
                acilSize++;

            }
            else{
                if(normalRear==null){
                    normalFront=normalRear=newNode;

                }
                else{
                    normalRear.next=newNode;
                    normalRear = newNode;
                }
                normalSize++;
            }
        }

        public TreatmentRequest dequeue(){
            if (acilFront != null){
                TreatmentRequest removed= acilFront.data;
                acilFront= acilFront.next;

                if (acilFront==null){
                    acilRear=null;
                }
                acilSize--;
                return removed;
            }
            if (normalFront != null) {
                TreatmentRequest removed = normalFront.data;
                normalFront = normalFront.next;

                if (normalFront == null) {
                    normalRear = null;
                }

                normalSize--;
                return removed;
            }

            return null;

        }





    public int acilSize() {
        System.out.println("Acil size: ");
        return acilSize;
    }
    public int normalSize() {
        System.out.println("Normal size: ");
        return normalSize;
    }
    public int totalSize() {
        System.out.println("Total size: ");
        return acilSize + normalSize;

    }


    public void printQueue() {
        Node temp = acilFront;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        temp = normalFront;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}





