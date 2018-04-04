package graph;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameAddedPanel extends Frame{

	public FrameAddedPanel(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameAddedPanel f=new FrameAddedPanel("在Frame中添加Panel");
		Panel p=new Panel(); //创建Panel
		f.setSize(480,640); //设置窗口大小
		f.setBackground(Color.blue);//设置窗口颜色
		f.setLayout(null);//取消布局管理器
		p.setSize(240,320);//设置面板p的大小
		p.setBackground(Color.red);//设置面板p颜色
		f.add(p);//把面板添加到窗口
		f.setVisible(true);//显示窗口
		f.addWindowListener(f.new Mywindowadapter());
		
	}
	//添加window关闭事件处理
	class Mywindowadapter extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
}
