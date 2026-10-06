package afranke.controller;

import afranke.view.GrafikFrame;

import afranke.model.GewinnModel;

import java.awt.event.*;

public class controller implements ActionListener {
    private GrafikFrame f;
    private int eingabe;
    private GewinnModel gewinnModel = new GewinnModel();

    public controller() {
        this.f = new GrafikFrame(this);
    }
    public static void main(String[] args) {
        new controller();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionL = e.getActionCommand();
        if(actionL.equals("xx")) {
            f.getGrafikPanel().setTxt("", 0);
            f.getGrafikPanel().setTxt("", 1);
            f.getGrafikPanel().setRundenErgebnis("Tippe eine Zahl von 1 bis 9");
            f.getGrafikPanel().getTxtField(0).setEnabled(true);
        }
        if (actionL.equals("text")) {

            eingabe = Integer.parseInt(f.getGrafikPanel().getTxt(0));

            gewinnModel.berechneRunde(eingabe);

            f.getGrafikPanel().setRundenErgebnis("" + gewinnModel.getRundenErgebnis());

            f.getGrafikPanel().setGesamtErgebnis("" + gewinnModel.getGesamtPunkte());

            f.getGrafikPanel().setTxt("" + gewinnModel.getComputerZahl(), 1);


            if (gewinnModel.hatVerloren()) {
                f.getGrafikPanel().setRundenErgebnis("Verloren!");
                f.getGrafikPanel().getTxtField(0).setEnabled(false);
                f.getGrafikPanel().getButton().setEnabled(false);
            }


            if (gewinnModel.hatGewonnen()) {

                f.getGrafikPanel().setRundenErgebnis("Gewonnen!");

                f.getGrafikPanel().getTxtField(0).setEnabled(false);

                f.getGrafikPanel().getButton().setEnabled(false);
            }


            f.getGrafikPanel().getTxtField(0).setEnabled(false);
        }
    }
}
