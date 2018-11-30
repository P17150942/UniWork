package lib;

public class ScreenRobot {
	//Fields
	public enum Direction {UP, DOWN, LEFT, RIGHT}
	
	private int x;
	private int y;
	private Direction direction;
	
	
	//Constructors
	
	public ScreenRobot() {
		this.x = 0;
		this. y = 0;
		this.direction = Direction.LEFT;
		
	}
	
	
	//Methods
	
	public void forward(int steps) {
		switch (direction) {
			case UP: y -= steps; break;
			case DOWN: y += steps; break;
			case LEFT: x -= steps; break;
			case RIGHT: x += steps; break;
			
		}
	}
	
	public void turnLeft() {
		switch (direction) {
			case UP: direction = Direction.LEFT; break;
			case DOWN: direction = Direction.RIGHT; break;
			case LEFT: direction = Direction.DOWN; break;
			case RIGHT: direction = Direction.UP; break;
			
		}
	}
	
	public void home() {
		x = 0;
		y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "[coordinates = (" + x + "," + y + "), direction =" +
				direction.toString() + "]";
	}
	
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		ScreenRobot object = (ScreenRobot) obj;
		
		return this.x == object.x && this.y == object.y && this.direction == object.direction;
		
	}
	
}
