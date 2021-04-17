/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricsevaluation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abdullah
 */
public class Course {
    private String title;
    private String id;
    private  List<String> clos;
    Course (String title, String id, List<String> clos) {
        this.title = title;
        this.id = id;
        this.clos = clos;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getClos() {
        return clos;
    }

    public void setClos(List<String> clos) {
        this.clos = clos;
    }  
}
