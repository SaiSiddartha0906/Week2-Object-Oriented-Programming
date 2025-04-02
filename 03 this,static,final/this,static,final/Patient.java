public class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "General Hospital";

    // Static counter to track total patients
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    // Constructor using 'this' to initialize instance variables
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = generatePatientID();
        totalPatients++;
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to get hospital name
    public static String getHospitalName() {
        return hospitalName;
    }

    // Method to set hospital name
    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    // Method to generate unique patient ID
    private String generatePatientID() {
        return "P" + (totalPatients + 1);
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Ailment: " + this.ailment);
        System.out.println("Hospital: " + hospitalName);
    }

    // Static method to display patient info with instanceof check
    public static void displayPatientInfo(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            System.out.println("\n--- Patient Information ---");
            patient.displayDetails();
        } else {
            System.out.println("Error: Object is not a Patient instance");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient("John Doe", 45, "Flu");
        Patient patient2 = new Patient("Jane Smith", 30, "Fracture");

        // Display patient details
        Patient.displayPatientInfo(patient1);
        Patient.displayPatientInfo(patient2);

        // Display total patients
        System.out.println("\nTotal patients admitted: " + Patient.getTotalPatients());

        // Try to display non-Patient object
        System.out.println("\nTrying to display non-Patient object:");
        String notPatient = "This is not a patient";
        Patient.displayPatientInfo(notPatient);

        // Change hospital name
        Patient.setHospitalName("City Medical Center");
        System.out.println("\nHospital name changed to: " + Patient.getHospitalName());

        // Display updated patient info
        Patient.displayPatientInfo(patient1);
    }
}
