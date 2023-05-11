package swing.messaging;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Messaging extends JFrame implements ActionListener {
    private final JTextField messageField;
    private final JTextArea chatArea;
    private final JComboBox<String> userComboBox;

    public Messaging() {
        super("Messagerie");

        JPanel contentPane = new JPanel();
        JButton addUserButton = new JButton("Ajouter");
        JButton sendButton = new JButton("Envoyer");

        ArrayList<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.ipady = gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.weightx = 1; gridBagConstraints.weighty = 3;

        messageField = new JTextField(30);
        messageField.setToolTipText("Entrez votre message ici");
        messageField.setBorder(new LineBorder(Color.BLUE, 1));
        messageField.setText("Entrez votre message ici");
        messageField.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                messageField.setText("");
            }
        });

        chatArea = new JTextArea(15, 30);
        chatArea.setEditable(false);
        chatArea.setBorder(new LineBorder(Color.RED, 1));

        userComboBox = new JComboBox<>(users.toArray(new String[0]));
        userComboBox.setBorder(new LineBorder(Color.GREEN, 1));

        contentPane.setLayout(new GridBagLayout());

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        contentPane.add(userComboBox, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        contentPane.add(addUserButton, gridBagConstraints);
        setContentPane(contentPane);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        contentPane.add(new JScrollPane(chatArea), gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        contentPane.add(messageField, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        contentPane.add(sendButton, gridBagConstraints);
        setContentPane(contentPane);

        addUserButton.addActionListener(evt -> {
            String user = JOptionPane.showInputDialog("Entrez le nom de l'utilisateur");
            if (user != null) {
                users.add(user);
                userComboBox.addItem(user);
            }
        });

        sendButton.addActionListener(this);
        messageField.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        String dateNow = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);

        String message = messageField.getText().trim();
        if (!message.isEmpty()) {
            String user = (String) userComboBox.getSelectedItem();
            chatArea.append(user + ": " + message + " " + dateNow + "\n");
            messageField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Messaging::new);
    }
}
