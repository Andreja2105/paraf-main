package rs.raf.core;


import rs.raf.gui.swing.MainFrame;

public class ApplicationFramework {

    private static ApplicationFramework instance;

    private ApplicationFramework(){

    }

    public void initialize() {
        MainFrame mainFrame = new MainFrame();

        mainFrame.setVisible(true);

    }

}
