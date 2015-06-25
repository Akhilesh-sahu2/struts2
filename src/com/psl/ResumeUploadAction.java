package com.psl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ResumeUploadAction extends ActionSupport implements ModelDriven<Employee>, ServletContextAware{
	static final Map localess = new HashMap();
	
	static {
		localess.put("en_US", "English");
		localess.put("es_SP", "Spanish");
	}
	
	public Map getLocaless(){
		return localess;
	}
	
	private Employee emp= new Employee();
	private ServletContext context;
	
	public Employee getModel() {
		return emp;
	}
	
	public String execute(){
		System.out.println("In ResumeUploadAction Execute method");
		File file = emp.getCv();
		FileInputStream fis=null;
		FileOutputStream fos=null;
		String realPath= context.getRealPath("");
		System.out.println("CTX Real Path : "+realPath);
		try {
			fis= new FileInputStream(file);
			fos= new FileOutputStream(realPath+"/"+emp.getCvFileName());
			
			FileChannel fileChannel = fis.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate((int)file.length());
			fileChannel.read(buffer);
			buffer.flip();
			FileChannel fosFileChannel=fos.getChannel();
			fosFileChannel.write(buffer);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return "uploadsuccess";
	}
    public ServletContext getServletContext(){
    	return this.context;
    }
	
	public void setServletContext(ServletContext context) {
		this.context=context;
		
	}

}
