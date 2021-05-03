
import data.Holidays;
import data.Months;

import javax.swing.JOptionPane;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, List<Holidays>> dictionary = new HashMap<>();

        var januaryList = new ArrayList<Holidays>();
        januaryList.add(Holidays.NEWYEAR);
        dictionary.put(Months.JANUARY.getName(), januaryList);

        var februaryList = new ArrayList<Holidays>();      //  будет неправильная надпись, поиск работает как по MARCH - пустой список
        februaryList.add(Holidays.NONE);
        dictionary.put(Months.FEBRUARY.getName(), februaryList);

        var marchList = new ArrayList<Holidays>();
        dictionary.put(Months.MARCH.getName(), marchList);

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

        var julyList = new ArrayList<Holidays>();
        dictionary.put(Months.JULY.getName(), julyList);

        var augustList = new ArrayList<Holidays>();
        dictionary.put(Months.AUGUST.getName(), augustList);

        var septemberList = new ArrayList<Holidays>();
        dictionary.put(Months.SEPTEMBER.getName(), septemberList);

        var octoberList = new ArrayList<Holidays>();
        dictionary.put(Months.OCTOBER.getName(), octoberList);

        var novemberList = new ArrayList<Holidays>();
        novemberList.add(Holidays.INDEPENDENCEDAY);
        dictionary.put(Months.NOVEMBER.getName(), novemberList);

        var decemberList = new ArrayList<Holidays>();
        decemberList.add(Holidays.CHRISTMAS);
        dictionary.put(Months.DECEMBER.getName(), decemberList);

        while (true) {
//            JOptionPane.showInputDialog("Enter the month: ");
            System.out.print("Enter the month: ");
            String month = input.nextLine();
            if (month.isBlank() || !dictionary.containsKey(month.toLowerCase())) {

//                JOptionPane.showMessageDialog(null,"Incorrect month name");
                System.out.println("Incorrect month name");
                continue;

            } else {
                var holidays = dictionary.get(month.toLowerCase());

                if (holidays.size() == 0) {
                    System.out.println("There are no holidays in " + month);
                    return;
                }
//              if(holidays.contains(Holidays.NONE)) {                               то же самое, если использовать Holidays.NONE
//                  System.out.println("There are no holidays in " + month);
//                  return;
//              }

                 else {

                    System.out.print("There are the following holidays in " + month + ": \n");
                    for (var hol: holidays) {
                        System.out.println(hol.getHolidayName());
                    }
                }
            }
            return;
        }
    }
}

