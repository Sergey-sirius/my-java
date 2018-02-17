import com.sun.deploy.panel.JSmartTextArea;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// io  ввод вивід
// net мережа
// awt ипользуется для рроботи з графічним інтерфейсом
// awt.event собития
// javax.swing для робот з графічн інтерф

/**
 * @version 1
 * класс chat server
 */
// наследуем для отображения окон
public class Server extends JFrame {
    // строка для ввода текста
    private JTextField userInputText;
    // окно, кто подключился, ip ...
    private JTextArea chatWindow;

    // потоки ввод вивід
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    //
    private ServerSocket serverSocket;
    // ip+port
    private Socket connection;

    // constructor
    public Server(){
        // подписив окно
        super("Серверная часть");
        userInputText = new JTextField();
        userInputText.setEditable(false); // off edit

        // слушатель ввода
        userInputText.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    sendMessage(e.getActionCommand());
                    userInputText.setText(""); //чистим поле после передачи
                }
            }
        );
        // помещаем текст в окно
        add(userInputText,BorderLayout.NORTH);
        chatWindow = new JSmartTextArea();
        add(new JScrollPane(chatWindow));
        setSize(300,600);
        setVisible(true);


    }
}
