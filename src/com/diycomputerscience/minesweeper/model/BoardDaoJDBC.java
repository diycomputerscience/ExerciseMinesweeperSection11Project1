package com.diycomputerscience.minesweeper.model;

import java.sql.Connection;

import org.apache.log4j.Logger;

import com.diycomputerscience.minesweeper.Board;

public class BoardDaoJDBC implements BoardDao {

	private static Logger logger = Logger.getLogger(BoardDaoJDBC.class);
	
	/**
	 * @see BoardDao
	 */
	@Override	
	public Board load(Connection conn) throws PersistenceException {
		// TODO: Implement this method
		Board board = null;
		return board;		
	}

	@Override
	public void save(Connection conn, Board board) throws PersistenceException {
		// TODO; Implement this method
	}

	@Override
	public void delete(Connection conn) throws PersistenceException {
		// TODO: Implement this method		
	}

}
