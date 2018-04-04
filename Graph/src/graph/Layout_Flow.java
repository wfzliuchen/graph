package graph;
/*
 * 设置Frame的布局管理器为顺序布局。从运行结果可以看出，
 * 三个按钮按照顺序添加在窗口中，顺序是从左到右、从上到下。
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layout_Flow {
	private Frame f;  //窗口
	private Button b1,b2,b3;//按钮
	public Layout_Flow() {
		// TODO Auto-generated constructor stub
		//初始化按钮
		b1=new Button("OK");
		b2=new Button("Cancel");
		b3=new Button("Continue");
	}
	public void show(){
		f=new Frame("FlowLayout 顺序布局");
		f.setSize(480,640);
		//设置布局管理器
		f.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				f.setVisible(false);
				f.dispose();//释放窗口及其子组件 的屏幕资源
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_Flow lf=new Layout_Flow();
		lf.show();
	}

}
