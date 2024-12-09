import java.awt.*;

public class Ball {
	//your code here!
	
		
		private int x;
		private int y;
		private int size;
		private int xVelocity;
		private int yVelocity;
		private int reverseY;
		private int velocity;
		private int reverseX;
								public Ball(int x, int y,int size, int xVelocity, int yVelocity,int reverseY, int reverseX, int velocity) {
						
									this.x = x;
									this.y = y;
									this.size = size;
									this.xVelocity= 2;
									this.yVelocity= 2;
									this.reverseY= 2;
									this.reverseX= 2;
									this.velocity= 3;
								}
								
								
								//getters and setters
							
								public int getXpos() {
									return x;
								}
							
								public void setX(int x) {
									this.x = x;
								}
				
								public void setXVelocity(int newVelocity){
									xVelocity = newVelocity;
								}
								public int getXVelocity() {
									return xVelocity;
								}
								public void setYVelocity(int newVelocity){
									yVelocity = newVelocity;
								}
								public int getYVelocity() {
									return yVelocity;
								}
							
								public int getYpos() {
									return y;
								}
							
								public void setY(int y) {
									this.y = y;
								}
						
								public int getSize() {
									return size;
								}
						
								public void setSize(int size) {
									this.size = size;
								}
								public void setReverseY(int reverseY){
									this.reverseY = reverseY;
								}
								public int getReverseY() {
									return reverseY;
								}
								public void setReverseX(int reverseX){
									this.reverseX = reverseX;
								}
								public int getReverseX() {
									return reverseX;
								}
								public void setVelocity(int velocity){
									this.velocity = velocity;
								}
								public int geVelocity() {
									return velocity;
								}
		public void draw(Graphics g){

		}

	}
	

