package _07gestaoacademica;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

public class LancarNotasCampoEditor extends AbstractCellEditor implements TableCellEditor{

    LancarNotasCampoPanel panel = new LancarNotasCampoPanel();
    JTextField campoDeTexto = panel.getCampoDeTexto();
    private String valorNoTexto;
    private ModeloTabelaNotasListagemProfessor tableModel;
    private LancarNotasListagemTurmaPanel tabela;
    private Turma turmaSelecionada;
    private int linha;
    private int coluna;
    
    public LancarNotasCampoEditor(ModeloTabelaNotasListagemProfessor referenciaModeloDaTabela, LancarNotasListagemTurmaPanel referenciaTabela, Turma turmaEscolhida) {
        tableModel = referenciaModeloDaTabela;
        tabela = referenciaTabela;
        turmaSelecionada = turmaEscolhida;
    }
    
    @Override
    public Object getCellEditorValue() {
        return "";
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        
        panel.setBackground(table.getSelectionBackground());
        panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        campoDeTexto.setText(value == null || value.equals("") ? "" : value.toString());
        coluna = column;
        linha = row;
        return panel;
        
    }
    
    

    @Override
    public void addCellEditorListener(CellEditorListener l) {
        
        panel.getCampoDeTexto().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    
                    valorNoTexto = getValorNaCelula().equals("") ? "" : getValorNaCelula();
                    tableModel.modificarValorDaNota(linha, coluna, turmaSelecionada, valorNoTexto);
                    tableModel.atribuirNotaACampoVazio(linha, coluna, valorNoTexto);
                    atualizaMediaPeriodos();
                    panel.requestFocus();
                    
                }
            }
        });
        
    }
    
    private void atualizaMediaPeriodos() {
        
        tabela.periodo1Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 1));
        tabela.periodo2Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 2));
        tabela.periodo3Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 3));
        tabela.periodo4Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 4));
        tabela.mediaDasMedias.setText(BancoDeDados.retornarMediasDasMediasTurma(tableModel.retornarAlteracoesFeitas()));
        tabela.alterarCorDaMedia(tabela.periodo1Label);
        tabela.alterarCorDaMedia(tabela.periodo2Label);
        tabela.alterarCorDaMedia(tabela.periodo3Label);
        tabela.alterarCorDaMedia(tabela.periodo4Label);
        tabela.alterarCorDaMedia(tabela.mediaDasMedias);
        
    }
    
    private String getValorNaCelula() {
        
        return campoDeTexto.getText();
        
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    public String getValorNoTexto() {
        return valorNoTexto;
    }
    
}
