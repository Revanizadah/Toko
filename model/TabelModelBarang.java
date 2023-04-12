/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Noval
 */
public class TabelModelBarang extends AbstractTableModel{

    List<Barang> listBrg;
    
    public TabelModelBarang(List<Barang> listBrg) {
        this.listBrg = listBrg;
    }
    
    @Override
    public int getRowCount() {
        return listBrg.size();
    }

    @Override
    public int getColumnCount() {
        return  5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
        case 0 -> listBrg.get(row).getKode();
        case 0 -> listBrg.get(row).getNama();
        case 0 -> listBrg.get(row).getJumlah();
        case 0 -> listBrg.get(row).getHarga();
        case 0 -> listBrg.get(row).getMerek();
        }
    }
    
    @Override
    public int getColumnName(int column) {
        return switch (column) {
            case 0 -> "Kode Barang";
            case 1 -> "Nama Barang";
            case 2 -> "Jumlah";
            case 3 -> "Harga";
            case 4 -> "Merek";
            default -> null;
        };
    }

}
    
    

