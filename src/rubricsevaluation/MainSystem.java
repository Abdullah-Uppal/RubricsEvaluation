/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricsevaluation;

import java.util.ArrayList;
import com.google.gson.*;
import java.io.*;


/**
 *
 * @author abdullah
 */
public class MainSystem {
    private transient static MainSystem instance = null;
    private transient Teacher teacher = new Teacher("Samyan Wahla", "samyan@uet.edu.pk", "35200-0000000-0");
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private MainSystem() {
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Course>();
    }
    public static MainSystem getInstance() {
        if (MainSystem.instance == null) {
            MainSystem.instance = new MainSystem();
        }
        return MainSystem.instance;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    public void addCourse(Course course) {
        for (int i = 0; i<this.courses.size(); i++) {
            if (this.courses.get(i).getId().equals(course.getId())) {
                return;
            }
        }
        this.courses.add(course);   
    }
    public void addStudent(Student student) {
        for (int i = 0; i<this.students.size(); i++) {
            if (this.students.get(i).getCnic().equals(student.getCnic())) {
                return;
            }
        }
        this.students.add(student);
    }
    public void deleteStudent(String registrationNumber) {
        for (int i = 0; i<this.students.size(); i++) {
            if (this.students.get(i).getRegistrationNumber().equals(registrationNumber)) {
                this.students.remove(i);
                return;
            }
        }
    }
    public void saveData() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter f = new FileWriter("data.json");
            gson.toJson(MainSystem.getInstance(), f);
            f.close();
        }
        catch (IOException e) {
            System.out.println("Failed to save data!");
        }
    }
    public void loadData() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("data.json")
            );
            MainSystem.instance =(new Gson()).fromJson(reader, MainSystem.class);
            reader.close();
            
        }
        catch (IOException e) {}
        
    }

//    public MainSystem(ArrayList<Student> students, ArrayList<Course> courses) {
//        this.students = students;
//        this.courses = courses;
//    }
}
