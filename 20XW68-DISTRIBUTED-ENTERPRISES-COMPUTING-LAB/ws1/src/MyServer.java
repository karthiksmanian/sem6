import  java.io.*;
import  java.net.*;

class ssocket extends Thread{
    String str;

    @Override
    public void run() {
        try
        {
            ServerSocket  ss=new  ServerSocket(6666);
            Socket  s=ss.accept();//establishes  connection
            DataInputStream  dis=new  DataInputStream(s.getInputStream());
            str=(String)dis.readUTF();
            System.out.println("message=  "+str);

            boolean flg = true;

            while(flg) {
                if (str == "end") {
                    flg=false;
                }
            }
            ss.close();
        }
        catch(Exception  e){System.out.println(e);}
    }
}

public  class  MyServer
{
    public  static  void  main(String[]  args)
    {
        ssocket s = new ssocket();
        s.start();
    }
}