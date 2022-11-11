package _07gestaoacademica;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class CadastroEdicaoDeTurma extends javax.swing.JFrame {

    //Atributos
    GestaoContaUsuario novaGestaoContaUsuario;
    ListagemDeTurma voltarParaListagemDeTurma;
    Turma turma;
    PopUp popUp;
    ModeloComboBoxProfessor<String> comboBoxModel = new ModeloComboBoxProfessor<>();
    int mouseX, mouseY;
    Boolean telaDeCadastro;
    
    public CadastroEdicaoDeTurma(JTablePersonalizada tabela) {
        
        initComponents();
        setLocationRelativeTo(null);
        
        jComboBox1.setModel(comboBoxModel);
        jComboBox1.setSelectedIndex(0);
        
        campoDeCodigo.requestFocus();
        
        botaoSalvar.addActionListener((e) -> {
            acaoDoBotaoSalvar(tabela);
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        cabecalhoPanel = new javax.swing.JPanel();
        sairPaginaButton = new javax.swing.JButton();
        botaoVoltarLabel = new javax.swing.JLabel();
        tituloDaPaginaLabel = new javax.swing.JLabel();
        botaoSalvar = new _07gestaoacademica.CustomizacaoBotao();
        separador = new javax.swing.JSeparator();
        codigoLabel = new javax.swing.JLabel();
        campoDeCodigo = new _07gestaoacademica.CampoDeEscrita();
        disciplinaLabel = new javax.swing.JLabel();
        campoDeDisciplina = new _07gestaoacademica.CampoDeEscrita();
        horarioLabel = new javax.swing.JLabel();
        campoDeHorario = new _07gestaoacademica.CampoDeEscrita();
        quantidadeAlunosLabel = new javax.swing.JLabel();
        campoDeQuantidadeAluno = new _07gestaoacademica.CampoDeEscrita();
        professorLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        cabecalhoPanel.setBackground(new java.awt.Color(204, 204, 204));
        cabecalhoPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabecalhoPanelMouseDragged(evt);
            }
        });
        cabecalhoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabecalhoPanelMousePressed(evt);
            }
        });

        sairPaginaButton.setBackground(new java.awt.Color(255, 255, 255));
        sairPaginaButton.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        sairPaginaButton.setForeground(new java.awt.Color(0, 0, 0));
        sairPaginaButton.setText("X");
        sairPaginaButton.setBorder(null);
        sairPaginaButton.setContentAreaFilled(false);
        sairPaginaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairPaginaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairPaginaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairPaginaButtonMouseExited(evt);
            }
        });
        sairPaginaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairPaginaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cabecalhoPanelLayout = new javax.swing.GroupLayout(cabecalhoPanel);
        cabecalhoPanel.setLayout(cabecalhoPanelLayout);
        cabecalhoPanelLayout.setHorizontalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairPaginaButton)
                .addGap(18, 18, 18))
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sairPaginaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botaoVoltarLabel.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        botaoVoltarLabel.setForeground(new java.awt.Color(102, 102, 102));
        botaoVoltarLabel.setText("←");
        botaoVoltarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoVoltarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoVoltarLabelMouseExited(evt);
            }
        });

        tituloDaPaginaLabel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        tituloDaPaginaLabel.setForeground(new java.awt.Color(30, 30, 30));
        tituloDaPaginaLabel.setText("Nova Turma");

        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setCor(new java.awt.Color(36, 53, 61));
        botaoSalvar.setCorBorda(new java.awt.Color(255, 255, 255));
        botaoSalvar.setCorEntrou(new java.awt.Color(19, 176, 110));
        botaoSalvar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        separador.setForeground(new java.awt.Color(234, 234, 234));

        codigoLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        codigoLabel.setForeground(new java.awt.Color(0, 0, 0));
        codigoLabel.setText("Código");

        campoDeCodigo.setText("Informe o código da turma");
        campoDeCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDeCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDeCodigoFocusLost(evt);
            }
        });
        campoDeCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDeCodigoKeyPressed(evt);
            }
        });

        disciplinaLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        disciplinaLabel.setForeground(new java.awt.Color(0, 0, 0));
        disciplinaLabel.setText("Disciplina");

        campoDeDisciplina.setText("Informe a disciplina");
        campoDeDisciplina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDeDisciplinaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDeDisciplinaFocusLost(evt);
            }
        });
        campoDeDisciplina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDeDisciplinaKeyPressed(evt);
            }
        });

        horarioLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        horarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        horarioLabel.setText("Horário");

        campoDeHorario.setText("Informe o horário das aulas. Ex.: Seg 08:00");
        campoDeHorario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDeHorarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDeHorarioFocusLost(evt);
            }
        });
        campoDeHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDeHorarioKeyPressed(evt);
            }
        });

        quantidadeAlunosLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        quantidadeAlunosLabel.setForeground(new java.awt.Color(0, 0, 0));
        quantidadeAlunosLabel.setText("Qtd. Máxima de Alunos");

        campoDeQuantidadeAluno.setText("Informe a quantidade máxima de alunos");
        campoDeQuantidadeAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDeQuantidadeAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDeQuantidadeAlunoFocusLost(evt);
            }
        });
        campoDeQuantidadeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDeQuantidadeAlunoKeyPressed(evt);
            }
        });

        professorLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        professorLabel.setForeground(new java.awt.Color(0, 0, 0));
        professorLabel.setText("Professor");

        jComboBox1.setBackground(new java.awt.Color(234, 234, 234));
        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setBorder(null);
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botaoVoltarLabel)
                .addGap(22, 22, 22)
                .addComponent(tituloDaPaginaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(professorLabel)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLabel)
                            .addComponent(horarioLabel)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoDeCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoDeHorario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantidadeAlunosLabel)
                            .addComponent(disciplinaLabel)
                            .addComponent(campoDeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDeQuantidadeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloDaPaginaLabel)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(disciplinaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horarioLabel)
                    .addComponent(quantidadeAlunosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDeHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDeQuantidadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(professorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos de simplificação
    
    public void mudarTituloDaPagina(Boolean isCadastro, JTablePersonalizada tabela) {
        
        if (isCadastro.equals(true)) {
            tituloDaPaginaLabel.setText("Nova Turma");
            telaDeCadastro = true;
        } else {
            
            tituloDaPaginaLabel.setText("Editar Turma");
            
            turma = BancoDeDados.retornarTurmas().get(tabela.getSelectedRow());
            campoDeCodigo.setText(turma.getCodigo());
            campoDeDisciplina.setText(turma.getDisciplina());
            campoDeHorario.setText(turma.getHorario());
            campoDeQuantidadeAluno.setText(String.valueOf(turma.getQuantidadeMaximaDeAlunos()));
            
            /*
            método de mudar o professor da seleção, na lista de turmas, para aquele já atribuído a turma.
            */
            int linhaDoItem = 0;
            while(linhaDoItem < BancoDeDados.retornarProfessores().size()) {
                if(turma.getProfessor().getNome().equals(BancoDeDados.retornarProfessores().get(linhaDoItem).getNome()))
                    break;
                ++linhaDoItem;
            }
            jComboBox1.setSelectedIndex(linhaDoItem);
            
            telaDeCadastro = false;
            
        }
        
    }
    
    public void mouseEntrouOuSaiuDoCampo(CampoDeEscrita campoDeTexto, String textoPadrao) {

        if (campoDeTexto.hasFocus()) {

            if (campoDeTexto.getText().equals(textoPadrao)) {
                campoDeTexto.setText("");
            } else {
                campoDeTexto.setForeground(new Color(81, 81, 81));
            }

        } else {
            
            if (campoDeTexto.getText().equals("")) {
                campoDeTexto.setText(textoPadrao);
                campoDeTexto.setForeground(new Color(81, 81, 81));
            } else {
                campoDeTexto.setForeground(Color.BLACK);
            }
            
        }

    }
    
    private Boolean gerarPopUp(char validarRepeticaoDeCodigo) {
        
        PopUp p;
        Boolean codigoJaExiste = false;
        Boolean quantidadeAlunoIsNumeric = campoDeQuantidadeAluno.getText().chars().allMatch(Character::isDigit);
        
        for(Turma turmaEscolhida: BancoDeDados.retornarTurmas()) {
            
            if(turmaEscolhida.getCodigo().equals(campoDeCodigo.getText())) {
                codigoJaExiste = true;
            }
            
        }
        
        if(campoDeCodigo.getText().equals("Informe o código da turma")){
            p = new PopUp();
            p.avisoCadastroTurma("Por favor preencha o campo de código.", campoDeCodigo);
            return true;
        } else if(codigoJaExiste.equals(true) && validarRepeticaoDeCodigo == 'n') {
            p = new PopUp();
            p.avisoCadastroTurma("Código de turma já existente, por favor digite outro.", campoDeCodigo);
            return true;
        } else if(campoDeDisciplina.getText().equals("Informe a disciplina")) {
            p = new PopUp();
            p.avisoCadastroTurma("Por favor preencha o campo de disciplina.", campoDeDisciplina);
            return true;
        } else if(campoDeHorario.getText().equals("Informe o horário das aulas. Ex.: Seg 08:00")) {
            p = new PopUp();
            p.avisoCadastroTurma("Por favor preencha o campo de horário.", campoDeHorario);
            return true;
        } else if(campoDeQuantidadeAluno.getText().equals("Informe a quantidade máxima de alunos")) {
            p = new PopUp();
            p.avisoCadastroTurma("Por favor coloque a quantidade máxima de alunos.", campoDeQuantidadeAluno);
            return true;
        } else if(!quantidadeAlunoIsNumeric) {
            p = new PopUp();
            p.avisoCadastroTurma("Quantidade de alunos tem que ser numérica.", campoDeQuantidadeAluno);
            return true;
        }
        
        return false;
        
    }
    
    private void limparCampo() {
        campoDeCodigo.setText("");
        campoDeDisciplina.setText("");
        campoDeHorario.setText("");
        campoDeQuantidadeAluno.setText("");
    }
    

    //Métodos de ação
    
    private void acaoDoBotaoSalvar(JTablePersonalizada tabela) {
        
        if(telaDeCadastro && !gerarPopUp('n')) {
            
            turma = new Turma();
            turma.setCodigo(campoDeCodigo.getText().toUpperCase());
            turma.setDisciplina(campoDeDisciplina.getText());
            turma.setHorario(campoDeHorario.getText());
            turma.setQuantidadeMaximaDeAlunos(Integer.parseInt(campoDeQuantidadeAluno.getText()));
            String nomeDoProfessorSelecionado = String.valueOf(jComboBox1.getSelectedItem());
            
            for(UsuarioProfessor professor: BancoDeDados.retornarProfessores()) {
                
                if(nomeDoProfessorSelecionado.equals(professor.getNome())) {
                    professor.adicionaTurma(turma);
                    turma.setProfessor(professor);
                }
                
            }
            
            BancoDeDados.cadastrarTurma(turma);
            popUp = new PopUp();
            popUp.mensagemFinalDoCadastroDeTurma("Turma cadastrada com sucesso.", this);
            limparCampo();
            
        } else if(!telaDeCadastro && !gerarPopUp('s')) {
            
            String nomeDoProfessorSelecionado = String.valueOf(jComboBox1.getSelectedItem());
            turma = new Turma();
            turma.setCodigo(campoDeCodigo.getText());
            turma.setDisciplina(campoDeDisciplina.getText());
            turma.setHorario(campoDeHorario.getText());
            turma.setQuantidadeMaximaDeAlunos(Integer.parseInt(campoDeQuantidadeAluno.getText()));
            
            for(UsuarioProfessor professor: BancoDeDados.retornarProfessores()) {
                
                if(nomeDoProfessorSelecionado.equals(professor.getNome())) {
                    professor.adicionaTurma(turma);
                    turma.setProfessor(professor);
                }
                
            }
            
            BancoDeDados.editarTurma(tabela.getSelectedRow(), turma);
            popUp = new PopUp();
            popUp.mensagemFinalDoCadastroDeTurma("Turma editada com sucesso.", this);
            limparCampo();
            
        }
        
    }

    private void sairPaginaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButtonMouseEntered
        Color corSelecionado = new Color(89, 89, 89);
        sairPaginaButton.setForeground(corSelecionado);
    }//GEN-LAST:event_sairPaginaButtonMouseEntered

    private void sairPaginaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButtonMouseExited
        sairPaginaButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_sairPaginaButtonMouseExited

    private void sairPaginaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairPaginaButtonActionPerformed
        novaGestaoContaUsuario = new GestaoContaUsuario();
        novaGestaoContaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairPaginaButtonActionPerformed

    private void cabecalhoPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_cabecalhoPanelMouseDragged

    private void cabecalhoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_cabecalhoPanelMousePressed

    private void botaoVoltarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseClicked
        voltarParaListagemDeTurma = new ListagemDeTurma();
        voltarParaListagemDeTurma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarLabelMouseClicked

    private void botaoVoltarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseEntered
        botaoVoltarLabel.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_botaoVoltarLabelMouseEntered

    private void botaoVoltarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseExited
        botaoVoltarLabel.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_botaoVoltarLabelMouseExited

    private void campoDeCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeCodigoFocusGained
        mouseEntrouOuSaiuDoCampo(campoDeCodigo, "Informe o código da turma");
    }//GEN-LAST:event_campoDeCodigoFocusGained

    private void campoDeCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeCodigoFocusLost
        mouseEntrouOuSaiuDoCampo(campoDeCodigo, "Informe o código da turma");
    }//GEN-LAST:event_campoDeCodigoFocusLost

    private void campoDeDisciplinaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeDisciplinaFocusGained
        mouseEntrouOuSaiuDoCampo(campoDeDisciplina, "Informe a disciplina");
    }//GEN-LAST:event_campoDeDisciplinaFocusGained

    private void campoDeDisciplinaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeDisciplinaFocusLost
        mouseEntrouOuSaiuDoCampo(campoDeDisciplina, "Informe a disciplina");
    }//GEN-LAST:event_campoDeDisciplinaFocusLost

    private void campoDeHorarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeHorarioFocusGained
        mouseEntrouOuSaiuDoCampo(campoDeHorario, "Informe o horário das aulas. Ex.: Seg 08:00");
    }//GEN-LAST:event_campoDeHorarioFocusGained

    private void campoDeHorarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeHorarioFocusLost
        mouseEntrouOuSaiuDoCampo(campoDeHorario, "Informe o horário das aulas. Ex.: Seg 08:00");
    }//GEN-LAST:event_campoDeHorarioFocusLost

    private void campoDeQuantidadeAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeQuantidadeAlunoFocusGained
        mouseEntrouOuSaiuDoCampo(campoDeQuantidadeAluno, "Informe a quantidade máxima de alunos");
    }//GEN-LAST:event_campoDeQuantidadeAlunoFocusGained

    private void campoDeQuantidadeAlunoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDeQuantidadeAlunoFocusLost
        mouseEntrouOuSaiuDoCampo(campoDeQuantidadeAluno, "Informe a quantidade máxima de alunos");
    }//GEN-LAST:event_campoDeQuantidadeAlunoFocusLost

    private void campoDeCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
            campoDeDisciplina.requestFocus();
    }//GEN-LAST:event_campoDeCodigoKeyPressed

    private void campoDeDisciplinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeDisciplinaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            campoDeHorario.requestFocus();
    }//GEN-LAST:event_campoDeDisciplinaKeyPressed

    private void campoDeHorarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeHorarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            campoDeQuantidadeAluno.requestFocus();
    }//GEN-LAST:event_campoDeHorarioKeyPressed

    private void campoDeQuantidadeAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeQuantidadeAlunoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            jComboBox1.requestFocus();
    }//GEN-LAST:event_campoDeQuantidadeAlunoKeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            botaoSalvar.doClick();
    }//GEN-LAST:event_jComboBox1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEdicaoDeTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEdicaoDeTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEdicaoDeTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEdicaoDeTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEdicaoDeTurma(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private _07gestaoacademica.CustomizacaoBotao botaoSalvar;
    private javax.swing.JLabel botaoVoltarLabel;
    private javax.swing.JPanel cabecalhoPanel;
    private _07gestaoacademica.CampoDeEscrita campoDeCodigo;
    private _07gestaoacademica.CampoDeEscrita campoDeDisciplina;
    private _07gestaoacademica.CampoDeEscrita campoDeHorario;
    private _07gestaoacademica.CampoDeEscrita campoDeQuantidadeAluno;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel disciplinaLabel;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel professorLabel;
    private javax.swing.JLabel quantidadeAlunosLabel;
    private javax.swing.JButton sairPaginaButton;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel tituloDaPaginaLabel;
    // End of variables declaration//GEN-END:variables
}
