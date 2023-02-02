package uia.com.api.inventario.dto;

public class PartidaDTO {

    private Long id;
    private String name;
    private String descripcion;
    private String estatus;
    private String clase;
    private String categoria;

    public PartidaDTO() {
    }

    public PartidaDTO(Long id, String name, String descripcion, String estatus, String clase, String categoria) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.estatus = estatus;
        this.clase = clase;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
