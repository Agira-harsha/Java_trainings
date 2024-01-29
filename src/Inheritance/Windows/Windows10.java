package Inheritance.Windows;

public class Windows10 extends Window{

    private  String  color;
    private String processer;

    public Windows10(String title, int width, int height, String color, String processer) {
        super(title, width, height);
        this.color=color;
        this.processer=processer;

    }

    public String getProcesser() {
        return processer;
    }

    public void setProcesser(String processer) {
        this.processer = processer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void assistant(){
        System.out.println( "Microsoft's voice assistant Started !! try to speak and lunch Applications");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Window Proceser:"+processer);
        System.out.println("Window color :"+color);
    }
}
