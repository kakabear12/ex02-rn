/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo1;


/**
 *
 * @author Xqy
 */
public class StudentMng2 {
    public static void main(String[] args) {
        Menu mnu = new Menu();
        mnu.add("Add new student");
        mnu.add("Remove a student");
        mnu.add("Update a student");
        mnu.add("List all student");
        mnu.add("Quit");
        //Init linked list of clocks
        StudentList list = new StudentList();
        int userChoice ;
        do{
            userChoice = mnu.getUserChoice();
            switch(userChoice){
                case 1: list.addStudent();break;
                case 2: list.remove();break;
                case 3: list.update();break;
                case 4: list.output();break;
            }
        }
        while (userChoice >= 0 && userChoice < 5);
    }
}
