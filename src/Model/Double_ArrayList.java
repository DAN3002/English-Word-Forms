package Model;

import java.util.ArrayList;

public class Double_ArrayList
{
    private  ArrayList<ArrayList<String>> arr;
    
    public Double_ArrayList(ArrayList<ArrayList<String>> input)
    {
        this.arr = input;
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
        for(int i = 0; i < Total_Size(); i++)
        {
            for(int j = 0; j < Column_Size(i); j++)
            {
                String[] cut = Get(i, j).split("-");
                if(cut[0].equals(str))
                {
                    output = i;
                    break;
                }
            }
        }
        return output;
    }
}
