/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Tiago Pinto
 */
public class TesteLoadWriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
    
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader("C:/Users/Tiago Pinto/Documents/NetBeansProjects/pp_recurso/src/raceResults/classificationLevel01.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String position = (String) jsonObject.get("Position");
           
            JSONArray positionDetails = (JSONArray) jsonObject.get("positionDetails");
 
            System.out.println("Position: " + position);
            
            System.out.println("\nPositionDetails:");
            Iterator<String> iterator = positionDetails.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
    

