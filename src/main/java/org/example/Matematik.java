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
        }

        if (educationLevel == 10) {
            System.out.println("Не хочу это делать, давай что-то лучше");
            return -Math.PI;
        } else if (educationLevel >= 2) {
            System.out.println("Я начал работать.");
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
    public double calculateCircleSurface(double radius) throws Exception {
        if (radius <= 0) {
            System.out.println("Радиус круга не может быть отрицательным");
        }
        System.out.println("Работа начата");
        Thread.sleep(100_000 / speed);


        if (educationLevel == 10) {
            System.out.println("Не хочу это делать, давай что-то лучше");
            return -Math.PI;
        }else if (educationLevel >=3){
            return Math.PI * radius * radius;
        } else if (educationLevel == 2) {
            System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
            if (Math.random() > 0.4) {
                Thread.sleep(100_000 / speed);
                return Math.PI * radius * radius;
            } else {
                Thread.sleep(100_000 / speed);
                return Math.PI * radius * radius * 0.25;
            }
        } else if (educationLevel == 1) {
            System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
            if (Math.random() > 0.6) {
                Thread.sleep(100_000 / speed);
                return Math.PI * radius * radius;
            } else {
                Thread.sleep(100_000 / speed);
                return Math.PI * radius * radius * Math.PI;
            }
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }

    public double calculatePrismSurface(double topSideArea, double sideArea, int sides) throws Exception{
        if ((topSideArea <= 0)&(topSideArea <= 0)&(sides < 3)){
            System.out.println("Аргументы функции невалидны");
            return -1;
        }

        Thread.sleep(100_000 / speed);
        if (educationLevel == 10) {
            System.out.println("Не хочу это делать, давай что-то лучше");
            return -Math.PI;
        }else if (educationLevel >= 4){
            return 2*topSideArea + (sideArea*sides);
        }else{
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }

    public double calculateSphereSurface(double radius) throws Exception{
        if (radius <= 0){
            System.out.println("Аргументы функции невалидны");
            return -1;
        }

        Thread.sleep(100_000 / speed);
        if (educationLevel == 10) {
            System.out.println("Не хочу это делать, давай что-то лучше");
            return -Math.PI;
        }else if (educationLevel >=5){
            return 4.0*Math.PI*Math.pow(radius, 3)/3;
        }else{
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
}
