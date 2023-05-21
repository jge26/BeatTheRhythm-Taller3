public class InstrumentoViento {

    private double idInstrumento;
    private double precioInstrumento;
    private String tipoInstrumento;
    private String materialConstruccion;

    public InstrumentoViento(double idInstrumento, double precioInstrumento, String tipoInstrumento, String materialConstruccion) {

        this.idInstrumento = idInstrumento;
        this.precioInstrumento = precioInstrumento;
        this.tipoInstrumento = tipoInstrumento;
        this.materialConstruccion = materialConstruccion;
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
    public String getMaterialConstruccion() {
        return this.materialConstruccion;
    }
    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }
}
