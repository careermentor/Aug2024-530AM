package javaBasics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling
{
	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/test.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("name"));
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is fifth line");
		fw.flush();
		fw.close();
	}
	

	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");
		
		FileReader fr = new FileReader("./TestData/abc.txt");
		
		int r = fr.read();  //116
		
		while(r!=-1)  //116 //114
		{
			System.out.print((char)r);
			r = fr.read();
		}
			
	}
	
	public static void main(String[] args) throws Exception {
		
		writedata();
		readprop();
		
	}
	
}
