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

    public double calculateCirkleSurface(double r) throws Exception {
        if (educationLevel >= 3 & educationLevel < 10) {
            System.out.println("Я начал работать.");
            if (r <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("радиус не может быть отрицательным");
                return -1;
            }
            Thread.sleep(300_000 / speed);
            return Math.PI * r * r;
        } else if (educationLevel == 2) {
            System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
            if (Math.random() > 0.4) {
                Thread.sleep(150_000 / speed);
                return Math.PI * r * r;
            } else {
                Thread.sleep(150_000 / speed);
                return Math.PI * r * r / 2;
            }
        } else if (educationLevel == 1) {
            System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
            if (Math.random() > 0.6) {
                Thread.sleep(100_000 / speed);
                return Math.PI * r * r;
            } else {
                Thread.sleep(100_000 / speed);
                return Math.PI * r * r / 2;
            }
        } else if (educationLevel == 0) {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        } else if (educationLevel == 10) {
            System.out.println("Я ничего не буду делать");
            return -999999999;
        }
        return r;
    }
    public double calculatePrizmaSurface(double p, double s) throws Exception {
        if (educationLevel >= 4 & educationLevel < 10) {
            System.out.println("Я начал работать.");
            if (p <= 0 || s <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("радиус не может быть отрицательным");
                return -1;
            }
            Thread.sleep(300_000 / speed);
            return (p + 2*s);
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        } else if (educationLevel == 10) {
            System.out.println("Я ничего не буду делать");
            return -999999999;
        }
        return p,s;
    }
}
