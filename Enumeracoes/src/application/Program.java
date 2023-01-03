package application;
import java.util.Date;
import entities.Pedido;
import entities.enums.StatusDoPedido;

public class Program {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        StatusDoPedido os1 = StatusDoPedido.ENVIADO;
        StatusDoPedido os2 = StatusDoPedido.valueOf("ENVIADO");

        System.out.println(os1);
        System.out.println(os2);
    }
}