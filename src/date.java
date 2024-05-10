import java.util.Scanner;

public class date {
    int day, month, year;
    date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this. year = year;
    }
    public int getDate(){
        return this.day;
    }
    public int getMonth(){
        return  this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDate(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        String result =this.day + " " + this.month + " " + this.year;
        return result;
    }
    public static void main(String[] args) {
        date date = new date(5, 12, 2005);
        date.toString();
        System.out.println();
    }
}
