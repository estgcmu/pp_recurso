/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.classes.RacingGame;

/**
 *
 * @author joaosoares
 */
public class PP_ER_8090301_8150277_RECURSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Classification c = new Classification();
        RacingGame game = new RacingGame();
        game.setClassification(c);
        //game.addVehicle(bike);
        
        //game.addLevel(level);
        //game.addNumberOfLaps(l);
        //RaceResults raceResulsts = new RaceResulsts();
        //game.setRaceResults(raceResults);
        game.startGame();
        
    }
    
}
