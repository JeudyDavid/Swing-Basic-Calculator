package core;

import javax.swing.*;
import java.awt.*;

public class view{
    private JTextField nb1,nb2;
    private JLabel resultat;
    private JFrame jfr;
    private JLabel l1,l2;
    private JButton ajouter, supprimer, multiplier, diviser;

    public JTextField getNb1() {
        return nb1;
    }
    public void setNb1(JTextField nb1) {
        this.nb1 = nb1;
    }
    public JTextField getNb2() {
        return nb2;
    }
    public void setNb2(JTextField nb2) {
        this.nb2 = nb2;
    }
    public JLabel getResultat() {
        return resultat;
    }
    public void setResultat(JLabel resultat) {
        this.resultat = resultat;
    }
    public JFrame getJfr() {
        return jfr;
    }
    public void setJfr(JFrame jfr) {
        this.jfr = jfr;
    }
    public JLabel getL1() {
        return l1;
    }
    public void setL1(JLabel l1) {
        this.l1 = l1;
    }
    public JLabel getL2() {
        return l2;
    }
    public void setL2(JLabel l2) {
        this.l2 = l2;
    }
    public JButton getAjouter() {
        return ajouter;
    }
    public void setAjouter(JButton ajouter) {
        this.ajouter = ajouter;
    }
    public JButton getSupprimer() {
        return supprimer;
    }
    public void setSupprimer(JButton supprimer) {
        this.supprimer = supprimer;
    }
    public JButton getMultiplier() {
        return multiplier;
    }
    public void setMultiplier(JButton multiplier) {
        this.multiplier = multiplier;
    }
    public JButton getDiviser() {
        return diviser;
    }
    public void setDiviser(JButton diviser) {
        this.diviser = diviser;
    }



    public view(String title){
        jfr = new JFrame(title);
        jfr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jfr.setSize(new Dimension( 400,300));
        jfr.setLocationRelativeTo(null);

        JPanel content =  (JPanel) jfr.getContentPane();
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

        ajouter = new JButton("+");
        ajouter.setBounds(0,140,90,30);
        content.add(ajouter);

        supprimer = new JButton("-");
        supprimer.setBounds(100,140,90,30);
        content.add(supprimer);

        multiplier = new JButton("*");
        multiplier.setBounds(210,140,90,30);
        content.add(multiplier);

        diviser = new JButton("/");
        diviser.setBounds(310,140,90,30);
        content.add(diviser);

        resultat = new JLabel("resultat: ");
        resultat.setBounds(10,190,150,20);
        content.add(resultat);

        jfr.setVisible(true);
    }
}