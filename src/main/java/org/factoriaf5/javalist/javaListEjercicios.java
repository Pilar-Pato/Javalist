package org.factoriaf5.javalist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class javaListEjercicios {

    private List<String> dias = new ArrayList<>();

    public javaListEjercicios() {
       crearListaDias();
    }

    private void crearListaDias() {
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo"); 

    }

       public List<String> obtenerDias() {
        return new ArrayList<>(dias); 
       }
    
        public int obtenerLargo() {
        return dias.size();
    }

    
         public boolean eliminarDia(String dia) {
            return dias.remove(dia);
    }

    
         public String obtenerDia(int index) {
        if (index >= 0 && index < dias.size()) {
            return dias.get(index);
        } else {
            throw new IndexOutOfBoundsException("Índice no existe");
        }
    }

    public boolean existeDia(String dia) {
        return dias.contains(dia);
    }

    
    public void ordenarDias() {
        Collections.sort(dias);
    }

    
    public void vaciarLista() {
        dias.clear();
    }
}