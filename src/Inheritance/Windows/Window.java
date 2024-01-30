package Inheritance.Windows;

class Window  implements  OperatingSystem{
    private String WindowName;
    private int width;
    private int height;

    // Constructor
    public Window(String title, int width, int height) {
        this.WindowName = title;
        this.width = width;
        this.height = height;
    }

    // Getter methods for encapsulation
    public String getTitle() {
        return WindowName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Method to display window information
    public void displayInfo() {
        System.out.println("Window Title: " + WindowName);
        System.out.println("Window Size: " + width + " x " + height);
    }
    public void start() {
        System.out.println("Starting Windows...");
    }

    public void shutDown() {
        System.out.println("Shutting down Windows..."+"\n");
    }

    public void update() {
        System.out.println("Checking for updates...");
    }
}
