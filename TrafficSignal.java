/*Author : Kavya K 
 Student Id : AF0232777
Date  : 01-12-2022(Thursday)
Aim : Traffic signal*/


package ThursdayActivity;

import java.io.IOException;



public class TrafficSignal{
    public static void main(String[] args) {

    	MultiThread obj = new MultiThread();
        obj.start();

    }
}

class MultiThread extends Thread {
    public static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public void run() {
        try {

            while (true) {
                System.out.println("Light: RED");
                Thread.sleep(3000);
                clearConsole();
                System.out.println("Light: GREEN");
                Thread.sleep(5000);
                clearConsole();
                System.out.println("Light: YELLOW");
                Thread.sleep(2000);
                clearConsole();
            }
        } catch (Exception e) {

            System.out.println("Exception is caught");
        }
    }
}
