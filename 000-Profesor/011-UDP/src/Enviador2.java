import java.net.*;
import java.io.*;

public class Enviador2 {
    public static void main(String[] args) {
        byte[] buff = new byte[256];
        try (DatagramSocket sock1 = new DatagramSocket();
                DatagramSocket sock2 = new DatagramSocket(8000);) {
            DatagramPacket dp = new DatagramPacket(
                    "Hola".getBytes(), "Hola".length(), InetAddress.getByName("127.0.0.1"), 8000);
            sock1.send(dp);
            DatagramPacket dp2 = new DatagramPacket(buff, buff.length);
            sock2.receive(dp2);
            System.out.println(new String(dp2.getData(), 0, dp2.getLength()));
        } catch (SocketException e) {
            System.out.println(e);
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
