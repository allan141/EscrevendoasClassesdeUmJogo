class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;

        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "ataque desconhecido";
                break;
        }

        System.out.println("o " + tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Gandalf", 150, "Mago");
        Heroi heroi2 = new Heroi("Aragorn", 87, "Guerreiro");
        Heroi heroi3 = new Heroi("Li", 35, "Monge");
        Heroi heroi4 = new Heroi("Kira", 25, "Ninja");

        heroi1.atacar();  System.out.println("O Mago atacou usando magia");
        heroi2.atacar();  System.out.println("O Guerreiro atacou usando espada");
        heroi3.atacar();  System.out.println("O Monge atacou usando artes marciais");
        heroi4.atacar();  System.out.println("O Ninja atacou usando shuriken");

    }
}
