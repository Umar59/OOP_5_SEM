public class InfoWriter 
{
    public static void WriteClassInfo(IToStringParsable parsable)
    {
        System.out.println(parsable.Parse());
    }
}
