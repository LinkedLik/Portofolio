import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyBoundsAdapter;

public class PengaturanMaskapai extends JFrame {

    void panel(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Maskapai");
        this.setSize(800,500);
        this.setVisible(true);
        this.setLayout(null);
    }

    public PengaturanMaskapai(){
        panel();

        // Deklarasi Label Pengaturan
        JLabel labelpengaturan = new JLabel("Pengaturan");
        labelpengaturan.setFont(new Font("Agency", Font.BOLD,32));
        labelpengaturan.setBounds(330,10,600,40);

        // Menambahkan label pengaturan ke panel
        this.add(labelpengaturan);

        // Deklarasi Label pengaturanmaskapai
        JLabel labelpengaturanmaskapai = new JLabel("Pengaturan Maskapai");
        labelpengaturanmaskapai.setFont(new Font("Arial",Font.PLAIN,18));
        labelpengaturanmaskapai.setBounds(70,50,200,30);

        // Menambahkan label pengaturan maskapai ke panel
        this.add(labelpengaturanmaskapai);

        // Deklarasi tabel daftar Maskapai
        String columnmaskapai[] = {"No","Nama Maskapai"};
        Object[][] datamaskapai = {
                {"1","Garuda"},
                {"2","Lion Air"},
                {"3","Batik Air"},
                {"4","Sriwijaya Air"},
                {"5","Air Asia"},
                {"6","Citilink"}
        };

        JTable tabelmaskapai = new JTable(datamaskapai,columnmaskapai);
        tabelmaskapai.setEditingColumn(2);
        tabelmaskapai.setBounds(60,100,200,100);

        // Menambahkan table ke panel
        this.add(tabelmaskapai);

        // Deklarasi Label, TextBox, dan Button Insert Update Delete
        JLabel labelnomor = new JLabel("No :");
        labelnomor.setBounds(60,280,150,20);
        labelnomor.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputnomor = new JTextField();
        inputnomor.setBounds(220,280,150,20);
        inputnomor.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelnomor);
        this.add(inputnomor);

        JLabel labelnama = new JLabel("Nama Maskapai :");
        labelnama.setBounds(60,310,150,20);
        labelnama.setFont(new Font("Arial",Font.PLAIN,14));
        JTextField inputnama = new JTextField();
        inputnama.setBounds(220,310,150,20);
        inputnama.setFont(new Font("Arial",Font.PLAIN,14));
        this.add(labelnama);
        this.add(inputnama);

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
