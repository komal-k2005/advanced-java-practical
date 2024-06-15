import java.net.*;
import java.io.*;
public class SixteenEx1Server {
  public static void main(String args[])throws Exception{
    try{
        ServerSocket s=new ServerSocket(512);
        System.out.println("Server Started");
        BufferedReader in=new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
        PrintWriter out=new PrintWriter(ClientSocket.getOutput);
        String Userid=in.readLine();
        String Password =in.readLine();
        if(authenticate(Userid,Password)){
          out.print("authentication successfully");
        
        }else{
          out.print("authentication failed");
        }ClientSocket.close();
}catch(IOException e){
  System.out.println(e);
}
  }

  private static boolean authenticate(String userid, String password) {
    return false;
  }  
}
