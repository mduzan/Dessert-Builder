/*
 * 
 * Stores and builds a dessert.
 * 
 */


class Dessert{
    private final String name;
    private final double sugar;  
    private final double butter;  
    private final int eggs;
    private final int vanila;    
    private final double flour;   
    private final double bakingpowder;
    private final double milk;  
    private final int chocolateChip;
    
    public static class Builder 
    {
        private String name;
        private double sugar;  
        private double butter; 
        private int eggs;
        private int vanila;    
        private double flour; 
        private double bakingpowder;
        private double milk;
        private int chocolateChip;
    
        
        public Builder name(String name)                    //builder methods for setting property
        {
            this.name = name;
            return this;
        }
        public Builder sugar(double cup)
        {
            this.sugar = cup; 
            return this; 
        }
        public Builder butter(double cup)
        {
            this.butter = cup; 
            return this; 
        }
        public Builder eggs(int number)
        {
            this.eggs = number; 
            return this;
        }
        public Builder vanila(int spoon)
        {
            this.vanila = spoon; 
            return this; 
        }
        public Builder flour(double cup)
        {
            this.flour = cup; 
            return this; 
        }
        public Builder bakingpowder(double spoon)
        {
            this.sugar = spoon; 
            return this;
        }
        public Builder milk(double cup)
        {
            this.milk = cup; 
            return this;
        }
        public Builder chocolateChip(int bags)
        {
            this.chocolateChip = bags; 
            return this; 
        }
        
        public Dessert build()                          //return fully build object
        {
            return new Dessert(this);
        }
    }
    
    
    private Dessert(Builder builder) {                      //private constructor to enforce object creation through builder
        this.name = builder.name;
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.chocolateChip = builder.chocolateChip;      
    }

    // public Dessert(String name, double sugar,
    //                double butter, int eggs,
    //                int vanilla, double flour,
    //                double bakingpowder,
    //                double milk, int chocolateChip){...}

    // public Dessert(String name, double sugar,
    //                 double butter, int eggs,
    //                 int vanilla, double flour,
    //                 //no baking powder or milk
    //                 double milk, int chocolateChip){...}

    @Override
    public String toString() 
    {
        return name + ":    " +
        "\nSugar =           " + sugar + " Cups " +
        "\nButter =          " + butter + " Cups " +
        "\nEggs =            " + eggs + " Eggs " +
        "\nVanila =          " + vanila + " Teaspoons " +
        "\nFlour =           " + flour + " Cups " +
        "\nBakingpowder =    " + bakingpowder + " Spoons " +
        "\nMilk =            " + milk + " Cups " +
        "\nChocolate Chips = " + chocolateChip + " Bags ";

    }
     
}