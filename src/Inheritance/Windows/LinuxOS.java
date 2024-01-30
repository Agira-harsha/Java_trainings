package Inheritance.Windows;

public class LinuxOS implements  OperatingSystem {
    private String LinuxName;
    private int width;
    private int height;

    // Constructor
    public LinuxOS(String title, int width, int height) {
        this.LinuxName = title;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    public String getLinuxName() {
        return  LinuxName;
    }

    @Override
    public void start() {
        System.out.println("Starting LinuxOS...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down LinuxOS..."+"\n");
    }

    @Override
    public void displayInfo() {
        System.out.println("Linux Title: " + LinuxName);
        System.out.println("Linux Size: " + width + " x " + height);
    }
}
