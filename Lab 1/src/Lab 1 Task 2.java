import java.util.*;

class Main2 
{
    public static void main(String[] args)
    {
        boolean active = true;
        Scanner input = new Scanner(System.in);
        while(active)
        {
           
            System.out.println("Enter the amount in USD");
            int SGD  = input.nextInt();
            

            if (SGD < 0)
            {
                
                break;
            }

            else
            {
                System.out.println("The final amount in SGD " + SGD*1.35);
            }  
            
            
        }

        input.close();
    }
}
