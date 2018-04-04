package graph;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 卡片布局管理器（CardLayout）将每一个组件视为一张卡片，一次只能看到一张卡片，容器充当卡片的堆栈，
 * 容器第一次显示的是第一次添加的组件。构造方法有以下几种。
 * public CardLayout()：创建一个新卡片的布局，水平间距和垂直间距都是0.
 * public CardLayout(int hgap,int vgap)：创建一个具有指定水平间距和垂直间距的新卡片布局。
 */

/*
 * 还有一些比较重要的方法，如下所示。
 * void first(Container parent)：翻转到容器的第一张卡片。
 * void next(Container parent)：翻转到指定容器的下一张卡片。
 * void last(Container parent)：翻转到容器的最后一张卡片。
 * void previous(Container parent)：翻转到指定容器的前一张卡片。
*/
/*
 * 注意：在程序中，由于经常操作卡片之间的跳转，必须将卡片布局管理CardLayout实例化保留句柄，方便以后处理时使用
 */
public class Layout_Card extends Frame implements MouseListener{
	private Panel cards=new Panel();//声明、初始化面板cards
	private CardLayout cl=new CardLayout(); //声明、初始化一个CradLayout布局
	private Button first=new Button("First Card");//声明、初始化按钮
	private Button second=new  Button("Second Card");
	private Button third=new Button("Third Card"); 
	public Layout_Card(String str) {
		// TODO Auto-generated constructor stub
		super(str);
		init();
	}

	private void init() {	
		setLayout(new BorderLayout());//窗口布局为BordLayout
		setSize(480,640);
		
		Panel p=new Panel();//创建、初始化面板p
		p.setLayout(new FlowLayout()); //面板p的布局为FlowLayout
		//为按钮添加鼠标监听器
		first.addMouseListener(this);
		second.addMouseListener(this);
		third.addMouseListener(this);
		//在p中添加按钮
		p.add(first);
		p.add(second);
		p.add(third);
		//把p添加到窗口
		add("North",p);
		
		cards.setLayout(cl);//给面板cards添加卡片布局
		cards.add("First card",new Button("this is first card"));//给cards添加按钮,字符串表示按钮的名字
		cards.add("Second card",new Button("this is second card"));
		cards.add("Third card",new Button("this is third card"));
		add("Center",cards);//将cards添加到窗口
		//设置关闭功能
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
		//显示窗口
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Layout_Card("CardLayout卡片布局");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==first){
			cl.first(cards);//显示第一张
		}
		if(e.getSource()==second){
			cl.first(cards);
			cl.next(cards); //显示第二张
		}
		if(e.getSource()==third){
			cl.last(cards);//最后一张
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
