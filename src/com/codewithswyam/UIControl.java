package com.codewithswyam;

public class UIControl {
    private boolean isEnabled = false;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("Constructor from UIControl Class");
//    }

    public void render() {
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
