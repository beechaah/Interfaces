public class ShortWordFilter implements ShortLister.Filter
{
    @Override
    public boolean accept(Object x)
    {
        if (x instanceof String)
        {
            String in = (String) x;
            return in.length() < 5;
        }
        return false;
    }
}
