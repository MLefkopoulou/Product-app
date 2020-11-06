package com.hw2.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.sql.*;

/**
 * Servlet implementation class InsertInfo
 */
@WebServlet("/InsertInfo")
public class InsertInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String Name = request.getParameter("name");
		String Color = request.getParameter("color");
		String Description = request.getParameter("description");
		String Barcode = request.getParameter("barcode");
		int check  =0;
		check = updateDB(Name,Color,Description,Barcode);
		if(check == 2) {
			String url = "/error.jsp";
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}
		else {
			String url = "/DisplayInfo.jsp";
			ProductInfo prod = new ProductInfo(Name,Color,Description,Barcode);
			request.setAttribute("prod", prod);
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}
	
	}
	protected int updateDB(String Name, String Color ,String Description,String Barcode) {
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			//Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/homework2";
			String user = "marialena";
			String pw = "test1sql";
			con = DriverManager.getConnection(url,user,pw);
			Statement s = con.createStatement();
			String query = "INSERT INTO product"+"(name, color, description, barcode)"+"VALUES('"+Name + "', '"+Color+"', '"+Description+"','"+Barcode+"')";
			s.executeUpdate(query);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			return(1);
		}
		catch(SQLException e){
			e.printStackTrace();
			return (2);
		}
		return(0);
	}
}