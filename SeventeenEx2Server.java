import java.net.*;
import java.io.*;
public class SeventeenEx2Server{
    public static void main(String args[])throws Exception{
        byte[] b=new byte[512];
        DatagramSocket ds=new DatagramSocket(2019);
        FileOutputStream f=new FileOutputStream("C:\\Users\\91969\\OneDrive\\Documents\\GitHub\\fifth-semester\\Background.java");
        DatagramPacket dp =new DatagramPacket(b, b.length);
        ds.receive(dp);
        String Data=new String(dp.getData(),0,dp.getLength());
        f.write(Data.getBytes(),0,Data.length());

    }
}