package test;

import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        // Instrument a = new Instrument();
        // Instrument b = new Instrument("Piano", 200.0);
        // Instrument c = new Instrument("Violin", 150.9);

        // // a.setType("Guitar");
        // // a.setPrice(101.5);
        // a.print();
        // b.print();
        // c.print();
        
        Scanner input = new Scanner(System.in);

        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c= new Instrument("Violin", 150.9);

        a.setType("Gitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Instrument termahal adalah " + a.getType());
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Instrument termahal adalah " + b.getType());
        } else if (c.getPrice() > a.getPrice() && c.getPrice() > b.getPrice()) {
            System.out.println("Instrument termahal adalah " + c.getType());
    
        }
        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Instrument termurah adalah " + a.getType());}
        else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Instrument termurah adalah " + b.getType());
        } else if (c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()) {
            System.out.println("Instrument termurah adalah " + c.getType());
        }
            
    }
}
    

