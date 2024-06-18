package com.example.spring2;

import com.example.spring2.entities.Menu;
import com.example.spring2.entities.Ordine;
import com.example.spring2.entities.StatoOrdine;
import com.example.spring2.entities.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Autowired
    private Ordine nuovoOrdine;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("RUNNER");
        System.out.println(nuovoOrdine);
    }
}
