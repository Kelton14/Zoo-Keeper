public class Mammal{
    public int energyLevel = 100;
    public Mammal(){

    }

    public int showEnergy(){
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
}