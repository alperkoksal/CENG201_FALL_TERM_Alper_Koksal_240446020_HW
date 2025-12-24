public class PatientList  {

    public class Node{
        Patient info;
        Node next;

        Node(Patient p){
            this.info = p;
            this.next = null;
        }

    }
     private Node head = null;

    public void addPatient(Patient p){
        Node newNode = new Node(p);

        if (head == null) {
            head = newNode;
            System.out.println("Patient added successfully");
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;


        }
        current.next = newNode;
        System.out.println("Patient added successfully");


    }
    public void removePatient(int id){
        if (head == null){
            System.out.println("Patient list is empty");
            return;
        }
        if(head.info.id == id){
            head = head.next;
            System.out.println("Patient with ID " + id + "Removed.");
            return;
        }
    Node current = head;
    Node previous = null;

    while (current != null && current.info.id !=id){
        previous = current;
        current = current.next;

    }
        if ( current == null){
            System.out.println("Patient with ID "+ id+"is not exist.");
            return;
    }
    previous.next = current.next;
    System.out.println("Patient with ID "+ id+ " removed");
    }
    public Patient findPatient(int id){   //I couldn’t manage to return the message directly, so I printed it in the Main class
        Node current = head;

        while (current != null){
            if(current.info != null && current.info.id == id){
                return  current.info;
            }
            current = current.next;
        }
        return null;

    }
    public void printList(){
        if (head == null) {
            System.out.println("List is empty ");
        }
        Node current = head;
        while (current != null){
            System.out.println(current.info);
            current = current.next;
        }
    }

    public void sortBySeverity(){

        if(head==null){
            return;

        }
        boolean swapped;

        do{
            swapped = false;
            Node current = head;

            while (current.next!=null){
                if (current.info.severity < current.next.info.severity){
                    Patient temp =current.info;
                    current.info = current.next.info;
                    current.next.info=temp;
                    swapped = true;

                }
                current=current.next;
            }
        }while (swapped);

    }
}
