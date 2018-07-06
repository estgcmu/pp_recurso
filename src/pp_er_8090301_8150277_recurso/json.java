/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author joaosoares
 */
public class json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("/Users/joaosoares/NetBeansProjects/PP_ER_8090301_8150277_RECURSO/src/levelsJSON/level1.json"));

            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println(jsonObject);

            Long Level = (Long) jsonObject.get("Level");
            System.out.println(Level);
    

            // loop array
            JSONArray UpperBound = (JSONArray) jsonObject.get("UpperBound");
            Iterator<Long> iterator = UpperBound.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            
            // loop array
            JSONArray LowerBound = (JSONArray) jsonObject.get("LowerBound");
            Iterator<Long> iterator_2 = LowerBound.iterator();
            System.out.println("Lowerbound");
            while (iterator_2.hasNext()) {
                System.out.println(iterator_2.next());
            }
            
             // loop array
            JSONArray Checkpoints = (JSONArray) jsonObject.get("Checkpoints");
            Iterator<Long> iterator_3 = Checkpoints.iterator();
            System.out.println("Checkpoints");
            while (iterator_3.hasNext()) {
                System.out.println(iterator_3.next());
            }
            
            // loop array
            JSONArray StartCar = (JSONArray) jsonObject.get("StartCar");
            Iterator<Long> iterator_4 = StartCar.iterator();
            System.out.println("StartCar");
            while (iterator_4.hasNext()) {
                System.out.println(iterator_4.next());
            }
            
            /**
            String ballImagePath = (String) jsonObject.get("ballImagePath");
            System.out.println(ballImagePath);
            
            Long paddleSpeed = (Long) jsonObject.get("paddleSpeed");
            System.out.println(paddleSpeed);
           
             String paddleImagePath = (String) jsonObject.get("paddleImagePath");
            System.out.println(paddleImagePath);
            **/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
