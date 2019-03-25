package com.dt13.controller;
import java.util.Collection;
import javax.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.dt13.model.UserDetails;
@Controller
public class LoginController {
	@RequestMapping("/Login")
	public ModelAndView goToForm()
			{
		System.out.println("login");
				ModelAndView mv=new ModelAndView("Login");
			
	    mv.addObject("User",new UserDetails());
	     return mv;

   	   }
	
	@RequestMapping("/on_login_success")
   public String onLoginSuccess (HttpSession session)
    {
		
       Authentication authentication=
		SecurityContextHolder.getContext().getAuthentication();
		    Collection<GrantedAuthority> list= (Collection<GrantedAuthority>)authentication.getAuthorities();
		    //String page="";
		    String un=authentication.getName();
		    session.setAttribute("uname",un);
		    
		//check authories with ROLE_USER and ROLE_ADMIN
		    for(GrantedAuthority authoritie:list)
		    {
		        if(authoritie.getAuthority().equals("ROLE_USER"))
		        {
		            un="guesthome";
		        }
		        else
		        {
		            un="adminhome";
		        }
		    }
		    return un;

		
   }
	
}
