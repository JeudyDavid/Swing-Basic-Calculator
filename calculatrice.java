import javax.swing.JTextField;
	import javax.swing.JLabel;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JButton;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;


	public class calculatrice extends JFrame implements ActionListener {
	   
		private static final long serialVersionUID = -2605076458328118334L;
	
		
	private JTextField nb1,nb2;
	   private JLabel resultat;
	    public  calculatrice(){
	      super("Jeudy Calculatrice");
	      this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	      this.setSize(new Dimension( 400,300));
	      this.setLocationRelativeTo(null);

	        JPanel content =  (JPanel) this.getContentPane();
	        content.setLayout(null);

	        JLabel l1 = new JLabel("Premier nombre: ");
	        l1.setBounds(10,20,1000,30);
	        content.add(l1);

	        nb1 = new JTextField();
	        nb1.setBounds(130, 20, 120, 30);
	        content.add(nb1);

	        JLabel l2 = new JLabel("Second nombre: ");
	        l2.setBounds(10,70,1000,30);
	        content.add(l2);

	        nb2 = new JTextField();
	        nb2.setBounds(130,80,120,30);
	        content.add(nb2);

	        JButton ajouter = new JButton("+");
	        ajouter.addActionListener( this);
	        ajouter.setBounds(0,140,90,30);
	        content.add(ajouter);

	        JButton supprimer = new JButton("-");
	        supprimer.addActionListener( this);
	        supprimer.setBounds(100,140,90,30);
	        content.add(supprimer);

	        JButton multiplier = new JButton("*");
	        multiplier.addActionListener( this);
	        multiplier.setBounds(210,140,90,30);
	        content.add(multiplier);

	        JButton diviser = new JButton("/");
	        diviser.addActionListener( this);
	        diviser.setBounds(310,140,90,30);
	        content.add(diviser);

	        resultat = new JLabel("resultat: ");
	        resultat.setBounds(10,190,150,20);
	        content.add(resultat);


	    }
	  @Override
	  public void actionPerformed(ActionEvent e) {
	    if(((JButton)e.getSource()).getText().equals("+")){
	      double n1 = Double.parseDouble(nb1.getText());
	      double n2 = Double.parseDouble(nb2.getText());
	      double s1 = n1 + n2;
	      resultat.setText("resultat: "+s1);
	    }
	    if(((JButton)e.getSource()).getText().equals("-")){
	      double n1 = Double.parseDouble(nb1.getText());
	      double n2 = Double.parseDouble(nb2.getText());
	      double s1 = n1 - n2;
	      resultat.setText("resultat: "+ s1);
	    }
	    if(((JButton)e.getSource()).getText().equals("*")){
	      double n1 = Double.parseDouble(nb1.getText());
	      double n2 = Double.parseDouble(nb2.getText());
	      double s1 = n1 * n2;
	      resultat.setText("resultat: "+ s1);
	    }
	    if(((JButton)e.getSource()).getText().equals("/")){
	      double n1 = Double.parseDouble(nb1.getText());
	      double n2 = Double.parseDouble(nb2.getText());
	      double s1 = n1 / n2;
	      resultat.setText("resultat: "+s1);
	    }
	  }

	    public static void main(String[] args) {
	       calculatrice f = new calculatrice();
	       f.setVisible(true);

	    }


	}
