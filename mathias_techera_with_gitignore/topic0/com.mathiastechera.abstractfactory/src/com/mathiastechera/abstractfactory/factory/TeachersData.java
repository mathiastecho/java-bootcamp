package com.mathiastechera.abstractfactory.factory;

public class TeachersData implements PersonDB {

	@Override
	public void getTheNames() {
		//connect with the DB trough JDBC and return the teachers names.
		System.out.println("The teachers names are: Teacher1, Teacher2, Teacher3");
		
	}

}