import java.util.*;

class Hospital {
    private String HospitalName;

    public Hospital(String hospitalName) {
        HospitalName = hospitalName;
    }

    public void displayDetails() {
        System.out.println("Hospital Name : " + HospitalName);
    }

    class Doctor {
        private String DoctorName;
        private List<Patient> patientList;

        public Doctor(String doctorName) {
            DoctorName = doctorName;
            this.patientList = new ArrayList<>();
        }

        public void addPatients(Patient patient) {
            patientList.add(patient);
        }

        public String getDoctorName() {
            return DoctorName;
        }

        public void consult() {
            System.out.println("Doctor name : " + DoctorName);
            for (Patient patient : patientList){
                System.out.println("Patient List :" + patient.getPatientname());
            }
        }


    }

    class Patient {
        private String patientname;
        public List<Doctor> doctorList;

        public Patient(String patientname) {
            this.patientname = patientname;
            this.doctorList = new ArrayList<>();
        }

        public void addDoctor(Doctor doctor) {
            doctorList.add(doctor);
            doctor.addPatients(this);
        }

        public String getPatientname() {
            return patientname;
        }
    }
}
public class HospitalandPatient {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("SRM Hospital");

        Hospital.Doctor doctor1 = hospital1.new Doctor("Dr. Anne");
        Hospital.Doctor doctor2 = hospital1.new Doctor("Dr. Bob");

        Hospital.Patient patient1 = hospital1.new Patient("Arpit");
        Hospital.Patient patient2 =hospital1.new Patient("Murali");

        doctor1.addPatients(patient1);
        doctor2.addPatients(patient1);
        doctor2.addPatients(patient2);

        doctor1.consult();
        System.out.println();
        doctor2.consult();
    }
}

