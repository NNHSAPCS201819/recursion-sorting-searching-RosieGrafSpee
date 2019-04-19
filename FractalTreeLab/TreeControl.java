
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
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
    private Color line;
    private JButton color; 
    private JPanel display;
    private JSlider left; 
    private JSlider right;
    private JSlider size;
    private JSlider branch;
    
    private JPanel carousel;
    private DrawingPanel canvas;

    /**
     * Constructor for objects of class TreeControl
     */
    public TreeControl(DrawingPanel canvas)
    {
        this.setBackground(Color.WHITE);
        this.canvas = canvas;
        
        this.line = Color.BLACK;

        this.color = new JButton("Change color");
        this.color.addActionListener(new ButtonListener());
        this.display = new JPanel();
        this.display.setBackground(line);
        
        this.left = new JSlider(0, 180);
        JLabel first = new JLabel("Angle to the left");
        this.left.addChangeListener(new SliderListener());
        
        this.left.setPaintTrack(true);
        this.left.setPaintTicks(true);
        this.left.setPaintLabels(true);
        this.left.setMajorTickSpacing(30);
        
        this.right = new JSlider(0, 180);
        JLabel second = new JLabel("Angle to the right");
        this.right.addChangeListener(new SliderListener());
        
        this.right.setPaintTrack(true);
        this.right.setPaintTicks(true);
        this.right.setPaintLabels(true);
        this.right.setMajorTickSpacing(30);
        
        this.size = new JSlider(0, java.lang.Math.min((int)canvas.getPreferredSize().getHeight(), (int)canvas.getPreferredSize().getWidth()));
        JLabel third = new JLabel("Size of trunk");
        this.size.addChangeListener(new SliderListener());
        
        this.size.setPaintTrack(true);
        this.size.setPaintTicks(true);
        this.size.setPaintLabels(true);
        this.size.setMajorTickSpacing(java.lang.Math.min((int)canvas.getPreferredSize().getHeight(), (int)canvas.getPreferredSize().getWidth()) / 5);
        
        this.branch = new JSlider(2, 22);
        JLabel fourth = new JLabel("Ratio between branches");
        this.branch.addChangeListener(new SliderListener());
        
        this.branch.setPaintTrack(true);
        this.branch.setPaintTicks(true);
        this.branch.setPaintLabels(true);
        this.branch.setMajorTickSpacing(2);
        
        
        this.add(color);
        this.add(display);
        this.add(first);
        this.add(left);
        
        this.add(second);
        this.add(right);
        
        this.add(third);
        this.add(size);
        
        this.add(fourth);
        this.add(branch);
    }

    public class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            canvas.pickColor();
            canvas.repaint();
            line = canvas.getColor();
            display.setBackground(line);
        }
    }
    
    public class SliderListener implements ChangeListener
    {
        public void stateChanged (ChangeEvent e)
        {
            if (e.getSource() == left)
            {
                canvas.setLeft(Math.toRadians(left.getValue()));
                canvas.repaint();
            }
            
            if (e.getSource() == right)
            {
                canvas.setRight(Math.toRadians(right.getValue()));
                canvas.repaint();
            }
            
            if (e.getSource() == size)
            {
                canvas.setScale(size.getValue());
                canvas.repaint();
            }
            
            if (e.getSource() == branch)
            {
                canvas.setBranch(branch.getValue());
                canvas.repaint();
            }
        }
    }
}
