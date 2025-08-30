package TDA;

public class Persona {

// Abstracción    
    private String Nombre;
    private String Apellido;
    private float Peso;
    private float Altura;
    
// Constructor
    public Persona(){}

    public Persona(String Nom,
                    String Apl,
                    float Pes,
                    float Alt) 
    {
        this.Nombre = Nom;
        this.Apellido = Apl;
        this.Peso = Pes;
        this.Altura = Alt;
    }
// Encapsulamiento

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
   
}
