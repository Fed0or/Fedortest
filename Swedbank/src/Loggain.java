import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Loggain implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	// https://www.youtube.com/watch?v=iE8tZ0hn2Ws&ab_channel=AlexLee

	public static void main(String[] args) {
		//Börjar med göra en  Frame ( JFrame ) JPanel panel = new JPanel();
		// Sen gör du en panel i framen (JPanel ) JFrame frame = new JFrame();
		// sen gör du setsize av framen
		// sen gör du close operation
		// Här lägger du en titel på framen
		// sen gör du den synlig
		//sen addar du paneln till framen och ta upp Jpanel upp  i koden så den syns
		
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Kan du ta dig in?");
		frame.setVisible(true);
		frame.add(panel);
		
		// Nu ska vi börja med göra i ordning paneln
		// Vi ska först lägga en layout men den kan du ändra sen panel.setLayout(null);
		// Sen importerar du in label ( JLabel ) detta är text bredvid din filk för senare 
		// efter du gjort label måste du lägga den på din panel , genom panel.add(label);
		
		panel.setLayout(null);
		userLabel = new JLabel("Namn");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		// Nu gör vi filken som folk kan skriva sina uppgifter i
		// börja med importera koden in ( JTextField userText = new JTextField(HÄR SKRIVER VI LÄNGDEN SOM AV BOKSTÄVER FOLK KAN SKRIVA I); )
		// Sen skriv in storlek av usertext var den ska vara i paneln  userText.setBounds(100, 20, 165, 25);
		//Sen importera det i paneln som processen innan panel.add(userText);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		// Nu gör vi en lösenord text för filken JLabel passwordLabel = new JLabel("Lösenord");
		// steg 2 som innan var på skärmen texten ska vara
		// steg 3 adda den till paneln som alla andra panel.add(passwordLabel);
		
		passwordLabel = new JLabel("Lösenord");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		//Nu ska vi göra Lösenord filken , men lösenorden ska vara osynlig när man skriver
		// Steg 2 klicka o lägg in Swing koden JPasswordField passwordText = new JPasswordField();
		// Steg 3 Lägg den till paneln
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		//Nu ska vi lägga till knappar
		// Klicka och lägga till koden(swingen)JButton JButton button = new JButton("Logga in");
		// steg 2 Storlek av knappen
		// Steg 3 Vad som händer om man trycker logga in button.addActionListener(null);
		// STEG 4 glöm inte lägga implements ActionListener i public class på rad 11 , du klickar sedan och lägger in swingen i koden
		// Steg 5  lägg till i paneln
	
		
		button = new JButton("Logga in");
		button.setBounds(10, 80, 90, 25);
		button.addActionListener(new Loggain());
		panel.add(button);
		
		// Vad som ska visas om man lyckas logga in 
		// storlek
		// Lägg i paneln
		// steg 4 vad ska visas om rätt inloggning sker , detta döljer vi just nu.
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		// success.setText("Inloggad din kuksugare");
		
		
		
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Nu kodar vi hur LOGGA IN knappen ska agera när man trycker
		
		//Innan vi fortsätter Måste vi göra private static som rad 13 - 18 .
		// System.out.println("Inloggad"); 
		
		String user = userText.getText();
		String password = passwordText.getText();
		// System.out.println(user + ", " + password); DENNA KODEN GÖR SÅ JA KAN SE I KONSOLEN OM NÅGON MISSLYCKAS LOGGA IN
		
		//Nu gör if ifstatment, om lösenord o namn är rätt så ska den logga in
		// Vi kan göra flera användernamn med lösenord som ni ser på rad 129 och 134
		// steg success.setText("Du har hackat systemet");
		// betyder att om du skrivit rätt inloggning får du " du hackat systemet "
		
		if(user.equals("fedor") && password.equals("raman")) {
			
			success.setText("Du har hackat systemet");
			
			
		} else {
            // System.out.println("fel");
			success.setText("Är du trög?");
			
			if(user.equals("ali") && password.equals("loki")) {
				success.setText("Du har hackat systemet");
				
				
			}
			if(user.equals("arwin") && password.equals("tinkie")) {
				success.setText("Du har hackat systemet");
				
				
			}
        }
    }
		
	
		
		
		
	

}
