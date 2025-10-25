import java.net.Socket;
public class ClientHandler extends Thread{
    Socket s;
    public static int nbclient;
    public ClientHandler(Socket s){
        nbclient++;
        this.s=s;

    }
    public void run(){
        System.out.println("je suis client numéro:"+ClientHandler.nbclient);

    }

}
