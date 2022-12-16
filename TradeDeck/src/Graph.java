import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Graph extends JPanel {
    int[] cordx={40,80,120,160};
    int[] cordy={220,180,240,200};
    int marg=20;
    
    protected void paintComponent(Graphics grf){
        super.paintComponent(grf);
        Graphics2D graph=(Graphics2D)grf;
        //get the height and width
        int height = getHeight();
        int width= getWidth();
        //x-axis
        graph.draw(new Line2D.Double(marg,height-marg,width-marg,height-marg));
       
        //y-axis
        graph.draw(new Line2D.Double(marg,marg,marg,height-marg));
        
        //changing the color
        //vertical grigfs
        int xstart=0;
        for(int i=2;i<marg;i++){
            xstart=i*(width/20);
            graph.drawLine(xstart,10+marg,xstart,height-marg);
        }
        //horizontal grids
        int ystart=0;
        for(int i=1;i<13;i++){
            ystart=i*(width/21);
            graph.drawLine(marg,ystart,width-marg,ystart);
        }
        
        
        for(int i=0;i<cordx.length;i++){
            int x=marg+cordx[i];
            int y=height-marg-cordy[i];
           graph.fill(new Ellipse2D.Double(x,y,10,10)); 
        }
    }
}
