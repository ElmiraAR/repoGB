/*
* Java 1. Homework #6
*
* @author Elmira Arslanova
* @version 20.03.2022-25.03.2022
*
*/

class GBJavaLesson6 {
    public static void main(String[] args) {
        IAnimal cat = new Cat("Murzik", 200, 100000);
        IAnimal dog = new Dog("Polcan", 500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal a : animals) {
            System.out.println(a.run(150));
            System.out.println(a.swim(5));
            System.out.println(a.run(600));
            System.out.println(a.swim(15));
        }
    }
}

class Cat extends Animal {
    Cat(String name, int limRunDist, int limSwimDist) {
        super (name, limRunDist, limSwimDist);
    }

    @Override
    public String swim(int swimDist) {
        return name + " doesn't swim";
    }

    @Override
    public String run(int runDist) {
        if (runDist < limRunDist) {
            return name + " ran " + runDist;
        } else {
            return name + " not ran " + runDist;
        }
    }
}

class Dog extends Animal {
    Dog(String name, int limRunDist, int limSwimDist) {
        super (name, limRunDist, limSwimDist);
    }

    @Override
    public String swim(int swimDist) {
        if (swimDist < limSwimDist) {
            return name + " swam " + swimDist;
        } else {
            return name + " didn't swim " + swimDist;
        }
    }

    @Override
    public String run(int runDist) {
        if (runDist < limRunDist) {
            return name + " ran " + runDist;
        } else {
            return name + " not ran " + runDist;
        }
    }
}

interface IAnimal {
        String swim(int swimDist);
        String run(int runDist);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int limRunDist;
    protected int limSwimDist;

    Animal(String name, int limRunDist, int limSwimDist) {
        this.name = name;
        this.limRunDist = limRunDist;
        this.limSwimDist = limSwimDist;
    }
}