 import java.applet.*;
 import java.awt.*;
 
 public class B extends Applet
 {
       
    
        public void paint(Graphics g)
        { 
		//Upper Segments
		g.setColor(Color.black);
		g.drawRect(169, 120, 500, 420);
		g.drawRect(169, 120, 166, 100);
		g.drawRect(335, 120, 166, 100);
		g.drawRect(501, 120, 168, 100);
		
		//Filling Room
		g.setColor(Color.pink);
		g.fillRect(336,121,165,99);
		g.fillRect(170,121,165,99);
		g.fillRect(502,121,167,99);
		
		//Upper Footpath 
		g.setColor(Color.black);
		g.drawRect(170, 221, 499, 20);
		g.setColor(Color.lightGray);
		g.fillRect(170, 221, 499, 20);
		
		//Road
		g.setColor(Color.black);
		g.drawRect(170, 242, 499, 98);
		g.setColor(Color.gray);
		g.fillRect(170, 242, 499, 98);
		
		//Lower Footpath
		g.setColor(Color.black);
		g.drawRect(170, 341, 499, 19);
		g.setColor(Color.lightGray);
		g.fillRect(170, 341, 499, 19);
        
		//Lower Segments
		/*Lower Left -- YELLOW -- Segment */
		g.setColor(Color.black);
		g.drawRect(170, 361, 165, 179);
		g.setColor(Color.yellow);
		g.fillRect(170, 361, 165, 179);
		
		/*Lower Middle Upper -- GREEN -- Segment*/
		g.setColor(Color.black);
		g.drawRect(336, 361, 165, 99);
		g.setColor(Color.green);
		g.fillRect(336, 361, 165, 99);
		
		/*Lower Middle Lower -- CYAN -- Segment*/
		g.setColor(Color.black);
		g.drawRect(336, 461, 165, 79);
		g.setColor(Color.cyan);
		g.fillRect(336, 461, 165, 79);

		/*Lower Right -- YELLOW -- Segment*/ 
		g.setColor(Color.black);
		g.drawRect(502, 361, 167, 179);
		g.setColor(Color.yellow);
		g.fillRect(502, 361, 167, 179);
		}
 }