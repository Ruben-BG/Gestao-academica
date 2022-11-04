package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaProfessor extends AbstractTableModel{

    String[] coluna = {"Nome", "Turmas", "Ações"};
    List<UsuarioProfessor> professores = new ArrayList<>();
    
    public ModeloTabelaProfessor() {
        professores = BancoDeDados.retornarProfessores();
    }
    
    @Override
    public int getRowCount() {
        return professores.size();
    }

    @Override
    public int getColumnCount() {
        return coluna.length;
    }

    @Override
    public String getColumnName(int column) {
        return coluna[column];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
            case 0: return professores.get(linha).getNome();
            case 1: return professores.get(linha).retornaQuantidadeDeTurma();
            case 2: break;
        }
        
        return null;
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2;
    }
    
    public void removeRow(int linha) {
        
        BancoDeDados.excluirProfessorDaLista(linha);
        professores.remove(linha);
        fireTableRowsDeleted(linha, linha);
        
    }
    
    public void pesquisarProfessor(String nomeDoProfessor, String codigoDaTurma, String disciplinaDaTurma, JTablePersonalizada referenciaATabela, ListagemProfessor referenciaPaginaDeListagem) {
        
        if(nomeDoProfessor.equals("") && codigoDaTurma.equals("") && disciplinaDaTurma.equals("")) {
            professores = BancoDeDados.retornarProfessores();
            referenciaATabela.setVisible(true);
            referenciaPaginaDeListagem.mensagemDePesquisaBemSucedida();
            fireTableDataChanged();
        } else {
            professores = BancoDeDados.pesquisarProfessor(nomeDoProfessor, codigoDaTurma, disciplinaDaTurma);
            
            if (professores.size() < 1) {
                referenciaATabela.setVisible(false);
                referenciaPaginaDeListagem.mensagemCasoPesquisaDeErrado();
            } else {
                referenciaATabela.setVisible(true);
                referenciaPaginaDeListagem.mensagemDePesquisaBemSucedida();
            }
            
            fireTableDataChanged();
        }
        
    }
    
}
