public class Main {
    public static void main(String[] args) {
        
        Character character = new Character("Character April");
        character.walk();
        character.walk();
        character.walk();
        character.run();
        character.run();
        character.showStats();
        System.out.println("************************************");
        
        Shaman shaman = new Shaman("Shaman Roxanne");
        shaman.walk();
        shaman.walk();
        shaman.walk();
        shaman.run();
        shaman.run();
        shaman.heal();
        shaman.showStats();
        System.out.println("************************************");
        
        Swordsman swordsman= new Swordsman("Swordsman Grazielle");
        swordsman.walk();
        swordsman.walk();
        swordsman.walk();
        swordsman.run();
        swordsman.run();
        swordsman.slash();
        swordsman.showStats();

        System.out.println("************************************");

        
    }
}
