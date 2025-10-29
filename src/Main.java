public class Main {
    public static void main(String[] args) {
        PatientList patient1 = new PatientList();

        Patient p1 = new Patient(123,"Fırat",5,22);
        Patient p2 = new Patient(124,"Eren",8,21);
        Patient p3 = new Patient(125,"Furkan",3,23);
        Patient p4 = new Patient(126,"Gizem",4,30);
        Patient p5 = new Patient(127,"Aynur",6,19);

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
        patient1.printList();


    }

}