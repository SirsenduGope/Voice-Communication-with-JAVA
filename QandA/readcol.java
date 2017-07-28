import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class readcol{
    public static void main(String args[]) throws FileNotFoundException, IOException{
        Scanner inp = new Scanner(new File("xxx.txt"));
        List<String> names = new ArrayList<String>();
        int i = 0;
     	
        while(inp.hasNext()){
            inp.nextFloat();            
            
            	names.add(inp.next());
            
            inp.nextFloat();
        }
        
        for(String temp: names){
                	
        	if(temp.charAt(i) == '\''){
        		i++;
        		continue;
        	}
        	else
            	System.out.println(temp);
        }

        File f = null;
        f = new File("textOne.txt");
        String v = f.getPath();
        //boolean check = f.exists();
        // if(check)
        // 	System.out.println("path: "+v);
        // else
        // 	System.out.println("file doesn't exist.");

        File file = new File(v);

        if(!file.exists()){
        	file.createNewFile();        	
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        for(String temp: names)
        	bw.write(temp+"\n");
 		System.out.println("all text written successfully.");
        bw.close();
    }

}