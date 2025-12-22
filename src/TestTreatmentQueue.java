public class TestTreatmentQueue {
    public static void main(String[] args) {


        TreatmentQueue queue = new TreatmentQueue();

        queue.enqueue(new TreatmentRequest(990,true));
        queue.enqueue(new TreatmentRequest(991,false));
        queue.enqueue(new TreatmentRequest(992,false));
        queue.enqueue(new TreatmentRequest(993,false));
        queue.enqueue(new TreatmentRequest(994,false));
        queue.enqueue(new TreatmentRequest(995,true));
        queue.enqueue(new TreatmentRequest(996,true));
        queue.enqueue(new TreatmentRequest(997,false));

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

    }
}
