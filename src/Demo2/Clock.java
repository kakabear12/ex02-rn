/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Xqy
 */
public class Clock {
    String ID="";
    String manufacturer="";
    int price =0;
    Scanner sc = new Scanner(System.in);
    public static Comparator comparator = new Comparator(){
        @Override
        public int compare(Object t, Object t1){
            return ((Clock)t).ID.compareTo(((Clock)t1).ID);
        }
    };
    public Clock(String ID){
        this.ID=ID;
    }

    public Clock(String ID, String manu, int p) {
        this.ID = ID;
        this.manufacturer= manu;
        this.price = p;
    }

    @Override
    public String toString() {
        return ID+ ", "+ manufacturer+ ", " +price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    
    
}
