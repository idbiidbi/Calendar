import data.Holidays;
import data.Months;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = input.nextLine();

        Map<String, List<Holidays>> dictionary = new HashMap<>();

        var januaryList = new ArrayList<Holidays>();
        januaryList.add(Holidays.NEWYEAR);
        dictionary.put(Months.JANUARY.getName(), januaryList);

        var aprilList = new ArrayList<Holidays>();
        aprilList.add(Holidays.GOODFRIDAY);
        aprilList.add(Holidays.EASTER);
        dictionary.put(Months.APRIL.getName(), aprilList);

        var mayList = new ArrayList<Holidays>();
        mayList.add(Holidays.LABOURDAY);
        mayList.add(Holidays.RestorationOfIndependenceDay);
        mayList.add(Holidays.MOTHERSDAY);
        dictionary.put(Months.MAY.getName(), mayList);

        var juneList = new ArrayList<Holidays>();
        juneList.add(Holidays.LIGO);
        dictionary.put(Months.JUNE.getName(), juneList);

        var novemberList = new ArrayList<Holidays>();
        novemberList.add(Holidays.INDEPENDENCEDAY);
        dictionary.put(Months.NOVEMBER.getName(), novemberList);

        var decemberList = new ArrayList<Holidays>();
        decemberList.add(Holidays.CHRISTMAS);
        dictionary.put(Months.DECEMBER.getName(), decemberList);


        if (!month.isBlank()) {
            var holidays = dictionary.get(month.toLowerCase());
            System.out.println("There are the following holidays in " + month + ": \n");

            for (var hol: holidays) {
                System.out.println(hol.getHolidayName());
            }
        }
    }
}
