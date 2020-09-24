//package selfprojects;

/*

BANKING APPLICATION

*/
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class test 
{
    private static Formatter output;
    public static void main(String args[])
    {
        open();   //open the file
        read();
        close();
    }
    public static void open()
    {
        try
        {
            output = new Formatter("bank.txt");
        }
        catch(NullPointerException | FileNotFoundException e)
        {
            e.getMessage();
        }
    }
    public static void read()
    {
        Scanner input = new Scanner(System.in);
                System.out.println("User Name:");
                String user = input.nextLine();
                System.out.println("Password : ");
                String password = input.nextLine();
                if(user.equals("maryam") && password.equals("123"))
                {
                    options();
                }
                else
                {
                    System.out.println("incorrect\n");
                    read();
                }
        
       
        }   
     
        
        

       
    
    public static void close()
    {
        if(output!= null)
        {
            output.close();
        }
    }
     public static void options()
     {
         Scanner input = new Scanner(System.in);
         action o = new action(50);
          int option;
        do{
           System.out.println("Select options\n\t 1: remaining balance\n\t 2: add balance\n\t 3: withdraw\n\t 4: exit\n\n");
           output.format("Select options\n\t 1: remaining balance\n\t 2: add balance\n\t 3: withdraw\n\t 4: exit\n\n");
           System.out.println("enter option");
           output.format("enter option\n");
           option = input.nextInt();
           System.out.println("option selected is: "+option);
           output.format("option selected is: %d\n",option);
           switch(option)
        {
            case 1:
                System.out.println("remaining balance is " + o.getBalance());
                output.format("remaining balance is %d\n",o.getBalance());
                break;
            case 2:
                System.out.println("Enter amount to add");
                output.format("Enter amount\n");
                int add = input.nextInt();
                o.add(add);
                output.format("new balance: %d",o.getBalance());
                System.out.println("new balance :" + o.getBalance());
                break;
            case 3:
                System.out.println("Enter amount to subtract");
                output.format("Enter amount to subtract");
                int subtract = input.nextInt();
                o.subtract(subtract);
                output.format("after withdraw amount %d",o.getBalance());
                System.out.println("after withdraw amount " + o.getBalance());
                break;
            case 4:
               System.out.println("Exit");
               output.format("Exit");
     }
           
     } while(option!=4);
}
     }
    


class action
{
    int add;
    int subtract;
    int balance;
    
    public action(int balance)
    {
        if(balance>0.0)
        this.balance=balance;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    public int getBalance()
    {
        return balance;
    }
    public int add(int add)
    {
        return balance = balance + add;
    }
    public int subtract(int subtract)
    {
         if(subtract < balance)
         {
              balance = balance - subtract;
         }
         return balance;
    }
    
}
    
