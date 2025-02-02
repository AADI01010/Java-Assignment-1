package Assignment.Programs;

public class SumDigitNumber {
    public static void main(String[] args) {
        int num=12345;
        int temp=num;
        int r=0;
        while(temp!=0){
            r+= temp%10;;
            temp/=10;
        }
        System.out.println(Math.pow(10,2));
        System.out.println("The Sum of the Number you have entered is:-"+r);
    }
}
