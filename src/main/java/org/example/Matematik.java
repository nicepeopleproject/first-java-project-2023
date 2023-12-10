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
        if (side <= 0) {
            // нужно выбрасывать ошибку
            System.out.println("Сторона квадрата не может быть отрицательной");
            return -1;
        } else if (educationLevel == 10){
            System.out.println("Ничего не хочу делать");
            return -1;
        }
        if (educationLevel == 2) {
            System.out.println("Я знаю, как считать площадь квадрата, но могу ошибиться.");
            if (Math.random() < 0.6) {
                Thread.sleep(200_000 / speed);
                return side * side;
            } else {
                Thread.sleep(200_000 / speed);
                return side * side / 2;
            }
        } else if (educationLevel == 1) {
            System.out.println("Я знаю, как считать площадь квадрата, но могу ошибиться.");
            if (Math.random() < 0.4) {
                Thread.sleep(200_000 / speed);
                System.out.print("Площадь квадрата: ");
                return side * side;
            } else {
                Thread.sleep(200_000 / speed);
                return side * side / 2;
            }
        } else {
            System.out.println("Я ничего не умею.");
            return -999_999_999;
        }
    }

    public double calculatePrismSurface(double side, double height, int kolvo) {
        if (side <= 0 || height <= 0 || kolvo <= 0) {
            // нужно выбрасывать ошибку
            System.out.println("Значения не могут быть отрицательными");
            return -1;
        } else if (educationLevel == 10){
            System.out.println("Ничего не хочу делать");
            return -1;
        }
        if (educationLevel >= 4) {
            System.out.println("Я знаю, как считать площадь поверхности любой призмы");
            //ф-ла может быть неточная
            return  kolvo * side * height + ((kolvo * side * side) / 4) * (1/Math.tan(Math.PI/kolvo));
        }
        return 0.0;
    }

    public double calculateBallSurface(double radius) {
        if (radius <= 0) {
            // нужно выбрасывать ошибку
            System.out.println("Значения не могут быть отрицательными");
            return -1;
        } else if (educationLevel == 10){
            System.out.println("Ничего не хочу делать");
            return -1;
        }
        if (educationLevel >= 5) {
            System.out.println("Я знаю, как считать площадь шара");
            return  4 * Math.PI * radius * radius;
        }
        return 0.0;
    }

    public double calculateCircleSurface(double radius) {
        if (radius <= 0) {
            // нужно выбрасывать ошибку
            System.out.println("Значения не могут быть отрицательными");
            return -1;
        } else if (educationLevel == 10){
            System.out.println("Ничего не хочу делать");
            return -1;
        }
        if (educationLevel >= 3) {
            System.out.println("Я знаю, как считать площадь круга");
            return  Math.PI * radius * radius;
        }
        return 0.0;
    }
}
