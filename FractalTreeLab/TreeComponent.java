import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.lang.Math.*;

/**
 * Write a description of class DrawingPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeComponent
{
    private double l_deg, r_deg, orient, br_size, scale;
    private Point2D.Double base;

    /**
     * Constructor for objects of class TreeComponent
     */
    public TreeComponent(double l_deg, double r_deg, double orient, double br_size, double scale, Point2D.Double loc)
    {
        this.l_deg = l_deg;
        this.r_deg = r_deg;
        this.orient = orient;
        this.br_size = br_size;
        this.scale = scale;
        this.base = loc;
    }
    
    public void drawTree(Graphics2D g)
    {
        Point2D.Double end = new Point2D.Double(base.getX() + br_size * Math.cos(orient), base.getY() + br_size * Math.sin(orient));
        TreeComponent a = new TreeComponent(l_deg, r_deg, orient + l_deg, br_size / scale, scale, end);
        TreeComponent b = new TreeComponent(l_deg, r_deg, orient - r_deg, br_size / scale, scale, end);
        if (br_size > 1)
        {
            a.drawTree(g);
            b.drawTree(g);
        }
        
        g.drawLine((int)this.base.getX(), (int)this.base.getY(), (int)end.getX(), (int)end.getY());
    }
}