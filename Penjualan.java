import javax.swing.*;
import java.awt.*;

public class Penjualan extends JFrame {
    void panel(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Laporan Penjualan");
        this.setSize(800,500);
        this.setVisible(true);
        this.setLayout(null);
    }
    public Penjualan(){
        panel();

        JLabel laporan = new JLabel("Laporan Penjualan ");
        laporan.setBounds(320,10,200,50);
        laporan.setFont(new Font("Agency FB",Font.BOLD,32));
        this.add(laporan);

        String kolomlaporan[]= {"Tanggal","Keterangan","Debit","Kredit"};
        Object[][] datalaporan ={
                {"28/11","Seorang Pelanggan Bernama James Membeli Tiket Menuju Semarang dari jakarta secara tunai","1.250.000",""},
                {"28/11","Seorang Pelanggan Bernama James Membeli Tiket Menuju Semarang dari jakarta secara tunai","","1.250.000"},
                {"29/11","Seorang Pelanggan Bernama Jack Membeli Tiket Menuju Jayapura dari semarang secara tunai","3.720.000",""},
                {"29/11","Seorang Pelanggan Bernama Jack Membeli Tiket Menuju Jayapura dari semarang secara tunai","","3.720.000"},
                {"","Total","4.970.000","4.970.000"}
        };
        JTable tabellaporan = new JTable(datalaporan,kolomlaporan);
        tabellaporan.setBounds(20,70,740,300);
        this.add(tabellaporan);
    }
}
