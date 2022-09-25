import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
public Employee(String id, String name, String project[]){
    
    this.eid = id;
    this.ename = name;
    this.eprojects = new String[project.length];
    for(int idx=0; idx<project.length; idx++)
    {
        this.eprojects[idx] = project[idx];
    }
    
}

public Employee(Employee e){
    this.eid = e.eid;
    this.ename = e.ename;
    this.eprojects = new String[e.eprojects.length];
    for(int idx=0; idx<e.eprojects.length; idx++)
    {
        this.eprojects[idx] = e.eprojects[idx];
    }
}

public void display(){
    System.out.println("id:"+this.eid);
    System.out.println("name:"+this.ename);
    System.out.println("projects:");
    for(String i:eprojects){
        System.out.print(i+":");
    }
}
public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class FClass
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}