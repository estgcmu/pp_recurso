/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Tiago Pinto
 */
public class jsonBike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("src/vehicleJSON/bike.json"));

            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println(jsonObject);

            String Type = (String) jsonObject.get("Type");
            System.out.println("Type" + "\n" + Type);
    

            String Model = (String) jsonObject.get("Model");
            System.out.println("Model" + "\n" + Model);
            
            
            // loop array
            JSONArray Bounds = (JSONArray) jsonObject.get("Bounds");
            Iterator<Long> iterator = Bounds.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            
            Double Speed = (Double) jsonObject.get("Speed");
            System.out.println("Speed" + "\n" + Speed);
            
            Long Direction = (Long) jsonObject.get("Direction");
            System.out.println("Direction" + "\n" + Direction);
            
            
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        //return Boolean.parseBoolean(string);
    }
}

