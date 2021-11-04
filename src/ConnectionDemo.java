import java.sql.*;
import java.util.Scanner;
public class ConnectionDemo {
	
	public static void main(String[]args){
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:product.db");
			if(con!=null)
			{
//				Updating
//				Statement stmt=con.createStatement();
//				String sql="update products set qty=30 where pid=102";
//				String sql1="delete from products where pid=103";
//				int n=stmt.executeUpdate(sql);
//				System.out.println(n+"records updated");
//  			Retriving				
				PreparedStatement pstmt=con.prepareStatement("select * from products");
				ResultSet rs= pstmt.executeQuery();
				System.out.println("pid\tpname\tqty");
				System.out.println("_______________________");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				}
							
								
//				PreparedStatement pstmt1=con.prepareStatement("insert into products values(?,?,?)");
//				int n=stmt1.executeUpdate("create table products(pid int primary key,pname text,quantity int)");		
//				System.out.println("table created");
//				int n=stmt1.executeUpdate("insert into products values(102,'Mobile',10)");
//				System.out.println(n);
//				System.out.println("Enter the product ID");
//				int pid=sc.nextInt();
//				
//				System.out.println("Enter Quantity");
//				int qty=sc.nextInt();
//				System.out.println("Enter the product Name");
//				String pname=sc.next();
//				pstmt1.setInt(1, pid);
//				pstmt1.setString(2, pname);
//				pstmt1.setInt(3, qty);
//				int n=pstmt1.executeUpdate();
//				System.out.println(n);

//				pstmt1.executeUpdate("insert into products values("+pid+"',"+pname+"',"+qty+")");				
				
			}		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
