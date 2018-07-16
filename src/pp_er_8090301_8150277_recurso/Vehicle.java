/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.PilotContract;
import game.classes.VehicleAbstract;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import javafx.scene.CacheHint;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Tiago Pinto
 */
public class Vehicle extends VehicleAbstract {

    private double speed;
    private int direction;
    private double brakes;
    private String type;
    private String model;
    private Pilot pilot;
    private String name;
    private double w;
    private double h;
    private double[] bounds;
    private boolean mappingBounds;

    public Vehicle(String name) {
        super(name);
        this.type = name;
    }
  

    @Override
    public boolean mappingBounds(String string) throws IOException {
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("src/vehicleJSON/bike.json" + getName() + ".json"));
            JSONObject jsonObject = (JSONObject) obj;

            String Model = (String) jsonObject.get("Model");
            model = Model;

            // loop array
            JSONArray Bounds = (JSONArray) jsonObject.get("Bounds");
            bounds = new double[Bounds.size()];

            for (int i = 0; i < Bounds.size(); i++) {
                bounds[i] = (double) Bounds.get(i);
            }

            Double Speed = (Double) jsonObject.get("Speed");
            speed = Speed;

            String Direction = "" + (Long)jsonObject.get("Direction");
            int vehicleDirection = Integer.parseInt(Direction);
            direction = vehicleDirection;
            
            Double Break = (Double) jsonObject.get("Break");
            brakes = Break;

        } catch (ParseException ex){
            return false;
        }

        return true;
    }

    @Override
    public double getSpeedVehicle() {
        return speed;
    }

    @Override
    public int getDirectionVehicle() {
        return direction;
    }

    @Override
    public double getBreakPadVehicle() {
        return brakes;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setPilot(PilotContract pc) {
        this.pilot = (Pilot) pc;
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
    public PilotContract getPilot() {
        return pilot;
    }

    @Override
    public double getW() {
        return w;
    }

    @Override
    public void setW(double d) {
        this.w = d;
    }

    @Override
    public double getH() {
        return h;
    }

    @Override
    public void setH(double d) {
        this.h = d;
    }

    @Override
    public double[] getBounds() {
        return bounds;
    }

}
