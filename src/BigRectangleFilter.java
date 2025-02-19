import java.awt.Rectangle;

public class BigRectangleFilter implements ShortLister.Filter
{
    public boolean accept(Object x)
    {
        if (x instanceof Rectangle)
        {
            Rectangle rect = (Rectangle) x;
            return 2 * (rect.width + rect.height) > 10;
        }
        return false;
    }
}
