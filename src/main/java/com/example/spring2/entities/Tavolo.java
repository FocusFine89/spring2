package com.example.spring2.entities;

import java.util.Random;

public class Tavolo {
    //Attributi
    private int nTavolo;
    private int nCopertiMax;
    private boolean isOccupied;
    private int costoCoperto;

    //Costruttori

    public Tavolo(boolean isOccupied, int costoCoperto) {
        Random rndm = new Random();
        this.nTavolo = rndm.nextInt(1,100);
        this.nCopertiMax = rndm.nextInt(1,4);
        this.isOccupied = isOccupied;
        this.costoCoperto = costoCoperto;
    }


    //Metodi

    public int getnTavolo() {
        return nTavolo;
    }

    public void setnTavolo(int nTavolo) {
        this.nTavolo = nTavolo;
    }

    public int getnCopertiMax() {
        return nCopertiMax;
    }

    public void setnCopertiMax(int nCopertiMax) {
        this.nCopertiMax = nCopertiMax;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getCostoCoperto() {
        return costoCoperto;
    }

    public void setCostoCoperto(int costoCoperto) {
        this.costoCoperto = costoCoperto;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "nTavolo=" + nTavolo +
                ", nCopertiMax=" + nCopertiMax +
                ", isOccupied=" + isOccupied +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}
