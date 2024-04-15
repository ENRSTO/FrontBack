package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExampleTest {
	
	 public static void main(String[] args) {
		 
		  // Effettua una richiesta GET e ottiene la risposta
	        Response response = RestAssured.get("http://localhost:8080/out");

	        // Esempio di utilizzo della risposta
	        int statusCode = response.getStatusCode();
	        String responseBody = response.getBody().asString();

	        System.out.println("Status code: " + statusCode);
	        System.out.println("Response body: " + responseBody);
	        if (statusCode == 200) {
	        	System.out.println("TEST OK!");
	        	System.out.println("---&&----");
	        	System.out.println("----&&&&------");
	        } else {
	        	System.out.println("niente");
	        }
	        System.out.println("END");
	        System.out.println("END2");
	        System.out.println("END3");
	        System.out.println("END5");
	        System.out.println("END-15-04-24");
	        System.out.println("END-15-04-24-2");
	        System.out.println("END-15-04-24-3");
	        System.out.println("PARALLELO");
	        System.out.println("PARALLELO1");
	        System.out.println("TRL-16");
	        System.out.println("--- TRL -15 ---");
	        System.out.println("BTTF");
	 }

	 
}
