package com;

import java.sql.SQLException;

import db.ConnectionProvider;

public class ConnectionTest {
public static void main(String[] args) throws SQLException {
	ConnectionProvider cp=new ConnectionProvider();
	cp.connectDatabase();
	System.out.println("Database Connectiod");
	
}
}
