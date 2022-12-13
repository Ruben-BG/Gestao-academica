package _07gestaoacademica;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLabel;
import javax.swing.table.TableColumn;

public class LancarNotasListagemTurmaPanel extends javax.swing.JPanel {

    //Atributos
    private ModeloTabelaNotasListagemProfessor tableModel;
    private LancarNotasCampoRenderer camposRenderer = new LancarNotasCampoRenderer();
    private LancarNotasCampoEditor camposEditor;
    private Turma turma;
    
    
    public LancarNotasListagemTurmaPanel(Turma turmaSelecionada) {
        
        initComponents();
        turma = turmaSelecionada;
        
        //Campos
        campoDeCodigo.setText(turmaSelecionada.getCodigo());
        campoDisciplinaDaTurma.setText(turmaSelecionada.getDisciplina());
        campoAlunoMatriculado.setText(String.valueOf(turmaSelecionada.getAlunosMatriculados().size()) + "/" + String.valueOf(turmaSelecionada.getQuantidadeMaximaDeAlunos()));
        campoHorarioDaTurma.setText(turmaSelecionada.getHorario());
        
        //Tabela
        jScrollPane1.getViewport().setBackground(Color.white);
        tableModel = new ModeloTabelaNotasListagemProfessor(turmaSelecionada);
        tabelaNotas.setModel(tableModel);
        tabelaNotas.getTableHeader().setResizingAllowed(false); //impedir que usuário redimensione coluna.
        tabelaNotas.getTableHeader().setReorderingAllowed(false); //impedir reordenamento da coluna.
        
        camposEditor = new LancarNotasCampoEditor();
        pegarColuna(2).setCellRenderer(camposRenderer);
        pegarColuna(2).setCellEditor(camposEditor);
        pegarColuna(3).setCellRenderer(camposRenderer);
        pegarColuna(3).setCellEditor(camposEditor);
        pegarColuna(4).setCellRenderer(camposRenderer);
        pegarColuna(4).setCellEditor(camposEditor);
        pegarColuna(5).setCellRenderer(camposRenderer);
        pegarColuna(5).setCellEditor(camposEditor);
        
            //Coluna da média com cor.
            LancarNotaCorRenderer corDasMedias = new LancarNotaCorRenderer(6);
            pegarColuna(6).setCellRenderer(corDasMedias);
        
        //Textos pós tabela
        periodo1Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 1));
        periodo2Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 2));
        periodo3Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 3));
        periodo4Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 4));
        mediaDasMedias.setText(BancoDeDados.retornarMediasDasMediasTurma(tableModel.retornarAlteracoesFeitas()));
        alterarCorDaMedia(periodo1Label);
        alterarCorDaMedia(periodo2Label);
        alterarCorDaMedia(periodo3Label);
        alterarCorDaMedia(periodo4Label);
        alterarCorDaMedia(mediaDasMedias);
        
        tabelaNotas.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String notaPega = camposEditor.getValorNaCelula();
                tableModel.modificarValorDaNota(camposEditor.getLinha(), camposEditor.getColuna(), turmaSelecionada, notaPega);
                
                //textos
                periodo1Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 1));
                alterarCorDaMedia(periodo1Label);
                periodo2Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 2));
                alterarCorDaMedia(periodo2Label);
                periodo3Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 3));
                alterarCorDaMedia(periodo3Label);
                periodo4Label.setText(BancoDeDados.retornarMediaPeriodoTurma(tableModel.retornarAlteracoesFeitas(), 4));
                alterarCorDaMedia(periodo4Label);
                mediaDasMedias.setText(BancoDeDados.retornarMediasDasMediasTurma(tableModel.retornarAlteracoesFeitas()));
                alterarCorDaMedia(mediaDasMedias);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                String notaPega = camposEditor.getValorNaCelula();
                tableModel.atribuirNotaACampoVazio(camposEditor.getLinha(), camposEditor.getColuna(), notaPega);
            }
        });
        
    }
    
    public TableColumn pegarColuna(int colunaEscolhida) {
        return tabelaNotas.getColumnModel().getColumn(colunaEscolhida);
    }
    
    public void salvarAlteracoesDeNotas() {
        
        for (AlunoNotas alunoNota : tableModel.retornarAlteracoesFeitas()) {
            
            BancoDeDados.salvarNotasAlteradas(alunoNota, turma);
            
        }
        
        PopUp p = new PopUp();
        p.mensagemFinalNovoProfessor("Alterações salvas com sucesso!");
        
    }
    
    private void alterarCorDaMedia(JLabel textoDaMedia) {
        
        Double valor = Double.valueOf(textoDaMedia.getText());
        
        if (valor < 0.0) {
            textoDaMedia.setText("-");
        }
        
        if (valor < 7) {
            textoDaMedia.setForeground(Color.RED);
        } else {
            textoDaMedia.setForeground(new Color(19, 176, 110));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoTurmaLabel = new javax.swing.JLabel();
        campoDeCodigo = new _07gestaoacademica.CampoDeEscrita();
        disciplinaTurmaLabel = new javax.swing.JLabel();
        campoDisciplinaDaTurma = new _07gestaoacademica.CampoDeEscrita();
        alunoMatriculadoLabel = new javax.swing.JLabel();
        campoAlunoMatriculado = new _07gestaoacademica.CampoDeEscrita();
        horarioTurmaLabel = new javax.swing.JLabel();
        campoHorarioDaTurma = new _07gestaoacademica.CampoDeEscrita();
        alunosLabel = new javax.swing.JLabel();
        mediaLabel = new javax.swing.JLabel();
        periodo1Label = new javax.swing.JLabel();
        periodo2Label = new javax.swing.JLabel();
        periodo3Label = new javax.swing.JLabel();
        periodo4Label = new javax.swing.JLabel();
        mediaDasMedias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNotas = new _07gestaoacademica.JTablePersonalizadaLancarNota();

        setBackground(new java.awt.Color(255, 255, 255));

        codigoTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        codigoTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        codigoTurmaLabel.setText("Código");

        campoDeCodigo.setEditable(false);
        campoDeCodigo.setText("");

        disciplinaTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        disciplinaTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        disciplinaTurmaLabel.setText("Disciplina");

        campoDisciplinaDaTurma.setEditable(false);
        campoDisciplinaDaTurma.setText("");

        alunoMatriculadoLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        alunoMatriculadoLabel.setForeground(new java.awt.Color(0, 0, 0));
        alunoMatriculadoLabel.setText("Alunos Matric./Máx");

        campoAlunoMatriculado.setEditable(false);
        campoAlunoMatriculado.setText("");

        horarioTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        horarioTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        horarioTurmaLabel.setText("Horário");

        campoHorarioDaTurma.setEditable(false);
        campoHorarioDaTurma.setText("");

        alunosLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        alunosLabel.setForeground(new java.awt.Color(0, 0, 0));
        alunosLabel.setText("Alunos");

        mediaLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mediaLabel.setForeground(new java.awt.Color(0, 0, 0));
        mediaLabel.setText("Média");

        periodo1Label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        periodo1Label.setForeground(new java.awt.Color(0, 0, 0));
        periodo1Label.setText("P.1");

        periodo2Label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        periodo2Label.setForeground(new java.awt.Color(0, 0, 0));
        periodo2Label.setText("P.2");

        periodo3Label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        periodo3Label.setForeground(new java.awt.Color(0, 0, 0));
        periodo3Label.setText("P.3");

        periodo4Label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        periodo4Label.setForeground(new java.awt.Color(0, 0, 0));
        periodo4Label.setText("P.4");

        mediaDasMedias.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        mediaDasMedias.setForeground(new java.awt.Color(0, 0, 0));
        mediaDasMedias.setText("M");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tabelaNotas.setBackground(new java.awt.Color(255, 255, 255));
        tabelaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaNotas.setSelectionBackground(new java.awt.Color(19, 176, 110));
        tabelaNotas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabelaNotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(codigoTurmaLabel)
                        .addGap(139, 139, 139)
                        .addComponent(disciplinaTurmaLabel)
                        .addGap(128, 128, 128)
                        .addComponent(alunoMatriculadoLabel)
                        .addGap(50, 50, 50)
                        .addComponent(horarioTurmaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(campoDeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoDisciplinaDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoAlunoMatriculado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoHorarioDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(alunosLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(mediaLabel)
                        .addGap(70, 70, 70)
                        .addComponent(periodo1Label)
                        .addGap(88, 88, 88)
                        .addComponent(periodo2Label)
                        .addGap(83, 83, 83)
                        .addComponent(periodo3Label)
                        .addGap(89, 89, 89)
                        .addComponent(periodo4Label)
                        .addGap(85, 85, 85)
                        .addComponent(mediaDasMedias)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoTurmaLabel)
                    .addComponent(disciplinaTurmaLabel)
                    .addComponent(alunoMatriculadoLabel)
                    .addComponent(horarioTurmaLabel))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDisciplinaDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAlunoMatriculado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoHorarioDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(alunosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediaLabel)
                    .addComponent(periodo1Label)
                    .addComponent(periodo2Label)
                    .addComponent(periodo3Label)
                    .addComponent(periodo4Label)
                    .addComponent(mediaDasMedias)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alunoMatriculadoLabel;
    private javax.swing.JLabel alunosLabel;
    private _07gestaoacademica.CampoDeEscrita campoAlunoMatriculado;
    private _07gestaoacademica.CampoDeEscrita campoDeCodigo;
    private _07gestaoacademica.CampoDeEscrita campoDisciplinaDaTurma;
    private _07gestaoacademica.CampoDeEscrita campoHorarioDaTurma;
    private javax.swing.JLabel codigoTurmaLabel;
    private javax.swing.JLabel disciplinaTurmaLabel;
    private javax.swing.JLabel horarioTurmaLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mediaDasMedias;
    private javax.swing.JLabel mediaLabel;
    private javax.swing.JLabel periodo1Label;
    private javax.swing.JLabel periodo2Label;
    private javax.swing.JLabel periodo3Label;
    private javax.swing.JLabel periodo4Label;
    private _07gestaoacademica.JTablePersonalizadaLancarNota tabelaNotas;
    // End of variables declaration//GEN-END:variables
}
