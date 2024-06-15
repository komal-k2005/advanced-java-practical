import java.awt.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class SeventeenEx1Server{
    public static void  main(String args[])throws Exception{
        DatagramSocket ds=new DatagramSocket();
        byte[] receiveData=new byte[512];
        byte[] sentData=new byte[512];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("UDP server socket is created waiting for client");
        do{
            DatagramPacket receiveDP=new DatagramPacket(receiveData,receiveData.length);
ds.receive(receiveDP);
String clientMessage=new String(receiveDP.getData(),0,receiveDP.getLength());
System.out.println("Client message"+clientMessage);
InetAddress ip=receiveDP.getAddress();
System.out.println("Enter server message");
String serverMessage=br.readLine();
sentData=serverMessage.getBytes();
DatagramPacket sendDp=new DatagramPacket(sentData,sentData.length,ip,receiveDP.getPort());
ds.send(sendDp);
receiveData=new byte[512];
            }while(true);
}

}