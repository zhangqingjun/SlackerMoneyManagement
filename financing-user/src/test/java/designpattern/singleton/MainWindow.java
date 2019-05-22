package designpattern.singleton;

public class MainWindow {
    private static MainWindow mainWindow = new MainWindow();
    private MainWindow(){}
    public static MainWindow getMainWindow(){
        return mainWindow;
    }
    public void showMessage(){
        System.out.println("hello world");
    }
    public static void main(String[] args){
        MainWindow mainWindow = MainWindow.getMainWindow();
        mainWindow.showMessage();
    }
}
