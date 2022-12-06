package com.company;

public class Worker {
    public String name;
    public String surname;
    public final String socialSecNumber;
    WorkStation workstation;

    public Worker(String name, String surname, String socialSecNumber){
        this.name = name;
        this.surname = surname;
        this.socialSecNumber = socialSecNumber;
    }

    private void requestWorkstation(Warehouse warehouse){
       warehouse.assignWorkstation().assignWorker(this);
    }
}
