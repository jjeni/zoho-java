package Assignment5;

import java.sql.Date;

class MedicalRecord{
    int recordId;
    String patientName;
    Date dateOfVisit;
    String diagnosis;

    void inputRecordDetails(int recordId, String patientName, Date dateOfVisit, String diagnosis){
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }

    void displayRecord(){
        System.out.println("Record ID : "+recordId);
        System.out.println("Name of the Patient : "+patientName);
        System.out.println("Date of Visit : "+dateOfVisit);
        System.out.println("Diagnosis Name : "+diagnosis);
    }
}

class InPatientRecord extends MedicalRecord{
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;

    
    void inputRecordDetails(int recordId, String patientName, Date dateOfVisit, String diagnosis, int roomNumber, int numberOfDaysAdmitted, double roomCharges) {
    
        super.inputRecordDetails(recordId, patientName, dateOfVisit, diagnosis);
        this.roomNumber = roomNumber;
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
        this.roomCharges = roomCharges;
    }

    double calculateTotalCharges(){
        return this.numberOfDaysAdmitted * this.roomCharges;
    }

    @Override
    void displayRecord(){
        System.out.println("--- InPatient Record ---");
        super.displayRecord();
        System.out.println("Room Number : "+roomNumber);
        System.out.println("Number of days Admitted : "+ numberOfDaysAdmitted);
        System.out.println("Room Charges of One day : "+ roomCharges);
        System.out.println("Total Charges : "+ this.calculateTotalCharges());
    }
}

class OutPatientRecord extends MedicalRecord {
    String doctorName;
    double consultationFee;

    void inputRecordDetails(int recordId, String patientName, Date dateOfVisit, String diagnosis, String doctorName, double consultationFee) {
        super.inputRecordDetails(recordId, patientName, dateOfVisit, diagnosis);
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    @Override
    void displayRecord() {
        System.out.println("--- OutPatient Record ---");
        super.displayRecord();
        System.out.println("Doctor Name : " + doctorName);
        System.out.println("Consultation Fee : " + consultationFee);
    }
}

public class Q1 {
    public static void main(String[] args) {
        MedicalRecord[] records = new MedicalRecord[4];
        records[0] = new InPatientRecord();
        records[1] = new OutPatientRecord();
        records[2] = new OutPatientRecord();
        records[3] = new InPatientRecord();

        ((InPatientRecord) records[0]).inputRecordDetails(101, "Jeni", new java.sql.Date(System.currentTimeMillis()), "Fever", 201, 4, 1000.0);
        ((OutPatientRecord) records[1]).inputRecordDetails(102, "Ravi", new java.sql.Date(System.currentTimeMillis()), "Cold", "Dr. Kumar", 300.0);
        ((OutPatientRecord) records[2]).inputRecordDetails(103, "Anu", new java.sql.Date(System.currentTimeMillis()), "Headache", "Dr. Meena", 400.0);
        ((InPatientRecord) records[3]).inputRecordDetails(104, "Raj", new java.sql.Date(System.currentTimeMillis()), "Injury", 105, 5, 1500.0);

        for(int i=0; i<records.length; i++){
            System.out.println("\n ------ Record "+ (i+1) + " ------");
            records[i].displayRecord();
        }
    }
}