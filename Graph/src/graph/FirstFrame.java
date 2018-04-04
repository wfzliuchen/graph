package graph;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstFrame extends Frame {
	public FirstFrame(String str){
		super(str);
	}
	//添加window关闭事件处理
	class Mywindowadapter extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstFrame fm=new FirstFrame("这是一个Frame");
		fm.setSize(480,640);
		fm.setBackground(Color.yellow);
		fm.setVisible(true);
		//窗口对象实例化后默认大小为0，且不可见必须使用setSize() 和setVisible()

		
		//添加事件处理方法,默认窗口无法关闭
		fm.addWindowListener(fm.new Mywindowadapter());
	}
	

}
