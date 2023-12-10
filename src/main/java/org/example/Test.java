package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik schoolMatematik = new Matematik(100, 3);
        schoolMatematik.name = "Иван";
        schoolMatematik.surname = "?";


        System.out.println("Уровень образования математика: " + schoolMatematik.getEducationLevel());
        //System.out.println(schoolMatematik.calculateSquareSurface(5.0));
        //System.out.println(schoolMatematik.calculatePrismSurface(5.0, 6, 4));
        //System.out.println(schoolMatematik.calculateBallSurface(5.0));
        System.out.println(schoolMatematik.calculateCircleSurface(5.0));
    }
}
