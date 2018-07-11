/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.LevelContract;
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
public class Level implements LevelContract{
    
    private String name = "Easy Game";
    private String pathToImage = "src/levelImages/level01.png";
    private double[] lowerBounds = {0.0};
    private double[] upperBounds = {0.0};
    private double[] checkPoints = {0.0};
    private double[] startCar = {0.0};
    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }

    @Override
    public boolean mappingBounds(String string) throws IOException {
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("src/levelsJSON/level1.json"));

            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println(jsonObject);

            Long Level = (Long) jsonObject.get("Level");
            System.out.println("Level");
    

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
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return Boolean.parseBoolean(string);
    
    }

    @Override
    public String getPathToImage() {
        return pathToImage;
    }

    @Override
    public void setPathToImage(String string) {
        this.pathToImage = string;
    }

    @Override
    public double[] getLowerBounds() {
        return lowerBounds;
    }

    @Override
    public double[] getUpperBounds() {
        return upperBounds;
    }

    @Override
    public double[] getCheckPoints() {
        return checkPoints;
    }

    @Override
    public double[] getStartCar() {
        return startCar;
    }
    
}
