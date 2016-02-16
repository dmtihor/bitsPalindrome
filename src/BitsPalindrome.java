public class BitsPalindrome {
    public boolean isPalindrome(int input) {

        int temp = 0;
        int tempInput = input;

        for (int i = 0; i < 32; i++) {
            temp <<= 1;
            temp |= (tempInput & 1);
            tempInput >>>= 1;
        }
        return input == temp;
    }
}