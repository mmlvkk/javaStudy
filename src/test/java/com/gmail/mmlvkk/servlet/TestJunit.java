package com.gmail.mmlvkk.servlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import bsh.EvalError;
import bsh.Interpreter;

public class TestJunit {

	private com.gmail.mmlvkk.servlet.Test testServlet ;
    private HttpServletRequest mockRequest;  
    private HttpServletResponse mockResponse; 
    
    private PrintWriter out ;
    
	@Test
	public void test() throws ServletException, IOException {
		testServlet = new com.gmail.mmlvkk.servlet.Test();
		mockRequest = EasyMock.createMock(HttpServletRequest.class);         //加载  
        mockResponse = EasyMock.createMock(HttpServletResponse.class);  
//        out = new PrintWriter(System.out, true);
//        out = new PrintWriter("c:\\a.txt");
        StringWriter sw = new StringWriter();
        out = new PrintWriter(sw, true);
        
        mockResponse.setContentType("text/html");
        EasyMock.expect(mockResponse.getWriter()).andReturn(out).times(1); 
       
       
        EasyMock.replay(mockRequest);                    //回放  
        EasyMock.replay(mockResponse);  
          
        testServlet.doPost(mockRequest, mockResponse);  //调用  
        
        EasyMock.verify(mockRequest);
        EasyMock.verify(mockResponse);
        System.out.println(sw.toString());
//        Assert.assertEquals(6, 6);
//        Assert.assertEquals("This is class com.gmail.mmlvkk.servlet.Test, using the POST method", sw.toString());
//        Assert.assertArrayEquals(expecteds, actuals)
        Assert.assertTrue(sw.toString().contains("This is class com.gmail.mmlvkk.servlet.Test, using the POST method"));
		
//        PrintWriter w = new PrintWriter(System.out, true);
//        w.print("ffffffffffffffffffffff");
//        w.flush();
	}
	@Test
	public void test2() throws EvalError {
		String discountRate = "t*0.5+100";
		Interpreter sum = new Interpreter();  // Construct an interpreter
		sum.set("t", 100);                    // Set variables
		sum.set("discount", discountRate);
		sum.eval("tariffSum = "+sum.get("discount"));    
//		sum.eval("tariffSum = 12+12");
		Assert.assertEquals(sum.get("tariffSum"), 150d);
	}

}
