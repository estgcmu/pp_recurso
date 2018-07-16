/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.LevelContract;
import game.classes.RaceResultsAbstract;
import game.classes.RacingGame;
import game.classes.VehicleAbstract;

/**
 *
 * @author joaosoares
 */
public class PP_ER_8090301_8150277_RECURSO {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        VehicleAbstract bike = new Vehicle("Bike");
        LevelContract level = new Level();
        int l = 0;
        //RaceResultsAbstract raceResults = new RaceResults();
        
        Classification c = new Classification();
        RacingGame game = new RacingGame();
        game.setClassification(c);
        game.addVehicle(bike);
        game.addLevel(level);
        game.addNumberOfLaps(l);
        //RaceResults raceResulsts = new RaceResults();
        //game.setRaceResults(raceResults);
        game.startGame();
        
    }
    
}
