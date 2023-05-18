package this_is_java.universitytask;

public class Date {
    private int year;
    private String month;
    private int day;
    Date() {
        this(2023, "4월", 23);
    }

    Date(int year) {
        this(year, "4월", 23);
    }

    Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return "Date [Year=" + year+", month=" + month + ", day = " + day +"]" ;
    }
}
