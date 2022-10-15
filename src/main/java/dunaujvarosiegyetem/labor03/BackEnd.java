/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dunaujvarosiegyetem.labor03;

import java.util.HashMap;

/**
 *
 * @author Zsolti
 */
public class BackEnd {

    public void osszehasonlit(int a, int b) {
        if (a == b) {
            System.out.println("Megegyeznek");
        } else if (a < b) {
            System.out.println("a kisebb mint béé");
        } else if (a > b) {
            System.out.println("bééé kisebb mint áááá");
        } else {
            System.out.println("Nem egyeznek meg");
        }
    }

    public void honapNeve(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Nincs ilyen nap");
                break;
        }
    }

    public void ciklus() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Az 'i' változó értéke: " + i);
        }
    }

    public void ciklusElo(int a, int b) {
        while (a < b) {
            ++a;
            System.out.println("Az a értéke: " + a);
        }
    }

    public void ciklusHatul(int a, int b) {
        do {
            ++a;
            System.out.println("Az a értéke: " + a);
        } while (a < b);
    }
    
    public void ciklusBreak() {
        for (int i = 1; i <= 10; ++i) {
            if(i % 3 == 0)
                break;
            System.out.println("Az 'i' változó értéke: " + i);
        }
    }
}
