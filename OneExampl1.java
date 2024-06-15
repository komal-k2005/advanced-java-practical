import java.awt.*;
import java.applet.*;
/*<applet code="OneExampl1" width=300 height=300></applet> */
public class OneExampl1 extends Applet {
    public void init(){
        Checkbox ch=new Checkbox("male");
        Checkbox ch1=new Checkbox("female");
        add(ch);
        add(ch1);

    }
}
