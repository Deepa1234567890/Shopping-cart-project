package org.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.project.model.Cart;

@WebServlet("/add-to-cart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		ArrayList<Cart> cart_list= new ArrayList<>();
		
		try  {
             ArrayList<Cart> cartList = new ArrayList<>();
             
             
			int id = Integer.parseInt(request.getParameter("id"));
			Cart cm = new Cart();
			cm.setId(id);
			cm.setQuantity(1);
			
			
			HttpSession session = request.getSession();
			 cart_list= (ArrayList<Cart>) session.getAttribute("cart-list");
			
			if (cart_list == null) {
				cartList.add(cm);
				session.setAttribute("cart-list", cartList);
				response.sendRedirect("index.jsp");
				 out.println("session created and added the list");
			} else {
				cartList = cart_list;
                boolean exist = false;
                
				for (Cart c : cart_list) {
				out.print(c.getId());
					if (c.getId() == id) {
						exist = true;
						out.println("product exist");
						out.println("<h3 style='color:crimson; text-align: center'>Item Already inCart. <a href='cart.jsp'>GO to Cart Page</a></h3>");
					}
				}
			

				if (!exist) {
					cartList.add(cm);
					out.println("product added");
					response.sendRedirect("index.jsp");
				}
			}
			}catch (Exception e) {
				// TODO: handle exception
			}
	
		
	
	
	
	
	
	}
}

