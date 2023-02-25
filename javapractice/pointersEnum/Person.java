package pointersEnum;

public class Person {

    enum HairColor { //they are consts that is why upperCase
        BLONDE, BROWN, BLACK, RED, ORANGE, PINK, BLUE, GREE, PURPLE, RAINBOW, OTHER
    }

    HairColor hairColor = HairColor.BLACK;
    
    public Person(){

    }

    public static void main(String[] args){
        Person peterParker = new Person();
        Person spiderMan = peterParker;

        peterParker.hairColor = HairColor.PINK;

        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spider Man is: " + spiderMan.hairColor);
    }
}
