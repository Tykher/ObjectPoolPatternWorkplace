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

    public void requestWorkstation(Warehouse warehouse){
        System.out.println("Worker " + socialSecNumber + " has requested a workstation");
       warehouse.assignWorkstation().assignWorker(this);
       System.out.println("Worker " + socialSecNumber + " was assigned workstation " + workstation.id);
    }

    public void unAssign(Warehouse warehouse){
        this.workstation.unAssignWorker(warehouse);
    }
}
