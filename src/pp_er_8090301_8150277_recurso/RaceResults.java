/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.ClassificationContract;
import game.Contracts.PilotContract;
import game.classes.RaceResultsAbstract;
import game.classes.VehicleAbstract;
import game.classes.VehicleManagement;
import game.collections.ClassificationManagementContract;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Tiago Pinto
 */
public class RaceResults extends RaceResultsAbstract {

    private Classification cla;
    private ClassificationManagement clm;
    private String level;

    public RaceResults(String level) {
        this.level = level;
        this.clm = new ClassificationManagement();
    }

    @Override
    public ClassificationManagementContract getClassificationManagementContract() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saveResultsToFile() throws IOException, ParseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saveMultiPlayerResultsToFile(ClassificationContract cc, VehicleManagement vm) throws IOException, ParseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClassificationManagementContract loadResultsFromFile() throws IOException {
        File f = new File("raceResulsts" + level + ".json");

        if (f.exists()) {
            try {

                ClassificationManagement cm = new ClassificationManagement();

                JSONParser parser = new JSONParser();

                JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("raceResulsts" + level + ".json"));

                for (Object o : jsonArray) {

                    JSONObject classification = (JSONObject) o;
                    JSONArray classificationDetails = (JSONArray) classification.get("positionDetails");

                    for (Object obj : classificationDetails) {

                        JSONObject classificationDetailsObj = (JSONObject) obj;

                        String vehicleName = (String) classificationDetailsObj.get("Vehicle");
                        String pilotName = (String) classificationDetailsObj.get("PilotName");

                        int pilotID = Integer.parseInt("" + (long) classificationDetailsObj.get("PilotID"));
                        double bestLap = (double) classificationDetailsObj.get("BestLap");
                        int totalLaps = Integer.parseInt("" + (long) classificationDetailsObj.get("TotalLaps"));
                        double BestTime = Integer.parseInt("" + (long) classificationDetailsObj.get("BestTime"));

                        Pilot pilot = new Pilot(pilotName, pilotID);
                        Vehicle vehicle = new Vehicle(vehicleName);
                        Classification cl = new Classification(level, pilot, vehicle, totalLaps);
                        cm.addObject(cl);

                    
                    }
                }
                
                return cm;

            } catch (ParseException ex) {
                Logger.getLogger(RaceResults.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public ClassificationContract mapLoadingResults() throws IOException {
        return cla;
    }

    @Override
    public void addClassification(ClassificationContract cc
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PilotContract getBestTotalTimePlayerFromFile(int i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClassificationContract getBestLapClassificationVehicleFromFile(VehicleAbstract va) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDifBetweenBestWorstFromFile(int i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
