package Task3_DateDifference;

public class SwiftDate {

    private int year;
    private int month;
    private int day;

    public String getInfo() {
        return toString();
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 400 == 0) {
            return true;
       } else if (year % 100 != 0 && year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getCentury() {
        return year / 100 + 1;
    }

    public int getDaysDifference(SwiftDate other) {
        return (other.getDays() - this.getDays()) + 1;
    }

    private int getDays() {
        int days = 0;

        for (int i = 0; i < getYear(); i++) {
            if (isLeapYear(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }
  // }
  // int x = year*365+year/4-yeasr/100+year/400;
  //switch(month){
    //  case 1:
      //    break;
      //case 2:
        //  x +=31;
      //case 3:
        //  x +=31:
         // break:
  //}
//}
