package Inheritance.Windows;

public class WindowRunner {
    public static void main(String[] args) {
        Window windowNormalVersion=new Window("Window 1.0v",24,26);
        windowNormalVersion.displayInfo();
        windowNormalVersion.start();
        windowNormalVersion.shutDown();
        Windows10 windows10=new Windows10("window 10.0V",25,26,"brown","i7");
        windows10.displayInfo();
        windows10.start();
        windows10.assistant();
        windows10.shutDown();
    }
}
