package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File_Factory 
{
    public static Object Input(String path)throws FileNotFoundException, IOException, ClassNotFoundException
    {
        FileInputStream fi = new FileInputStream(path);
        ObjectInputStream input = new ObjectInputStream(fi);
        Object ob = input.readObject();
        input.close();
        fi.close();     
        return ob;
    }
    
    public static void Output(Object ob, String path) throws FileNotFoundException, IOException
    {
        FileOutputStream fo = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(ob);
        oos.close();
        fo.close();
    }
}
