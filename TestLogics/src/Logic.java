/*import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.JOptionPane;


public class Logic {
	
	String key,Value,user,Source,Destination1,Destination2,Destination3,Destination4,Destination5,Destination6,Destination7,Destination8;
	static String Types;
	static String Totaltypes[];
	
	public void readproperty() throws IOException{
		
		File prop =new File("C:/Autoclear/Autoclear.properties");
		FileInputStream input = new FileInputStream(prop);
		Properties readprop = new Properties();
		readprop.load(input);
		
		Enumeration enumkey =  readprop.keys();
		
		while(enumkey.hasMoreElements()){
			key = (String) enumkey.nextElement();
			Value = readprop.getProperty(key);
			if(key.equals("Username")){
				user=Value;
			}
			if(key.equals("Source")){
				Source=Value;
			}
			if(key.equals("Destination1")){
				Destination1=Value;
 
			}
			if(key.equals("Destination2")){
				Destination2=Value;
 
			}
			if(key.equals("Destination3")){
				Destination3=Value;
 
			}
			if(key.equals("Destination4")){
				Destination4=Value;
 
			}
			if(key.equals("Destination5")){
				Destination5=Value;
 
			}
			if(key.equals("Destination6")){
				Destination6=Value;
 
			}
			if(key.equals("Destination7")){
				Destination7=Value;
 
			}
			if(key.equals("Destination8")){
				Destination8=Value;
 
			}
			if(key.equals("Types")){
				Types=Value;
				if(Types.contains(",")){
				Totaltypes= Types.split(",");
				}else{
					Totaltypes= Types.split("");
				}
			}
			
			System.out.println("*****************"+key+":"+Value+"**********************");
		}
	}
	
	public void Cleartemp() throws AWTException, InterruptedException{
		
		File temp = new File("C:/Users/"+user+"/AppData/Local/Temp");
		File temp1 = new File("C:/Users/"+user+"/AppData/Local/Temp/1");
		
		if(temp1.exists()){
			for(File file: temp.listFiles()) {
			    if (!file.isDirectory()) 
			        file.delete();
			}
		}
		
		if(temp.exists()){
		for(File file: temp.listFiles()) {
		    if (!file.isDirectory()) 
		        file.delete();
		}
		}
		System.out.println("*********************Temp folder was cleared*********************");
		
	}
	
	public void clearrecyclebin() throws IOException{
		
		Process p = Runtime.getRuntime().exec("C:/Autoclear/binclear.bat");		
		System.out.println("*********************Recyle bin was cleared*********************");
	
	}
public void alligndesktop(String arg) throws IOException, InterruptedException{
		
		File clumsyfolder = new File(Source);
		
		if(!(clumsyfolder.exists())){
			Logic.infobox("**Given source folder path is not exits on your system.","Folder doesn't exist!");
		}
		
		for(File file: clumsyfolder.listFiles()) {			
		    if(getFileExtension(file).equals(arg)){
		    	
		    	File dstn1 = new File(Destination1);
		    	if(!(dstn1.exists())){
					Logic.infobox("**Given Destination1 folder path is not exits on your system.","Folder doesn't exist!");
				}
		    	
		    	boolean success = file.renameTo(new File(Destination1, file.getName()));
		    	if(success){
		    		file.delete();
		    	}
		    }
		}
		    }
	
	public void alligndesktop(String[] args) throws IOException, InterruptedException{
		
		File clumsyfolder = new File(Source);
		
		for(int i=0;i<args.length;i++){
//			Thread.sleep(1000);
		for(File file: clumsyfolder.listFiles()) {			
		    if(getFileExtension(file).equals(args[i])){
		    	
		    	if(i==0){
		    		File dstn1 = new File(Destination1);
			    	if(!(dstn1.exists())){
						Logic.infobox("**Given Destination1 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
		    	boolean success = file.renameTo(new File(Destination1, file.getName()));
		    	if(success){
		    		file.delete();
		    	}
		      }
		    	
		    	if(i==1){
		    		File dstn2 = new File(Destination2);
			    	if(!(dstn2.exists())){
						Logic.infobox("**Given Destination2 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
			    	boolean success = file.renameTo(new File(Destination2, file.getName()));
			    	if(success){
			    		file.delete();
			    	}
			      }
		    	
		    	if(i==2){
		    		File dstn3 = new File(Destination3);
			    	if(!(dstn3.exists())){
						Logic.infobox("**Given Destination3 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
			    	boolean success = file.renameTo(new File(Destination3, file.getName()));
			    	if(success){
			    		file.delete();
			    	}
			      }
		    	
		    	if(i==3){
		    		File dstn4 = new File(Destination1);
			    	if(!(dstn4.exists())){
						Logic.infobox("**Given Destination4 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
			    	
			    	boolean success = file.renameTo(new File(Destination4, file.getName()));
			    	if(success){
			    		file.delete();
			    	}
			      }
		    	
		    	if(i==4){
		    		File dstn5 = new File(Destination1);
			    	if(!(dstn5.exists())){
						Logic.infobox("**Given Destination5 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
			    	boolean success = file.renameTo(new File(Destination5, file.getName()));
			    	if(success){
			    		file.delete();
			    	}
			      }
		    	
		    	if(i==5){
		    		File dstn6 = new File(Destination1);
			    	if(!(dstn6.exists())){
						Logic.infobox("**Given Destination6 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
			    	boolean success = file.renameTo(new File(Destination6, file.getName()));
			    	if(success){
			    		file.delete();
			    	}
			      }
		    	
		    	if(i==6){
		    		File dstn7 = new File(Destination1);
			    	if(!(dstn7.exists())){
						Logic.infobox("**Given Destination7 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
			    	boolean success = file.renameTo(new File(Destination7, file.getName()));
			    	if(success){
			    		file.delete();
			    	}
			      }
		    	
		    	if(i==7){
		    		File dstn8 = new File(Destination1);
			    	if(!(dstn8.exists())){
						Logic.infobox("**Given Destination8 folder path is not exits on your system.","Folder doesn't exist!");
					}
			    	
			    	boolean success = file.renameTo(new File(Destination8, file.getName()));
			    	if(success){
			    		file.delete();
			    	}
			      }
		    }
		  }
		}
		 System.out.println("*********************All folders are alligned*********************");
		
	}
	
	private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
	
	public static void infobox(String infoMessage, String titleBar) {
		JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException, FileNotFoundException   {
	Logic lg = new Logic();
	lg.readproperty();
	lg.Cleartemp();
	lg.clearrecyclebin();
	lg.alligndesktop(Totaltypes);
	lg.alligndesktop(Types);
	Logic.infobox("1.Temp folder was cleared. \n"
			+ "2.Recyle bin was cleared. \n"
			+ "3.All folders are moved to destinations.", "Boosted!");
	}

}
*/

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import org.apache.commons.io.FileUtils;



public class Logic {
	
	static String user,Source,newfolder,newsubfolder,key,Value;	
	
	/*Constructor to get system attributes*/
	public Logic() throws IOException{
		
		user = new com.sun.security.auth.module.NTSystem().getName();
		
		File prop =new File("C:/Autoclear/Autoclear.properties");
		FileInputStream input = new FileInputStream(prop);
		Properties readprop = new Properties();
		readprop.load(input);
		
		Enumeration enumkey =  readprop.keys();
		
		while(enumkey.hasMoreElements()){
			key = (String) enumkey.nextElement();
			Value = readprop.getProperty(key);
			if(key.equals("Source")){
				Source=Value;
			}
		}
	
	}
	
	public void Cleartemp() throws AWTException, InterruptedException, IOException{
		
		File temp = new File("C:/Users/"+user+"/AppData/Local/Temp");
		File temp1 = new File("C:/Users/"+user+"/AppData/Local/Temp/1");
		
		if(temp1.exists()){
			System.out.println(temp1);
			
			for(File file: temp.listFiles()) {
				File dir = new File(file+"");
				   if (dir.isDirectory())
				   {
					   try{
					   FileUtils.deleteDirectory(new File(dir+""));
					   }catch(Exception e){
						   continue;
					   }
				   }else{
				    
				    file.delete();
				    
				   }
			}
		}
		
		if(temp.exists()){
			System.out.println(temp);
			
		for(File file: temp.listFiles()) {
			
			File dir = new File(file+"");
			   if (dir.isDirectory())
			   {
				   try{
				   FileUtils.deleteDirectory(new File(dir+""));
				   }catch(Exception e){
					   continue;
				   }
			   }else{
			    
			    file.delete();
			    
			   }
		}
		
		}
		System.out.println("*********************Temp folder was cleared*********************");
		
	}
	
	public void clearrecyclebin() throws IOException{
		
		Process p = Runtime.getRuntime().exec("C:\\Autoclear\\binclear.bat");
		System.out.println("*********************Recyle bin was cleared*********************");
	
	}
	
	
	public boolean createfolder(String folder){
		
		File AllignedFolder = new File(folder);
		newfolder = folder;
		if(!(AllignedFolder.exists())){				
			try{
				AllignedFolder.mkdir();
				System.out.println("***************"+newfolder+" folder was created successfully!*******************");
				return true;
			}catch(SecurityException e){
				Logic.infobox("Can not arrage this folder due to access issue. :( \n"+e,"Security alert!");
				return false;
			}
		}else{
			System.out.println("***************"+newfolder+" folder was already exists!*******************");	
		return true;
		}
	}
	
	public void alligndesktop() throws IOException, InterruptedException{
	
		File clumsyfolder = new File(Source);
		
		if(!(clumsyfolder.exists())){
			Logic.infobox("**Given source folder path is not exits on your system.","Folder doesn't exist!");
		}else{
			 createfolder(Source+"/All files");			
		}
		

		for(File file: clumsyfolder.listFiles()) {		
			
			newsubfolder = Source+"/All files"+"/"+getFileExtension(file);
			File dstn = new File(newsubfolder);			
		    	
				if(dstn.exists()){		    	
		    	boolean success = file.renameTo(new File(newsubfolder, file.getName()));
		    	if(success){
		    		file.delete();
		    	}		    	
		    }
				else if(createfolder(newsubfolder)){
					boolean success = file.renameTo(new File(newsubfolder, file.getName()));
			    	if(success){
			    		file.delete();
			    	}	
				}
		}
		System.out.println("*******************All files are moved to destinations***********************");
    }

	
	
	private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
	
	public static void infobox(String infoMessage, String titleBar) {
		JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void killdrivertask() throws IOException{
		
		String line;
		String pidInfo ="";

		Process p =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");

		BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));

		while ((line = input.readLine()) != null) {
		    pidInfo+=line; 
		}

		input.close();

		if(pidInfo.contains("chromedriver.exe"))
		{
			Runtime.getRuntime().exec("TASKKILL /F /IM chromedriver.exe");
			System.out.println("**********Killed chrome driver*************");
		}
		
		if(pidInfo.contains("IEDriverServer.exe"))
		{
			Runtime.getRuntime().exec("TASKKILL /F /IM IEDriverServer.exe");
			System.out.println("**********Killed ie driver*************");
		}
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException, FileNotFoundException   {
		
		try{
		final String dir = System.getProperty("user.dir");
	       
		 File srcDir = new File(dir+"/Autoclear");
		 File destDir = new File("C:/Autoclear");
		 
		 File iffolderexists = new File("C:/Autoclear");
		 
		 if(!iffolderexists.exists()){
			 try{
			
		 FileUtils.copyDirectory(srcDir, destDir);
		 ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "C:\\Autoclear\\Autoclear.properties");
		 pb.start();
		 	 
			 }
			 catch(IOException e){
				 
			 }
		 
		 }else{
		 
	Logic lg = new Logic();
	lg.Cleartemp();
	lg.clearrecyclebin();
	lg.alligndesktop();
	lg.killdrivertask();
	Logic.infobox("1.Temp folder was cleared. \n"
			+ "2.Recyle bin was cleared. \n"
			+ "3.All folders are moved to destinations. \n"
			+ "4.Killed the driver process"
			+ "\n"
			+ "**Note**\n"
			+ "-> I can not move short cuts :(\n"
			+ "-> I can not move a file, if it is already exits in destination.", "Boosted!");
	}

	}
	catch(Exception e){
		Logic.infobox("Contact your developer: "+e,"Exception");
	}
}
}
