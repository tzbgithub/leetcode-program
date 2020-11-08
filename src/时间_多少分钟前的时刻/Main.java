package 时间_多少分钟前的时刻;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int day = in.nextInt();

        String time = in.next();

        int minute = in.nextInt();


        String time_minute = time.substring(3);
        String time_hour = time.substring(0, 2);

//		System.out.println(time_day);
//
//		System.out.println(time_minute);

        int Hour = Integer.valueOf(time_hour);

        int Minute = Integer.valueOf(time_minute);

//		System.out.println(Hour);
//
//		System.out.println(Minute);



        int beHour = (minute / 60) % 24;

        int beDay = (minute / 24 / 60) % 7;

        int beMinute = minute % 60;

        if (Minute - beMinute < 0) {
            Minute = Minute - beMinute + 60;
//			System.out.println("a" + Minute);
            beHour++;
        } else {
            Minute = Minute - beHour;
        }

        if (Hour - beHour < 0) {
            Hour = Hour - beHour + 24;
            beDay++;
        } else {
            Hour = Hour - beHour;
        }
        if (day - beDay < 0) {
            day = day - beDay + 7;

        } else {
            day = day - beDay;
        }

        System.out.println(day);

        System.out.println(String.valueOf(Hour) + ":" + String.valueOf(Minute));

    }
}
