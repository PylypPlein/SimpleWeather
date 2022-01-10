# SimpleWeather
Hi!
Welcome to the SimpleWeather wiki!

Hi everybody! To your attention my first , simple , JAVA project, created by me in the first half of the year of study at the programming faculty. Well, in the files you will find the source code that will help you understand how the program works.

Simple Weather... When you run application , you will see that the theme of program will change in following with current season and time. If it is a winter day outside, then an illustration of a winter day will appear in your window in the background. In main window you will see next parameters: City , Temperature (Max/min) , pressure and humidity. You can find out the weather anywhere in the world using the service API built into my program. Simple , right?

On day 08.01.22 my project decorated only for winter... but i will finish it later.



I created this program in InteliJ that's why the tutorial will be dedicated to him.

First action is changing project SDK for version 11.

For the program to work properly, you need to have JavaFx 11.0.2 and JSON library.
Install it on your computer , then open your Project Structure.
In Project Structure choose libraries and add JavaFX , JSON libraries into it.

After you add libraries , just edit configuration (on toolbar "RUN")

Then choose modify option and click on Add VM Options.. In VM Options you need to specify the path to the JavaFX library by command:
--module-path
/Users/you/way/javafx-sdk-11.0.2/lib
--add-modules
javafx.controls,javafx.fxml

save and rerun your InteliJ.
Thank you for attention. Have nice day!
Have fun!

