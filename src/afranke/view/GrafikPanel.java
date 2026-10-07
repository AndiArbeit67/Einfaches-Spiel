package afranke.view;
import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class GrafikPanel extends JPanel{
    private JLabel rundenErgebnis = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gesamtPunkte = new JLabel("Gesamtpunkte: 30");
    private JTextField[] text = new JTextField[2];
    private JButton button;

    public GrafikPanel() {
        BorderLayout b = new BorderLayout();
        this.setLayout(b);

        for (int i = 0; i < 2; i++) {
            this.getJLabel(i).setOpaque(true);
            this.getJLabel(i).setBackground(Color.WHITE);
        }

        JPanel oben = new JPanel(new GridLayout(3, 2, 2, 1));
        oben.add(new JLabel("Rundenergebnis:", CENTER));
        oben.add(new JLabel("Gesamtpunkte: ", CENTER));
        oben.add(rundenErgebnis);
        oben.add(gesamtPunkte);
        oben.add(new JLabel("Deine Zahl:", CENTER));
        oben.add(new JLabel("Computer:", CENTER));

        JPanel mitte = new JPanel(new GridLayout(1, 2));
        text[0] = new JTextField();
        text[1] = new JTextField();

        text[0].setHorizontalAlignment(JTextField.CENTER);
        text[1].setHorizontalAlignment(JTextField.CENTER);

        text[0].setFont(new Font("Arial", Font.BOLD, 64));
        text[1].setFont(new Font("Arial", Font.BOLD, 64));

        rundenErgebnis.setFont(new Font("Arial", Font.BOLD, 20));
        gesamtPunkte.setFont(new Font("Arial", Font.BOLD, 20));
        rundenErgebnis.setOpaque(true);
        gesamtPunkte.setOpaque(true);
        rundenErgebnis.setBackground(Color.WHITE);
        gesamtPunkte.setBackground(Color.WHITE);
        rundenErgebnis.setHorizontalAlignment(JLabel.CENTER);
        gesamtPunkte.setHorizontalAlignment(JLabel.CENTER);

        mitte.add(text[0]);
        mitte.add(text[1]);
        text[1].setEnabled(false);

        JPanel alles = new JPanel(new GridLayout(2, 2));
        alles.add(oben);
        alles.add(mitte);

        JPanel unten = new JPanel();
        this.button = new JButton("Noch einmal!");
        this.button.setEnabled(false);
        unten.add(this.button);

        this.add(alles, BorderLayout.CENTER);
        this.add(unten, BorderLayout.PAGE_END);
    }
    public void setRundenErgebnis(String s) {
        rundenErgebnis.setText(s);
    }

    public String getRundenErgebnis() {
        return rundenErgebnis.getText();
    }

    public String getGesamtErgebnis() {
        return gesamtPunkte.getText();
    }

    public void setGesamtErgebnis(String s) {
        gesamtPunkte.setText(s);
    }

    public JButton getButton() { return this.button; }

    public String getTxt(int i) {
        return this.text[i].getText();
    }

    public void setTxt(String s, int i) {
        this.text[i].setText(s);
    }

    public JTextField getTxtField(int i) {
        return text[i];
    }
    public JLabel getJLabel(int i) {
        if(i == 0) {
            return this.rundenErgebnis;
        } else {
            return this.gesamtPunkte;
        }
    }
}