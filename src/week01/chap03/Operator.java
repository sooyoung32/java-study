package week01.chap03;

/**
 * Created by sooyo on 2016-10-10.
 */
public class Operator {
    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A' ; // 'A'의 문자 코드 65
        System.out.println(1 + x << 33); // 6
        System.out.println(y >= 5 || x < 0 && x > 2); // true
        System.out.println(y += 10 - x++); // 13
        System.out.println(x += 2); // 5
        System.out.println(!('A' <= c && c <= 'Z')); //false
        System.out.println('C' -c); //2
        System.out.println(c+1); // 66
        System.out.println(++c); // B
        System.out.println(c++);//B
        System.out.println(c); //C


        // 3-2
        System.out.println("3-2 문제: ");
        int numOfApples = 123;
        int sizeOfbucket = 10;
        int numOfbucket = getNumOfBucket(numOfApples, sizeOfbucket);
        System.out.println(numOfbucket);

        System.out.println("3-3 문제: ");
        int num = 10;
        System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));

        System.out.println("3-5 문제 : ");
        int num2 = 333;
        System.out.println(num/10*10 +1);

    }

    private static int getNumOfBucket(int numOfApples, int sizeOfBucket) {
        int value = numOfApples/sizeOfBucket;
        if (numOfApples%sizeOfBucket != 0) {
            value++;
        }
        return value;
    }
}
