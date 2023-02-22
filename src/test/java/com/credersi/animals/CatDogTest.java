package com.credersi.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatDogTest {

	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		assertTrue(cat.isAlive());
		assertTrue(dog.isAlive());
		
		assertEquals(cat.howHungry(), dog.howHungry());
	}
	
	@Test
	public void testDeath() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		assertTrue(cat.isAlive());
		assertTrue(dog.isAlive());
		
		cat.runs();
		cat.runs();
		
		dog.runs();
		dog.runs();
		
		assertTrue(cat.isAlive());
		assertFalse(dog.isAlive());
	}
	
	@Test
	public void testTwoDeaths() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		assertTrue(cat.isAlive());
		assertTrue(dog.isAlive());
		
		for (int i = 0; i < 2; i++) {
			cat.runs();
			cat.runs();
			
			dog.runs();
			dog.runs();
		}
		
		assertTrue(cat.isAlive());
		assertFalse(dog.isAlive());
	}
	
	@Test
	public void testNineDeaths() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		assertTrue(cat.isAlive());
		assertTrue(dog.isAlive());
		
		for (int i = 0; i < 18; i++) {
			cat.runs();
			dog.runs();
		}
		
		assertFalse(cat.isAlive());
		assertFalse(dog.isAlive());
	}
	
	@Test
	public void testHungerOnDeath() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		assertTrue(cat.isAlive());
		assertTrue(dog.isAlive());
		
		cat.runs();
		cat.runs();
		
		dog.runs();
		dog.runs();
		
		assertEquals(cat.howHungry(), 50);
		assertEquals(dog.howHungry(), 110);
	}

}
