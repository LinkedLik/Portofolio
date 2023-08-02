import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

    void panel() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Menu Admin");
        this.setSize(800, 400);
        this.setVisible(true);
        this.setLayout(null);
    }

    public Admin(){
        panel();

        // Deklarasi Label Header
        JLabel labelheader = new JLabel("Control Panel Admin");
        labelheader.setFont(new Font("Agency FB",Font.BOLD,32));
        labelheader.setBounds(280,20,350,50);

        // Menambahkan label header ke panel
        this.add(labelheader);

        // Deklarasi Tombol Pengaturan maskapai
        JButton pengaturanmasakapai = new JButton("Pengaturan Maskapai");
        pengaturanmasakapai.setBounds(80,250,200,50);

        // Menambahkan tombol pengatruan maskapai ke panel
        this.add(pengaturanmasakapai);
        // Menambahkan actionlistener
        pengaturanmasakapai.addActionListener(this);

        // Deklarasi Tombol Pengaturan Rute
        JButton pengatruanrute = new JButton("Pengaturan Rute");
        pengatruanrute.setBounds(290,250,200,50);

        // Menambahkan Tombol pengaturan Rute ke panel
        this.add(pengatruanrute);
        // Menambahkan actionlistener
        pengatruanrute.addActionListener(this);

        // Deklarasi Tombol Pengaturan Jadwal Penerbangan
        JButton pengaturanjadwalpenerbangan = new JButton("Jadwal Penerbangan");
        pengaturanjadwalpenerbangan.setBounds(500,250,200,50);

        // Menambahkan Tombol Pengaturan Jadwal Penerbangan ke panel
        this.add(pengaturanjadwalpenerbangan);
        // Menambahan actionlistener
        pengaturanjadwalpenerbangan.addActionListener(this);

        // Deklarasi Tombol Data Customer
        JButton datacustomer = new JButton("Data Customer");
        datacustomer.setBounds(80, 190, 200,50);

        // Menambahkan Tombol Data Customer ke panel
        this.add(datacustomer);
        // Menambahkan Actionlistner
        datacustomer.addActionListener(this);

        // Deklarasi Tombol Data Staff Kantor
        JButton datastaff = new JButton("Data Staff");
        datastaff.setBounds(290,190,200,50);

        // Menambahkan Tombol Data Staff Kantor
        this.add(datastaff);
        // Menambahkan Actionlistener
        datastaff.addActionListener(this);

        // Deklarasi Tombol Laporan Penjualan Tiket
        JButton laporan = new JButton("Laporan Penjualan Tiket");
        laporan.setBounds(500,190,200,50);

        // Menambahkan Tombol Laporan Penjualan Tiket ke panel
        this.add(laporan);
        // Menambahkan Actionlistener
        laporan.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton asal = (JButton) e.getSource();
        if(asal.getActionCommand().equals("Pengaturan Maskapai")){
            PengaturanMaskapai settingmaskapai = new PengaturanMaskapai();
        } else if (asal.getActionCommand().equals("Pengaturan Rute")) {
            PengaturanRute settingrute = new PengaturanRute();
        } else if (asal.getActionCommand().equals("Jadwal Penerbangan")) {
            JadwalPenerbangan settingjadwal = new JadwalPenerbangan();
        } else if (asal.getActionCommand().equals("Data Customer")) {
            DataCustomer datapelanggan = new DataCustomer();
        } else if (asal.getActionCommand().equals("Data Staff")) {
            DataStaff datapegawai = new DataStaff();
        } else if (asal.getActionCommand().equals("Laporan Penjualan Tiket")) {
            Penjualan laporan = new Penjualan();
        }
    }
}