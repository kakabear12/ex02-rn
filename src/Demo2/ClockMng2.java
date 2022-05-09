/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

/**
 *
 * @author Xqy
 */
public class ClockMng2 {
    public static void main(String[] args) {
        Menu mnu = new Menu();
        mnu.add("Add new Clock");
        mnu.add("Remove a Clock");
        mnu.add("Update a Clock");
        mnu.add("Search a Clock ");
        mnu.add("List all Clock");
        mnu.add("Quit");
        //Init linked list of clocks
        ClockList list = new ClockList();
        Clock st = new Clock("", "", 0);
        int userChoice ;
        do{
            userChoice = mnu.getUserChoice();
            switch(userChoice){
                case 1: list.add(st);break;
                case 2: list.remove(st);break;
                case 3: break;
                case 4: break;
                case 5: list.output();break;
            }
        }
        while (userChoice >= 0 && userChoice < 6);
    }
}
