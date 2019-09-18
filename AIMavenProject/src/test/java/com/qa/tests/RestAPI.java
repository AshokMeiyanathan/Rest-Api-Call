/**
 * 
 */
package com.qa.tests;

import static com.jayway.restassured.RestAssured.get;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

/**
 * @author AMeiyanathan
 *
 */
public class RestAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter country code or country name :");
		String cntCodeOrName=s.nextLine().toUpperCase();
		
		if (cntCodeOrName.matches("[0-9]+") || !cntCodeOrName.matches("[a-zA-Z_]+")) {
		    System.out.println("Invalid country code or country name");
		
		}else{

		

				Response resp = get("https://restcountries.eu/rest/v2/all");

				

				JSONArray jsonResponse = new JSONArray(resp.asString());
				
				for (int i = 0; i < jsonResponse.length(); i++) {
					if(jsonResponse.getJSONObject(i).getString("name").toUpperCase().equals(cntCodeOrName) ||
							jsonResponse.getJSONObject(i).getString("alpha3Code").toUpperCase().equals(cntCodeOrName)){
						System.out.println("Country capital :"+jsonResponse.getJSONObject(i).getString("capital"));
						System.out.println("County Name : "+jsonResponse.getJSONObject(i).getString("name"));
						System.out.println("Country code : "+jsonResponse.getJSONObject(i).getString("alpha3Code"));
						System.out.println("population "+jsonResponse.getJSONObject(i).getBigInteger("population"));
					break;
					}

				}
				
		}
	}

}
