package FacadeCombo;

public class Combo {

    OrganizaCombo OC;

    Combo(String PratoPrincipal ){
        OC = new OrganizaCombo(PratoPrincipal);
    }
    public void AddItem(int codigo, String descricao, double preco){
        OC.Adicionar(codigo,descricao,preco);
    }
    public void ListaItensCombo(){
        OC.MostraItens();
    }

}
