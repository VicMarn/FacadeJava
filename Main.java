package FacadeCombo;

public class Main {
    public static void main(String[] args) {
        Combo cmb = new Combo("X-Picanha");
        cmb.AddItem(1, "Sobremesa: Sorvete", 5);
        cmb.AddItem(2, "Bebida: Sprite", 3);
        cmb.ListaItensCombo();
        cmb.removerItem();
        System.out.println("\nTroca de bebida, Sprite por guaranĂ¡:");
        cmb.AddItem(3,"Bebida: GuaranĂ¡", 4);
        cmb.ListaItensCombo();
    }
}
