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
public class Level implements LevelContract {

    private String name;// = "Easy Game";
    private String pathToImage;// = "src/levelImages/level01.png";
    private double[] lowerBounds;
    private double[] upperBounds;
    private double[] checkPoints;
    private double[] startCar;
    private boolean mappingBounds;

    public Level() {
    }

    public Level(String name, String pathToImage) {
        this.name = name;
        this.pathToImage = pathToImage;
    }
    
    

    public Level(String name, boolean mappingBounds) throws IOException {
        this.name = name;
        this.mappingBounds = mappingBounds(name);
        setPathToImage(name);
    }

    

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

            Object obj = parser.parse(new FileReader("src/levelsJSON/level1.json" + string + ".json"));
            JSONObject jsonObject = (JSONObject) obj;


            // loop array
            JSONArray UpperBound = (JSONArray) jsonObject.get("UpperBound");
            upperBounds = new double[UpperBound.size()];

            for (int i = 0; i < UpperBound.size(); i++) {
                upperBounds[i] = (double) UpperBound.get(i);
            }

            // loop array
            JSONArray LowerBound = (JSONArray) jsonObject.get("LowerBound");
            lowerBounds = new double[LowerBound.size()];

            for (int i = 0; i < LowerBound.size(); i++) {
                lowerBounds[i] = (double) LowerBound.get(i);
            }

            // loop array
            JSONArray Checkpoints = (JSONArray) jsonObject.get("Checkpoints");
            checkPoints = new double[Checkpoints.size()];

            for (int i = 0; i < Checkpoints.size(); i++) {
                checkPoints[i] = (double) Checkpoints.get(i);

            }

            // loop array
            JSONArray StartCar = (JSONArray) jsonObject.get("StartCar");
            startCar = new double[StartCar.size()];

            for (int i = 0; i < StartCar.size(); i++) {
                startCar[i] = (double) StartCar.get(i);
            }

        } catch (ParseException ex) {
            return false;
        }
        return true;
    }

    @Override
    public String getPathToImage() {
        return pathToImage;
    }

    @Override
    public void setPathToImage(String string) {
        this.pathToImage = "src/levelImages/level01.png" + string + ".png";
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
