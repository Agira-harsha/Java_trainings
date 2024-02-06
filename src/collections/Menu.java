package collections;

import java.lang.Iterable;
import java.util.Iterator;
public class Menu {
    public static void main(String[] args){
        CakeShop menu = new CakeShop();
        menu.addCake("Vanilla Cake");
        menu.addCake("Chocolate Cake");
        menu.addCake("Pineapple Cake");
        menu.addCake("Cheese Cake");
        menu.addCake("Strawberry Cake");
        System.out.println("Printing Menu using Iterator");
        Iterator<String> iter = menu.iterator();


        while(iter.hasNext()){
            String cake = iter.next();
            if(cake.equals("Pineapple Cake")){
                iter.remove();
            }else{

                System.out.println(cake);
            }
        }



    }
}
