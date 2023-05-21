public class InstrumentoCuerda {

    private double idInstrumento;
    private double precioInstrumento;
    private String tipoInstrumento;
    private String tipoCuerdas;
    private  int cantCuerdas;
    private String materialConstruccion;
    private String tipoSonido;

    public InstrumentoCuerda(double idInstrumento, double precioInstrumento, String tipoInstrumento, String tipoCuerdas, int cantCuerdas, String materialConstruccion, String tipoSonido) {

        this.idInstrumento = idInstrumento;
        this.precioInstrumento = precioInstrumento;
        this.tipoInstrumento = tipoInstrumento;
        this.tipoCuerdas = tipoCuerdas;
        this.cantCuerdas = cantCuerdas;
        this.materialConstruccion = materialConstruccion;
        this.tipoSonido = tipoSonido;
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
    public String getTipoCuerdas() {
        return  this.tipoCuerdas;
    }
    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
    public int getCantCuerdas() {
        return  this.cantCuerdas;
    }
    public void setCantCuerdas(int tipoCuerdas) {
        this.cantCuerdas = cantCuerdas;
    }
    public String getMaterialConstruccion() {
        return  this.materialConstruccion;
    }
    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }
    public String getTipoSonido() {
        return  this.tipoSonido;
    }
    public void setTipoSonido(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }
}
