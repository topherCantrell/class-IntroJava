
interface Animal {
    public void sayHi();
    public void sayBye();
}

class Dog implements Animal {

    @Override
    public void sayHi() {
        System.out.println("WOOF");
    }

    @Override
    public void sayBye() {
        System.out.println("PANT");        
    }
    
}

class FrenchAnimal implements Animal {
    
    Animal target;    
    FrenchAnimal(Animal other) {
        target = other;
    }

    @Override
    public void sayHi() {
        System.out.print("LE ");
        target.sayHi();
    }

    @Override
    public void sayBye() {
        System.out.print("LE ");
        target.sayBye();
    }
    
}

class FrenchDog extends Dog {
    @Override
    public void sayHi() {
        System.out.print("LE ");
        super.sayHi();
    }
}

public class Tinker {
    
    public static void main(String [] args) {
        
        Dog dog = new Dog();
        Animal a = dog;
        
        //Animal a = new FrenchAnimal(new Dog());
        
        // This code just works with the 
        // Animal interface.
        a.sayHi();
        a.sayBye();
        
    }

}
