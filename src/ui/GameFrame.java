package ui;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	public GameFrame(){
		// ����
		setTitle("ѩ�к�����");
		// ��С
		setSize(800,480);
		// ���λ��
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		// ��������
		GameFrame frame = new GameFrame();
		// ������Ϸ���
		GamePanel panel = new GamePanel();
		// �������ӵ�������
		frame.add(panel);
		// ��ʾ����
		frame.setVisible(true);
		
		
		
	}
}
