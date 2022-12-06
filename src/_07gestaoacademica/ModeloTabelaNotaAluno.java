package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaNotaAluno extends AbstractTableModel{
    
    private String[] colunas = {"Período", "Nota"};
    private List<NotaDeAluno> notas = new ArrayList<>();
    
    public ModeloTabelaNotaAluno(ModeloTabelaTurmaAluno referenciaOutroModelo, int linha) {

        notas = referenciaOutroModelo.getTurmaSelecionada(linha).getNotas();
        
    }

    @Override
    public int getRowCount() {
        return notas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
            case 0: return ++linha + "°";
            case 1: return null;
            default: return null;
        }
        
    }
    
}
