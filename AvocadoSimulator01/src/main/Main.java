/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;


/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
	//enum myEnum {A,B,C,D};	// Demo of enumerated date type

	

	public static void main(String[] args) {
		//myEnum e = myEnum.A;
		//System.out.println(e.toString());

		//Declare and instantiate an avocado
		
		Avocado bob = new Avocado("Green", Avocado.enumCondition.fresh, 2);
	}
}
