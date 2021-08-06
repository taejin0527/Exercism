class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String number = String.valueOf(numberToCheck);
        int len = number.length();

        Integer result = number.chars().map(Character::getNumericValue).map(n -> (int) (Math.pow(n, len))).sum();

        return result == numberToCheck;
    }

}
