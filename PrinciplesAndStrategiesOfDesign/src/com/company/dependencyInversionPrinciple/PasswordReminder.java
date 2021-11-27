package com.company.dependencyInversionPrinciple;

public class PasswordReminder {
	private DBConnectionInterface dbConnection;

	// this example brakes the principle because the PasswordReminder depends on a concrete implementation
	// of the DBConnectionInterface (MySqlConnection)

	public PasswordReminder(MySqlConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
}
