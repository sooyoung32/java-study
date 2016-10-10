package week01.chap02;

public class Variable {
    /**
     *
     *  Q.1 8개의 기본형
     * boolean : 1 byte
     * char : 2 byte
     * byte : 1byte
     * short :2 byte
     * int : 4 byte
     * long : 8 byte
     * flout :  4 byte
     * double : 8byte
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Q2
         */
        int socialNum = 900228;
        System.out.println(socialNum);

        /**
         * Q3
         */
        System.out.println("1"+"2");
        System.out.println(true + "");
        System.out.println('A');
        System.out.println('A'+'B');
        System.out.println('1'+2);
        System.out.println('1'+'2');
        System.out.println('J'+"ava");
        // System.out.println(true + null); 오류
    }
}
