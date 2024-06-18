package com.example.spring2;

import com.example.spring2.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.List;
import com.example.spring2.entities.Bevande;
import com.example.spring2.entities.Menu;
import com.example.spring2.entities.Pizze;
import com.example.spring2.entities.Toppings;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {

        @Bean
        public Toppings getFunghi(){
            return new Toppings("Funghi", 0.50, "24 Kcal");
        }

        @Bean
        public Toppings getPomodoro(){
            return new Toppings("Pomodoro", 0.30, "29 Kcal");
        }

        @Bean
        public Toppings getCipolla(){
            return new Toppings("Cipolla", 0.30, "35 Kcal");
        }

        @Bean
        public Toppings getSalsiccia(){
            return new Toppings("Salsiccia", 1, "324 Kcal");
        }

        @Bean
        public Toppings getMozzarella(){
            return new Toppings("Mozzarella", 1, "250 Kcal");
        }

        @Bean
        public Toppings getSalame(){
            return new Toppings("Salame", 0.90, "412 Kcal");
        }



        @Bean
        public Pizze getPizzaMargherita(){
            return new Pizze("Margherita", 5, "700 kcal", List.of(getPomodoro(), getMozzarella()));
        }

    @Bean
    public Pizze getPizzaDiavola(){
        return new Pizze("Diavola", 6, "910 kcal", List.of(getPomodoro(), getMozzarella(), getSalame()));
    }

    @Bean
    public Pizze getPizzaCapricciosa(){
        return new Pizze("Capricciosa", 5, "1100 kcal", List.of(getPomodoro(), getMozzarella(), getFunghi()));
    }

    @Bean
    public Pizze getPizzaMarinara(){
        return new Pizze("Marinara", 5, "950 kcal", List.of(getPomodoro()));
    }

    @Bean
    public Bevande getCoca(){
            return new Bevande("Coca Cola", "0.33l", 1, "42 Kcal");
    }

    @Bean
    public Bevande getSprite(){
        return new Bevande("Sprite", "0.33l", 1, "9 Kcal");
    }

    @Bean
    public Bevande getFanta(){
        return new Bevande("Fanta", "0.33l", 1, "48 Kcal");
    }


    @Bean
    public Menu Menu(){
            return new Menu(List.of(getPizzaMargherita(), getPizzaDiavola(), getPizzaCapricciosa(), getPizzaMarinara()), List.of(getSalame(), getCipolla(), getFunghi(), getMozzarella(), getPomodoro(), getSalsiccia()), List.of(getSprite(), getCoca(), getFanta()));
    }

    @Bean
    public Tavolo tavolo(@Value("${tavolo.coperto}") int costo){
            return new Tavolo(true, costo);
    }

    @Bean
    public Ordine ordine(Tavolo tavolo){
       Ordine nuovoOrdine = new  Ordine(List.of(getPizzaMargherita()), List.of(getSalame(), getFunghi()), List.of(getCoca()), tavolo, StatoOrdine.SERVITO);
        nuovoOrdine.setTotale(nuovoOrdine.totaleOrdine());
        nuovoOrdine.setnCoperti(tavolo.getnCopertiMax());
        return nuovoOrdine;
    }
}
