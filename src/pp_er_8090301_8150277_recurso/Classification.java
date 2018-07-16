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
public class Classification implements ClassificationContract {

    private String level;
    private int totalLaps = 0;
    private Pilot Pilot;
    private Vehicle vehicle;
    private double bestLap = 0.0;
    private double lap = 0.0;
    private double totalTime = 0.0;

    public Classification() {
    }

    public Classification(String level, Pilot Pilot, Vehicle vehicle) {
        this.level = level;
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
        this.Pilot = (Pilot) pc;
    }

    @Override
    public VehicleAbstract getVehicle() {
        return vehicle;
    }

    @Override
    public void setVehicle(VehicleAbstract va) {
        this.vehicle = (Vehicle) va;
    }

    @Override
    public double getBestLap() {
        return bestLap;
    }

    @Override
    public void addLap(double d) {
        if (bestLap > d) {
            bestLap = d;
        }
        totalTime += d; //totalTime = totalTime + d;   
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
        return rrc.compareTo(rrc);
    }
    

}
