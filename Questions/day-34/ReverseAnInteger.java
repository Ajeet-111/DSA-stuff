public class ReverseAnInteger{
    public long reverse(int num){
        boolean isNeg = num < 0;
        if (isNeg) {
            num = num * -1;
        }
        long rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        return isNeg? -1 * rev : rev;
    }
    public static void main(String[] args){
        ReverseAnInteger rai = new ReverseAnInteger();
        System.out.println(rai.reverse(2567));
    }
}