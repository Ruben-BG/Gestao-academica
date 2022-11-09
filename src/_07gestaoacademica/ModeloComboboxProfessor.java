package _07gestaoacademica;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class ModeloComboboxProfessor<E> implements ComboBoxModel<String>{
    
    private List<UsuarioProfessor> professores = BancoDeDados.retornarProfessores();
    private Object professor;
    private ListDataListener listagemProfessores = new ListDataListener() {
        @Override
        public void intervalAdded(ListDataEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
        
        @Override
        public void intervalRemoved(ListDataEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        @Override
        public void contentsChanged(ListDataEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    };

    @Override
    public void setSelectedItem(Object anItem) {
        //listagemProfessores.
    }

    @Override
    public Object getSelectedItem() {
        return professor;
    }

    @Override
    public int getSize() {
        return professores.size();
    }

    @Override
    public String getElementAt(int index) {
        return professores.get(index).getNome();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        professores = (List<UsuarioProfessor>) l;
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        professores.remove(professor);
    }
    
}
