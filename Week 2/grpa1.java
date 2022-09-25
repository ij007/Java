import java.util.*;
public class SeriesSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//Fill your code here
    int sum=0;
    for(int start=1; start<=n; start++){
        for(int inner=1; inner<=start; inner+=1)
        {
            sum+=Math.pow(inner, 2);
        }
    }
System.out.println(sum);
    
  }
}