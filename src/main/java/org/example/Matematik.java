package org.example;

public class Matematik {
    String name;
    String surname;
    private int speed; // скорость вычисления математиком 1 - 100
    private int educationLevel; // образование 0 - 10
    int figureTimePar = 100_000;

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
            throw new RuntimeException("Сторона выбрана неверно, введено значение: " + side);
        }else if (educationLevel == 10){
            System.out.println("Не буду ничего считать!");
            return -1;
        }else if (educationLevel >= 2) {
            System.out.println("Я начал работать.");
            Thread.sleep(figureTimePar / speed);
            return side * side;
        } else if (educationLevel == 1) {
            System.out.println("Я только начинаю, могу ошибться в этом непростом для меня вычислении.");
            if (Math.random() > 0.5) {
                Thread.sleep(figureTimePar*2 / speed);
                return side * side;
            } else {
                Thread.sleep(figureTimePar*2 / speed);
                return side * side / 2;
            }
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
    public double calculateCircleSurface(double radius) throws Exception {
        if (radius <= 0) {
            throw new RuntimeException("Радиус не может быть отрицательным, введено значение: " + radius);
        }else if (educationLevel == 10){
            System.out.println("Не буду ничего считать!");
            return -1;
        }else if (educationLevel >= 3) {
            System.out.println("Я начал работать.");
            Thread.sleep(figureTimePar*2 / speed);
            return (radius*radius) * Math.PI;
        } else if (educationLevel == 2) {
            System.out.println("Я только начинаю, могу ошибться в этом непростом для меня вычислении.");
            if (Math.random() > 0.4) {
                Thread.sleep(figureTimePar*4 / speed);
                return (radius*radius) * Math.PI;
            } else {
                Thread.sleep(200_000 / speed);
                return (radius*radius) * Math.PI;
            }
        } else if (educationLevel == 1) {
            System.out.println("Я только начинаю, скорее всего я ошибусь в этом непростом для меня вычислении.");
            if (Math.random() > 0.6) {
                Thread.sleep(figureTimePar*4 / speed);
                return (radius*radius) * Math.PI;
            } else {
                Thread.sleep(figureTimePar*4 / speed);
                return (radius*radius) * Math.PI;
            }
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
    public double calculateTriangularPrismSurface(double side, double height) throws Exception {
        if (side <= 0){
            throw new RuntimeException("Сторона не может быть отрицательной или равной 0, введено значение: " + side);
        }else if (height <= 0){
            throw new RuntimeException("Высота не может быть отрицательной или равной 0, введено значение: " + height);
        }else if (educationLevel == 10){
            System.out.println("Не буду ничего считать!");
            return -1;
        }else if (educationLevel >= 4) {
            System.out.println("Я начал работать.");
            Thread.sleep(figureTimePar*2 / speed);
            return (Math.pow(3,0.5)/4) * (side * side) * height;
        } else if (educationLevel == 3) {
            System.out.println("Я только начинаю, могу ошибться в этом непростом для меня вычислении.");
            if (Math.random() > 0.4) {
                Thread.sleep(figureTimePar*4 / speed);
                return (Math.pow(3,0.5)/4) * (side * side) * height;
            } else {
                Thread.sleep(200_000 / speed);
                return (Math.pow(3,0.5)/4) * (side * side) * height;
            }
        } else if (educationLevel == 2) {
            System.out.println("Я только начинаю, скорее всего я ошибусь в этом непростом для меня вычислении.");
            if (Math.random() > 0.6) {
                Thread.sleep(figureTimePar*4 / speed);
                return (Math.pow(3,0.5)/4) * (side * side) * height;
            } else {
                Thread.sleep(figureTimePar*4 / speed);
                return (Math.pow(3,0.5)/4) * (side * side) * height / 2;
            }
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
    public double calculateSphereSurface(double radius) throws Exception {
        if (radius <= 0) {
            throw new RuntimeException("Радиус не может быть отрицательным или равным 0, введено значение: " + radius);
        }else if (educationLevel == 10){
            System.out.println("Не буду ничего считать!");
            return -1;
        }else if (educationLevel >= 5) {
            System.out.println("Я начал работать.");
            Thread.sleep(figureTimePar*4 / speed);
            return 4*Math.PI*(radius * radius);
        } else if (educationLevel == 4) {
            System.out.println("Я только начинаю, могу ошибться в этом непростом для меня вычислении.");
            if (Math.random() > 0.4) {
                Thread.sleep(figureTimePar*4 / speed);
                return 4*Math.PI*(radius * radius);
            } else {
                Thread.sleep(200_000 / speed);
                return 4*Math.PI*(radius * radius);
            }
        } else if (educationLevel == 3) {
            System.out.println("Я только начинаю, скорее всего я ошибусь в этом непростом для меня вычислении.");
            if (Math.random() > 0.6) {
                Thread.sleep(figureTimePar*4 / speed);
                return 4*Math.PI*(radius * radius);
            } else {
                Thread.sleep(figureTimePar*4 / speed);
                return 4*Math.PI*(radius * radius);
            }
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
}
