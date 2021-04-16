/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricsevaluation;
import java.util.ArrayList;
/**
 *
 * @author abdullah
 */
public class Student extends Person {
    private String registrationNumber;
    private String fatherName;
    private ArrayList<Assessment> attemptedTest;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public Student(String registrationNumber, String fatherName, String name, String email, String cnic) {
        super(name, email, cnic);
        this.registrationNumber = registrationNumber;
        this.fatherName = fatherName;
    }

    public ArrayList<Assessment> getAttemptedTest() {
        return attemptedTest;
    }

    public void setAttemptedTest(ArrayList<Assessment> attemptedTest) {
        this.attemptedTest = attemptedTest;
    }

}
