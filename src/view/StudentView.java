/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.Student;

public class StudentView {

    List<Student> estudiantes = new ArrayList<>();

    public String printStudentDetails() {
        String a = "";
        for (Student estudiante : estudiantes) {
            a = a + "Student: \n";
            a = a + "Name: "+estudiante.getRollNo()+" \n";
            a = a + "Roll No: "+estudiante.getName() + " \n";
            a = a + "\n";
        }
        return a;
    }

    public void agregar(String studentName, String studentRollNo) {
        Student nuevo = new Student(studentName, studentRollNo);
        estudiantes.add(nuevo);
    }

    public void delete(String studentName) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).equals(studentName)) {
                estudiantes.remove(0);
            }
        }
    }
    
     public void actualizar(String studentName,String studentNameNuevo ) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getName().equals(studentName)) {
                estudiantes.get(i).setName(studentNameNuevo);
            }
        }
    }

    public void buscar(String studentName) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).equals(studentName)) {
                System.out.println("Student: ");
                System.out.println("Name: " + estudiantes.get(i).getName());
                System.out.println("Roll No: " + estudiantes.get(i).getRollNo());
            }
        }
    }
}
