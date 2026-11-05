package rs.raf.model;

public class Document extends Node{
    private String text;

    public Document(String name){
        super(name);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
