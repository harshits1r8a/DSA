package Phase1.Assingment_03;


import java.time.LocalDate;

public class Ass_03_R25 {
    public static void main(String[] args) {
        int month = 8; // August
        int year = 2023; // Year

        LocalDate startOfMonth = LocalDate.of(year, month, 1);
        int numberOfDays = startOfMonth.lengthOfMonth();

        int count = 0;
        for (int day = 1; day <= numberOfDays; day++) {
            LocalDate date = LocalDate.of(year, month, day);
            if (date.getDayOfMonth() % 2 == 0) {
                count++;
            }
        }

        System.out.println("Kunal can go out on " + count + " days in August " + year + ".");
    }
}
