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
    private ArrayList<String> enrolledCourses;

    @Override
    public String toString() {
        return "Student{" + "registrationNumber=" + registrationNumber + ", fatherName=" + fatherName + ", attemptedTest=" + attemptedTest + ", enrolledCourses=" + enrolledCourses + '}';
    }

    public Student(String registrationNumber, String fatherName, ArrayList<Assessment> attemptedTest, ArrayList<String> enrolledCourses, String name, String email, String cnic) {
        super(name, email, cnic);
        this.registrationNumber = registrationNumber;
        this.fatherName = fatherName;
        this.attemptedTest = attemptedTest;
        this.enrolledCourses = enrolledCourses;
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    

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
        this.attemptedTest = new ArrayList<Assessment>();
        this.enrolledCourses = new ArrayList<String>();
    }

    public ArrayList<Assessment> getAttemptedTest() {
        return attemptedTest;
    }

    public void setAttemptedTest(ArrayList<Assessment> attemptedTest) {
        this.attemptedTest = attemptedTest;
    }

    public boolean isEnrolled(String courseId) {
        return this.enrolledCourses.contains(courseId);
    }
}
