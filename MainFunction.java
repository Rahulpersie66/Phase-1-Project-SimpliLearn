
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.filechooser.FileSystemView;

public class MainFunction {
	public static void main(String[] args) {
		
		int response=0,res;
		String fileName;
		//To get desktop Path
		File home = FileSystemView.getFileSystemView().getHomeDirectory();
		String desktop=home.getAbsolutePath();
		TreeSet<String> treeSet=new TreeSet<>();
		GenricAndMenu genric=new GenricAndMenu();
		genric.nameDispaly();
		genric.GenricDisplay();
		
		File[] files=new File(desktop).listFiles();//path of directory
		for(File file:files)
		{
			if(file.isFile())
				treeSet.add(file.getName());
		}
		System.out.println("Files already present in DESKTOP");
		System.out.println("Total Files:" +treeSet.size()); 
		System.out.println();
		System.out.println("Desktop File Names : "+ treeSet);
		System.out.println();

		 	System.out.println();
			System.out.println("Your selection(Number between 0 & 2): ");
		Scanner input=new Scanner(System.in);
		while(!input.hasNextInt())
		{
			System.out.println("Enter number between 0 & 2!!!");
			input.next();
		}
		response=input.nextInt();
		while(response!=0)
		{
			if(response<1 || response>3)
				{
				System.out.println("NOTE: please enter between 0 & 2");
				}
			else
				switch(response)
				{
				case 1: //Sort the List of file 
						{
							System.out.println(" Sorted List is : ");
							System.out.println();
							for(String tree:treeSet)
							System.out.println(tree);
							System.out.println();
							System.out.println("--------------------------------------------------------------------");
							genric.GenricDisplay();
						}
						break;
				case 2://Business Level logic
						{	System.out.println();
							System.out.println("Going in Business Level logic");
							//calling class method
							
							genric.MenuBusinessLogic();
							System.out.println("Enter your choice (NUMBER bewtween 1 & 5):");
							while(!input.hasNextInt())
							{
								System.out.println("Enter number between 1 & 5!!!");
								input.next();
							}
							 res=input.nextInt();
							
							while(res!=5)
							{	if(res<1 ||res >5)
									System.out.println("NOTE: Please enter between 1 & 5");
								else
									switch(res)
									{
										case 1://Add the file
												System.out.println("File Name:");
												fileName=input.nextLine();
												fileName+=input.nextLine();;
												treeSet.add(fileName);
												genric.addFile(fileName);
												System.out.println();
												System.out.println("SUCESSFULLY ADDED THE FILE :"+fileName);
												System.out.println();
												System.out.println("Total files now :"+treeSet.size());
												System.out.println();
												System.out.println("Files in directory(DESKTOP): "+treeSet);
												genric.MenuBusinessLogic();
												break;
										case 2: //delete the file 
												System.out.println("Delete file: ");
												fileName=input.nextLine();
												fileName+=input.nextLine();
												System.out.println();
												treeSet.remove(fileName);
												genric.deleteFile(fileName);
												System.out.println();
												System.out.println("Total files Remaining :"+treeSet.size());
												System.out.println();
												System.out.println("Remanining Files(DESKTOP) :"+treeSet);
												genric.MenuBusinessLogic();
												break;
										case 3://search for the file
												System.out.println("Search file: ");
												fileName=input.nextLine();
												fileName+=input.nextLine();
												System.out.println();
												genric.searchFile(fileName);
												genric.MenuBusinessLogic();
												break;
										case 4://Display file content
												System.out.println("All files are  shown: ");
												System.out.println(treeSet);
												System.out.println();
												System.out.println("Display file: ");
												fileName=input.nextLine();
												fileName+=input.nextLine();
												genric.showContent(fileName);
												System.out.println();
												genric.MenuBusinessLogic();
												break;
										default:System.out.println("Enter number please");
												break;
									}
							
							System.out.println("Select Option (NUMBER between 1 & 5):");
							while(!input.hasNextInt())
							{
								System.out.println("Enter number between 1 & 5!!!");
								input.next();
							}
							res=input.nextInt();
							
							}
							genric.GenricDisplay();//returning to previous menu
//								
						}
						break;
				
					default: System.out.println("enter number please 0 & 2");
								break;
					
				}
			System.out.println("Select Option(NUMBER between 0 & 2): ");
			while(!input.hasNextInt())
			{
				System.out.println("Enter number between 0 & 2!!!");
				input.next();
			}
			response=input.nextInt();
	
		
		}
	
	
		if(response==0)
			{
			System.out.println();
			System.out.println("Thank you for using this application. You have been suceesfully EXITED.");
			}
			
		
	}
	

}
