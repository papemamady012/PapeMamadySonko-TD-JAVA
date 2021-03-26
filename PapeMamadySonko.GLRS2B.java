
import java.util.Scanner;
import java.util.Locale;
public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	{
	
	
	    Scanner scan = new Scanner (System.in);
	    
	   int année ;
	   System.out.println("Entrée une année:"); 
	   année= scan.nextInt();
	   if(année % 4 ==0 && année % 100 != 0){
		   System.out.println("l'annee n'est pas bisextil");
		}else if(année % 400 == 0){
			   System.out.println("l'annee est pas bisextil");
		}else {
		 
		}
}
}}


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	{

	    DateFormat shortDateFormatEN = DateFormat.getDateTimeInstance(
	        DateFormat.SHORT,
	        DateFormat.SHORT, new Locale("EN","en"));
	    Date aujourdhui = null;
		System.out.println(shortDateFormatEN.format(aujourdhui));
		
	
	}
}}


package aziz;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	{
			SimpleDateFormat formater = null;
			Date aujourdhui = new Date();
			formater = new SimpleDateFormat("dd-MM-yy");
		    System.out.println(formater.format(aujourdhui));

		
	
	}
}}



import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	{
			SimpleDateFormat formater = null;
			Date aujourdhui = new Date();
			formater = new SimpleDateFormat("dd-MM-yyyy");
		    System.out.println(formater.format(aujourdhui));

		
	
	}
}}

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	{

	    DateFormat shortDateFormatEN = DateFormat.getDateTimeInstance(
	 

    DateFormat mediumDateFormatEN = DateFormat.getDateTimeInstance(
        DateFormat.MEDIUM,
        DateFormat.MEDIUM, new Locale("EN","en"));

		
	 System.out.println(mediumDateFormatEN.format(aujourdhui));

	}
}}


