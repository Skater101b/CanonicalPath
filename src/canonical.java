import java.io.File;
import java.io.IOException;



public class canonical {
	
	public static void main(String[] args) throws IOException {
		// All canonical paths are absolution unique but visa versa is not true,
		// Defines the abosolute path from the file system
			   
		File f, G, D, H, PB, BP, CF = null;
		String workDirPath4, pathCanonicalPath,nameOfClass, pathConanicalPath_2, pathAbsolute, pathBase, pathBase2, workDirPath, abOfF, pOfF, abOfG, pOfG, workDirPath2, workDirPath3, PB1, PB2, BP1, BP2 = "";
		String mixUp1 = "C:/Windows";
	    String mixUp2 = "/System/Study/WOrkSpace.txt";
	    String mixUp3 = "/System/Study/../Study1/Stuff/WOrkSpace.txt";
	    
	    String Example = "If I go do this\nc:/>>cd System\nc:/system>>\nc:/system>>cd Study\nc:/system/Study.\nNow if I do ../Windows. I will go back a directory and into windows\nc:/Windows>>\nbut if I am anywhere else it wont work\n\nBUT what if I had the canonical path of study right from the start? I could say oh yeah forget the path, Study is here always here\nIt's unique and can only be one that I can add to later by using it as a base path.\njust like the plugin does. with workDir('.')";
	    
	    
		f = new File("C:\\Windows\\System\\Study\\WOrkSpace.txt");
		String FileF = "C:\\Windows\\System\\Study\\WOrkSpace.txt";
		G = new File("C:/Windows./System/./Study/../Study1/Stuff/WOrkSpace.txt");
		CF = new File("C:/Windows./System/./Study/../Study1/Stuff/WOrkSpace.txt");
		String FileG = "C:/Windows./System/./Study/../Study1/Stuff/WOrkSpace.txt";
		
		
		pathCanonicalPath = f.getCanonicalPath();
		abOfF = f.getAbsolutePath();
		pOfF = f.getPath();
		
		pathConanicalPath_2 = G.getCanonicalPath();
		pathAbsolute = G.getAbsolutePath();
		abOfG = G.getPath();
		
		
		H = new File(".");
		workDirPath = H.getCanonicalPath();
		workDirPath4 = H.getCanonicalFile().getName();
		workDirPath2 = H.getPath();
		workDirPath3 = H.getAbsolutePath();
		
		pathBase = mixUp1 + mixUp2;
		PB = new File(pathBase);
		PB1 = PB.getCanonicalPath();
		PB2 = PB.getAbsolutePath();
		
		pathBase2 = mixUp1 + mixUp3;
		BP = new File(pathBase2);
		BP1 = BP.getCanonicalPath();
		BP2 = BP.getAbsolutePath();
		
		

		 System.out.print("File with \\ slashes " + FileF + " has a Canonical Path, Absolute Path and regular Path as shown Below.\n\n" + "The Canoncial   = "+ pathCanonicalPath + "\n" + "The Absolute    = " + abOfF + "\n" + "The normal Path = " + pOfF + "\n\n" 
				 + "This would be hard coding the file path, which we do not want to do ever really. " +"\n\n" + "The path containing ../ for example " + FileG + " will resolve but yet has two different paths." +"\n\n" + "AbsolutePath  = " + pathAbsolute + "\n" + "CanoncialPath = " + pathConanicalPath_2 + "\n\n"
				 + "We can now see how Canonical Path and Absolute Path go to the same place but have different paths. " + "\n\n"
				 + "In UCD workdir is super important. Need to know where I am and it never uses hard coded paths. I could be working in one dir one second and\n" + "another one the next. I have to add paths together a lot, but I want to resolve all paths first to ensure they exists and are usable right off the bat. Canonical does this.\n" + "The conanical path can resolve all instance of paths related to a file location and it's unique. That file will always be that path" + "\n\n" + "Canonical will go and resolve the path in all places it's used. Then it gives it a unique path for the file. It will never change and can never have more than 1.\nWhich isn't the case with Absolute path. A canonical path is absolute but an absolute path is not canonical." + "\n\n"
				 + "Imagine if I used the absolute path but was in a different directory? What if I was one ahead or behind. The ../ would fail. I wouldn't be able to reach my path.\n" + Example + "\n\n" + "Let's get the root of where I am running this from: " + workDirPath + "\n" + "I can get aboslute and Path as well. " + workDirPath2 + "  " + workDirPath3 + "\n" 
				 + "The only difference is the \\ which is often handled." + "\n" +  "I can mix and match pieces of paths which is exactly what UCD does A LOT. For Example" +"\n"
				 + "Take part one " + mixUp1 + "\n" + "Part two " + mixUp2 + "\n\n" +"Now let's stick them together" + "\n\n"
				 + "We get the " + pathBase + "\n\n" + "This is ok for this, but what if there was a .. in the file path or even a .\n\n"
				 + "To drive it home. Let's mix a file path containing a .. together.\n\n" + mixUp1 + " and " + mixUp3 + "\n\n" + "The results are the following\n" + "Canonical = " + BP1 + "\n" + "Absolute" + BP2 + "------ see the difference?\nLastely, if I get conanical file i get the actual file name where I am working and the PATH is set to this file or my script working enviornment in this case. " + workDirPath4  );
		        
		         }
		}
