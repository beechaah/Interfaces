import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(5, 5));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(1, 5));
        rectangles.add(new Rectangle(3, 5));
        rectangles.add(new Rectangle(1, 6));
        rectangles.add(new Rectangle(3, 2));

        ShortLister.Filter filter = new BigRectangleFilter();
        for (Rectangle rect : rectangles)
        {
            if (filter.accept(rect))
            {
                System.out.println("Big Rectangle: " + rect);
            }
        }
    }
}
