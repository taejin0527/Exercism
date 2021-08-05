class Leap {

    boolean isLeapYear(int year) {
        /** 다른사람 풀이
           boolean isDivisibleByFour = year % 4 == 0;
           boolean isDivisibleBy100 = year % 100 == 0;
           boolean isDivisibleBy400 = year % 400 == 0;
           return isDivisibleByFour && (!isDivisibleBy100 || isDivisibleBy400);
         */

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

}
