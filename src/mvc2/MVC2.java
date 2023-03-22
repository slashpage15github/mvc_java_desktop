package mvc2;
import controlador.CtrlProducto;
import modelo.ConsultasProducto;
import modelo.Producto;
import vista.frmProducto;

public class MVC2 {

    public static void main(String[] args) {
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmProducto frm = new frmProducto();
        
        CtrlProducto ctrl = new CtrlProducto(mod, modC,frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
    
}
