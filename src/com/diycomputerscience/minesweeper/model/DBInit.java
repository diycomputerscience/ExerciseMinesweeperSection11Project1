package com.diycomputerscience.minesweeper.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBInit {

	public static boolean schemaExists(Connection conn) throws SQLException {
		DatabaseMetaData dbMeta = conn.getMetaData();
		
		ResultSet rs = dbMeta.getTables(null, null, "BOARD", null);
		if(!rs.next()) {
			return false;
		}
		
		rs = dbMeta.getTables(null, null, "SQUARE_STATUS", null);
		if(!rs.next()) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Creates the following 2 tables
	 * 
	 * TableName: SQUARE_STATUS
	 * ****************************************
	 * * id     * INT PRIMARY KEY             *
	 * ****************************************
	 * * status * VARCHAR(128) UNIQUE NOT NULL*
	 * ****************************************
	 * 
	 * TableName: BOARD
	 * ***************************************************
	 * * row       * INT NOT NULL                        *
	 * ***************************************************
	 * * col       * INT NOT NULL                        *
	 * ***************************************************
	 * * is_mine   * BOOLEAN NOT NULL                    *
	 * ***************************************************
	 * * status_id * INT NOT NULL                        *
	 * ***************************************************
	 * * PRIMARY KEY (row, col)                          *
	 * * FOREIGN KEY status_id to the SQUARE_STATUS table*
	 * ***************************************************
	 * 
	 */
	public static boolean buildSchema(Connection conn) throws SQLException {
		// TODO: Implement this method
		return false;
	}
	
	/**
	 * Adds data to the SQUARE_STATUS table
	 * ************************************
	 * * id    * status                   *
	 * ************************************
	 * * 1     * COVERED                  *
	 * ************************************
	 * * 1     * UNCOVERED                *
	 * ************************************
	 * * 1     * MARKED                   *
	 * ************************************
	 * @param conn
	 * @throws SQLException
	 */
	public static void populateSquareStatus(Connection conn) throws SQLException {
		// TODO: Implement this method
		// TODO: Do not hard code the values, rather use a PreparedStatement and iterate through the SquareState enum		
	}
}
