/*Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/



package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImageButtonDemo extends JFrame implements ActionListener{
	 private JButton digitalClockButton;
	    private JButton hourGlassButton;
	    private JLabel messageLabel;

	    public ImageButtonDemo() {
	        setTitle("Image Button Demo");
	        setSize(400, 250);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Load images (adjust path as needed)
	        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

	        // Create buttons with images and text below
	        digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
	        digitalClockButton.setVerticalTextPosition(SwingConstants.BOTTOM);
	        digitalClockButton.setHorizontalTextPosition(SwingConstants.CENTER);

	        hourGlassButton = new JButton("Hour Glass", hourGlassIcon);
	        hourGlassButton.setVerticalTextPosition(SwingConstants.BOTTOM);
	        hourGlassButton.setHorizontalTextPosition(SwingConstants.CENTER);

	        // Add action listeners
	        digitalClockButton.addActionListener(this);
	        hourGlassButton.addActionListener(this);

	        // Label to show messages
	        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);
	        messageLabel.setPreferredSize(new Dimension(350, 30));

	        // Add components to frame
	        add(digitalClockButton);
	        add(hourGlassButton);
	        add(messageLabel);

	        setLocationRelativeTo(null); // Center the frame
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == digitalClockButton) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == hourGlassButton) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new ImageButtonDemo().setVisible(true);
	        });
	    }
	}

