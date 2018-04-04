package graph;
/*
 * 在使用边界布局管理器时，如果容器大小发生变化，
 * 内部组件的变化规律如下：组件大小会变化，相对位置不变。
 * 另外，容器5个区域并没有要求必须添加组件，如果中间区域没有组件，
 * 则中间区域将会保留空白；如果四周的区域没有组件，中间区域将会补充
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layout_Border {
	private Button b1,b2,b3,b4,b5;
	private Frame f;
	public Layout_Border() {
		// TODO Auto-generated constructor stub
		b1=new Button("UP");
		b2=new Button("LEFT");
		b3=new Button("DOWN");
		b4=new Button("RIGHT");
		b5=new Button("MIDDLE");
		
	}
	public void show(){
		f=new Frame("BorderLayout方位布局");
		f.setSize(480,640);
		//设置窗口布局为BorderLayout
		f.setLayout(new BorderLayout());
		f.add(BorderLayout.NORTH,b1);
		f.add(BorderLayout.WEST,b2);
		f.add(BorderLayout.SOUTH,b3);
		f.add(BorderLayout.EAST,b4);
		f.add(BorderLayout.CENTER,b5);
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
		Layout_Border lb=new Layout_Border();
		lb.show();
	}

}
