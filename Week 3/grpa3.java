import java.util.*;
    class BankAccount{
        int accountNumber;
        String name;
        int balance;
        final int minBalance = 100;
        private boolean checkMinBalance(int amount){
            if(balance - amount <= minBalance){
                return false;
            }
            else{
              return true;
            }
        }
//Fill the code here
        BankAccount(int accN, String name, int b){
            accountNumber = accN;
            this.name = name;
            balance = b;
        }
        public void balance(){
            System.out.println(this.balance);
        }
        
        public void deposit(int amt){
            this.balance+=amt;
        }
        
        public void withdraw(int amt){
            
            if(checkMinBalance(amt)){
                this.balance-=amt;
            }
            else{
                
                System.out.println("Transaction failed");
            }
            
        }
}
    class AccountCheck{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int amnt = sc.nextInt( );
            int amnt1 = sc.nextInt( );
            BankAccount b = new BankAccount(1890, "rahul", 1000);
            b.deposit(amnt);
            b.balance();
            b.withdraw(amnt1);
            b.balance();
        }
    
    }