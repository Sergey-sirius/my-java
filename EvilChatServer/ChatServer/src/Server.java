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

}
