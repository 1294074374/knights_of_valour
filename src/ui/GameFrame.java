package ui;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	public GameFrame(){
		// 标题
		setTitle("雪中悍刀行");
		// 大小
		setSize(800,480);
		// 相对位置
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		// 创建窗口
		GameFrame frame = new GameFrame();
		// 创建游戏面板
		GamePanel panel = new GamePanel();
		// 讲面板添加到窗口中
		frame.add(panel);
		// 显示窗体
		frame.setVisible(true);
		
		
		
	}
}
