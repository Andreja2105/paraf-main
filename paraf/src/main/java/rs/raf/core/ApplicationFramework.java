package rs.raf.core;


import rs.raf.gui.swing.MainFrame;
import rs.raf.model.Folder;

public class ApplicationFramework {

    private static ApplicationFramework instance;

    public static ApplicationFramework getInstance(){
        if (instance == null)
            instance = new ApplicationFramework();

        return instance;
    }
    private static Folder project;

    private ApplicationFramework(Folder project){
        this.project = project;
    }

    public void initialize() {
        MainFrame mainFrame = MainFrame.getInstance();

        mainFrame.setVisible(true);

    }

}
