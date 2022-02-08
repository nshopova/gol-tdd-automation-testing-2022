package gol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GameOfLifeTest {

	@Test
	public void deadCellStaysDead_0neighbours() {
		Cell cell = new Cell(false);
		
		cell.getNextGeneration(0);
		
		assertFalse(cell.isAlive());
	}
	
	@Test
	public void aliveCellBecomesDead_0neighbours() {
		Cell cell = new Cell(true);
		
		cell.getNextGeneration(0);
		
		assertFalse(cell.isAlive());
	}
	
	@Test
	public void aliveCellStaysAlive_2neighboiurs() {
		Cell cell = new Cell(true);
		
		cell.getNextGeneration(2);
		
		assertTrue(cell.isAlive());
	}
	
	@Test
	public void deadCellStaysDead_2neighboiurs() {
		Cell cell = new Cell(false);
		
		cell.getNextGeneration(2);
		
		assertFalse(cell.isAlive());
	}
	
	@Test
	public void deadCellBecomesAlive_3neighbours() {
		Cell cell = new Cell(false);
		
		cell.getNextGeneration(3);
		
		assertTrue(cell.isAlive());
	}
	
	@Test
	public void aliveCellBecomesDead_1neighbour() {
		Cell cell = new Cell(true);
		
		cell.getNextGeneration(1);
		
		assertFalse(cell.isAlive());
	}
}
