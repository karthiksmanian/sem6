import java.io.DataOutputStream;
import java.net.Socket;

class Csocket extends Thread{
    String message;

    public Csocket( String message) {
        this.message = message;
    }

    public Csocket() {
        this.message = "msg from client";
    }

    @Override
    public void run() {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(message);
            dout.flush();
            dout.close();
            s.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

public class clients {
    public static void main(String[] args) {
        Csocket c1 = new Csocket();
        Csocket c2 = new Csocket();
        Csocket c3 = new Csocket("end");

        c1.start();
        c2.start();
        c3.start();
    }
}
