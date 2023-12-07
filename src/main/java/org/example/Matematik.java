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
        if (educationLevel >= 2 && educationLevel <10) {
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
    public double calculateCirclePlos(double side) throws Exception {
        if (educationLevel >= 3 && educationLevel <10){
            System.out.println("Работаю");
            if (side <= 0){
                System.out.println("Радиус не может быть отрицательным");
                return -1;
            }
            Thread.sleep(100_000/speed);
            return Math.PI * (side * side);
        } else if (educationLevel ==2){
            System.out.println("Я не особо опытный, но я попробую сделать");
            if (Math.random() >= 0.4){
                Thread.sleep(200_000/speed);
                return Math.PI * (side * side);
            } else{
                Thread.sleep(200_000/speed);
                return Math.PI * (side * side/2);
            }
        } else if (educationLevel == 1){
            System.out.println("Я в этом очень плохо разбираюсь, но я попробую сделать");
            if (Math.random() >= 0.6){
                Thread.sleep(300_000/speed);
                return Math.PI * (side * side);
            } else{
                Thread.sleep(300_000/speed);
                return Math.PI * (side * side/2);
            }
        }else {
            System.out.println("Я не могу это решить");
            return -999_999_999;
        }
    }
    public double calculateBokPrizPlos(double sosn, double sbok) throws Exception {
        if (educationLevel >= 4 && educationLevel <10){
            System.out.println("Работаю");
            if (sbok <=0 || sosn <=0){
                System.out.println("Площадь не может быть отрицательной");
                return -1;
            }
            Thread.sleep(100_000/speed);
            return sbok + (2 * sosn);
        }else{
            System.out.println("Я не умею это решать");
            return -999_999_999;
        }
    }
    public double calculateBokSharPlos(double r) throws Exception {
        if (educationLevel >=5 && educationLevel <10){
            System.out.println("Работаю");
            if (r<=0){
                System.out.println("Радиус не может быть меньше 0");
                return -1;
            }Thread.sleep(100_000/speed);
            return 4 * Math.PI * (r * r);
        }else{
            System.out.println("Я не умею это решать");
            return -999_999_999;
        }
    }
}
