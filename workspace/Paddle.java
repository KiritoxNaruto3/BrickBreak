import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	
	private int x;
		private int y;
		private int height;
		private int width;
		private int velocity;
		
		Paddle (int x, int y, int width, int height) {
		
			this.x = x;
			this.y = y;
			this.width = width;
		this.height = height;
		velocity = 0;
}
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getWidth() {
	return width;
}

public int getHeight() {
	return height;
}

public int getVelocity() {
	return velocity;
}

public void draw(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(x, y, width, height);
	
}
	public void move(){
		x+= velocity;
	}

}


