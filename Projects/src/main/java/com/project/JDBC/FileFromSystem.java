package com.project.JDBC;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;

public class FileFromSystem {
	public static void main(String[] args) {
   
	try {
		
	  Connection c = ConnectionProvider.getConnection();
	  
	  String q = "insert into image(pic)value(?)";
	  PreparedStatement pstmt = c.prepareStatement(q);
	  
	  
	  JFileChooser jfc = new JFileChooser();
	  jfc.showOpenDialog(null);
	  File file = jfc.getSelectedFile();
	  
	  FileInputStream fis = new FileInputStream(file);
	 
	pstmt.setBinaryStream(1,fis , fis.available());
	  pstmt.executeUpdate();
	  System.out.println("Done....!!!!");
	  }catch(Exception e) {
	e.printStackTrace();
}
}
}
