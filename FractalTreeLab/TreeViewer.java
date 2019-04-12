import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;
/**
 * Write a description of class TreeViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeViewer extends JFrame
{
    /**
     * Constructor for objects of class TreeViewer
     */
    public TreeViewer()
    {
        this.setLayout(new BorderLayout());
        
        this.setTitle( "Tree Viewer" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        this.setSize(800,400);
        this.add(new TreeComponent(0, 0, 0, 0), BorderLayout.CENTER);
        
        this.pack();
        this.setVisible( true );
    }
    
    public static void main( String[] args )
    {
       TreeViewer thing = new TreeViewer();
    }
}
