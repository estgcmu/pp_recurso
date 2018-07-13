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
public class Vehicle extends VehicleAbstract{
    
    private double speed = 0.1;
    private int direction = 5;
    private double padBreakVehicle = 0.1;
    private String type = "x";
    private String model = "Norton 1941";
    private Pilot pilotName;
    private String name = "Bike";
    private double w = 20.0;
    private double h = 20.0;
    private double[] bounds = {29.0, 0.0, 15.0, 0.0,
            15.0, 0.0, 7.0, 12.0,
            7.0, 12.0, -3.0, 13.0,
            -3.0, 13.0, -3.0, 22.0,
            -3.0, 22.0, 6.0, 26.0,
            6.0, 26.0, 34.0, 24.0,
            34.0, 24.0, 35.0, 5.0,
            35.0, 5.0, 29.0, -1.0};

    public Vehicle(String name) {
        super(name);
    }

    @Override
    public boolean mappingBounds(String string) throws IOException {
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
        
        return Boolean.parseBoolean(string);
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
        return padBreakVehicle;
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
        this.pilotName = (Pilot) pc;
    }

    @Override
    public String getName() {
      
        System.out.println("Name:" + name);
          return name;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }

    @Override
    public PilotContract getPilot() {
        //return Pilot pilotName;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
