package com.company;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<WorkStation> workStations = new ArrayList<>();
    private static int StationsID = 0;

    public Warehouse(){

    }

    public WorkStation assignWorkstation(){
            for (WorkStation workStation : workStations) {
                if (workStation.worker == null) {
                    workStations.remove(workStation);
                    return workStation;
                }
            }
            return new WorkStation(20, 20, ++StationsID);

    }

    public void returnWorkStation(WorkStation workStation){
        this.workStations.add(workStation);
    }
}
