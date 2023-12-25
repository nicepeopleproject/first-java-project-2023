package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik schoolMatematik = new Matematik(100, 2);
        schoolMatematik.name = "Иван";
        schoolMatematik.surname = "?";


        System.out.println("Уровень образования математика: " + schoolMatematik.getEducationLevel());
        System.out.println(schoolMatematik.calculateCirkleSurface(5));
        System.out.println(schoolMatematik.calculatePrizmaSurface(5,7));
        System.out.println(schoolMatematik.calculateSphereSurface(10));
    }
}
