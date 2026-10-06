package afranke.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import afranke.controller.controller;

public class GrafikFrame extends JFrame {
    private GrafikPanel grafikPanel = new GrafikPanel();

    public GrafikFrame(ActionListener controler) {
        this.setTitle("Einfaches Spiel");
        this.setVisible(true);
        this.setSize(600, 420);
        this.setLocationRelativeTo(null);
        this.add(this.grafikPanel);

        JButton btn = grafikPanel.getButton();
        btn.addActionListener(controler);
        btn.setActionCommand("ne");

        JTextField jt = grafikPanel.getTxtField(0);
        jt.addActionListener(controler);
        jt.setActionCommand("txt");
    }

    public void setRundenErgebnis(String s) {
        this.grafikPanel.setRundenErgebnis(s);
    }

    public String getRundenErgebnis() {
        return this.grafikPanel.getRundenErgebnis();
    }

    public String getGesamtErgebnis() {
        return this.grafikPanel.getGesamtErgebnis();
    }

    public void setGesamtErgebnis(String s) {
        this.grafikPanel.setGesamtErgebnis(s);
    }

    public String getText(int i) {
        return this.grafikPanel.getTxt(i);
    }

    public void setText(String t, int i) {
        this.grafikPanel.setTxt(t, i);
    }
}