package Dominio;
import android.content.Context;

import Persistencia.PerUsuarioPrivado;
/**
 * Created by cristian castro on 04/08/2016.
 */
public class UsuarioPrivado extends Persona {
    private int IdUPRIV;
    public Context context;

    public int getIdUPRIV() {
        return IdUPRIV;
    }

    public void setIdUPRIV(int idUPRIV) {
        IdUPRIV = idUPRIV;
    }

    public UsuarioPrivado(int pÌdUPRIV,String pUsuarioU,String  pContraseñaU,String  pNombreU,String  pApellidoU) {
        super(pUsuarioU, pContraseñaU, pNombreU, pApellidoU);
        this.IdUPRIV = pÌdUPRIV;
    }
    public UsuarioPrivado(){}

    public UsuarioPrivado SeleccionarEspecifica(UsuarioPrivado up,Context pContext)
    {
        PerUsuarioPrivado Pp = new PerUsuarioPrivado(pContext);
        return Pp.SeleccionarEspecifica(up);
    }

}
