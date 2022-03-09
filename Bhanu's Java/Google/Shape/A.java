 import java.applet.*;
 import java.awt.*;
 
 public class A extends Applet
 {
       
    
        public void paint(Graphics g)
        {
		g.setColor(Color.red);
        g.drawRect(170, 100, 30, 30);
		g.fillRect(170,100,30,30);
		g.drawLine(20,30,20,300);
		g.drawOval(70,200,30,30);
		g.setColor(Color.pink);
		g.fillOval(70,200,30,30);
		g.drawArc(90,150,30,30,30,270);
		g.fillArc(270,150,30,30,0,180);
		
        }
 }