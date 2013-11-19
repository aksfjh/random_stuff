/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336project;
import java.io.*;
/**
 *
 * @author Daniel Heironimus
 */
public class RefrigeratorDatabase {
    private File contents;

    //constructors
    RefrigeratorDatabase(String loc){
        contents = new File(loc);
    }
    RefrigeratorDatabase(){
        contents = new File("fridgecontents.txt");
    }
    
    /** method for reading database file(assumes proper format)
     *  returns Refrigerator object from parsing the file and putting it into
     *  the correct object formats*/
    public Refrigerator read(){
        Refrigerator out = new Refrigerator();
        Food temp;
        BufferedReader br = null;
        String line = "";
        String delimiter = ",";
        try{
            br = new BufferedReader(new FileReader(contents));
            while((line = br.readLine()) != null){
                String[] food = line.split(delimiter);
                temp = new Food(food[0],
                        new java.util.Date(Long.valueOf(food[1]).longValue()),
                        food[2]);
                out.addItem(temp);
                /**
                 * test code
                * System.out.println("Name: " + food[0] + "\tExpiration: " +
                *       food[1]+ "\tDescription: " + food[2]);
                */
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(br != null){
                try{
                    br.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return out;
    }

    /** method for storing refrigerator data from a Refrigerator object into
     *  the proper location, with the proper format (comma separated values) */
    public void write(Refrigerator fridge){
        String delimiter = ",";
        try{
            FileWriter fr = new FileWriter(contents);
            for(Food f : fridge.getList()){
                fr.append(f.getName().trim()+delimiter+
                        f.getExpiration().getTime()+
                        delimiter+f.getDescription().trim()+" \n");
            }
            fr.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}