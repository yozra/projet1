/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoryExemple;


import java.util.Date;

/**
 *
 * @author 1795850
 */
public class Student extends Person {
    String student_id;
    String LastName;
    String FirstName;
 Date dateBirth;
    public Student(String LastName, String FirstName, Date dateBirth) {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.dateBirth = dateBirth;
        this.student_id=createStudentId(LastName,FirstName,dateBirth);
    }

    private String createStudentId(String LastName, String FirstName, Date dateBirth) {
        String end=concatDate(dateBirth);
        return LastName.substring(0,3)+FirstName.charAt(0)+end;
    }
   private String concatDate(Date date){
   return date.getYear()+"-"+date.getMonth();
   }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    public void isSupervisedBy(Professor professor){
    
    professor.Students.add(this);
    }
    
}
