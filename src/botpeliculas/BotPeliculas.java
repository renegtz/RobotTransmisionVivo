/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botpeliculas;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 *
 * @author rene
 */
public class BotPeliculas {

//    tiempo Tiempo;
//    Thread threadTiempo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        BotPeliculas var1 = new BotPeliculas();
        robot = new Robot();
        boolean siempre = true;
//        tiempo hiloTiempo = new tiempo();

        //iniciar todo
//        var1.abrirFACEBOOK();
//        var1.minimizar();
//        var1.abrirObs();
//        var1.minimizar();
//        var1.abrirCarpetaPeliculas();
//        var1.minimizar();
//////////////
//
//        var1.abrirventanadefirefox();
//        var1.subirvideo();
//        var1.minimizar();
//        var1.abrirventanadeobs();
//        var1.configurarOBS();
//        var1.minimizar();
//        var1.abrirventanaDepeliculas();
//        var1.abrirPelicula();
//        var1.minimizar();
//        var1.cerrarventana();
//        var1.aumentarvolumen();
//////////
//        var1.abrirventanadeobs();
//        var1.iniciarTransmisionOBS();
//        var1.minimizar();
////////iniciar transmisionface
//        var1.abrirventanadefirefox();
//        var1.iniciarTransmisionFacebook();
//        var1.minimizar();
////detener transmision de OBS y cerrar todo
        while (siempre) {
            //iniciar todo
            var1.abrirFACEBOOK();
            var1.minimizar();
            var1.abrirObs();
            var1.minimizar();
            var1.abrirCarpetaPeliculas();
            var1.minimizar();
////////////

            var1.abrirventanadefirefox();
            var1.subirvideo();
            var1.minimizar();
            var1.abrirventanadeobs();
            var1.configurarOBS();
            var1.minimizar();
            var1.abrirventanaDepeliculas();
            var1.abrirPelicula();
            var1.minimizar();
            var1.cerrarventana();
            var1.aumentarvolumen();
////////
            var1.abrirventanadeobs();
            var1.iniciarTransmisionOBS();
            var1.minimizar();
//////iniciar transmisionface
            var1.abrirventanadefirefox();
            var1.iniciarTransmisionFacebook();
            var1.cerrarventana();
//            Thread threadTiempo = new Thread(hiloTiempo);
//            threadTiempo.start();
            boolean paso = false;
            int minutos = 0;
            while (paso == false) {
                System.out.println(" " + paso + " minutos " + minutos);
//                robot.delay(60000);
//            robot.delay(17200);
                minutos = minutos + 1;
                if (minutos >= 0) {
                    paso = true;

                }
            }
            System.out.println(" nueva pelicula ");
//            var1.abrirventanadefirefox();
//            var1.cerrarventana();
            var1.abrirventanadeobs();
            var1.detenerTransmisionOBS();
            var1.cerrarventana();
            var1.abrirventanaVLC();
            var1.cerrarventana2();

        }

    }
    public static Robot robot;

    public void abrirventanaVLC() {
        robot.delay(2000);

        robot.mouseMove(275, 751);
        lelfclick();
        robot.delay(9000);

    }

    public void lelfclick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void copiartexto() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_C);
        robot.delay(500);

    }

    public void abrirObs() {
        robot.delay(4000);

        robot.mouseMove(40, 275);
        dobleclick();
        robot.delay(9000);

    }

    public void dobleclick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

    }

    public void abrirCarpetaPeliculas() {
        robot.mouseMove(20, 752);
        lelfclick();
        robot.delay(4000);

        robot.mouseMove(299, 494);
        lelfclick();
        robot.delay(12000);

        robot.mouseMove(76, 442);
        lelfclick();
        robot.delay(3000);

        robot.mouseMove(268, 120);
        lelfclick();
        robot.delay(3000);

        robot.mouseMove(271, 132);
        dobleclick();
        robot.delay(3000);

        robot.mouseMove(271, 132);
        dobleclick();
        robot.delay(3000);
    }

    public void abrirPelicula() {
        robot.delay(4000);
        Random Random = new Random();
        int aleatorio = (int) (Random.nextDouble() * 11 + 1);
//        Random Random = new Random();
        int espacio = 25;
        robot.mouseMove(282, (129 + (espacio * (aleatorio - 1))));
        dobleclick();

        robot.delay(1000);
        robot.mouseMove(249, 136);
        dobleclick();
        robot.delay(10000);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.delay(3000);

    }

    public void abrirFACEBOOK() {
        robot.mouseMove(24, 747);
        lelfclick();
        robot.mouseMove(99, 397);
        lelfclick();
        robot.delay(12000);
        robot.mouseMove(153, 49);
        lelfclick();
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyRelease(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(35000);
        robot.mouseMove(870, 180);

        lelfclick();

    }

    public void subirvideo() {
        robot.delay(15000);
        robot.mouseMove(563, 141);
        lelfclick();
        robot.delay(13000);
        robot.mouseMove(74, 384);
        lelfclick();
        robot.delay(15000);
        robot.mouseMove(871, 237);
        lelfclick();
        robot.delay(15000);
        robot.mouseMove(967, 694);
        lelfclick();
        robot.delay(18000);
        robot.mouseMove(705, 514);
        dobleclick();
        lelfclick();
        copiartexto();
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void abrirventanadeobs() {
        robot.mouseMove(282, 747);
        lelfclick();

    }

    public void configurarOBS() {
        robot.delay(5000);
        robot.mouseMove(1165, 653);
        lelfclick();
        robot.delay(5000);
        robot.mouseMove(222, 119);
        lelfclick();
        robot.delay(5000);
        robot.mouseMove(749, 189);
        robot.delay(5000);
        lelfclick();
        robot.mouseMove(583, 192);
        robot.delay(5000);
        dobleclick();
        lelfclick();
        pegarTEXTO();
        robot.keyPress(KeyEvent.VK_ENTER);

    }

    public void iniciarTransmisionOBS() {
        robot.mouseMove(1199, 578);
        lelfclick();
        robot.delay(35000);

    }

    public void pegarTEXTO() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(200);
    }

    public void abrirventanadefirefox() {
        robot.mouseMove(216, 748);
        lelfclick();

    }

    public void minimizar() {
        robot.delay(3000);
        robot.mouseMove(1180, 15);
        lelfclick();
        robot.delay(3000);

    }

    public void abrirventanaDepeliculas() {
        robot.mouseMove(337, 752);
        lelfclick();
        robot.delay(3000);
    }

    public void cerrarventana() {
        robot.delay(5000);

        robot.mouseMove(1255, 17);
        lelfclick();
    }

    public void cerrarventana2() {
        robot.delay(3000);

        robot.mouseMove(1251, 8);
        lelfclick();
        dobleclick();
    }

    public void aumentarvolumen() {
        robot.mouseMove(1175, 749);
        lelfclick();
        robot.mouseMove(1167, 695);
        lelfclick();
        robot.mouseMove(1075, 522);
        dobleclick();
        dobleclick();
        robot.mouseMove(1184, 519);
        dobleclick();
        dobleclick();
        robot.delay(2000);

        robot.mouseMove(1228, 389);
        robot.delay(2000);
        lelfclick();
    }

    public void iniciarTransmisionFacebook() {
        robot.mouseMove(925, 679);
        lelfclick();
        robot.delay(7000);

    }

    public void detenerTransmisionOBS() {
        robot.mouseMove(1199, 578);
        lelfclick();
        robot.delay(7000);
        lelfclick();
        robot.delay(5000);

    }
}
