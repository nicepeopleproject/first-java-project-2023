package org.example;

public class Matematik {
    String name;
    String surname;
    private int speed; // скорость вычисления математиком 1 - 100
    private int educationLevel; // образование 0 - 10
    private static int BASIC_TIME = 100_000;

    public Matematik(int speed, int educationLevel)
    {
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

    private String getPhrase()
    {
        int value = (int) Math.ceil(7 * Math.random());
        return switch (value) {
            case (1) -> "Please, leave me alone!";
            case (2) -> "What? No! That`s an idiotic thing to ask.";
            case (3) -> "Shouldn`t you be guarding some donuts and coffee right about now?";
            case (4) -> "As I expected. Access denied.";
            case (5) -> "Go away and don`t tell anyone I`m here!";
            case (6) -> "I refuse to go another step!";
            case (7) -> "Stop!";
            default -> "I`ve predicted this could happen, but the administrator just would not listen...";
        };
    }

    public int getSpeed() {
        return speed;
    }

    public int getEducationLevel() {
        return educationLevel;
    }

    public double calculateSquareSurface(double side) throws Exception
    {
        if (educationLevel == 0)
        {
            System.out.println("Ничего не могу сделать");
            return -999_999_999;
        }
        if (educationLevel == 10)
        {
            System.out.println(getPhrase());
            return 0.5;
        }
        if (side <= 0)
            throw new RuntimeException("Длина стороны должна быть положительной (" + side + ")");
        if (educationLevel == 1)
        {
            System.out.println("Я только начинаю, могу ошибиться в этом непростом для меня вычислении.");
            if (Math.random() > 0.5)
            {
                Thread.sleep(BASIC_TIME / speed);
                return side * side;
            } else
            {
                Thread.sleep(BASIC_TIME / speed);
                return side * side / 2;
            }
        }

        System.out.println("Я начал работать.");
        Thread.sleep(BASIC_TIME / speed);
        return side * side;
    }

    public double calculateCircleSurface(double radius) throws Exception
    {
        if (educationLevel == 0)
        {
            System.out.println("Ничего не могу сделать");
            return -999_999_999;
        }
        if (educationLevel == 10)
        {
            System.out.println(getPhrase());
            return 0.5;
        }
        if (radius <= 0)
            throw new RuntimeException("Радиус должен быть положительным (" + radius + ")");
        if (educationLevel <= 2)
        {
            System.out.println("Я только начинаю, могу ошибиться в этом непростом для меня вычислении.");
            if (educationLevel == 1 && Math.random() > 0.6 || educationLevel == 2 && Math.random() > 0.4)
            {
                Thread.sleep(BASIC_TIME / speed);
                return Math.PI * radius * radius;
            } else
            {
                Thread.sleep(BASIC_TIME / speed);
                return 2 * Math.PI * radius;
            }
        }

        System.out.println("Я начал работать.");
        Thread.sleep(BASIC_TIME / speed);
        return Math.PI * radius * radius;
    }

    public double calculatePerfectPrismSurface(int n, double side, double formative) throws Exception
    {
        if (educationLevel < 4)
        {
            System.out.println("Ничего не могу сделать");
            return -999_999_999;
        }
        if (educationLevel == 10)
        {
            System.out.println(getPhrase());
            return 0.5;
        }
        if (n <= 0)
            throw new RuntimeException("Число сторон должно быть натуральным числом (" + n + ")");
        if (side <= 0)
            throw new RuntimeException("Длина стороны должна быть положительной (" + side + ")");
        if (formative <= 0)
            throw new RuntimeException("Длина образующей должна быть положительной (" + side + ")");
        
        System.out.println("Я начал работать.");
        Thread.sleep(BASIC_TIME / speed);
        double p = n * side;
        double a = side / (2 * Math.tan(Math.PI / n));
        return (a * p) + n * side * formative;
    }

    public double calculateSphereSurface(double radius) throws Exception
    {
        if (educationLevel < 5)
        {
            System.out.println("Ничего не могу сделать");
            return -999_999_999;
        }
        if (educationLevel == 10)
        {
            System.out.println(getPhrase());
            return 0.5;
        }
        if (radius <= 0)
            throw new RuntimeException("Длина стороны должна быть положительной (" + radius + ")");

        System.out.println("Я начал работать.");
        Thread.sleep(BASIC_TIME / speed);
        return 4 * Math.PI * radius * radius;
    }



}
