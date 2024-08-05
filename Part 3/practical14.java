

import java.util.Scanner;

class Date {
    private
    int date;
    int month;
    int year;


    Date(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }

    public int getdate(){
        return date;
    }

    public void setdate(int date){
        this.date=date;
    }
    public int getmonth(){
        return month;
    }

    public void setmonth(int month){
        this.month=month;
    }
    public int getyear(){
        return year;
    }

    public void setyear(int year){
        this.year=year;
    }

    public void Display(){
        System.out.println(date + "/" + month + "/" + year);
    }
}

class practical14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date :");
        int date= sc.nextInt();
        System.out.print("Enter month :");
        int month= sc.nextInt();
        System.out.print("Enter year :");
        int year= sc.nextInt();

        Date d = new Date(date , month , year);
        d.Display();

    }
}