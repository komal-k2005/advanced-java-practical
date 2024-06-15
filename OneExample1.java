
import java.awt.*;
public class OneExample1 extends Frame {
        public  OneExample1(){
        Frame f=new Frame("Example1");
        f.setSize(300,300);
        f.setVisible(true);
      
               Checkbox ch=new Checkbox("male");
        Checkbox ch1=new Checkbox("female");
         Checkbox ch2=new Checkbox("male");
        Checkbox ch3=new Checkbox("female");
        f.add(ch);
         f.add(ch1);
           f.add(ch2);
         f.add(ch3);
        }
        public static void main(String args[]){
            OneExample1 E=new OneExample1();
          
        }
    }


