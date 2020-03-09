public class Dog {
    private String name;
    private double weight;
    private int medals;

    public Dog(String name, double weight, int medals) {
        this.name = name;
        this.weight = weight;
        this.medals = medals;
    }

    public String getName ()
    {
        return this.name;
    }

    public double getWeight ()
    {
        return weight;
    }

    public int getMedals ()
    {
        return medals;
    }
}