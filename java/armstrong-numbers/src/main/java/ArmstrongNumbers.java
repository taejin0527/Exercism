class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int digit = numberToCheck;
        int len = (int) (Math.log10(numberToCheck) + 1);
        int sum = 0;

        while (digit > 0) {
            int d = digit % 10;

            sum += Math.pow(d, len);

            digit /= 10;
        }

        return sum == numberToCheck;
    }

}
