package org.example.CodigoFinal;

public class Carpinteria extends Servicio {
    private boolean isTrabajoEstructural;
    private boolean herramientaPesada;
    public Carpinteria(String id,String descripcion,double duracionHoras,
                      boolean isTrabajoEstructural,boolean herramientaPesada) {
        super(id, descripcion, duracionHoras);
        this.isTrabajoEstructural = isTrabajoEstructural;
        this.herramientaPesada = herramientaPesada;
    }
    public boolean isTrabajoEstructural(){
        return  isTrabajoEstructural;
    }
    public boolean HerramientaPesada(){
        return herramientaPesada;
    }
    @Override
    public double calcularCosto(){
        double costo =60000;
        if(herramientaPesada){
            costo+=15000;
        }
        return costo;
    }


}






