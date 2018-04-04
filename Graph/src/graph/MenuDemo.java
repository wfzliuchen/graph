package graph;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuDemo extends Frame{
	private PopupMenu pop;//弹出式菜单
	
	public MenuDemo(String str) {
		// TODO Auto-generated constructor stub
		super(str);
		setSize(640,480);
		Menu m1=new Menu("文件");//菜单m1
		m1.add("新建");
		m1.add("打开");
		m1.add("关闭");
		m1.add("退出");
		Menu m2=new Menu("编辑");//菜单m2
		m2.add("撤销");
		m2.add("复制");
		m2.add("删除");
		m2.add("替换");
		m2.add("查找");
		m2.addSeparator();
		m2.add("取消");
		m2.insert("粘贴",2);
		MenuBar mb=new MenuBar();//菜单栏
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);//窗口添加菜单栏
		pop=new PopupMenu("menu");//pop初始化
		pop.add("复制");
		pop.add("粘贴");
		pop.add("取消");
		final TextArea ta=new TextArea(100,100);//文本域
		//ta.setBackground(Color.BLUE);
		ta.add(pop);//添加pop
		ta.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent evt){
				if(evt.isPopupTrigger()){
					System.out.println("popup trigger");
					System.out.println(evt.getComponent());
					System.out.println(""+evt.getX()+" "+evt.getY());
					pop.show(evt.getComponent(), evt.getX(), evt.getY());
				}
			}
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		this.add(ta,BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuDemo("菜单Demo").setVisible(true);
	}

}
