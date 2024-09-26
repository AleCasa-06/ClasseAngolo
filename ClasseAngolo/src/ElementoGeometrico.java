public abstract class ElementoGeometrico {
    private String nome;
    private String unitaMisura;



    public ElementoGeometrico(String nome, String unitaMisura) {
        this.nome = nome;
        this.unitaMisura = unitaMisura;
    }

    public void stampa(){
        System.out.println("Nome: " + nome);
    }
}
