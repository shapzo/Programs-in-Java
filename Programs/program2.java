import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class program2 extends JFrame{
	JLabel a,b,c,d,e,f,g,i;

    public program2() {
    	setLayout(null);
         a= new JLabel("Rodrigo");
    	 b= new JLabel("Paternal Grandfather");
    	 c= new JLabel("Dad");
         d= new JLabel("Maternal Grandfather");
    	 e= new JLabel("Paternal Grandfather");
    	 f= new JLabel("Mom");
    	 g= new JLabel("Maternal Grandfather");
    	 i= new JLabel();
    	 
    	 i.setIcon(new ImageIcon("image2.jpg"));
    	 
    	 a.setForeground(Color.red);
    	 b.setForeground(Color.cyan);
    	 c.setForeground(Color.orange);
    	 d.setForeground(Color.green);
    	 e.setForeground(Color.blue);
    	 f.setForeground(Color.LIGHT_GRAY);
    	 g.setForeground(Color.MAGENTA);
   
    	a.setBounds(212,360,150,30);
    	
    	b.setBounds(30,150,150,30);
    	c.setBounds(30,250,150,30);
    	d.setBounds(30,450,150,30);
    	
    	e.setBounds(300,150,150,30);
    	f.setBounds(300,250,150,30);
    	g.setBounds(300,450,150,30);
    	
    	i.setBounds(1,1,466,466);
    	

    	add(a);
    	add(b);
    	add(c);
    	add(d);
    	add(e);
    	add(f);
    	add(g);
    	add(i);
    }
    
    public static void main (String[]args){
    	program2 a=new program2();
    	
    	a.setSize(466,466);
    	a.setVisible(true);
    	
    	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    }
    
    
}