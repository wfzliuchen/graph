package graph;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 网格包布局管理器（GridBagLayout）是一个复杂的布局管理器，容器中的组件大小不要求一致。
 * 通常使用网格包布局管理器要涉及到一个辅助类GridBagContraints，
 * 该类包含GridBagLayout类用来保存组件布局大小和位置的全部信息，其使用步骤如下。
 * （1）创建一个网格包布局管理器的对象，并将其设置为当前容器的布局管理器。
 * （2）创建一个GridBagContraints对象。
 * （3）通过GridBagContraints为组件设置布局信息.
 * （4）将组件添加到容器中。
 */
public class Layout_GridBag extends Frame{
	
	private Label l1,l2,l3,l4;
	private TextField tf1,tf2,tf3;
	private Button b1,b2;
	private Checkbox cb1,cb2,cb3,cb4;
	private CheckboxGroup cbg;
	private GridBagLayout gbl;
	private GridBagConstraints gbc;
	
	public Layout_GridBag( String str) {
		super(str);
		
		l1=new Label("用户");
		l2=new Label("密码");
		l3=new Label("重复密码");
		l4=new Label("获取途径");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		
		gbl=new GridBagLayout();
		setLayout(gbl);//设置窗口布局为网格包
		gbc=new GridBagConstraints();//初始化网格包容器
		
		Panel p=new Panel();
		cbg=new CheckboxGroup();
		cb1=new Checkbox("搜索",cbg,false);
		cb2=new Checkbox("广告",cbg,false);
		cb3=new Checkbox("朋友",cbg,false);
		cb4=new Checkbox("其他",cbg,false);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		b1=new Button("提交");
		b2=new Button("重置");
		Panel p1=new Panel();
		p1.add(b1);
		p1.add(b2);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		gbc.fill=GridBagConstraints.HORIZONTAL; //设置fill域
		//向窗口添加组件
		addComponent(l1,0,0,1,1);
		addComponent(tf1,0,2,1,4);
		addComponent(l2,1,0,1,1);
		addComponent(tf2,1,2,1,4);
		addComponent(l3,2,0,1,1);
		addComponent(tf3,2,2,1,4);
		addComponent(l4,4,0,1,1);
		addComponent(p,4,2,1,1);
		addComponent(p1,5,2,1,5);
		
		
	}

	private void addComponent(Component c, int row, int col, int nrow, int ncol) {
		// TODO Auto-generated method stub
		gbc.gridx=col;
		gbc.gridy=row;
		gbc.gridwidth=ncol;
		gbc.gridheight=nrow;
		gbl.setConstraints(c, gbc);
		add(c);
	}

	public static void main(String[] args) {
		Layout_GridBag lgb=new Layout_GridBag("网格包布局");
		lgb.setSize(400,300);
		lgb.setVisible(true);
		
	}

}
