package Metodos;

import Parametros.*;
public class Botones {

    EscogerPreguntas ep;
    FondoNegro fn ;
    FondoBlanco fb;
    public int i;
    LateralIzq datos;
    private String respuesta;

    public Botones() {
        ep = new EscogerPreguntas();
    }
    
    public Botones(String resp) {
        this.respuesta = resp;
        // fb = new FondoBlanco(this);
    }
    public String getRespuesta() {
        return respuesta;
    }

    public void cambiar () {
        ep.setPreguntas();
        datos = new LateralIzq();
        for (i = 0; i < Constantes.FILAS; i++) {
        }
        System.out.println("\n");
    }

    public void validar () {
        System.out.println("Boton validar Crucigrama");
    }
    public void reiniciar () {
        System.out.println("Boton reiniciar Crucigrama");
    }
    public void guardar () {
        System.out.println("Boton guardar Crucigrama");
    }

    public void hacerAccionB(int i, String resp) {
        fn = new FondoNegro();
        fb = new FondoBlanco();
        switch(i) {
            case 0:
                System.out.println("boton" + resp);
                // respuestas[0].getText()
                // fn.setRespuestas(resp, i+1);
                fb.dividirResp(resp);
                break;
            case 1:
                System.out.println("boton" + resp);
                break;
            case 2:
                System.out.println("boton" + resp);
                break;
            case 3:
                System.out.println("boton" + resp);
                break;
            case 4:
                System.out.println("boton" + resp);
                break;
            case 5:
                System.out.println("boton" + resp);
                break;
            case 6:
                System.out.println("boton" + resp);
                break;
            case 7:
                System.out.println("boton" + resp);
                break;
            case 8:
                System.out.println("boton" + resp);
                break;
            case 9:
                System.out.println("boton" + resp);
                break;
            case 10:
                System.out.println("boton" + resp);
                break;
        }
    }

}