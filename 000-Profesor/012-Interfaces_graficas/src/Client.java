package client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Client extends JFrame {

    private JButton bContador;
    private int contador;
    private JButton makeServer;
    private JLabel showIpServer;

    public Client() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(666, 333));

        makeServer = new JButton("Quiero ser server!");
        makeServer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ev) {
                try {
                    MulticastSocket enviador = new MulticastSocket();
                    String ip;
                    try (DatagramSocket socket = new DatagramSocket()) {
                        socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
                        ip = socket.getLocalAddress().getHostAddress();
                    }
                    byte[] dato = ip.getBytes();
                    DatagramPacket dgp = new DatagramPacket(dato, dato.length, InetAddress.getByName("230.0.0.1"),
                            12300);
                    enviador.send(dgp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
        showIpServer = new JLabel("No server detected!");
        bContador = new JButton(String.valueOf(contador));
        bContador.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                bContador.setText(String.valueOf(++contador));
            }

        });

        Container ct = getContentPane();
        ct.add(bContador);
        ct.add(makeServer, BorderLayout.NORTH);
        ct.add(showIpServer, BorderLayout.SOUTH);

        Thread t = new Thread() {
            public void run() {
                try {
                    MulticastSocket escucha = new MulticastSocket(12300);
                    escucha.joinGroup(InetAddress.getByName("230.0.0.1"));
                    byte[] dato = new byte[1024];
                    DatagramPacket dgp = new DatagramPacket(dato, dato.length);
                    escucha.receive(dgp);
                    byte[] dato2 = dgp.getData();
                    showIpServer.setText(new String(dato2));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.setVisible(true);
    }
}
