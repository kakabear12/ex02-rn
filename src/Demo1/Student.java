/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo1;
import java.lang.Comparable;
import java.util.Scanner;

/**
 *
 * @author Xqy
 */
public class Student implements Comparable{
    String ID="";
    String name = "";
    int mark=0;
    Scanner sc = new Scanner(System.in);
    public  Student(){
    }

    public Student(String ID) {
        this.ID = ID;
    }

    public Student(String ID, String name, int mark) {
        this.ID= ID; this.name= name; this.mark =mark;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public void input(){
        sc = new Scanner(System.in);
        System.out.println("Id: ");
        ID = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Mark: ");
        mark  = Integer.parseInt(sc.nextLine());
    }
    
    @Override
    public int compareTo(Object t) {
        return ID.compareTo(((Student)t).ID);
    }

    @Override
    public String toString() {
        return ID+", "+ name+", "+mark;
    }
}
