 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricsevaluation;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author abdullah
 */
public class Assessment {
    private List<Question> questions;
    private int totalMarks;

    public Assessment() {
    }

    public Assessment(List<Question> questions, int totalMarks) {
        this.questions = questions;
        this.totalMarks = totalMarks;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    
    
}
