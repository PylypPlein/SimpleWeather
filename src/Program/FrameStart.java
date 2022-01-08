package Program;

import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.concurrent.*;
import javax.swing.JFrame;
import javax.swing.*;



public class FrameStart {

    public FrameStart(){

        Date d = new Date();
        Calendar rightNow = Calendar.getInstance();
        int hourss = rightNow.get(Calendar.HOUR_OF_DAY);

        int mont = d.getMonth();
        switch(mont){


            case 0:
                System.out.println("January Winter " + hourss);
                if (hourss >= 0 && hourss <6){
                    //winter night illustration
                    System.out.println("Program");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/NightWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);

                    try {
                        TimeUnit.SECONDS.sleep(4);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //winter morning illustration
                    System.out.println("Morning");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/MorningWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }

                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //winter day illustration
                    System.out.println("Day");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/DayWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //winter afternoon illustration
                    System.out.println("Afternoon");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/AfternoonWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Afternoon");
                }

            case 1:
                System.out.println("February Winter " + hourss);
                if (hourss >= 0 && hourss <6){
                    //winter night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //winter morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //winter day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //winter afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 2:
                System.out.println("March Spring " + hourss);
                if (hourss >= 0 && hourss <6){
                    //spring night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //spring morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //spring day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //spring afternoon illustration
                    System.out.println("Afternoon");
                }

            case 3:
                System.out.println("April Spring " + hourss);
                if (hourss >= 0 && hourss <6){
                    //spring night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //spring morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //spring day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //spring afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 4:
                System.out.println("May Spring " + hourss);
                if (hourss >= 0 && hourss <6){
                    //spring night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //spring morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //spring day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //spring afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 5:
                System.out.println("June Summer " + hourss);
                if (hourss >= 0 && hourss <6){
                    //summer night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //summer morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //summer day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //summer afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 6:
                System.out.println("July Summer " + hourss);
                if (hourss >= 0 && hourss <6){
                    //summer night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //summer morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //summer day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //summer afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 7:
                System.out.println("Agust Summer " + hourss);
                if (hourss >= 0 && hourss <6){
                    //summer night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //summer morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //summer day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //summer afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 8:
                System.out.println("September Autumn " + hourss);
                if (hourss >= 0 && hourss <6){
                    //autumn night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //autumn morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //autumn day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //autumn afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 9:
                System.out.println("October Autumn " + hourss);
                if (hourss >= 0 && hourss <6){
                    //autumn night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //autumn morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //autumn day illustration
                    System.out.println("Day");
                } else if (hourss > 18 && hourss < 23){
                    //autumn afternoon illustration
                    System.out.println("Afternoon");
                }
                break;

            case 10:

                System.out.println("November Autumn " + hourss);

                if (hourss >= 0 && hourss <6){
                    //autumn night illustration
                    System.out.println("Program");
                } else if (hourss > 6 && hourss < 12){
                    //autumn morning illustration
                    System.out.println("Morning");
                } else if (hourss > 12 && hourss < 18) {
                    //autumn day illustration
                    System.out.println("Day");

                } else if (hourss > 18 && hourss < 23){
                    //autumn afternoon illustration
                    System.out.println("Afternoon");
                }
                break;
            case 11:
                System.out.println("December Winter " + hourss);
                if (hourss >= 0 && hourss <6){
                    //winter night illustration
                    System.out.println("Program");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/NightWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);

                    try {
                        TimeUnit.SECONDS.sleep(4);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }

                } else if (hourss > 6 && hourss < 12){
                    //winter morning illustration
                    System.out.println("Morning");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/MorningWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }

                } else if (hourss > 12 && hourss < 18) {
                    //winter day illustration
                    System.out.println("Day");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/DayWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }


                } else if (hourss >= 18 && hourss < 24){
                    //winter afternoon illustration
                    System.out.println("Afternoon");

                    JFrame start = new JFrame();
                    start.setSize(480,240);

                    start.add(new JLabel(new ImageIcon("/Users/Богдан/IdeaProjects/SWeatherTest/src/Images/AfternoonWinter.png")));
                    start.setUndecorated(true);
                    start.setLocationRelativeTo(null);
                    start.setVisible(true);
                    start.setResizable(false);
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        //System.exit(0);
                        start.dispose();

                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }

                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}