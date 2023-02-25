package interfacepractice;

import java.util.Random;

public class Interfaces implements Character{
    
    public static Character summonCharacter(){
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 ==0){
            return new Enemy();
        }else{
            return new Hero();
        }
    }

    public static void main(String[] args){
        Enemy darthVader = new Enemy();
        Hero ObiWanKenobi = new Hero();
        darthVader.attack();
        ObiWanKenobi.attack();
        darthVader.heal();
        ObiWanKenobi.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public void heal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heal'");
    }

    @Override
    public String getWeapon() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWeapon'");
    }
}
