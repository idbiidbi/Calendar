package data;

public enum Holidays {

    NEWYEAR("New Year"),
    GOODFRIDAY("Good Friday"),
    EASTER("Easter"),
    LABOURDAY("Labour Day"),
    RestorationOfIndependenceDay("Restoration of Independence Day"),
    MOTHERSDAY("Mothers Day"),
    LIGO("LIGO"),
    INDEPENDENCEDAY("Independence Day of Latvia"),
    CHRISTMAS("Christmas"),
    NONE("NONE");  // используется для варианта с FEBRUARY

    private String holidayName;

    private Holidays(String holidayName) {
        this.holidayName = holidayName;
    }

    public String getHolidayName() {
        return this.holidayName;
    }

}
