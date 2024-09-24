import java.math.BigInteger;

/**
 * A class that represents large integers and includes additional operations such as addition and modulo.
 */
public class CustomBigInteger {
    private final BigInteger value;

    /**
     * Constructs a CustomBigInteger from a string.
     *
     * @param value The value of the BigInteger represented as a string.
     * @throws NumberFormatException if the string does not represent a valid BigInteger.
     */
    public CustomBigInteger(String value) throws NumberFormatException {
        this.value = new BigInteger(value);
    }

    /**
     * Adds this CustomBigInteger to another CustomBigInteger.
     *
     * @param other The CustomBigInteger to add.
     * @return A new CustomBigInteger representing the sum of this and the other CustomBigInteger.
     * @throws NullPointerException if the other CustomBigInteger is null.
     */
    public CustomBigInteger add(CustomBigInteger other) throws NullPointerException {
        if (other == null) {
            throw new NullPointerException("The other CustomBigInteger cannot be null.");
        }
        return new CustomBigInteger(this.value.add(other.value).toString());
    }

    /**
     * Performs a modulo operation. This method always returns a non-negative BigInteger.
     *
     * @param divisor The divisor to mod by. Must not be zero.
     * @return A new CustomBigInteger representing this value mod the divisor.
     * @throws ArithmeticException if the divisor is zero.
     * @throws NullPointerException if the divisor is null.
     */
    public CustomBigInteger mod(CustomBigInteger divisor) throws ArithmeticException, NullPointerException {
        if (divisor == null) {
            throw new NullPointerException("The divisor cannot be null.");
        }
        if (divisor.value.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        BigInteger result = this.value.mod(divisor.value);
        return new CustomBigInteger(result.toString());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
