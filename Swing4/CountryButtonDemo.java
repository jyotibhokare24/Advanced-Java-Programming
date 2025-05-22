/*. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/



package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryButtonDemo extends JFrame implements ActionListener {
	 private JButton srilankaButton;
	    private JButton indiaButton;
	    private JLabel messageLabel;

	    public CountryButtonDemo() {
	        // Frame settings
	        setTitle("Country Button Demo");
	        setSize(400, 150);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Create buttons
	        srilankaButton = new JButton("Srilanka");
	        indiaButton = new JButton("India");

	        // Add action listeners
	        srilankaButton.addActionListener(this);
	        indiaButton.addActionListener(this);

	        // Create label for displaying messages
	        messageLabel = new JLabel("Press a button");

	        // Add components to frame
	        add(srilankaButton);
	        add(indiaButton);
	        add(messageLabel);

	        // Center the frame on screen
	        setLocationRelativeTo(null);
	    }

	    // Handle button clicks
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == srilankaButton) {
	            messageLabel.setText("Srilanka is pressed");
	        } else if (e.getSource() == indiaButton) {
	            messageLabel.setText("India is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        // Create and show the frame
	        SwingUtilities.invokeLater(() -> {
	            new CountryButtonDemo().setVisible(true);
	        });
	    }
	}


