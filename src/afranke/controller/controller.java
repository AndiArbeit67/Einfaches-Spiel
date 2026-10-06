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
        if(actionL.equals("ne")) {
            for (int i = 0; i < 2; i++) {
                this.f.setText("", i);
            }
            this.f.setRundenErgebnis("Tippe eine Zahl von 1 bis 9");
        } else if(actionL.equals("txt")) {
            this.eingabe = Integer.parseInt(this.f.getText(0));
            this.gewinnModel.berechneRunde(this.eingabe);
            this.f.setGesamtErgebnis("" + gewinnModel.getGesamtPunkte());
        }
    }

}