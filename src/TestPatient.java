public class TestPatient {
        public static void main(String[] args) {
        PatientList patient1 = new PatientList();


        Patient p1 = new Patient(990,"Hasan",5,22);
        Patient p2 = new Patient(991,"Kemal",8,21);
        Patient p3 = new Patient(992,"Efe",3,23);
        Patient p4 = new Patient(993,"Babi",4,76);
        Patient p5 = new Patient(994,"Fikret",6,19);

        patient1.addPatient(p1);
        patient1.addPatient(p2);
        patient1.addPatient(p3);
        patient1.addPatient(p4);
        patient1.addPatient(p5);

        System.out.println(); //I add these to create spacing in between

        patient1.removePatient(125);

        System.out.println();

        System.out.println(patient1.findPatient(127));

        System.out.println();
        System.out.println("Before:  ");
        patient1.printList();

        patient1.sortBySeverity();
        System.out.println("After sorting:");
        patient1.printList();

    }

}