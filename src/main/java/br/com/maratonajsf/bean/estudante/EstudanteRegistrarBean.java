package br.com.maratonajsf.bean.estudante;

//import javax.faces.bean.ManagedBean;
import br.com.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;

//@ManagedBean essa notação será depreciada
@Named //Gerenciado pelo CDI -- // CDI - O container(Wildfly) vai instanciar a classe
public class EstudanteRegistrarBean implements Serializable {

   private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
