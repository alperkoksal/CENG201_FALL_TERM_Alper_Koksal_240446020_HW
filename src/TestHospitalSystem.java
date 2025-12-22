public class TestHospitalSystem {
    public static void main(String[] args) {

        HospitalSystem testHospital = new HospitalSystem();


        testHospital.addPatient(new Patient(990,"Alper",9,20));
        testHospital.addPatient(new Patient(991,"Babi",6,23));
        testHospital.addPatient(new Patient(992,"Kemal",1,30));
        testHospital.addPatient(new Patient(993,"Hasan",3,50));
        testHospital.addPatient(new Patient(994,"Fikret",4,35));
        testHospital.addPatient(new Patient(995,"Efe",5,25));
        testHospital.addPatient(new Patient(996,"Mete",2,13));
        testHospital.addPatient(new Patient(997,"Azra",10,6));
        testHospital.addPatient(new Patient(998,"Aynur",10,19));
        testHospital.addPatient(new Patient(999,"Şerif",4,26));

        testHospital.addTreatmentRequest(990,true);
        testHospital.addTreatmentRequest(991,true);
        testHospital.addTreatmentRequest(992,false);
        testHospital.addTreatmentRequest(993,false);
        testHospital.addTreatmentRequest(994,false);
        testHospital.addTreatmentRequest(995,false);
        testHospital.addTreatmentRequest(996,false);
        testHospital.addTreatmentRequest(997,true);


        testHospital.processTreatment();
        testHospital.processTreatment();
        testHospital.printSystemState();


    }
}
