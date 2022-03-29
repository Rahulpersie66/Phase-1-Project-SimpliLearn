
public class GenricAndMenu {

	private String applicationName ="Locker File";
	private String developerName="Rahul Rana";
	
	public void nameDispaly() {
		System.out.println("|---------------------------------------------------------------------------------|");
		System.out.println("| Appplication Name: "+applicationName+"                                                 |");
		System.out.println("| Developer Name: "+developerName+"                                                      |");
		System.out.println("|Note-- The output & input will be shown/taken in the Console in form of NUMBER   |");
		System.out.println("|---------------------------------------------------------------------------------|");
	}
	
	public void GenricDisplay()
	{	
		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("Menu ----");
		System.out.println("1. Sort files in Ascending order");
		System.out.println("2. Business Level Operation");
		System.out.println("0. Exit from the console");
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
	}
	
	
	
	
	public void MenuBusinessLogic()
	{	System.out.println();
		System.out.println();
		System.out.println("/---------------------------------------------------------------------/");
		System.out.println("Business level logic menu----");
		System.out.println("1.Add the File");
		System.out.println("2.Delete the File");
		System.out.println("3.Search for specified File");
		System.out.println("4.Show Content of file");
		System.out.println("5.Back to previous Menu");
	
		
	}
	
	
	public void addFile(String fname)
	{
		FileOutputStreamDemo file=new FileOutputStreamDemo();
		file.createFile(fname);
	}
		
	
	public void deleteFile(String fname)
	{	
				FileOutputStreamDemo file=new FileOutputStreamDemo();
				file.deleteF(fname);
	}
	
	public void searchFile(String fname)
	{	
		FileOutputStreamDemo file=new FileOutputStreamDemo();
		file.searchFound(fname);
	}
	
	public void showContent(String fname)
	{
		FileOutputStreamDemo file=new FileOutputStreamDemo();
		file.displayFile(fname);
	}
}
