package 手牌比较;

import java.util.Scanner;

//https://www.nowcoder.com/question/next?pid=260145&qid=25367&tid=32502729

public class Main {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
//			System.out.println(s1);
        String[] arr = s1.split("-");
        String hand1 = arr[0];
        String hand2 = arr[1];

        String[] hand1arr = hand1.split(" ");
        String[] hand2arr = hand2.split(" ");
//			
//			
//			System.out.println(hand1);
//
//			System.out.println(hand2);


        if (hand1.equals("joker JOKER") || hand2.equals("joker JOKER")) {
            System.out.println("joker JOKER");
        }
        else if (hand1arr.length == hand2arr.length) {


            if (count(hand1arr[0]) > count(hand2arr[0])) {
                System.out.println(hand1);
            } else {
                System.out.println(hand2);
            }
        }

        else if ((hand1arr.length == 4) && (hand2arr.length != 4)) {
            System.out.println(hand1);
        } else if (hand2arr.length == 4 && hand1arr.length != 4) {
            System.out.println(hand2);

        } else {
            System.out.println("ERROR");
        }
    }


    public static int count(String s) {
        return "345678910JQKA2jokerJOKER".indexOf(s);
    }

}
