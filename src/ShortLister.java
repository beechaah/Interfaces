import javax.swing.*;
import java.io.*;
import java.util.*;

public class ShortLister
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            try
            {
                Scanner in = new Scanner(file);
                Filter filter = new ShortWordFilter();
                while (in.hasNext())
                {
                    String word = in.next();
                    if (filter.accept(word))
                    {
                        System.out.println(word);
                    }
                }
                in.close();
            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }

public interface Filter
    {
        boolean accept(Object x);
    }
}