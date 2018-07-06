/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.ClassificationContract;
import game.Contracts.LevelContract;
import game.classes.RaceResultsAbstract;
import game.classes.VehicleAbstract;
import javafx.stage.Stage;

/**
 *
 * @author Tiago Pinto
 */
public class RacingGame extends game.classes.RacingGame{

    public RacingGame() {
        super();
    }

    @Override
    public void addLevel(LevelContract level) {
        super.addLevel(level); 
    }

    @Override
    public void addNumberOfLaps(int laps) {
        super.addNumberOfLaps(laps); 
    }

    @Override
    public void addVehicle(VehicleAbstract vehicle) {
        super.addVehicle(vehicle); 
    }

    public static boolean isMultiplayerMode() {
        return multiplayerMode;
    }

    @Override
    public void setClassification(ClassificationContract classification) {
        super.setClassification(classification); 
    }

    @Override
    public void setRaceResults(RaceResultsAbstract raceResults) {
        super.setRaceResults(raceResults); 
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        super.start(primaryStage); 
    }

    @Override
    public void startGame() throws Exception {
        super.startGame(); 
    }
   
}
