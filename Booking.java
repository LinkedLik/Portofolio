import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Booking extends JFrame implements ActionListener{

    // Bikin Fungsi Panel
    void panel(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Menu Booking");
        this.setSize(800,720);
        this.setVisible(true);
        this.setLayout(null);
    }

    Booking(){
        panel();

        // Deklarasi dan mengatur posisi label header
        JLabel labelheader = new JLabel("Data Maskapai");
        labelheader.setBounds(330,10,500,30);
        labelheader.setSize(150, 40);
        labelheader.setFont(new Font("Agency FB", Font.BOLD,32));
        // Menambahkan labelheader ke panel
        this.add(labelheader);

        // Deklarasi dan mengatur posisi label & combobox untuk pilihan jenis maskapai
        JLabel labeljenismaskapai = new JLabel("Maskapai Penerbangan :");
        labeljenismaskapai.setBounds(60,120,220,40);
        labeljenismaskapai.setFont(new Font("Arial",Font.PLAIN, 18));
        JComboBox pilihanmaskapai = new JComboBox(new String[]{"Garuda Indonesia","Lion Air","Batik Air",
                                    "Sriwijaya Air","Air Asia","Citilink"});
        pilihanmaskapai.setFont(new Font("Arial", Font.PLAIN,18));
        pilihanmaskapai.setBounds(270,120,220,40);
        // Memasukan labeljenismaskapai & pilihanmaskapai ke panel
        this.add(labeljenismaskapai);
        this.add(pilihanmaskapai);

        // Deklarasi dan Mengatur posisi label & textbox untuk Memilih Rute
        JLabel labelrute = new JLabel("Rute Penerbangan :");
        labelrute.setBounds(60,170,220,40);
        labelrute.setFont(new Font("Arial",Font.PLAIN,18));
        JTextField inputrute = new JTextField();
        inputrute.setBounds(270,170,220,40);
        inputrute.setFont(new Font("Arial",Font.PLAIN,18));
        // Memasukan labelrute & input rute ke panel
        this.add(labelrute);
        this.add(inputrute);

        // Deklarasi dan Mengatur Posisi label & textbox Tanggal
        JLabel labeltanggal = new JLabel("Tanggal Berangkat :");
        labeltanggal.setBounds(60,220,220,40);
        labeltanggal.setFont(new Font("Arial",Font.PLAIN,18));
        JTextField inputtanggal = new JTextField();
        inputtanggal.setFont(new Font("Arial",Font.PLAIN,18));
        inputtanggal.setBounds(270,220,220,40);
        // Memasukan labeltanggal & input tanggal ke panel
        this.add(labeltanggal);
        this.add(inputtanggal);

        // Deklarasi dan Mengatur Posisi label & textbox Bagasi
        // Label Volume Bagasi
        JLabel labelvolumebagasi = new JLabel("Volume Bagasi :");
        labelvolumebagasi.setBounds(60,270,220,40);
        labelvolumebagasi.setFont(new Font("Arial",Font.PLAIN,18));
        // Label Textbox Volume Bagasi
        JTextField inputvolumebagasi = new JTextField();
        inputvolumebagasi.setBounds(270,270,50,40);
        inputvolumebagasi.setFont(new Font("Arial",Font.PLAIN,18));
        // Label Satuan Kilogram (Kg) setelah textbox Input Volume Bagasi
        JLabel labelkg = new JLabel("Kg");
        labelkg.setBounds(330,270,30,40);
        labelkg.setFont(new Font("Arial",Font.PLAIN,18));
        // Menambahkan Label & Textbox Volume bagasi berikut dengan label satuan Kilogram
        this.add(labelvolumebagasi);
        this.add(inputvolumebagasi);
        this.add(labelkg);

        // Deklarasi Label & Combobox Menu Makanan yang akan dipilih penumpang
        // Label Menu Makanan
        JLabel menumakanan = new JLabel("Menu Makanan :");
        menumakanan.setBounds(60,320,220,40);
        menumakanan.setFont(new Font("Arial",Font.PLAIN,18));
        // Comboxbox Menu Makanan
        JComboBox pilihanmakanan = new JComboBox(new String[]{"Steak","Nasi Lemak","Mac & Cheese","Salad",
                                                "Nasi Kuning","Opor Ayam","Rendang"});
        pilihanmakanan.setBounds(270,320,220,40);
        pilihanmakanan.setFont(new Font("Arial",Font.PLAIN,18));
        // Menambahkan Label & Combobox Menu Makanan ke panel
        this.add(menumakanan);
        this.add(pilihanmakanan);

        // Deklarasi Label & Combobox Minuman yang akan dipilih penumpang
        // Label Minuman
        JLabel labelminuman = new JLabel("Minuman :");
        labelminuman.setBounds(60,370,220,40);
        labelminuman.setFont(new Font("Arial",Font.PLAIN,18));
        // Combobox Pilihan Minuman
        JComboBox pilihanminuman = new JComboBox(new String[]{"Air Mineral","Kopi","Teh","Coca Cola","Fanta",
                                                "Sprite","Champagne","Beer"});
        pilihanminuman.setBounds(270,370,220,40);
        pilihanminuman.setFont(new Font("Arial",Font.PLAIN,18));
        // Menambahkan Label & Combobox Minuman ke panel
        this.add(labelminuman);
        this.add(pilihanminuman);

        // Deklarasi Label & Combobox Kelas Maskapai yang akan dipilih penumpang
        // Label Kelas
        JLabel labelkelas = new JLabel("Kelas :");
        labelkelas.setBounds(60,420,220,40);
        labelkelas.setFont(new Font("Arial",Font.PLAIN,18));
        // Combobox pilihan kelas
        JComboBox pilihkelas = new JComboBox(new String[]{"Ekonomi","Ekonomi Premium","Bisnis","First Class",
                                                            "Quiet Zone"});
        pilihkelas.setBounds(270,420,220,40);
        pilihkelas.setFont(new Font("Arial",Font.PLAIN,18));
        // Menambahkan Label & Combobox Kelas Pesawat ke panel
        this.add(labelkelas);
        this.add(pilihkelas);

        // Deklarasi Label & Combobox NIK
        JLabel labelNIK = new JLabel("NIK :");
        labelNIK.setBounds(60,470,220,40);
        labelNIK.setFont(new Font("Arial",Font.PLAIN,18));

        JComboBox pilihNIK = new JComboBox(new String[]{"31432543655","36348958435"});
        pilihNIK.setBounds(270,470,220,40);
        pilihNIK.setFont(new Font("Arial",Font.PLAIN,18));

        // Menambahkan Label & Combobox NIK
        this.add(labelNIK);
        this.add(pilihNIK);

        // Deklarasi Label & Combobox Jenis Pembayaran
        JLabel labelpembayaran = new JLabel("Jenis Pembayaran ");
        labelpembayaran.setFont(new Font("Arial",Font.PLAIN,18));
        labelpembayaran.setBounds(60,530,220,40);

        JComboBox pilihpembayaran = new JComboBox(new String[]{"Cash","Kredit","Transfer","QRIS"});
        pilihpembayaran.setBounds(270,530,220,40);
        pilihpembayaran.setFont(new Font("Arial",Font.PLAIN,18));

        // Menambahkan Label & Combobox Pembayaran
        this.add(labelpembayaran);
        this.add(pilihpembayaran);

        // Deklarasi label & textbox Nominal
        JLabel labelnominal = new JLabel("Nominal :");
        labelnominal.setFont(new Font("Arial",Font.PLAIN,18));
        labelnominal.setBounds(60,580,220,40);

        JTextField inputnominal = new JTextField();
        inputnominal.setFont(new Font("Arial",Font.PLAIN,18));
        inputnominal.setBounds(270,580,220,40);

        // Menambahkan label & textbox nominal
        this.add(labelnominal);
        this.add(inputnominal);

        // Deklarasi Button untuk menuju menu pengisian data diri penumpang
        JButton tomboldaftar = new JButton("Daftar Data Penumpang");
        tomboldaftar.setBounds(550,640,200,30);
        tomboldaftar.addActionListener(this);
        this.add(tomboldaftar);

        // Deklarasi Button untuk Logout
        JButton tombolpesan = new JButton("Booking");
        tombolpesan.setBounds(60,640,200,30);
        tombolpesan.addActionListener(this);
        this.add(tombolpesan);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton asal = (JButton) e.getSource();
        if(asal.getActionCommand().equals("Daftar Data Penumpang")){
        JOptionPane.showMessageDialog(null,"Membuka Menu Daftar Penumpang");
        Penumpang daftar = new Penumpang();
        } else if (asal.getActionCommand().equals("Booking")) {
            JOptionPane.showMessageDialog(null,"Booking Berhasil");
        }
    }
}
