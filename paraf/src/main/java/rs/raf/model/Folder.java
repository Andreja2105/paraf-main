package rs.raf.model;

import java.util.ArrayList;

public class Folder extends Node {

     private ArrayList<Node> childern;

    public Folder(String name){
        super(name);
        childern = new ArrayList<>();
    }
    public void addChildern(Node child){
        childern.add(child);
    }

    public ArrayList<Node> getChildern() {
        return childern;
    }

    public void setChildern(ArrayList<Node> childern) {
        this.childern = childern;
    }
}
