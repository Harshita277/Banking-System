import java.util.Scanner;
public class Banking {
    public static void main(String arg[])
    {
        int choice;
        int acno,tmp;
        int money;
        String name, type = null;
        int check_bal =0;
        Scanner sc = new Scanner(System.in);
        // to create a random account 
        System.out.println("Enter name");
         name = sc.next();
         System.out.println("Enter account no ");
         acno = sc.nextInt();
         Bank2 b = new Bank2("Pratham", 123567, 1931, "Current");
             System.out.println("1) Create Account ");
             System.out.println("2) Deposit Money ");
             System.out.println("3) Check Balance " );
             System.out.println("4) Withdraw Money ");
             System.out.println("5) Display Account Details ");
             System.out.println("0) Quit ");
         System.out.println("Enter choice ");
         choice = sc.nextInt();
         boolean quit = false; 
         while(choice==0);
         {
             switch(choice)
             {
                 case 1: 
                          System.out.println("Enter user name ");
                          name = sc.next();
                          System.out.println("Enter account number ");
                          acno = sc.nextInt();
                          b.insert(type, check_bal, type);
                          System.out.println("Your details ");
                          b.display();
                           break;
                 case 2: // deposit money
                         System.out.println("Enter user name ");
                         name = sc.next();
                         System.out.println("Enter account number ");
                         tmp = sc.nextInt();
                         if(tmp==acno)
                         {
                            System.out.println("Enter money to deposit ");
                            money = sc.nextInt();
                            System.out.println("Money deposited Succesfully");
                            b.display();
                         }
                         else
                         System.out.println("Wrong Account Number");
                         break;
                 case 3: // check balance
                     System.out.println("Enter account number ");
                     tmp = sc.nextInt();
                     if(tmp == acno)
                     {
                         System.out.println("Your balance "+b.balance);
                     }
                     else 
                     System.out.println("Wrong account Number ");
                     break;
                case 4: // withdraw money
                       System.out.println("Enter account number");
                       tmp = sc.nextInt();
                       if(tmp == acno)
                       {
                           if(b.balance==0)
                           System.out.println("You have no money ");
                           else
                           System.out.println("Enter money to withdraw ");
                           money = sc.nextInt();
                           if(money> b.balance)
                           {
                               System.out.println("You don't have sufficient money ");
                           }
                           else 
                           check_bal = b.withdraw();
                           System.out.print(" Your current balance"+check_bal);
                       }
                       break;

                case 5: // display account details
                      System.out.println("Enter account number ");
                      tmp = sc.nextInt();
                      if(tmp== acno)
                      {
                        System.out.println("Your details ");
                          b.display();
                      }
                      else
                      System.out.println("Wrong account number ");
                      break;
               case 0:
                   quit = true;
                   break;
                
                default: 
                   System.out.println(" wrong choice ");
                   break;
                        
                        
             }
            
         }
    }
}
class Bank1{
    String name,type;
    int balance ;
    int account;
    
    Bank1(String n, int acc,int bal,String t )
    {
        name = n;
        type= t;
        account = acc;
        balance = bal ;
    }
}   // end parent class
// child class
class Bank2 extends Bank1{
    Bank2(String n, int acc,int bal,String t)
    {    
        super(t, bal, bal, t);
        name = n;
        type= t;
        account = acc;
        balance = bal ;
    }  
       public int withdraw() {
		return 0;
	}
	void insert(String n, int acc, String t)
       {
        name = n;
        type= t;
        account = acc;
          
       }
       void display(){
           System.out.println("Name"+name);
           System.out.println("Account No. "+account);
           System.out.println("Account Balance"+balance);
           System.out.println("Account type "+type);
       }
       void deposit(int acc, int money)
       {
           balance = money;
       }
       int withdrawn(int wd)
       {
           balance = balance - wd;
           return balance; 
       }
}