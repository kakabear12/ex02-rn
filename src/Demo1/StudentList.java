/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Xqy
 */
public class StudentList extends TreeSet<Student>{
    Scanner sc = new Scanner(System.in);
    public StudentList(){
        super();
    }
    public void addStudent(){
        Student st = new Student();
        Student rs;
        do { 
            st.input();
            rs = this.search(st.getID());
            if(rs != null )
                System.out.println("Id existed. Retype!");
        } while (rs != null);
        if(this.add(st)==true)
            System.out.println("Added!");
        else 
            System.out.println("Add failde!");
    }
    public Student search(String ID){
        return this.ceiling(new Student(ID));
    }
    public void output(){
        Iterator it = this.iterator();
        while (it.hasNext()) {            
            System.out.println(it.next());
        }
    }
    public void update(){
        String id;
        System.out.println("Input your id which be update");
        id = sc.nextLine();
        Student rs = this.search(id);
        if(rs == null) System.out.println("Not found");
        else {
            rs.input();
            System.out.println("Student"+ id +" was updated!");
        }
    }
    public void remove(){
        String id;
        System.out.println("Input your id which be remove");
        id = sc.nextLine();
        Student rs = this.search(id);
        if(rs == null) System.out.println("Not found");
        else {
            this.remove(rs);
            System.out.println("Student"+ id +" was removed!");
        }
    }
}
