package methodoverloading;

public class Calculater {
    public static void main(String[] args) {
        Operaters operaters = new Operaters();
        //method overloading for add
        operaters.add(30,34);//addion
        operaters.add(4.4,55);//one int and another double
        operaters.add(4.5,6.8);//double

        operaters.minus(45,56);
        operaters.minus(5.5,67);


    }


}
