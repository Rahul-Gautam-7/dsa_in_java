//the 10digit number whose sum is divisible by 11
public class Isbnnumber {

    public static void main(String[] args) {
        
        int num = 1259060977;
        int sum =0;
        int i=1;
        while (num>0) {

            int rem = num%10;
            sum+=(i*rem);
            num/=10;
            i++;
            
        }
        System.out.println(sum);
        if(sum%11 == 0)
        {
            System.out.println("The number is ISBN number ");
        }
        else
        {
            System.out.println("The number is not an ISBN number ");
        }

    }
    
}
