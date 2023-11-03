class BreakStatement{
    public static void main(String[] args) {
        int number = 1;
        while (true) {
            if (number % 2 == 0) {
                System.out.println("The first even number is: " + number);
                break; // Exit the loop when the first even number is found
            }
            number++;
        }
    }
}
