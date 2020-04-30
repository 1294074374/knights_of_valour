package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

	public GamePanel() {
		// 设置背景
		setBackground(Color.GREEN);
	}
	
	/*
	 * 画图方法
	 */
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		// 字体颜色
		g.setColor(Color.YELLOW);
		// 设置字体
		g.setFont(new Font("楷体",Font.BOLD,30));
		// 画文字
		g.drawString("123", 100, 50);
		
		// 画空心矩形
		g.drawRect(100, 20, 100, 100);
		
		
		//实心矩形
		g.setColor(Color.YELLOW);
		g.fillRect(500, 20, 100, 100);
	}
}
