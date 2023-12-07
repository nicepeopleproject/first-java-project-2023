package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik schoolMatematik = new Matematik(100, 15);
        schoolMatematik.name = "Иван";
        schoolMatematik.surname = "Иванов";


        System.out.println("Уровень образования математика: " + schoolMatematik.getEducationLevel());
        System.out.println(schoolMatematik.calculateSquareSurface(5));
        System.out.println(schoolMatematik.calculateCircleSurface(50));
        System.out.println(schoolMatematik.calculateBallSurface(4));
        System.out.println(schoolMatematik.calculatePrismaSurface(20, 2));
    }
}
