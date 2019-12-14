package com.play.bdd.steps;


import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;



public class DataTableStep {

	@Given("I have the following details for play")
	public void i_have_the_following_details_for_play(DataTable dataTable) throws Throwable{

		List<List<String>> data =  dataTable.asLists(String.class);
		for(int i=0; i<data.size();i++) {
		System.out.print("|" +data.get(i).get(0));
		System.out.print("|" +data.get(i).get(1));
		System.out.println("|" +data.get(i).get(2) +"|");
		
		}
	
	}

}
