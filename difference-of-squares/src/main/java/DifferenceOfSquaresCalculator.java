class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        Integer total = 0;
        for (int i = 1; i <= input; i++) {
            total += i;
        }
        return (int)Math.pow(total, 2);
    }

    int computeSumOfSquaresTo(int input) {
        Integer total = 0;
        for (int i = 1; i <= input; i++) {
            total += (int)Math.pow(i, 2);
        }
        return total;
    }

    int computeDifferenceOfSquares(int input) {
        return Math.abs(computeSquareOfSumTo(input) - computeSumOfSquaresTo(input));
    }

}
