package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

	public GamePanel() {
		// ���ñ���
		setBackground(Color.GREEN);
	}
	
	/*
	 * ��ͼ����
	 */
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		// ������ɫ
		g.setColor(Color.YELLOW);
		// ��������
		g.setFont(new Font("����",Font.BOLD,30));
		// ������
		g.drawString("123", 100, 50);
		
		// �����ľ���
		g.drawRect(100, 20, 100, 100);
		
		
		//ʵ�ľ���
		g.setColor(Color.YELLOW);
		g.fillRect(500, 20, 100, 100);
	}
}
