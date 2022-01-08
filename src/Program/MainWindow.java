package Program;


import java.util.Calendar;

public class MainWindow{

    public static void main(String[] args) {



        Calendar rightNow = Calendar.getInstance();
        int h = rightNow.get(Calendar.HOUR_OF_DAY);
        System.out.println(h);


        if (h > 7 && h <= 18) {

            Main2 newrun = new Main2();


            System.out.println("Day/Morning window Started");


        } else if (h > 18 || h < 8){


            Main1 newrunr = new Main1();

            System.out.println("Program/Afternoon window Started");


        } else {
            System.out.println("ERROR");

        }


        }


}
