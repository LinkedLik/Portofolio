import javax.swing.*;
import java.awt.*;

public class JadwalPenerbangan extends JFrame {
    void panel(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Jadwal Penerbangan");
        this.setSize(800,500);
        this.setVisible(true);
        this.setLayout(null);
    }
    public JadwalPenerbangan(){
        panel();
        // Deklarasi Label Pengaturan
        JLabel labelpengaturan = new JLabel("Pengaturan");
        labelpengaturan.setFont(new Font("Agency", Font.BOLD,32));
        labelpengaturan.setBounds(330,10,500,40);

        // Menambahkan label pengaturan ke panel
        this.add(labelpengaturan);

        // Deklarasi Label Jadwal
        JLabel labelpengaturanjadwal = new JLabel("Pengaturan Jadwal Penerbangan");
        labelpengaturanjadwal.setFont(new Font("Arial",Font.PLAIN,18));
        labelpengaturanjadwal.setBounds(70,50,300,30);

        // Menambahkan label pengaturan Jadwal ke panel
        this.add(labelpengaturanjadwal);

        // Deklarasi tabel daftar Jadwal
        String columnjadwal[] = {"No","Rute","Maskapai","Jadwal Terbang"};
        Object[][] datajadwal = {
                {"1","Jakarta Semarang","Lion Air","Senin 28 November 2022"},
                {"2","Semarang Jayapura","Garuda Indonesia","Selasa 29 November 2022"}
        };

        JTable tabeljadwal = new JTable(datajadwal,columnjadwal);
        tabeljadwal.setEditingColumn(2);
        tabeljadwal.setBounds(60,100,600,100);

        // Menambahkan table ke panel
        this.add(tabeljadwal);

        // Deklarasi Label, TextBox, dan Button Insert Update Delete
        JLabel labelnomor = new JLabel("No :");
        labelnomor.setBounds(60,280,150,20);
        labelnomor.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputnomor = new JTextField();
        inputnomor.setBounds(220,280,150,20);
        inputnomor.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelnomor);
        this.add(inputnomor);

        JLabel labelrute = new JLabel("Rute");
        labelrute.setBounds(60,310,150,20);
        labelrute.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputrute = new JTextField();
        inputrute.setBounds(220,310,150,20);
        inputrute.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelrute);
        this.add(inputrute);

        JLabel labelnama = new JLabel("Nama Maskapai :");
        labelnama.setBounds(60,340,150,20);
        labelnama.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputnama = new JTextField();
        inputnama.setBounds(220,340,150,20);
        inputnama.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelnama);
        this.add(inputnama);

        JLabel labeljadwal = new JLabel("Jadwal Penerbangan :");
        labeljadwal.setBounds(60,370,150,20);
        labeljadwal.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputjadwal = new JTextField();
        inputjadwal.setBounds(220,370,150,20);
        inputjadwal.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labeljadwal);
        this.add(inputjadwal);

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
