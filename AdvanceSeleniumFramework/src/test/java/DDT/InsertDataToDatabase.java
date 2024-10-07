package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertDataToDatabase {

	public static void main(String[] args) throws Throwable {
		//step1:- register/load my SQL database
				Driver driverRef= new Driver();
				DriverManager.registerDriver(driverRef);
				
				//step2:- get connect to database
				
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_Table","root","root");
				
				//step3:-
				Statement state=conn.createStatement();
				String query="insert into student(id,first_name,last_name,address)values('3','sam','ram','goa'))";
            
				int result=state.executeUpdate(query);
				
				if(result==1)
				{
					System.out.println("data created");
				}
				else {
					System.out.println("data not created");
				}
				conn.close();
				
	}

}
