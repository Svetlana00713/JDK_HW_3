package task_1;

public class Calculator {
    public static <T extends Number, U extends Number> double sum(T num1, U num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T num1, U num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T num1, U num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T num1, U num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Сумма: " + calculator.sum(3.5, 6));
        System.out.println("Произведение: " + calculator.multiply(2, 3.5));
        System.out.println("Разность: " + calculator.subtract(4.8, 2.3));
        System.out.println("Результат деления: " + calculator.divide(10, 2.5));
    }
}
