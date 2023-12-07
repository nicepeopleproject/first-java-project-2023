package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik schoolMatematik = new Matematik(100, 3);
        Matematik highSchoolMatematik = new Matematik(100, 5);
        schoolMatematik.name = "Иван";
        schoolMatematik.surname = "?";


        System.out.println("Уровень образования математика: " + schoolMatematik.getEducationLevel());
        System.out.println("Уровень образования математика: " + highSchoolMatematik.getEducationLevel());
        //System.out.println(schoolMatematik.calculateSquareSurface(5));
        //System.out.println(schoolMatematik.calculateCircleSurface(10));
        System.out.println(schoolMatematik.calculateTriangularPrismSurface(10,20));
        System.out.println(highSchoolMatematik.calculateTriangularPrismSurface(10,20));
        System.out.println(highSchoolMatematik.calculateSphereSurface(10));

    }
}
