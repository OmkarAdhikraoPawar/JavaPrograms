package com.interf;

public interface Edit {
	void read();
	void update();
	default void write()
	{
		System.out.println("Write Method");
	}

}

