import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
    JFrame login = new JFrame();
    JPanel layout = new JPanel();
    //Deklarasi Label Username & Password
    JLabel labelusername = new JLabel("Username : ");
    JLabel labelpassword = new JLabel("Password : ");
    //Deklarasi Textbox username & password
    JTextField textboxusername = new JTextField();
    JTextField textboxpassword = new JPasswordField();
    // Deklarasi Button
    JButton tombollogin = new JButton("Login");

    public Login(){
        // Deklarasi Login
        login.setVisible(true);
        login.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Set ukuran form login
        login.setSize(500,300);
        login.setLocationRelativeTo(null);
        login.setTitle("Menu Login");
        login.setLayout(null);

        // Set panel layout
        layout.setLayout(new GridLayout(3,2,10,10));
        layout.setBounds(50,70,350,120);

        // Menambahkan Komponen lain ke panel layout
        layout.add(labelusername);
        layout.add(textboxusername);
        layout.add(labelpassword);
        layout.add(textboxpassword);
        layout.add(tombollogin);

        // Semua Komponan di layout di gabung & dipanggil di frame login
        login.add(layout);

        tombollogin.addActionListener(this);


    }

    public static void main(String[] args) {
        Login start = new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(textboxusername.getText().equals("Staff") && textboxpassword.getText().equals("test")){
            JOptionPane.showMessageDialog(null,"Berhasil Login");
            Booking open = new Booking();
        }else if(textboxusername.getText().equals("Admin") && textboxpassword.getText().equals("admin")){
            JOptionPane.showMessageDialog(null, "Login Via Admin Berhasil");
            Admin masuk = new Admin();
        } else {
            JOptionPane.showMessageDialog(null, "Username atau Password yang dimasukan salah");
        }
    }

}
