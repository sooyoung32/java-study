package week01.chap04;

/**
 * Created by sooyo on 2016-10-10.
 */
public class Iterator {

    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;

        int result=0;
         while (tmp !=0) {
            result =result * 10 + tmp % 10;
             tmp /= 10;
         }

         if (number == result) {
             System.out.println(number + " 는 회문수입니다");
         } else {
             System.out.println(number + " 는 회문수가 아닙니다");
         }
    }


}
