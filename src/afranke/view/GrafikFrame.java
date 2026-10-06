package afranke.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import afranke.controller.controller;

public class GrafikFrame extends JFrame {
    private GrafikPanel grafikPanel = new GrafikPanel();

    public GrafikFrame(ActionListener controler) {
        this.setTitle("Zahlen- Gewinnspiel (v1.0)");
        this.setSize(600, 420);
        this.setLocationRelativeTo(null);
        this.add(this.grafikPanel);

        JButton button = grafikPanel.getButton();
        button.addActionListener(controler);
        button.setActionCommand("xx");

        JTextField text = grafikPanel.getTxtField(0);
        text.addActionListener(controler);
        text.setActionCommand("text");

        this.setVisible(true);
    }

    public GrafikPanel getGrafikPanel(){
        return grafikPanel;
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