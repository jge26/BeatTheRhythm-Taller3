public class InstrumentoPercusion {

    private double idInstrumento;
    private double precioInstrumento;
    private String tipoInstrumento;
    private String tipoPercusion;
    private String materialConstruccion;
    private double alturaInstrumento;

    public InstrumentoPercusion(double idInstrumento, double precioInstrumento, String tipoInstrumento, String tipoPercusion, String materialConstruccion, double alturaInstrumento) {

        this.idInstrumento = idInstrumento;
        this.precioInstrumento = precioInstrumento;
        this.tipoInstrumento = tipoInstrumento;
        this.tipoPercusion = tipoPercusion;
        this.materialConstruccion = materialConstruccion;
        this.alturaInstrumento = alturaInstrumento;
    }
    public double getIdInstrumento() {
        return  this.idInstrumento;
    }
    public void  setIdInstrumento(double idInstrumento) {
        this.idInstrumento = idInstrumento;
    }
    public double getPrecioInstrumento() {
        return  this.precioInstrumento;
    }
    public void  setPrecioInstrumento(double precioInstrumento) {
        this.precioInstrumento = precioInstrumento;
    }
    public String getTipoInstrumento() {
        return this.tipoInstrumento;
    }
    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    public String getTipoPercusion() {
        return this.tipoPercusion;
    }
    public void setTipoPercusion(String tipoPercusion) {
        this.tipoPercusion = tipoPercusion;
    }
    public String getMaterialConstruccion() {
        return this.materialConstruccion;
    }
    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }
    public double getAlturaInstrumento() {
        return this.alturaInstrumento;
    }
    public void setAlturaInstrumento(double alturaInstrumento) {
        this.alturaInstrumento = alturaInstrumento;
    }
}
