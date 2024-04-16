package frq;

public class Animal {
    private String animalType;
    private String species;
    private String name;

    public Animal(String type, String s, String n){
        animalType = type;
        species = s;
        name = n;
    }

    public String toString(){
        return name + " the " + species + " is a " + animalType;
    }
}
