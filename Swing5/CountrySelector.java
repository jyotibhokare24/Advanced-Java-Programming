/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list. */



package swing2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountrySelector extends JFrame implements ActionListener{
	private JComboBox<String> countryComboBox;
    private JLabel selectedCountryLabel;

    public CountrySelector() {
        setTitle("Country Selector");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JComboBox with country list
        countryComboBox = new JComboBox<>(countries);
        countryComboBox.addActionListener(this);

        // Label to show selected country
        selectedCountryLabel = new JLabel("Select a country from the list");

        // Add components to the frame
        add(countryComboBox);
        add(selectedCountryLabel);

        setLocationRelativeTo(null); // Center the frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedCountry = (String) countryComboBox.getSelectedItem();
        selectedCountryLabel.setText("Selected Country: " + selectedCountry);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountrySelector().setVisible(true);
        });
    }
}

