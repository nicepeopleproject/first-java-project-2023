package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik schoolMatematik = new Matematik(100, 0);
        schoolMatematik.name = "Иван";
        schoolMatematik.surname = "?";


        System.out.println("Уровень образования математика: " + schoolMatematik.getEducationLevel());
        System.out.println(schoolMatematik.calculateCirclSQ(5));
        System.out.println(schoolMatematik.calculateCirclCircl(6));
        System.out.println(schoolMatematik.calculatePrizma(5,4,7));
    }
//Морин Никита ИУ1-11Б
}
