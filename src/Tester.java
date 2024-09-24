public class Tester {

    public static void main(String[] args) {
        // Test 1: Addition
        CustomBigInteger bigInt1 = new CustomBigInteger("123456789123456789");
        CustomBigInteger bigInt2 = new CustomBigInteger("987654321987654321");
        CustomBigInteger sum = bigInt1.add(bigInt2);
        System.out.println("Sum: " + sum); // Expected: 1111111111111111110

        // Test 2: Modulo
        CustomBigInteger bigInt3 = new CustomBigInteger("100000000000000000");
        CustomBigInteger divisor = new CustomBigInteger("123456789");
        CustomBigInteger modResult = bigInt3.mod(divisor);
        System.out.println("Mod Result: " + modResult); // Expected non-negative result

        // Test 3: Modulo with smaller value
        CustomBigInteger smallInt = new CustomBigInteger("100");
        CustomBigInteger smallDivisor = new CustomBigInteger("30");
        CustomBigInteger modSmallResult = smallInt.mod(smallDivisor);
        System.out.println("Mod Small Result: " + modSmallResult); // Expected: 10

        // Test 4: Modulo by zero (should throw ArithmeticException)
        try {
            CustomBigInteger zeroDivisor = new CustomBigInteger("0");
            bigInt3.mod(zeroDivisor);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage()); // Expected: Division by zero
        }
    }
}
