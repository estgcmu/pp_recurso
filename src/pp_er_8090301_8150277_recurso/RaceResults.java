/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.ClassificationContract;
import game.Contracts.PilotContract;
import game.Contracts.RaceResultsComparator;
import game.classes.RaceResultsAbstract;
import game.classes.VehicleAbstract;
import game.classes.VehicleManagement;
import game.collections.ClassificationManagementContract;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author Tiago Pinto
 */
public class RaceResults extends RaceResultsAbstract implements RaceResultsComparator{

    private ClassificationManagementContract classification;
    
    public RaceResults() {
        super();
    }
    

    @Override
    public ClassificationManagementContract getClassificationManagementContract() {
        return classification;
    }

    
    @Override
    public boolean saveResultsToFile() throws IOException, org.json.simple.parser.ParseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saveMultiPlayerResultsToFile(ClassificationContract cc, VehicleManagement vm) throws IOException, org.json.simple.parser.ParseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClassificationManagementContract loadResultsFromFile() throws IOException {
        
            JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader("raceResults/file1.txt"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String name = (String) jsonObject.get("Name");
            String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
 
            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classification;
    }

    @Override
    public ClassificationContract mapLoadingResults() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addClassification(ClassificationContract cc) {
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

    @Override
    public int compareTo(RaceResultsComparator rrc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
