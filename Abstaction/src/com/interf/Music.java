package com.interf;
interface MusicalInstrument
{
	void play();
	static void learnInstrument()
	{
		System.out.println("Learn Instruments");
	}
}
abstract class Sound
{
	abstract public void listenSound();
}
class PercussionInstrument extends Sound implements MusicalInstrument
{
	public void play()
	{
		System.out.println("Play All Musical Instruments");
	}
	public void learnInstrument()
	{
		System.out.println("Learn all Musical Instruments");	
	}
	public void listenSound() 
	{
		System.out.println("Listen Sound ");
	}	
}
class StringedInstrument extends Sound implements MusicalInstrument
{
	public void play()
	{
		System.out.println("Play All Musical Instruments");
	}
	public void learnInstrument()
	{
		System.out.println("Learn all Musical Instruments");	
	}
	public void listenSound() 
	{
		System.out.println("Listen Sound ");
	}	
}

public class Music {

	public static void main(String[] args) {
		PercussionInstrument tabla = new PercussionInstrument();
		MusicalInstrument.learnInstrument();
		tabla.play();
		tabla.learnInstrument();
		tabla.listenSound();
		
		System.out.println("________________________________________");
		
		StringedInstrument violin = new StringedInstrument();
		MusicalInstrument.learnInstrument();
		violin.play();
		violin.learnInstrument();
		violin.listenSound();
		
	}

}
