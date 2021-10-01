package FacadeCombo;

import java.util.ArrayList;
import java.util.List;

public class OrganizaCombo {
    int j;
    Item I;
    List<Item> ListaItens = new ArrayList<Item>();
    private String PratoPrincipal;

    OrganizaCombo(String PratoPrincipal){
        this.PratoPrincipal=PratoPrincipal;

    }
    public void Adicionar(int codigo, String descricao, double preco){
        I = new Item();
        I.setCodigo(codigo);
        I.setDescricao(descricao);
        I.setPreco(preco);
        ListaItens.add(I);
    }
    public void MostraItens(){
        System.out.println("Prato Principal: " + PratoPrincipal);
        for(j=0;j<ListaItens.size();j++){
            System.out.println(ListaItens.get(j).getDescricao());
        }
    }
    public void Remover(){
        ListaItens.remove(1);
    }

    public String getPratoPrincipal() {
        return PratoPrincipal;
    }
}
