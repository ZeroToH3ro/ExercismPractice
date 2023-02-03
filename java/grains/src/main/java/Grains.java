import java.math.BigInteger;

class Grains {
    static final int NUM_SQUARES = 64;

    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square > NUM_SQUARES) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger base = new BigInteger("2");
        return base.pow(square-1);
    }

    BigInteger grainsOnBoard() {
        BigInteger base = new BigInteger("2");
        return base.pow(NUM_SQUARES).subtract(BigInteger.ONE);
    }
}
