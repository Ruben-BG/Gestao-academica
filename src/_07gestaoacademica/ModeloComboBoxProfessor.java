package _07gestaoacademica;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ModeloComboBoxProfessor<E> extends AbstractListModel<String> implements ComboBoxModel<String>{
    
    private List<UsuarioProfessor> professores = BancoDeDados.retornarProfessores();
    private Object professor;

    @Override
    public int getSize() {
        return professores.size();
    }

    @Override
    public String getElementAt(int index) {
        return professores.get(index).getNome();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        professor = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return professor;
    }
    
}
