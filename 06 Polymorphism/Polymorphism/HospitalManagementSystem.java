import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

interface MedicalRecord {
    void addRecord(String diagnosis);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, double roomCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomCharges + (medicalHistory.size() * 500);
    }

    @Override
    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee + (medicalHistory.size() * 300);
    }

    @Override
    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("IP001", "John Doe", 35, 3000);
        inPatient.addRecord("Diabetes");
        inPatient.addRecord("Hypertension");
        patients.add(inPatient);

        OutPatient outPatient = new OutPatient("OP002", "Jane Smith", 28, 500);
        outPatient.addRecord("Flu");
        patients.add(outPatient);

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Medical Records: " + ((MedicalRecord) patient).viewRecords());
            System.out.println("Billing Amount: $" + patient.calculateBill());
            System.out.println();
        }
    }
}