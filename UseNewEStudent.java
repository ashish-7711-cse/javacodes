import java.util.*;
import mypkg.NewEStudent;
class UseNewEStudent
{
    public static void main(String [] args)
    {
        NewEStudent e=new NewEStudent();
        e.setData(100);
        e.display();
        e.delRecord();
        e.display();
    }
}