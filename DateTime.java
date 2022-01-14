import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;


/** Create an applet that displays date and time on it */

public class DateTime extends Applet implements Runnable{
	Date d;
	Thread th;
	
	public void init(){
		d=new Date();
		th =new Thread(this);
		th.start();
	}
	
	public void paint (Graphics g){
            g.drawString(d.toString(), 50, 100);
		
	}
	public void run(){
		while (true){
			d=new Date();     
			try{
                   th.sleep(1000);  
             }
            catch(InterruptedException e){
				e.printStackTrace();
			}
			this.repaint();
			
			
		}
		
		
		
	}	
	
}