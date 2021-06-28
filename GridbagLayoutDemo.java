import java.awt.*;
import java.awt.event.*;
class GridbagLayoutDemo extends Frame
{
	Panel p;
	GridBagConstraints c;
	GridbagLayoutDemo()
	{
		super("GridbagLayout");
		p = new Panel();
		p.setLayout(new GridBagLayout());
		c= new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;  //componet prows in both direction
		c.insets = new Insets(5,5,5,5);	//5 px margin on all side
		c.gridx= 0;  //colomn
		c.gridy=0;   //row
		c.gridwidth = 4;  
		c.gridheight = 4;
		c.weightx = c.weighty = 1.0;
		p.add(new Button("Btn1"), c);

		c.gridx= 4;  //colomn
		c.gridy=0;   //row
		c.gridwidth = 1;  
		c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn2"), c);

		c.gridx= 4;  //colomn
		c.gridy=1;   //row
		c.gridwidth = 1;  
		c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn3"), c);

		c.gridx= 4;  //colomn
		c.gridy=2;   //row
		c.gridwidth = 1;  
		c.gridheight = 2;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn4"), c);
		
		c.gridx= 0;  //colomn
		c.gridy=4;   //row
		c.gridwidth = 1;  
		c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn5"), c);
	
		c.gridx= 2;  //colomn
		c.gridy=4;   //row
		c.gridwidth = 1;  
		c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn6"), c);

		c.gridx= 3;  //colomn
		c.gridy=4;   //row
		c.gridwidth = 2;  
		c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn7"), c);
		
		c.gridx= 1;  //colomn
		c.gridy=5;   //row
		c.gridwidth = 1;  
		c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn8"), c);
		
		c.gridx= 3;  //colomn
		c.gridy=5;   //row
		c.gridwidth = 1;  
		c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		p.add(new Button("Btn9"), c);

		add(p);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		GridbagLayoutDemo g = new GridbagLayoutDemo();
	}
}						