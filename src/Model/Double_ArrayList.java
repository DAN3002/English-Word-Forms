package Model;

import IO.File_Factory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Double_ArrayList
{
    private ArrayList<ArrayList<String>> arr;
    private HashMap<String, Integer> list_Location;
    
    public Double_ArrayList(ArrayList<ArrayList<String>> input) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        this.arr = input;
        this.list_Location = (HashMap<String, Integer>) File_Factory.Input("Data\\Inf\\Location.txt");
    }
    
    public void Add(int column, String  index)
    {
        this.arr.get(column).add(index);
    }
    
    public void New_Column()
    {
        this.arr.add(new ArrayList<>());
    }
    
    public String Get(int column, int row)
    {
        return this.arr.get(column).get(row);
    }
    
    
    public Integer Total_Size()
    {
        return this.arr.size();
    }
    
    public Integer Column_Size(int column)
    {
        return arr.get(column).size();
    }
    
    public void Show()
    {
        for(int i = 0; i < Total_Size(); i++)
        {
            for(int j = 0; j < Column_Size(i); j++)
            {
                System.out.println(Get(i, j));
            }
            System.out.println("=");
        }
    }
    
    public int IndexOf(String str)
    {
        int output = -1;                                
        ArrayList<String> s = new ArrayList<String>();
        Collections.addAll(s, "Ably", "Ability", "Enable");
        
        if(s.contains(str))
        {
            output = 0;
        }
        else
        {
            for(int i = list_Location.get(str.charAt(0) + ""); i < Total_Size(); i ++)
            {
                for(int j = 0; j < Column_Size(i); j++)
                {
                    String text = (Get(i, j).split("-"))[0];
                    if(str.equals(text))
                    {
                        output = i;
                        break;
                    }
                }
            }
        }
        
        return output;
    }
}
