/*
 * 
 * This program uses the Builder Design Pattern to show the ingredents required for a Dessert
 * 
 */


public class DerssertBuilder {
    public static void main(String args[]) 
    {
     
        Dessert cake = new Dessert.Builder()            //Creating object using Builder pattern in java
        .name("Cake")
        .sugar(1)
        .butter(0.5)
        .eggs(2)
        .vanila(2)
        .flour(1.5)
        .bakingpowder(0.75)
        .milk(0.5)
        .build();

        //Dessert cakeAlt = Dessert("cake", .75, .5, 2, 2, 1.5, 0, .5, 0);

        //Dessert cookieAlt = Dessert("Cookie", 1.5, 1, 2, 2, 3, 3);

        System.out.println(cake);
        System.out.println("");

        Dessert cookie = new Dessert.Builder()
        .name("Cookie")
        .sugar(1.5)
        .butter(1)
        .eggs(2)
        .vanila(2)
        .flour(3)
        .chocolateChip(3)
        .build();

        System.out.println(cookie);
        System.out.println("");

        Dessert mess = new Dessert.Builder()
        .flour(10)
        .name("Mess")
        .sugar(10)
        .build();
        System.out.println(mess);
    }    
}
