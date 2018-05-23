/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoryExemple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1795850
 */
public class Professor extends Person {

    List<Student> Students = new ArrayList<Student>();
    String photoUrl;

    public Professor(String lastName, String firstName) {
        String employeeId = lastName.toUpperCase().trim().substring(1, 3) + firstName.toUpperCase().trim().substring(1, 3);
        System.out.println("New Prefessor :  " + employeeId);

    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = "/photos/professors/mad/"+photoUrl;
    }
 
}
