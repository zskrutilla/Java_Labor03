/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dunaujvarosiegyetem.labor03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Zsolti
 */
public class Labor03 {

    public static void main(String[] args) throws Exception {
        int a = 0, b = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Léccci add meg az a számot: ");
        a = scan.nextInt();
        System.out.println("Léccci add meg a b számot: ");
        b = scan.nextInt();

        BackEnd Back = new BackEnd();
//        Back.osszehasonlit(a, b);
//        Back.ciklus();
//        Back.ciklusElo(a, b);
//        Back.ciklusHatul(a, b);
        Back.ciklusBreak();

        int[] tomb = new int[10];
        ArrayList<Integer> lista = new ArrayList<>();
        int aa = 0;
        Integer bb = 110;

        //tömb feltöltés
        for (int i = 0; i < 10; ++i) {
            tomb[i] = i * 10;
        }
        //egy elem "delete"/érték módosítása
        tomb[5] = 0;
        //tömb törlése
        //tomb = null;

        //lista feltöltés
        for (int i = 0; i < 10; ++i) {
            lista.add(i * 10);
        }
        //egy elem "delete"
        lista.remove(0);
        //egy elem módosítása
        lista.set(1, bb);

        System.out.println(Arrays.toString(tomb));
        System.out.println(lista);
    }
}
