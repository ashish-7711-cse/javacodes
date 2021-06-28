import javax.swing.*;
import java.util.*;
class AClass{
    void Display()
    {
        System.out.println("AClass");
    }
}
class BClass extends AClass
{
    void Display() {
        System.out.println("BClass");
    }
}
final class CClass extends BClass
{
        void Display()
        {
            System.out.println("BClass");
        }
}
public class DMD{
        public static void main(String[]args)
        {
            AClass a =new AClass();
            BClass b =new BClass();
            CClass c =new CClass();
            AClass ref = null;
            ref = a;
            a.Display();
            ref = b;
            b.Display();
            ref = c;
            ref.Display();
        }
    }
// IN Above program a reference of type AClass called ref is declared The program then assigned a reference to each type of object to ref and uses that reference to invoke the method display. The version of Display method is determined by type of obj being referred to the

