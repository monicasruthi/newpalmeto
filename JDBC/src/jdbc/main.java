package jdbc;
	 
import java.util.Iterator;

	import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	 
	 
	 
	public class main
	{
	     private static final String String = null;
	     ApplicationContext ctx=new ClassPathXmlApplicationContext("appcontext.xml"); 
	        
         EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");
        

		public static void main(String[] args)
	     {
            ApplicationContext ctx=new ClassPathXmlApplicationContext("appcontext.xml"); 
        
            EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");
       
	    
	    	 Scanner sc=new Scanner(System.in);
		     if(res==0) {
		     System.out.println("record alredy exist with this id");
		     }
		     else
		    	 System.out.println("enter employee id");
		     int res=dao.addRecord(st);
		     Employee st=new Employee();
		     System.out.println("enter id");
		     int id=sc.nextInt();
		     System.out.println("enter firstname:");
		     String firstname=sc.next();
		     System.out.println("enter Lastname:");
		     String lastname=sc.next();
		     st.setId(id);
			 st.setFirstname(firstname);
			 st.setLastname(lastname);
		     System.out.println("record inserted...");
	         
	           

	          /* List<Employee> employee =dao.getEmployee();
	               
	              Iterator<Employee> itr=employee.iterator();
	              for(Employee e:employee)
	              {
	                   System.out.println(e.getId()+" " +e.getFirstname()+" "+e.getLastname());
	              }
	         
	              dao.getEmployee();*/
	              
	              
	             
	     }
	}


