package br.com.maratonajsf.bean.estudante;

//import javax.faces.bean.ManagedBean;
import br.com.maratonajsf.model.Estudante;
import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.inject.Named;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

//@ManagedBean essa notação será depreciada
@Named//Gerenciado pelo CDI -- // CDI - O container(Wildfly) vai instanciar a classe
public class EstudanteRegistrarBean implements Serializable {

   private Estudante estudante = new Estudante();
   private String[] nomesArray = {"Você","PRECISA","De", "DEUS"};
   private List<String> nomesList = asList("Igor","Santos","Mascarenhas");
   private Set<String> nomesSet = new HashSet<>(asList("Bruna","Liana","Luana"));
   private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Estude", " mais");
        nomesMap.put("Seja", " melhor");
        nomesMap.put("Lute", " pra vencer");

        for (Map.Entry<String, String > entry : nomesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
    }
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
