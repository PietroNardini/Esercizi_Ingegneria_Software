package com.example.Rubrica.Telefonica;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RubricaTelefonicaApplication {

	public static void main(String[] args) {
		ArrayList<Contatto> rubrica = new ArrayList<>();

        rubrica.add(new Contatto("Pietro Nardini", "3665249823"));
        rubrica.add(new Contatto("Pietro Nardoni", "3665249824"));


        System.out.println("Rubrica telefonica:");
        for (Contatto c : rubrica) {
            System.out.println(c);
        }
	}

}
