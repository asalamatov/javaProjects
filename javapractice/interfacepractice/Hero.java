package interfacepractice;

public class Hero implements Character{

    private String weapon = "Fire";

    public Hero(){

    }

    public String getWeapon(){
        return weapon;
    }
    
    public void attack(){
        System.out.println("The hero attack the enemy!");
    }

    public void heal(){
        System.out.println("The hero heals himself");
    }
}
