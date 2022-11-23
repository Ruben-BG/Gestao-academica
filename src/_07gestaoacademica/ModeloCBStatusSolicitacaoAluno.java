package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ModeloCBStatusSolicitacaoAluno<E> extends AbstractListModel<String> implements ComboBoxModel<String>{
    
    private List<String> status = new ArrayList<>();
    private Object s;
    
    public ModeloCBStatusSolicitacaoAluno() {
        status.add("Todos");
        status.add("Pendente");
        status.add("Rejeitada");
        status.add("Aprovada");
    }

    @Override
    public int getSize() {
        return status.size();
    }

    @Override
    public String getElementAt(int index) {
        return status.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        s = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return s;
    }
    
}
