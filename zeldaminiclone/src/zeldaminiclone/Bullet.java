package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends Rectangle{
	
	public int dir = 1;
	public int speed = 8;
	
	public Bullet(int x, int y, int dir) {
		super(x,y,20,20);
		this.dir = dir;
	}

	public void tick() {
		x+=speed*dir;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
}
