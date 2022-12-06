package _07gestaoacademica;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ModeloCBSelecaoTurmaProfessor<E> extends AbstractListModel<String> implements ComboBoxModel<String>{

    private List<Turma> turmas = ((UsuarioProfessor)BancoDeDados.pegaUsuario()).retornarTurmasDesseProfessor();
    private Object obj;
    
    @Override
    public int getSize() {
        return turmas.size();
    }

    @Override
    public String getElementAt(int index) {
        return turmas.get(index).getCodigo();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        obj = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return obj;
    }
    
    public Turma getTurmaEspecifica(int turmaSelecionada) {

        return turmas.get(turmaSelecionada);
        
    }

}
