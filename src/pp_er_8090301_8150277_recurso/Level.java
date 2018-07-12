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
    
    private String name;// = "Easy Game";
    private String pathToImage;// = "src/levelImages/level01.png";
    private double[] lowerBounds = {707.0, 40.0, 599.0, 19.0, 599.0, 19.0, 465.0, 11.04, 65.0, 11.0, 354.0, 13.0,
            354.0, 13.0, 231.0, 26.0,
            231.0, 28.0, 165.0, 45.0,
            165.0, 45.0, 111.0, 68.0,
            111.0, 68.0, 72.0, 97.0,
            72.0, 97.0, 42.0, 132.0,
            42.0, 132.0, 21.0, 180.0,
            21.0, 180.0, 9.0, 229.0,
            9.0, 229.0, 3.0, 290.0,
            3.0, 290.0, 6.0, 356.0,
            6.0, 356.0, 18.0, 430.0,
            18.0, 430.0, 34.0, 488.0,
            34.0, 488.0, 46.0, 494.0,
            45.0, 494.0, 87.0, 551.0,
            87.0, 551.0, 125.0, 563.0,
            125.0, 563.0, 189.0, 566.0,
            189.0, 566.0, 384.0, 514.0,
            385.0, 514.0, 438.0, 509.0,
            439.0, 509.0, 477.0, 521.0,
            477.0, 521.0, 545.0, 557.0,
            545.0, 557.0, 596.0, 576.0,
            596.0, 576.0, 643.0, 580.0,
            643.0, 580.0, 715.0, 559.0,
            715.0, 559.0, 765.0, 523.0,
            765.0, 523.0, 783.0, 484.0,
            783.0, 484.0, 772.0, 427.0,
            772.0, 427.0, 727.0, 376.0,
            727.0, 376.0, 690.0, 341.0,
            690.0, 341.0, 768.0, 259.0,
            690.0, 341.0, 768.0, 259.0,
            768.0, 259.0, 791.0, 217.0,
            791.0, 217.0, 795.0, 168.0,
            795.0, 168.0, 784.0, 127.0,
            784.0, 127.0, 750.0, 74.0,
            750.0, 74.0, 708.0, 40.0};
            
    private double[] upperBounds = {673.0, 126.0, 576.0, 110.0,
            576.0, 110.0, 416.0, 102.0,
            416.0, 102.0, 265.0, 114.0,
            265.0, 114.0, 136.0, 162.0,
            136.0, 162.0, 103.0, 221.0,
            103.0, 221.0, 95.0, 315.0,
            94.0, 316.0, 116.0, 440.0,
            116.0, 440.0, 135.0, 470.0,
            135.0, 470.0, 173.0, 476.0,
            173.0, 476.0, 372.0, 424.0,
            372.0, 424.0, 419.0, 418.0,
            419.0, 418.0, 478.0, 424.0,
            478.0, 424.0, 524.0, 442.0,
            524.0, 442.0, 615.0, 488.0,
            615.0, 488.0, 654.0, 488.0,
            654.0, 488.0, 688.0, 471.0,
            688.0, 471.0, 612.0, 391.0,
            612.0, 391.0, 589.0, 334.0,
            589.0, 334.0, 598.0, 352.0,
            598.0, 352.0, 596.0, 317.0,
            596.0, 317.0, 706.0, 188.0,
            706.0, 188.0, 674.0, 128.0};
    private double[] checkPoints = {95.0, 340.0, 6.0, 341.0,
            394.0, 11.0, 399.0, 101.0,
            691.0, 338.0, 599.0, 339.0,
            405.0, 422.0, 407.0, 510.0};
    private double[] startCar = {34.0, 379.0};
    

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
