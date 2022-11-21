package assignment1;

import java.util.Arrays;
import java.util.List;

public class NextDateGiver {
    public List<Integer> monthOf31Days = Arrays.asList(1,3,5,7,8,10,12);
    public List<Integer> monthOf30Days = Arrays.asList(4,6,9,11);

    public int day;
    public int month;
    public int year;
    public int lastDay;

    public NextDateGiver (int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        lastDaySetter(month);
    }

    public void lastDaySetter(int month){
        if(monthOf31Days.contains(month)){
            lastDay = 31;
        }
        else if(monthOf30Days.contains(month)){
            lastDay = 30;
        } else if (isLeapYear(year)) {
            lastDay = 29;
        }
        else {
            lastDay = 28;
        }

    }

    public boolean isLeapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        else{
            return false;
        }
    }

    public String GetNextDay(){
        if(day == lastDay) {
            day = 1;
            if(month == 12) {
                month = 1;
                year++;
            }
            else{
                month++;
            }
        }
        else{
            day++;
        }
        return "Day: " + day + " " + "Month: " + month + " " + "Year: " + year;
    }
}