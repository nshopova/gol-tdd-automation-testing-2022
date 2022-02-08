package gol;

public class Cell {
	private boolean isAlive;
	
	public Cell(boolean alive) {
		isAlive = alive;
	}
	
	public void getNextGeneration(int neighbours) {
		if((isAlive && neighbours == 2) || neighbours == 3) {
			isAlive = true;
		}
		if(neighbours < 2) {
			isAlive = false;
		}
	}

	public boolean isAlive() {
		return isAlive;
	}

}
