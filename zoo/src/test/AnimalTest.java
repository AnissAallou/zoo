package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import zoo.Animal;

public class AnimalTest {
	
	// String race, String surnom, char sexe, String numTatouage
		Animal a1 = new Animal("Oiseau", "Rayleigh", "M", 1994);
		Animal a2 = new Animal("Oiseau", "Mihawk","F", 1999);
		
		// public Animal(String race, String surnom, String sexe, int numTatouage) {
		@Test 
		public void TestMariageMemeSexe() {
			boolean sameSex = a1.setPacs(a2);
			System.err.println(sameSex);
		
			assertTrue(sameSex, "Pas de mariage entre deux animaux de même sexe");
		}
		

		@Test
		public void TestMelangeRaces() {

			a2.setRace("Chat");
			assertTrue(a1.setPacs(a2),"Pas de mélange de races" );

		}
		
		

}
