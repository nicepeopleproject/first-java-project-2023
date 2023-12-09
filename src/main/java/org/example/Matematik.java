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
        if (educationLevel >= 2 & educationLevel <= 9) {
            System.out.println("Я начал работать.");
            if (side <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("Сторона квадрата не может быть отрицательной");
                return -1;
            }
            Thread.sleep(100_000 / speed);
            return side * side;
        } else if (educationLevel == 1) {
            if (side <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("Сторона квадрата не может быть отрицательной");
                return -1;
            } else {
                System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
                if (Math.random() > 0.5) {
                    Thread.sleep(200_000 / speed);
                    return side * side;
                } else {
                    Thread.sleep(200_000 / speed);
                    return side * side / 2;
                }
            }
        } else if (educationLevel == 10){
            System.out.println("Я не буду ничего вычислять.");
            return 0;
        } else {
            System.out.println("Я не могу ничего сделать.");
            return -999_999_999;
        }
    }

    public double calculatePrismSurface(double sideOne, double sideTwo, double height) throws Exception{
        if (educationLevel >= 4 & educationLevel <= 9) {
            if (sideOne <= 0) {
                System.out.println("Значения сторон четырехугольной призмы должны быть положительными, введено значение: " + sideOne);
                return -1;
            } else if (sideTwo <= 0) {
                System.out.println("Значения сторон четырехугольной призмы должны быть положительными, введено значение: " + sideTwo);
                return -1;
            } else if (height <= 0) {
                System.out.println("Значение высоты должно быть положительным, введено значение: " + height);
                return -1;
            }
            System.out.println("Я начал работать.");
            Thread.sleep(100_000 / speed);
            double prismSurface = 2*height*sideOne+2*height*sideTwo+2*sideOne*sideTwo;
            return prismSurface;
        } else if (educationLevel == 10) {
            System.out.println("Я не буду ничего вычислять.");
            return 0;
        }
        else {
            System.out.println("Не могу ничего сделать.");
            return -999_999_999;
        }
    }

    public double calculateSphereSurface(double radius) throws Exception{
        if (educationLevel >= 5 & educationLevel <= 9) {
            if (radius <= 0) {
                System.out.println("Радиус шара должен быть положительным, введено значение: " + radius);
                return -1;
            } else {
                System.out.println("Я начал работать.");
                Thread.sleep(100_000/speed);
                return 4*Math.PI*radius*radius;
            }
        } else if (educationLevel == 10){
            System.out.println("Я не буду ничего вычислять.");
            return 0;
        }
        else {
            System.out.println("Не могу ничего сделать.");
            return -999_999_999;
        }
    }

    public double calculateCircleSurface(double radius) throws Exception{
        if (educationLevel >= 3 & educationLevel <= 9) {
            if (radius <= 0) {
                System.out.println("Радиус круга должен быть положительным, введено значение: " + radius);
                return -1;
            } else {
                System.out.println("Я начал работать.");
                Thread.sleep(100_000 / speed);
                return Math.PI*radius*radius;
            }
        } else if (educationLevel == 2) {
            if (radius <= 0) {
                System.out.println("Радиус круга должен быть положительным, введено значение: " + radius);
                return -1;
            } else {
                System.out.println("Я только начинаю, могу ошибиться в этом нелегком для меня вычислении.");
                if (Math.random() > 0.4) {
                    Thread.sleep(200_000/speed);
                    return Math.PI*radius*radius;
                }
                else {
                    Thread.sleep(200_000/speed);
                    return 2*Math.PI*radius; //математик уровня 2 ошибся и посчитал длину окружности вместо площади круга
                }
            }
        } else if (educationLevel == 1) {
            if (radius <= 0) {
                System.out.println("Радиус круга должен быть положительным, введено значение: " + radius);
                return -1;
            } else {
                System.out.println("Я только начинаю, могу ошибиться в этом нелегком для меня вычислении.");
                if (Math.random() > 0.6) {
                    Thread.sleep(300_000/speed);
                    return Math.PI*radius*radius;
                }
                else {
                    Thread.sleep(300_000/speed);
                    return 2*Math.PI*radius*radius; //математик уровня 1 ошибся и неправильно посчитал площадь круга, умножив её на 2 (смешал формулы длины окружности и площади круга)
                }
            }
        } else if (educationLevel == 10) {
            System.out.println("Я не буду это вычислять.");
            return 0;
        } else {
            System.out.println("Я не могу ничего сделать");
            return -999_999_999;
        }
    }
}