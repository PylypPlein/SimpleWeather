package Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.json.JSONObject;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField city;


    @FXML
    private Text date;

    @FXML
    private Text name;

    @FXML
    private Button getData;

    @FXML
    private Text temp_info;

    @FXML
    private Text temp_max;

    @FXML
    private Text temp_min;

    @FXML
    private Text pressure;

    @FXML
    private Text humidity;

    @FXML
    void initialize() {


        getData.setOnAction(event-> {
            String getUserCity = city.getText().trim();
            if(!getUserCity.equals("")) {
                String output = getUrlContent("https://api.openweathermap.org/data/2.5/weather?q=" + getUserCity + "&appid=eb0d2611c17cc3a1a34562cc27484b96");
                System.out.println(output);



                if (!output.isEmpty()) {
                    JSONObject obj = new JSONObject(output);
                    temp_info.setText("TEMPERATURE: " + (obj.getJSONObject("main").getDouble("temp")- 273.00) + " C");
                    temp_max.setText("MAX: " + (obj.getJSONObject("main").getDouble("temp_max")- 273.00) + " C");
                    temp_min.setText("MIN: " + (obj.getJSONObject("main").getDouble("temp_min")- 273.00) + " C");
                    pressure.setText("PRESSURE: " + (obj.getJSONObject("main").getInt("pressure")) + " hPa");
                    humidity.setText("HUMIDITY: " + (obj.getJSONObject("main").getInt("humidity")) + "%");
                    name.setText("CITY: " + city.getText());



                }
            }
        });

    }
    private static String getUrlContent(String urlAdress){
        StringBuffer content = new StringBuffer();

        try{
            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;

            while((line = bufferedReader.readLine()) != null){
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch(Exception e){
            System.out.println("No City");
        } return content.toString();
    }

}
