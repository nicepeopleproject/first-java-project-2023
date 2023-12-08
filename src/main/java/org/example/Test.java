package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik schoolMatematik = new Matematik(100, 10);
        schoolMatematik.name = "Иван";
        schoolMatematik.surname = "?";


        System.out.println("Уровень образования математика: " + schoolMatematik.getEducationLevel());
        System.out.println(schoolMatematik.calculateSquareSurface(5));
        System.out.println(schoolMatematik.calculateCirleSurface(10));
        System.out.println(schoolMatematik.calculatePrismsurface(5, 6, 7));
        System.out.println(schoolMatematik.calculateBallsurface(8));
    }

}
