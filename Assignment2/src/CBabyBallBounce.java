import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CBabyBallBounce extends JFrame
{
	private JPanel jPCentral;
	private JPanel jPRight;
	private JPanel jPBottom;
	
	public static void main(String[] args)
	{
		CBabyBallBounce frame = new CBabyBallBounce(); //make an instance
		frame.setSize(825, 585); //set frame size
		frame.createGUI(); //call createGUI function
		frame.show(); //show the frame

	}
	
	private void createGUI()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        jPCentral = new JPanel();
        jPCentral.setPreferredSize(new Dimension(615, 430));
        //jPCentral.setBackground(Color.ORANGE);
        jPCentral.setBorder(BorderFactory.createLineBorder(Color.black));
        window.add(jPCentral);

        jPRight = new JPanel();
        jPRight.setPreferredSize(new Dimension(180, 430));
        //jPRight.setBackground(Color.YELLOW);
        jPRight.setBorder(BorderFactory.createLineBorder(Color.black));
        window.add(jPRight);
        
        jPBottom = new JPanel();
        jPBottom.setPreferredSize(new Dimension(800, 100));
        //jPBottom.setBackground(Color.GREEN);
        jPBottom.setBorder(BorderFactory.createLineBorder(Color.black));
        window.add(jPBottom);
	}

}