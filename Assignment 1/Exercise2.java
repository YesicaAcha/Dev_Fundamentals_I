/**
 * Given a year, return the century it is in. The first century spans from the
 * year 1 up to and including the year 100, the second - from the year 101 up to
 * and including the year 200, etc.
 */
public class Exercise2 {

    /**
     * Gets the century of the year received in the parameter.
     * 
     * @param year - Year.
     * @return the century of the year.
     */
    private static int getCenturyByYear(final int year) {
        return (year - 1)/100 + 1;
    }
 
    public static void main(String[] args) {
        int year = Integer.parseInt(System.console().readLine("Enter the year: "));
        System.out.println("The year " + year + " is part of " + getCenturyByYear(year) + " century.");
    }    
}