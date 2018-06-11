package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class File_Factory 
{
    public static ArrayList<ArrayList<String>> Input(String path)throws FileNotFoundException, IOException, ClassNotFoundException
    {
        FileInputStream fi = new FileInputStream(path);
        ObjectInputStream input = new ObjectInputStream(fi);
        ArrayList<ArrayList<String>> arr = (ArrayList<ArrayList<String>>) input.readObject();
        input.close();
        fi.close();     
        return arr;
    }
    
    public static void Output(ArrayList<ArrayList<String>> arr, String path) throws FileNotFoundException, IOException
    {
        FileOutputStream fo = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(arr);
        oos.close();
        fo.close();
    }
}
