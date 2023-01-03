package entities;
import java.util.Date;
import entities.enums.StatusDoPedido;

public class Pedido {

    private Integer id;
    private Date moment;
    private StatusDoPedido status;

    public Pedido() {
    }

    public Pedido(Integer id, Date moment, StatusDoPedido status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido [id="
                + id
                + ", moment="
                + moment
                + ", status="
                + status
                + "]";
    }
}