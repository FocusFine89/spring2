package com.example.spring2.entities;

import java.util.List;
import java.util.Random;

public class Ordine {
    //Attributi
    private List<Pizze> listaPizze;
    private List<Toppings> listaTopping;
    private List<Bevande> listaBevande;
    private int nOrdine;
    private Enum<StatoOrdine> statoOrdine;
    private int nCoperti;
    private String oraAcquisizione;
    private double totale;
    private Tavolo tavolo;

    //Costruttori
    public Ordine(List<Pizze> listaPizze, List<Toppings> listaTopping, List<Bevande> listaBevande, Tavolo tavolo, StatoOrdine statoOrdine){
        Random nOrdine = new Random();
        Random min = new Random();
        Random ora = new Random();

        this.listaPizze = listaPizze;
        this.listaTopping = listaTopping;
        this.listaBevande = listaBevande;
        this.tavolo = tavolo;
        this.statoOrdine = statoOrdine;
        this.nOrdine = nOrdine.nextInt(1,5000);
        this.oraAcquisizione = String.valueOf(ora.nextInt(1,23))+ ":" + String.valueOf(min.nextInt(0,59));
    }


    //Metodi

    public List<Pizze> getListaPizze() {
        return listaPizze;
    }

    public void setListaPizze(List<Pizze> listaPizze) {
        this.listaPizze = listaPizze;
    }

    public List<Toppings> getListaTopping() {
        return listaTopping;
    }

    public void setListaTopping(List<Toppings> listaTopping) {
        this.listaTopping = listaTopping;
    }

    public List<Bevande> getListaBevande() {
        return listaBevande;
    }

    public void setListaBevande(List<Bevande> listaBevande) {
        this.listaBevande = listaBevande;
    }

    public int getnOrdine() {
        return nOrdine;
    }

    public void setnOrdine(int nOrdine) {
        this.nOrdine = nOrdine;
    }

    public Enum<StatoOrdine> getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(Enum<StatoOrdine> statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public int getnCoperti() {
        return nCoperti;
    }

    public void setnCoperti(int nCoperti) {
        this.nCoperti = nCoperti;
    }

    public String getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(String oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public double totaleOrdine(){
        double tot = 0;
         for (Pizze pizza : listaPizze){
             tot += pizza.getPrezzo();
         }

         for(Bevande bevanda : listaBevande){
             tot+= bevanda.getPrezzo();
         }

         if(listaTopping != null){
             for (Toppings topping : listaTopping){
                 tot+= topping.getPrezzo();
             }
         }
         return tot + tavolo.getCostoCoperto() ;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "listaPizze=" + listaPizze.stream().map(pizze -> pizze.getNomePizza() +" "+ pizze.getPrezzo() + " euro").toList() +
                ", listaTopping=" + listaTopping +
                ", listaBevande=" + listaBevande +
                ", nOrdine=" + nOrdine +
                ", statoOrdine=" + statoOrdine +
                ", nCoperti=" + nCoperti +
                ", oraAcquisizione='" + oraAcquisizione + '\'' +
                ", totale=" + totale +
                ", tavolo=" + tavolo.getnTavolo() +
                '}';
    }
}
