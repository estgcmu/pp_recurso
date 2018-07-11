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

    private String level = "src/levelsJSON/level1.json";
    private int totalLaps = 0;
    private PilotContract Pilot;
    private VehicleAbstract vehicle;
    private double bestLap = 0.0;
    private double totalTime = 0.0;

    public Classification() {
    }

    
    public Classification(PilotContract Pilot, VehicleAbstract vehicle) {
        super();
        this.Pilot = Pilot;
        this.vehicle = vehicle;
    }
    
    
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
        return Pilot;
    }

    @Override
    public int getTotalLaps() {
        return totalLaps;
    }

    @Override
    public void setPilot(PilotContract pc) {
        this.Pilot = pc;
    }

    @Override
    public VehicleAbstract getVehicle() {
        return vehicle;
    }

    @Override
    public void setVehicle(VehicleAbstract va) {
        this.vehicle = va;
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
