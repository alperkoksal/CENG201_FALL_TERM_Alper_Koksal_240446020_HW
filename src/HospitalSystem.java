import java.util.HashMap;

public class HospitalSystem {
    private PatientList patientList;
    private TreatmentQueue treatmentQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientMap;


    public HospitalSystem(){
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }


    public void addPatient(Patient patient){
        patientList.addPatient(patient);
        patientMap.put(patient.id,patient);


    }

    public void addTreatmentRequest(int patientid, boolean acil) {
        treatmentQueue.enqueue(new TreatmentRequest(patientid, acil));


    }

    public void processTreatment(){
        TreatmentRequest request = treatmentQueue.dequeue();
        if(request!=null){
            dischargeStack.push(new DischargeRecord(request.patientid));
        }



    }

    public void printSystemState(){
        System.out.println("Patients: ");
        patientList.printList();
        System.out.println("Treatment Queue: ");
        treatmentQueue.printQueue();
        System.out.println("Discharge Stack: ");
        dischargeStack.printStack();
    }
}
