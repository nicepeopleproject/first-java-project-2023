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
        if (educationLevel >= 2) {
            System.out.println("Я начал работать.");
            if (side <= 0) {
                // нужно выбрасывать ошибку
                throw new Exception("Сторона квадрата не может быть отрицательной");
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

        } else if (educationLevel == 10){
          System.out.println("Слишком тривиально");
          return 0;
        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }

    public double calculateSquareCirle(double r) throws Exception {
        if(educationLevel >= 2){
            System.out.println("Работаем");
            if (r <= 0) {
                // нужно выбрасывать ошибку
                throw new Exception("Сторона круга не может быть отрицательной");
            }

            else if(educationLevel == 1){
                if (Math.random() > 0.4) {
                    Thread.sleep(200_000 / speed);
                    return 3.14 * r * r;
                } else {
                    Thread.sleep(200_000 / speed);
                    return 3.14 * r * r / 2;
                }
            }

            else if(educationLevel == 2){
                if (Math.random() > 0.6) {
                    Thread.sleep(100_000 / speed);
                    return 3.14 * r * r;
                } else {
                    Thread.sleep(100_000 / speed);
                    return 3.14 * r * r / 2;
                }
            }

            else if(2 < educationLevel && educationLevel < 10){
                return 3.14 * r * r;
            }

            else {
                System.out.println("Это тривиально");
                return 0;
            }
        }

        else{
            System.out.println("У меня лапки, это не могу вычислить");
            return -999_999_999;
        }
    }

    public double calculatePrismSurfaces(double P,double h,double Sosn) throws Exception {
        if(P <= 0 || h <= 0 || Sosn <= 0){
            throw new Exception("Не может сущетсвовать данная фигура");
        }

        else if(educationLevel >= 4 && educationLevel != 10){
            return P*h + 2*Sosn;
        }

        else if(educationLevel == 10){
            System.out.println("Это тривиально");
            return 0;
        }

        else{
            System.out.println("У меня лапки, это не могу вычислить");
            return -999_999_999;
        }
    }

    public double calculatePrismSurfaces(double r) throws Exception {
        if(r <= 0){
            throw new Exception("Не может сущетсвовать данная фигура");
        }

        else if(educationLevel >= 5 && educationLevel != 10){
            return 4 * 3.14 * r * r;
        }

        else if(educationLevel == 10){
            System.out.println("Это тривиально");
            return 0;
        }

        else{
            System.out.println("У меня лапки, это не могу вычислить");
            return -999_999_999;
        }
    }

}
