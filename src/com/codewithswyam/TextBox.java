package com.codewithswyam;

public class TextBox extends UIControl {
    private String text = "";

//    public TextBox() {
//        super(false);
//        System.out.println("Constructor from TextBox Class");
//    }

    @Override
    public void render() {
        System.out.println("Render Text Box");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clearText() {
        text = "";
    }
}
