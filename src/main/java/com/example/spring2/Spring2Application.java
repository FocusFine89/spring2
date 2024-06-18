package com.example.spring2;

import com.example.spring2.entities.Menu;
import com.example.spring2.entities.Ordine;
import com.example.spring2.entities.Tavolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring2Application {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(Spring2Application.class, args);



//		Menu menu = ctx.getBean(Menu.class);
//		Tavolo tavolo = ctx.getBean(Tavolo.class);
//		Ordine ordine = ctx.getBean(Ordine.class);
//		System.out.println(ordine);
	}

}
