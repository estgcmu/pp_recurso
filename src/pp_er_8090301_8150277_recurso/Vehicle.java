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
    
    private double speed = 0.0;
    private int direction = 0;
    private double padBreakVehicle = 0.0;
    private String type = "";
    private String model = "";
    private Pilot pilotName;
    private String name = "";
    private double w = 0.0;
    private double h = 0.0;
    private double[] bounds = {0.0};

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

            Long Level = (Long) jsonObject.get("Type");
            System.out.println("Type");
    

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
        return name;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }

    @Override
    public PilotContract getPilot() {
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
