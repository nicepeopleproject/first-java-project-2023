package org.example;

public class Matematik {
    String name;
    String surname;
    private int speed; // скорость вычисления математиком 1 - 100
    private int educationLevel; // образование 0 - 10

    public Matematik(int speed, int educationLevel) {
        if (speed < 1 || speed > 100) {
            throw new RuntimeException("Скорость должна быть между 1 - 100, введено значение: " + speed);
        } else {
            this.speed = speed;
        }
        if (educationLevel < 0 || educationLevel > 10) {
            throw new RuntimeException("Уровень образования должен быть между 0 - 10, введено значение: " + educationLevel);
        } else {
            this.educationLevel = educationLevel;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getEducationLevel() {
        return educationLevel;
    }
    public double calculateSquareSurface(double side) throws Exception {
        if (educationLevel == 10) {
            System.out.println("Я слишком занят решением задачки международной математической олмпиады, спроси в другой раз.");
            return -1;
        } else if (educationLevel >= 2) {
            System.out.println("Я начал работать.");
            if (side <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("Сторона квадрата не может быть отрицательной");
                return -1;
            }
            Thread.sleep(100_000 / speed);
            return side * side;
        } else if (educationLevel == 1) {
            System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
            if (Math.random() > 0.5) {
                Thread.sleep(200_000 / speed);
                return side * side;
            } else {
                Thread.sleep(200_000 / speed);
                return side * side / 2;
            }
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
    public double calculateCirleSurface(double side) throws Exception {
        if (educationLevel == 10) {
            System.out.println("Я слишком занят решением задачки международной математической олмпиады, спроси в другой раз.");
            return -1;
        } else if (educationLevel == 10) {
                System.out.println("Я слишком занят решением задачки международной математической олмпиады, спроси в другой раз.");
                    return -1;
            } else if (educationLevel == 2) {
                System.out.println("Я начал работать.");
                if (side <= 0) {
                    // нужно выбрасывать ошибку
                    System.out.println(" не может быть отрицательной");
                    return -1;
                }
                    if (Math.random() > 0.4) {
                        Thread.sleep(200_000 / speed);
                        return side * side*Math.PI;
                    } else {
                        Thread.sleep(200_000 / speed);
                        return side * side * Math.PI / 2;
                    }
            } else if (educationLevel == 1) {
                System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
                if (Math.random() > 0.6) {
                    Thread.sleep(200_000 / speed);
                    return side * side*Math.PI;
                } else {
                    Thread.sleep(200_000 / speed);
                    return side * side*Math.PI / 2;
                }
            } else if (educationLevel == 0){
                System.out.println("Ничего не могу сделать.");
                return -999_999_999;
            } else if (educationLevel >=3) {
                        System.out.println("Я начал работать.");
                        if (side <= 0) {
                            // нужно выбрасывать ошибку
                            System.out.println(" не может быть отрицательной");
                            return -1;
                        }
                       else {
                            Thread.sleep(200_000 / speed);
                            return side * side*Math.PI;
                    }
            }

    return -1;}
    public double calculatePrismsurface(double a,double b,double c) throws Exception {


        if (educationLevel == 10) {
            System.out.println("Я слишком занят решением задачки международной математической олмпиады, спроси в другой раз.");
            return -1;
        } else if (educationLevel >= 4) {
            System.out.println("Я начал работать.");
            if (a <= 0 & b <= 0 & c <= 0) {
                // нужно выбрасывать ошибку
                System.out.println(" не может быть отрицательной");
                return -1;
            }

            Thread.sleep(200_000 / speed);
            return (a*a+b*b+c*c)*2;
        } else if (educationLevel < 4){
                System.out.println("Ничего не могу сделать.");
                return -999_999_999;}


    return -1;}

    public double calculateBallsurface(double radius) throws Exception {
        if (educationLevel == 10) {
            System.out.println("Я слишком занят решением задачки международной математической олмпиады, спроси в другой раз.");
            return -1;
        } else if (educationLevel >= 5) {
            System.out.println("Я начал работать.");
            if (radius <= 0) {
                // нужно выбрасывать ошибку
                System.out.println(" не может быть отрицательной");
                return -1;
            }

            Thread.sleep(200_000 / speed);
            return (radius*radius)*4*Math.PI;
        } else if (educationLevel < 5){
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;}
    return -1;}
}
