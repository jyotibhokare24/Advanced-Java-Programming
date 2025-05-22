/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list. */



package swing2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
public class CountryCapitalList extends JFrame {
	private JList<String> countryList;
    private HashMap<String, String> capitalMap;

    public CountryCapitalList() {
        setTitle("Country-Capital Viewer");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Map of countries to capitals
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Varies by country");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create the JList and enable multiple selection if needed
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add selection listener
        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedCountry = countryList.getSelectedValue();
                String capital = capitalMap.get(selectedCountry);
                System.out.println("Capital of " + selectedCountry + " is " + capital);
            }
        });

        // Add the JList to a scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add scroll pane to the frame
        add(scrollPane, BorderLayout.CENTER);

        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryCapitalList().setVisible(true);
        });
    }
}


