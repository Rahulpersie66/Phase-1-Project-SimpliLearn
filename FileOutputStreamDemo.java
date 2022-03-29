import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.filechooser.FileSystemView;

public class FileOutputStreamDemo {
	
	private FileOutputStream file=null;
	private FileInputStream fis=null;
	
	
	public void createFile(String fname)
	{
		try {
			File home = FileSystemView.getFileSystemView().getHomeDirectory();
			String desktop=home.getAbsolutePath();
			String desktop1=desktop+"//"+fname;
		file=new FileOutputStream(desktop1);
		String data="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text to write in File:");
		
		data=sc.nextLine();
		byte [] b=data.getBytes();
		file.write(b);
		}
		
		catch(IOException e)
		{
			System.out.println("Input output error");
		}
		finally{
			if(file!=null)
				try{
					file.close();
				}
			catch(IOException e)
			{
				System.out.println("File close error.");
			}
		}
	}
	
	public void displayFile(String fname)
	{
		try {File home = FileSystemView.getFileSystemView().getHomeDirectory();
		String desktop=home.getAbsolutePath();
		String desktop1=desktop+"//"+fname;
			fis=new FileInputStream(desktop1);
			int data;
			System.out.println("");
			System.out.println("Content of the file:");
			while((data=fis.read())!=-1)//until file empty
				System.out.print((char)data);
		
		}
		catch(IOException e)
		{
			System.out.println("No such file exist.");
		}
		
		finally {
			if(fis!=null)
				try {
					fis.close();
				}
			catch(IOException e)
			{
				System.out.println("Input Output error occured.");
			}
		}
		
		
	}
	
	public void deleteF(String fname)
	{	File home = FileSystemView.getFileSystemView().getHomeDirectory();
	String desktop=home.getAbsolutePath();
	String desktop1=desktop+"//"+fname;
		File f=new File(desktop1);
		
		if(f.delete())
			System.out.println("file deleted succesfully.");
		else
			System.out.println("File not deleted succesfully");
	}
	
	public void searchFound(String fname)
	{	File home = FileSystemView.getFileSystemView().getHomeDirectory();
	String desktop=home.getAbsolutePath();
	String desktop1=desktop+"//"+fname;
		File f=new File(desktop1);
		if(f.exists())
			System.out.println("The file " +fname+" is found.");
		else
			System.out.println("The file not found.");
		
	}
}
