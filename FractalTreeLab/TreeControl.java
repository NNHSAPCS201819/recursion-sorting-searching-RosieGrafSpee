import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 * Write a description of class TreeControl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeControl extends JPanel
{
    // instance variables - replace the example below with your own
    private JButton chooser; 
    private JButton addCirc; 
    private JButton addSq; 
    private JButton toggle;
    
    private JPanel carousel;
    private DrawingPanel canvas;

    /**
     * Constructor for objects of class TreeControl
     */
    public TreeControl(DrawingPanel canvas)
    {
        this.canvas = canvas;

        this.chooser = new JButton("Tree Color");
        this.addCirc = new JButton("Add circle");
        this.addSq = new JButton("Add square");
        this.toggle = new JButton("Transparent - false");
        this.carousel = new JPanel();
        
        this.setBackground(Color.WHITE);
        
        ButtonListener listener = new ButtonListener();
        
        this.chooser.addActionListener(listener);
        this.addCirc.addActionListener(listener);
        this.addSq.addActionListener(listener);
        this.toggle.addActionListener(listener);
        
        this.add(toggle);
        this.add(chooser);
        this.add(carousel);
        this.add(addCirc);
        this.add(addSq);
    }

    public class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
        }
    }
}
