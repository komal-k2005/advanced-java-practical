import java.net.*;
import java.io.*;
public class SeventeenEx2Client {
  public static void main(String args[])throws Exception{
    byte b[]=new byte[512];
        FileInputStream f=new FileInputStream("C:\\Users\\91969\\OneDrive\\Documents\\GitHub\\fifth-semester\\AEvent.java");
          DatagramSocket ds=new DatagramSocket();
          int i=0;
          while(f.available()!=0){
            b[i]=(byte)f.read();
            i++;
          }
       f.close();
       ds.send(new DatagramPacket(b, i,InetAddress.getLocalHost(),2019));j
   
  }  
}
