package com.company;

public class Main {

    public static void main(String[] args) {
        Worker a = new Worker("Konrad", "Maliszewski", "39190547012");
        Worker b = new Worker("Rafał", "Tekliński", "54810947134");
        Worker c = new Worker("Anna", "Rozmarym", "931904189470");
        Warehouse warehouse = new Warehouse();
        a.requestWorkstation(warehouse);
        b.requestWorkstation(warehouse);
        a.unAssign(warehouse);
        c.requestWorkstation(warehouse);
        a.requestWorkstation(warehouse);
    }
}
