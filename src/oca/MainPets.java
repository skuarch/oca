package oca;

public class MainPets {

    public static void main(String[] args) {
        Pet p = new Dog();
        Dog d = new Beatle();
        Pet p2 = new Beatle();

        System.out.println(p.getClass());
        System.out.println(d.getClass());
        System.out.println(p2.getClass());
        
    }

}
