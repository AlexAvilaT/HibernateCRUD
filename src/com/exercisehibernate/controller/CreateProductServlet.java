package com.exercisehibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.exercisehibernate.model.Product;

/**
 * Servlet implementation class CreateProductServlet
 */
@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.setContentType("text/html charset = 'UTF-8'");
		PrintWriter output = response.getWriter();
		
		//objeto de persistencia
		Product myProduct = new Product();
		myProduct.setNameProduct(request.getParameter("txtNameProduct"));
		myProduct.setPriceProduct(Double.parseDouble(request.getParameter("txtPriceProduct")));
		
		
		System.out.println(myProduct.toString());
		
		
		//crear el objeto de configuracion
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		//crear session factory
		
	
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		//abrir sesion
		Session session = sessionFactory.openSession();
		
		//iniciar el request
		Transaction t = session.beginTransaction();
		//iniciar el proceso dde persistencia
		//crud create
		session.persist(myProduct);
		
		System.out.println("se guardaron los datos");
		
		session.close();
		
		output.close();
		
		
	}

}
