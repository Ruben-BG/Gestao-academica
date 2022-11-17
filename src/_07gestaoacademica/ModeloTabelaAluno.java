package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaAluno extends AbstractTableModel {

    List<UsuarioAluno> alunos = new ArrayList<>();
    private String[] colunas = {"Nome", "Turmas", "Ações"};
    
    public ModeloTabelaAluno() {
        alunos = BancoDeDados.retornarAlunos();
    }
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
            case 0: return alunos.get(linha).getNome();
            case 1: return alunos.get(linha).getTurmasOndeAlunoEsta().size();
            case 2: break;
        }
        
        return null;
        
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return coluna == 2;
    }
    
    public void removeLinha(int linha) {
        
        BancoDeDados.excluirAlunoDaLista(linha);
        alunos.remove(linha);
        fireTableDataChanged();
        
    }
    
    public void pesquisarAluno(String nome, String codigo, String disciplina, ListagemDeAluno referenciaAListagem, JTablePersonalizada tabela) {
        
        if (nome.equals("") && codigo.equals("") && disciplina.equals("")) {
            
            alunos = BancoDeDados.retornarAlunos();
            referenciaAListagem.casoDePesquisaNula();
            fireTableDataChanged();
        
        } else {
            
            alunos = BancoDeDados.pesquisarAluno(nome, codigo, disciplina);
            
            if (alunos.size() < 1) {
                referenciaAListagem.mensagemCasoPesquisaDeErrado();
            } else {
                referenciaAListagem.casoDePesquisaNula();
            }
            
            fireTableDataChanged();
            
        }
        
    }
    
}
