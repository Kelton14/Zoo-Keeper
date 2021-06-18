public class Bat extends Mammal{
    public Bat(){
        this.energyLevel = 300;
    }
    public void fly(){
        energyLevel -= 50;
        System.out.println("zoommmmm the bat took off!");
    }
    public void eatHuman(){
        energyLevel += 25;
        System.out.println("Yum the bat ate!");
    }
    public void attackTown(){
        energyLevel -= 100;
        System.out.println("Burnnn the town is on FIRE!");
    }
}
