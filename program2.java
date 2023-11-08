class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        int sum = myCalculator.add(10, 5);
        int difference = myCalculator.subtract(10, 5);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }

    }

 
    
