package br.com.maratonajsf.bean.estudante;

//import javax.faces.bean.ManagedBean;

import br.com.maratonajsf.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

//@ManagedBean essa notação será depreciada
@Named//Gerenciado pelo CDI -- // CDI - O container(Wildfly) vai instanciar a classe
@ViewScoped //Manter os mesmos objs na tela
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Você", "PRECISA", "De", "DEUS"};
    private List<String> nomesList = asList("Igor", "Santos", "Mascarenhas");
    private Set<String> nomesSet = new HashSet<>(asList("Bruna", "Liana", "Luana"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas = false;
    private boolean mostrarLink = false;

    {
        nomesMap.put("Estude", " mais");
        nomesMap.put("Seja", " melhor");
        nomesMap.put("Lute", " pra vencer");

        //       for (Map.Entry<String, String > entry : nomesMap.entrySet()){
        //           System.out.println(entry.getKey());
        //           System.out.println(entry.getValue());
        //   }
    }

    public void executar() {
        System.out.println("Fazendo uma busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");

    }

    public void executar(String param) {
        System.out.println("Fazendo uma busca no BD com o PARAMETRO" + param);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");

    }

    public String executarRetorno(String param) {
        return "Retornando param" + param;

    }

    //?faces-redirect=true - alterar a url
    public String irParaIndex2() {
        return "index2?faces-redirect=true";

    }

    public String exibirNotas(){
        this.mostrarNotas = true;
        return "index";
    }

    public String esconderNotas(){
        this.mostrarNotas = false;
        return "index";
    }

    public String exibirLink(){
        this.mostrarLink = true;
        return "index";
    }

    public String esconderLink(){
        this.mostrarLink = false;
        return "index";
    }

    public void calcularCubo(LambdaExpression le, long value){
       long result = (long)
               le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
        System.out.println(result);
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
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
