import java.awt.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class SeventeenEx1Client{
    public static void  main(String args[])throws Exception{
        DatagramSocket ds=new DatagramSocket();
        byte[] receiveData=new byte[512];
        byte[] sentData=new byte[512];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("UDP server socket is created waiting for client");
        InetAddress ip=InetAddress.getLocalHost();
        do{
            System.out.println("Enter client message");
            String clientMessage=br.readLine();
             sentData=clientMessage.getBytes();
             DatagramPacket sendDp=new DatagramPacket(sentData,sentData.length,ip,2019);
             ds.send(sendDp);
            DatagramPacket receiveDP=new DatagramPacket(receiveData,receiveData.length);
            ds.receive(receiveDP);
            String serverMessage=new String(receiveDP.getData(),0,receiveDP.getLength());
            receiveDP.getLength();
System.out.println("Server message"+serverMessage);
            }while(true);
}

}
