public class Comparendo {

    private Carro carro;
    private Mula mula;
    private Camion camion;
    private String TipoVehiculo;

    public Comparendo(Carro carro, Mula mula, Camion camion) {
        this.carro = new Carro(85,66,85);
        this.mula = new Mula(95,92,110);
        this.camion = new Camion(75,76,95);
    }


    public Comparendo(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public Comparendo() {
    }


    public String CalcularFotomultas (String TipoVehiculo, int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior){
        if(TipoVehiculo == TipoVehiculo) {
            if(velocidad<=limiteInferior) {
                return 0;
            }else if (velocidad >=limiteInferiorIntermedio && velocidad<=limiteSuperior) {
                return 1;
            }
            return 2;
        }
    }

//    public void construirFotoMulta(int velocidad, Carro carro) {
//        int calculoComparendo = calcularComparendo(velocidad, carro);
//        String correo = enviarCorreoFotomulta(vehiculo);
//        if(calculoComparendo == -1){
//            System.out.println("no hay calculo para el tipo de vehiculo" + carro + "corre: " + correo);
//        }else {
//            System.out.println("----el tipo de comparendo es: " + calculoComparendo + " ----cuerpo del correo" + correo);
//        }
//
//    }

    public int calcularComparendo(int velocidad, String vehiculo) {

        if(vehiculo == "CARRO") {
            if(velocidad<=limiteInferior) {
                return 0;
            }else if (velocidad >=limiteInferiorIntermedio && velocidad<=limiteSuperior) {
                return 1;
            }
            return 2;
        }

        if(vehiculo == "CAMION") {
            if(velocidad<=limiteInferior) {
                    return 0;
                }else if (velocidad >=limiteInferiorIntermedio && velocidad<=limiteSuperior) {
                    return 1;
                }
                return 2;
        }

        if(vehiculo == "MULA") {
            if(velocidad<=limiteInferior) {
                return 0;
            }else if (velocidad >=limiteInferiorIntermedio && velocidad<=limiteSuperior) {
                return 1;
            }
            return 2;
        }

        return -1;
    }




    public String enviarCorreoFotomulta(String vehiculo) {

        if(vehiculo == "CAMION") {
            String cuerpoMensaje = "//enviando correo para el tipo camion.";
            String asunto = "//asunto: comparendo camion";
            return   asunto + cuerpoMensaje;
        }else if(vehiculo == "CARRO") {
            String cuerpoMensaje = "//enviando correo para el tipo carro.";
            String asunto = "//asunto: comparendo carro";
            return   asunto + cuerpoMensaje;
        }else if(vehiculo == "MULA") {
            String cuerpoMensaje = "//enviando correo para el tipo mula.";
            String asunto = "//asunto: comparendo mula";
            return   asunto + cuerpoMensaje;
        } else {
            return "enviando correo con vehiculo desconocido";
        }
    }

}
