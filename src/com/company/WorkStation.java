package com.company;

public class WorkStation {
    public int length;
    public int width;
    public final int id;
    public Worker worker = null;

    public WorkStation(int length, int width, int id){
        this.length = length;
        this.width = width;
        this.id = id;
    }

    public void assignWorker(Worker worker){
        this.worker = worker;
        worker.workstation = this;
    }

    public void unAssignWorker(Warehouse warehouse){
        System.out.println("Worker " + worker.socialSecNumber + " has been unassigned from their workplace " + this.id);
        worker.workstation = null;
        this.worker = null;
        warehouse.returnWorkStation(this);
    }
}
