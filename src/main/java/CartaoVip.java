public class CartaoVip extends Cartao{
    @Override
    public String verificarPerfil() {
        if(this.getCredito() < 5000) {
            return "Cartão Comum";
        } else {
            return "Cartão VIP";
        }
    }
}
