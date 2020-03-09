import java.util.ArrayList;

public class DogKennel
{
    ArrayList<Dog> dogs;  // holds the dogs that are currently in this kennel

    public DogKennel()
    {
        dogs = new ArrayList<>();
    }

    // addADog() adds a new dog to the end of the list of dogs at this kennel
    public void addADog(Dog d)
    {
        // TODO write addADog method
    }

    // find()  returns true if the argument dogName is the name of  one (or more) dogs in the kennel
    public boolean find(String dogName)
    {
        // TODO write find method
        return false;
    }

    // remove() searches through the list of dogs and removes all dogs in this kennel
    // that have this name. It returns true if at least one dog was found (and was removed).
    public boolean remove(String dogName)
    {
        // TODO write remove method
        return false;
    }

    // findChampions() returns an ArrayList of Dogs that have at least as many medals
    // as that given in the argument. If no dogs are found that have at least this many
    // medals, an empty ArrayList is returned.
    public ArrayList<Dog> findChampions( int medals)
    {
        // TODO write findChampions method using a foreach loop
        return null;
    }
}