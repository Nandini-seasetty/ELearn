package PROJECT;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/main")
public class Main extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String name=req.getParameter("nm");
		String dob=req.getParameter("dob");
		String mail=req.getParameter("mail");
		String pass=req.getParameter("pass");	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded and registered the driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Lavanya@2004");
			System.out.println("Established the connection");
			String qry="insert into userdb.user_details values (?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1,name);
			pstmt.setString(2,dob);
			pstmt.setString(3,mail);
			pstmt.setString(4,pass);
			System.out.println(name+mail+dob+pass);
			int res=pstmt.executeUpdate();
			PrintWriter out=resp.getWriter();
			if(res>0) {
				 resp.sendRedirect("home.html");
				 pstmt.close();
		         con.close();
			}
			else {
				out.print("<h1>Failed</h1>");
			}
	} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	
}
}