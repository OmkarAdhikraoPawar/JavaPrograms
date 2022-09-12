package com.interf;
//Assignment 6 :- 7) What is output of following code?
interface X
{
void methodX();
}
class Y implements X
//{
//void methodX()    //Error :-  Cannot reduce the visibility of the inherited 
//{
//System.out.println("Method X");
//}
{
public void methodX()   
{
    System.out.println("Method X");
}
}
public class Check {

	public static void main(String[] args) {
		X obj = new Y();
		obj.methodX();
	}

}
