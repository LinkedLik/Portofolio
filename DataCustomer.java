import javax.swing.*;
import java.awt.*;

public class DataCustomer extends JFrame {
    void panel(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Data Customer");
        this.setSize(800,500);
        this.setVisible(true);
        this.setLayout(null);
    }
    public DataCustomer(){
        panel();
        // Deklarasi Label Pengaturan
        JLabel labelpengaturan = new JLabel("Pengaturan");
        labelpengaturan.setFont(new Font("Agency", Font.BOLD,32));
        labelpengaturan.setBounds(330,10,500,40);

        // Menambahkan label pengaturan ke panel
        this.add(labelpengaturan);

        // Deklarasi Label Data Customer
        JLabel labelpengaturandatacustomer = new JLabel("Pengaturan Data Customer");
        labelpengaturandatacustomer.setFont(new Font("Arial",Font.PLAIN,18));
        labelpengaturandatacustomer.setBounds(70,50,300,30);

        // Menambahkan label pengaturan Data Customer ke panel
        this.add(labelpengaturandatacustomer);

        // Deklarasi tabel daftar Data Customer
        String columncustomer[] = {"No","NIK","Nama Lengkap","Email","No. Telp"};
        Object[][] datacustomer = {
                {"1","31432543655","James","James@test.com","0987213545"},
                {"2","36348958435","Jack","Jack@test.com","0192887548"}
        };

        JTable tabelcustomer = new JTable(datacustomer,columncustomer);
        tabelcustomer.setEditingColumn(2);
        tabelcustomer.setBounds(60,100,600,100);

        // Menambahkan table ke panel
        this.add(tabelcustomer);

        // Deklarasi Label, TextBox, dan Button Insert Update Delete
        JLabel labelnomor = new JLabel("No :");
        labelnomor.setBounds(60,280,150,20);
        labelnomor.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputnomor = new JTextField();
        inputnomor.setBounds(220,280,150,20);
        inputnomor.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelnomor);
        this.add(inputnomor);

        JLabel labelNIK = new JLabel("NIK :");
        labelNIK.setBounds(60,310,150,20);
        labelNIK.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputNIK = new JTextField();
        inputNIK.setBounds(220,310,150,20);
        inputNIK.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelNIK);
        this.add(inputNIK);

        JLabel labelnama = new JLabel("Nama Lengkap :");
        labelnama.setBounds(60,340,150,20);
        labelnama.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputnama = new JTextField();
        inputnama.setBounds(220,340,150,20);
        inputnama.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelnama);
        this.add(inputnama);

        JLabel labelemail = new JLabel("Email :");
        labelemail.setBounds(60,370,150,20);
        labelemail.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputemail = new JTextField();
        inputemail.setBounds(220,370,150,20);
        inputemail.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelemail);
        this.add(inputemail);

        JLabel labelnotel = new JLabel("No. Telp :");
        labelnotel.setBounds(60,400,150,20);
        labelnotel.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputnotel = new JTextField();
        inputnotel.setBounds(220,400,150,20);
        inputnotel.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelnotel);
        this.add(inputnotel);

        JButton tombolinsert = new JButton("Insert");
        tombolinsert.setBounds(660,280,100,20);
        tombolinsert.setFont(new Font("Arial",Font.PLAIN,14));
        JButton tombolupdate = new JButton("Update");
        tombolupdate.setBounds(660,310,100,20);
        tombolupdate.setFont(new Font("Arial",Font.PLAIN,14));
        JButton tomboldelete = new JButton("Delete");
        tomboldelete.setBounds(660,340,100,20);
        tomboldelete.setFont(new Font("Arial",Font.BOLD,14));
        this.add(tombolinsert);
        this.add(tombolupdate);
        this.add(tomboldelete);
    }
}
