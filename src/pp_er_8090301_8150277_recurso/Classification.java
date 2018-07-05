/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.ClassificationContract;
import game.Contracts.PilotContract;
import game.Contracts.RaceResultsComparator;
import game.classes.VehicleAbstract;

/**
 *
 * @author Tiago Pinto
 */
public class Classification implements ClassificationContract{

    private String level = "";
    private int totalLaps = 0;
    private double bestLap = 0.0;
    private double totalTime = 0.0;
    
    
    @Override
    public String getLevel() {
        return level;
    }

    @Override
    public void setLevel(String string) {
        this.level = string;
    }

    @Override
    public void setTotalLaps(int i) {
        this.totalLaps = i;
    }

    @Override
    public PilotContract getPilot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalLaps() {
        return totalLaps;
    }

    @Override
    public void setPilot(PilotContract pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehicleAbstract getVehicle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVehicle(VehicleAbstract va) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getBestLap() {
        return bestLap;
    }

    @Override
    public void addLap(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalTime() {
        return totalTime;
    }

    @Override
    public void setTotalTime(double d) {
        this.totalTime = d;
    }

    @Override
    public int compareTo(RaceResultsComparator rrc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
