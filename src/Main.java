public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog+= 4;
        cat+=4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(totalWeight);
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference);
        System.out.println("Задача 7");
        var remainder= weightBoxer2 % weightBoxer1;
        System.out.println(remainder);
        System.out.println("Задача 8");
        var workingHours = 640;
        var timeWork = 8;
        var totalWorker = workingHours / timeWork;
        System.out.println("Всего работников в компании - " + totalWorker);
        totalWorker = totalWorker + 94;
        var totalWorkHouers = workingHours / totalWorker;
        System.out.println("Если в компании работает " + totalWorker + " человек, то всего " + totalWorkHouers + " часов работы может быть проделано между сотрудниками");


    }
}