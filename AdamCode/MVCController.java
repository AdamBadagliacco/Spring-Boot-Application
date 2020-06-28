package com.renadam.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    
    @GetMapping("/loginScreen")
    public String loginScreen(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    
    
    @RequestMapping(value = "/newGame")
    public ModelAndView someMethod(@RequestParam("myEmail") String myEmail) {
    	String myCode = ""; //Initialize
    	boolean b = false;
    	while(!b){
    		myCode = CodeHandler.generateCode();
        	int code = Integer.parseInt(myCode);
        	b = DatabaseConnectionHandler.enterCodeIntoDatabase(code);
    	}
    	EmailHandler.sendEmail("XXXX","XXXX",myEmail,myCode,"Your code to continue your game is: " + myCode);
    	return new ModelAndView("redirect:/MainPage/gamepage.html");
    	
    }

}