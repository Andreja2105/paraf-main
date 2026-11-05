package rs.raf.core;


import rs.raf.gui.swing.MainFrame;

public class ApplicationFramework {

    public ApplicationFramework(){

    }

    public void initialize() {
        MainFrame mainFrame = new MainFrame();

        mainFrame.setVisible(true);

    }

}
