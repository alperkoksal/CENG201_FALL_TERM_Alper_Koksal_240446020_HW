public class TestTreatmentQueue {
    public static void main(String[] args) {


        TreatmentQueue queue = new TreatmentQueue();

        queue.enqueue(new TreatmentRequest(990));
        queue.enqueue(new TreatmentRequest(991));
        queue.enqueue(new TreatmentRequest(992));
        queue.enqueue(new TreatmentRequest(993));
        queue.enqueue(new TreatmentRequest(994));
        queue.enqueue(new TreatmentRequest(995));
        queue.enqueue(new TreatmentRequest(996));
        queue.enqueue(new TreatmentRequest(997));

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

    }
}
