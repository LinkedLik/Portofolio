import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Penumpang extends JFrame implements ActionListener {

    void panel(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Menu Booking");
        this.setSize(800,500);
        this.setVisible(true);
        this.setLayout(null);
    }

    public Penumpang(){
        panel();

        // Deklarasi Header Registrasi Penumpang
        JLabel labelheader = new JLabel("Biodata Penumpang");
        labelheader.setFont(new Font("Agency FB",Font.BOLD,32));
        labelheader.setBounds(330,10,500,40);

        // Memasukan Label Header ke panel
        this.add(labelheader);

        // Deklarasi Label NIK & Textbox NIK
        JLabel labelNIK = new JLabel("NIK :");
        labelNIK.setFont(new Font("Arial",Font.PLAIN,18));
        labelNIK.setBounds(60, 120,220,40);

        JTextField inputNIK = new JTextField();
        inputNIK.setFont(new Font("Arial",Font.PLAIN,18));
        inputNIK.setBounds(270,120,220,40);

        // Memasukan Label NIK & Textbox NIK ke panel
        this.add(labelNIK);
        this.add(inputNIK);

        // Deklarasi Label Nama Lengkap & Textbox Nama Lengkap
        JLabel labelnama = new JLabel("Nama Lengkap :");
        labelnama.setFont(new Font("Arial",Font.PLAIN,18));
        labelnama.setBounds(60,170,220,40);

        JTextField inputnama = new JTextField();
        inputnama.setFont(new Font("Arial",Font.PLAIN,18));
        inputnama.setBounds(270,170,220,40);

        // Memasukan Label & Textbox nama lengkap ke panel
        this.add(labelnama);
        this.add(inputnama);

        // Deklarasi Label Email & TextBox Email
        JLabel labelemail = new JLabel("Email :");
        labelemail.setFont(new Font("Arial",Font.PLAIN,18));
        labelemail.setBounds(60, 220, 220,40);

        JTextField inputemail = new JTextField();
        inputemail.setFont(new Font("Arial",Font.PLAIN,18));
        inputemail.setBounds(270,220,220,40);

        // Memasukan Label & Textbox Email ke panel
        this.add(labelemail);
        this.add(inputemail);

        // Deklarasi Label & Textbox nomor telepon
        JLabel labelnomortelepon = new JLabel("No. Telp:");
        labelnomortelepon.setFont(new Font("Arial",Font.PLAIN,18));
        labelnomortelepon.setBounds(60,270,220,40);

        JTextField inputnomortelepon = new JTextField();
        inputnomortelepon.setFont(new Font("Arial",Font.PLAIN,18));
        inputnomortelepon.setBounds(270,270,220,40);

        // Memasukan Label & Textbox Nomor telepon ke Panel
        this.add(labelnomortelepon);
        this.add(inputnomortelepon);

        // Deklarasi Tombol Simpan Data
        JButton tombolsimpan = new JButton("Simpan");
        tombolsimpan.setBounds(270,350,220,40);
        tombolsimpan.addActionListener(this);

        // Memasukan Tombol Simpan Data
        this.add(tombolsimpan);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Data Tersimpan");
    }
}
