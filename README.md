# SimpleWeather
HI!
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
Have fun!

