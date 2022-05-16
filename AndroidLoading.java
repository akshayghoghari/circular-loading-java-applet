/*<applet code="AndroidLoading" width="1000" height="1000">
</applet>*/
import java.awt.*;
import java.applet.*;
public class AndroidLoading extends Applet implements Runnable
{
	Thread t;
	int i,j=0,k=0,l,cx=0;
	boolean b=false;
	public void init()
	{
		t=new Thread(this);
	}
	public void start()
	{
		t.start();
	}
	public void paint(Graphics g)
	{
		g.drawArc(300,300,300,300,i+l,j);
		g.drawArc(299,299,302,302,i+l,j);
		
	}
	public void run()
	{
		while(true)
		{
		
			for(i=0;i<=360;i++)
			{
				repaint();
				try
					{
					t.sleep(5);
					}
					catch(Exception e)
					{
					}
				if(b==false)
				{
					if(j>=200)
					{
						b=true;
						cx=1;
					}
					if(cx>=3)
					{	
						l++;
					}
					cx++;
					j++;
					
					
					
				}
				else
				{
					if(j==0)
					{
						b=false;
						cx=0;
					}
					j--;
					if(cx>=3)
					{	
						l++;
					}
					cx++;
				}
				
			}
		}
		
		
		
		
	}
}
