package game;

import java.awt.Graphics;

import main.Contents;

public class Racket extends GraphicObject {
	private int width;
	private int height;
	private char upkey = 'a';
	private char downkey = 'z';
	private float speed = 10;
	private Player player; 
	
	private String shape = "RECT";
	
	public Racket(Player player) {
		width = 20;
		height = 100;
		tilt = 0;
		this.player = player;
	}
	
	@Override
	public void draw(Graphics g) {
		
		switch(shape) {
			case "RECT":
				g.drawRect(Math.round(xpos - width/2), Math.round(ypos - height/2), width, height);
				break;
		}
		
		
	}
	
	public char getUpkey() {
		return upkey;
	}

	public void setUpkey(char upkey) {
		this.upkey = upkey;
	}

	public char getDownkey() {
		return downkey;
	}

	public void setDownkey(char downkey) {
		this.downkey = downkey;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void move() {
		switch (player.getId()) {
			case 0:
				if(Contents.KeysPressed.A) {
					ypos -= speed;
				}
				if(Contents.KeysPressed.Z) {
					ypos += speed;
				}
				break;

			case 1:
				if(Contents.KeysPressed.L) {
					ypos -= speed;
				}
				if(Contents.KeysPressed.comma) {
					ypos += speed;
				}
				break;
		}
	}
}
