package gui_orang2;


import java.io.*;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.*;
import gui_orang2.Properties;
public class LogEngine 
{
	private Path logFile;
        
	public LogEngine(Properties p)
	{
        }
	
	public void WriteToFile(String s)
	{
                String fileName = "OrangsG1.log";
                logFile = FileSystems.getDefault().getPath(fileName, "");
                String t;
                t = String.format("\r\n%s", s);
		byte data[] = t.getBytes();
		
		try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(logFile, StandardOpenOption.CREATE, StandardOpenOption.APPEND))) 
                {
		    out.write(data, 0, data.length);
		} catch (IOException x) {
		    System.err.println(x);
		}
	}

        public String[] FindListOfLastLog(Properties p)
        {
            String[] array = new String[10000];
            int LogNumber = p.getNewLogNumber();
            int i = 0;
            try{
            FileReader reader = new FileReader("OrangsG1.log");
                BufferedReader br = new BufferedReader(reader);
                String str = "";
                
                while ((str = br.readLine()) != null) 
                {
                        if(str.startsWith("#,"+LogNumber))
                        {
                            while((str = br.readLine()) != null)
                            {
                                array[i] = str;
                                i++;}
                        }
                }
                } catch (IOException x) {
			System.err.println(x);
		}
                //br.close();
                return array;
        }
        public String[] FindList(Properties p,String LogNumber)
        {
            String[] array = new String[100];
            int i = 0;
            int NextLogNumber = Integer.parseInt(LogNumber)+1;
            String x = "#,"+Integer.toString(NextLogNumber);
            try{
            FileReader reader = new FileReader("OrangsG1.log");
                BufferedReader br = new BufferedReader(reader);
                String str = "";
                
                while ((str = br.readLine()) != null) 
                {
                        if(str.startsWith("#,"+LogNumber))
                        {
                            while((!(str = br.readLine()).trim().equals(x)) && str !=null)
                            {
                                array[i] = str;
                                i++;}
                        }
                }
                } catch (IOException e) {
			System.err.println(e);
		}
                //br.close();
                return array;
        }
        public void GetCurrentLogNumber(Properties p)
        {
            int count=0;
            try{
            FileReader reader = new FileReader("OrangsG1.log");
                BufferedReader br = new BufferedReader(reader);
                String str = "";
                
                while ((str = br.readLine()) != null) 
                {
                        if(str.startsWith("#"))
                        {
                            count++;
                        }
                }
                } catch (IOException x) {
			System.err.println(x);
		}
                p.setNewLogNumber(count);
        }
}


