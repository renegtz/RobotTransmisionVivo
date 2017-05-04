/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botpeliculas;

import java.awt.Color;

/**
 *
 * @author rene
 */
public class tiempo implements Runnable {

    public static boolean paso = false;

    @Override
    public void run() {
        int segundos = 0;
        paso = false;
//        while (segundos <= 7200) {
            try {
                Thread.sleep(7200000);
                segundos = segundos + 1;
                System.out.println("" + segundos +"  "+paso);
            } catch (Exception e) {
            }
//        }
        paso = true;

    }

}
