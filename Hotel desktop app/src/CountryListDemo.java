
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
 
import javax.swing.*;
 
public class CountryListDemo extends JFrame implements ActionListener {
    private JLabel labelCountry;
    private JComboBox<Country> comboCountry;
    private JButton buttonSubmit;
     
    public CountryListDemo() throws HeadlessException {
        super("Country List Demo");
     
        initComponents();
         
        setSize(600, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    private void initComponents() {
        labelCountry = new JLabel("Select your country: ");
 
        Country[] listCountry = createCountryList();
        comboCountry = new JComboBox<>(listCountry);
 
        buttonSubmit = new JButton("Submit");
        buttonSubmit.addActionListener(this);
         
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        add(labelCountry);
        add(comboCountry);
        add(buttonSubmit);
         
    }
     
    private Country[] createCountryList() {
        String[] countryCodes = Locale.getISOCountries();
        Country[] listCountry = new Country[countryCodes.length];
 
        for (int i = 0; i < countryCodes.length; i++) {
            Locale locale = new Locale("", countryCodes[i]);
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();
 
            listCountry[i] = new Country(code, name);
        }
 
        Arrays.sort(listCountry);
 
        return listCountry;
    }
     
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                new CountryListDemo().setVisible(true);
            }
        });
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        Country selectedCountry = (Country) comboCountry.getSelectedItem();
         
        JOptionPane.showMessageDialog(this, "You selected country: " + selectedCountry);
    }

    
}
