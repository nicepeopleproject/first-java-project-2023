package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik first = new Matematik(100, 2);
        Matematik second = new Matematik(100, 3);
        Matematik third = new Matematik(100, 4);
        Matematik fourth = new Matematik(100, 5);
        Matematik fifth = new Matematik(100, 10);
        System.out.println("\n--Квадрат--");
        System.out.println("Первый");
        System.out.println(first.calculateSquareSurface(4));
        System.out.println("Второй");
        System.out.println(second.calculateSquareSurface(4));
        System.out.println("Третий");
        System.out.println(third.calculateSquareSurface(4));
        System.out.println("Четвертый");
        System.out.println(fourth.calculateSquareSurface(4));
        System.out.println("Пятый");
        System.out.println(fifth.calculateSquareSurface(4));
        System.out.println("\n--Круг--");
        System.out.println("Первый");
        System.out.println(first.calculateCircleSurface(4));
        System.out.println("Второй");
        System.out.println(second.calculateCircleSurface(4));
        System.out.println("Третий");
        System.out.println(third.calculateCircleSurface(4));
        System.out.println("Четвертый");
        System.out.println(fourth.calculateCircleSurface(4));
        System.out.println("Пятый");
        System.out.println(fifth.calculateCircleSurface(4));
        System.out.println("\n--Призма--");
        System.out.println("Первый");
        System.out.println(first.calculatePrismSurface(10, 5, 5));
        System.out.println("Второй");
        System.out.println(second.calculatePrismSurface(10, 5, 5));
        System.out.println("Третий");
        System.out.println(third.calculatePrismSurface(10, 5, 5));
        System.out.println("Четвертый");
        System.out.println(fourth.calculatePrismSurface(10, 5, 5));
        System.out.println("Пятый");
        System.out.println(fifth.calculatePrismSurface(10, 5, 5));
        System.out.println("\n--Сфера--");
        System.out.println("Первый");
        System.out.println(first.calculateSphereSurface(10));
        System.out.println("Второй");
        System.out.println(second.calculateSphereSurface(10));
        System.out.println("Третий");
        System.out.println(third.calculateSphereSurface(10));
        System.out.println("Четвертый");
        System.out.println(fourth.calculateSphereSurface(10));
        System.out.println("Пятый");
        System.out.println(fifth.calculateSphereSurface(10));

    }
}
