public class Gorilla extends Mammal{
    public void throwSomething(){
        energyLevel -= 5;
        System.out.println("The Gorilla just threw something!");
    }
    public void eatBananas(){
        energyLevel += 10;
        System.out.println("The Gorilla just ate a tastey banana!");
    }
    public void climb(){
        energyLevel -= 10;
        System.out.println("The Gorilla just climbed a big tree!");
    }
}