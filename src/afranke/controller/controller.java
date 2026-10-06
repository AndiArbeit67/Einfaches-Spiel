package afranke.controller;

import afranke.view.GrafikFrame;

public class controller {
    private GrafikFrame f;
    public controller() {
        this.f = new GrafikFrame();
    }
    public static void main(String[] args) {
        new controller();
    }
}