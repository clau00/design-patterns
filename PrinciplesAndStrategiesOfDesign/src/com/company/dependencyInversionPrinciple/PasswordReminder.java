package com.company.dependencyInversionPrinciple;

public class PasswordReminder {
	private DBConnectionInterface dbConnection;

	// this example brakes the principle because the PasswordReminder depends on a concrete implementation
	// of the DBConnectionInterface (MySqlConnection)

	public PasswordReminder(DBConnectionInterface dbConnection) { // changed the concrete implementation "MySqlConnection"
															// with the interface "DBConnectionInterface" (abstraction)
		this.dbConnection = dbConnection;
	}
}

interface DBConnectionInterface {
	public int connect();
}

class MySqlConnection implements DBConnectionInterface {

	@Override
	public int connect() {
		return 1;
	}
}
