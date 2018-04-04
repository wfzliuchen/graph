package graph;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 网格布局管理器（GridLayout）使容器中各个组件呈网格状分布，并且每一个网格的大小一致。其构造方法有以下几种。
 * public GridLayout()：默认网格布局管理器只占据一行一列。
 * public GridLayout(int  row,int  col)：创建指定行数和列数的网格布局管理器，组件分配大小是平均的。但是行和列不能同时为零，其中一个为零时，只是表示所有的组件都放置于一行或者一列中。
 * public GridLayout(int row,int col,int horz,int vert)：创建指定行数和列数的网格布局管理器，组件分配大小是平均的。
 * 放置顺序是从左到右、从上到下。
 */
public class Layout_Grid {
	private Frame f;
	private Button b1,b2,b3,b4,b5,b6;
	public Layout_Grid() {
		// TODO Auto-generated constructor stub
		b1=new Button("[0][0]");
		b2=new Button("[0][1]");
		b3=new Button("[0][2]");
		b4=new Button("[1][0]");
		b5=new Button("[1][1]");
		b6=new Button("[1][2]");
		
 	}
	public void show(){
		f=new Frame("GridLayout网格布局");
		f.setSize(480,640);
		//指定网格布局
		f.setLayout(new GridLayout(2,3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_Grid lg=new Layout_Grid();
		lg.show();
	}

}
