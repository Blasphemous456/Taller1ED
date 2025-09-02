package TDA;

public class Vector {

    private int max;
    private int Indice;
    private Persona[] VectorPersona;

    public Vector(int max) {
        this.max = max;
        this.Indice = -1;
        this.VectorPersona = new Persona[max];
    }

    public boolean VectorVacio() {
        if (this.Indice == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean VectorLleno() {
        if (this.Indice == this.max - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void Insertar(Persona P) {
        if (!VectorLleno()) {
            Indice++;
            VectorPersona[this.Indice] = P;
        } else {
            System.out.println("¡El Vector esta lleno!");
        }
    }

    public void MostrarVector(){
        if(!VectorVacio()){
            for (int i = 0; i <= this.Indice; i++) {
                System.out.println("Nombre: "+this.VectorPersona[i].getNombre()+
                                   ", Apellido: "+this.VectorPersona[i].getApellido()+
                                   ", Peso: "+this.VectorPersona[i].getPeso()+
                                   ", Altura: "+this.VectorPersona[i].getAltura());
                System.out.println("");
            }
        }else{
            System.out.println("El vector esta vacio");
        }
    }
    
    public int BuscarPersona(String Nombre) {
        if (!VectorVacio()) {
            int i = 0;
            boolean encontrado = false;
            while (i <= this.Indice && !encontrado) {
                if (this.VectorPersona[i].getNombre().equalsIgnoreCase(Nombre)) {
                    System.out.println("Se encontro a " + Nombre +" en la posición: " + i );
                    encontrado = true;
                    return i;
                } else {
                    i++;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontro a la persona");
            }
        }
        return -1; //No encontrado
    }

    public void Eliminar(int Posicion) {
        if (!VectorVacio() && Posicion >= 0 && Posicion <= this.Indice) {
            for (int i = Posicion; i < this.Indice; i++) {
                this.VectorPersona[i] = this.VectorPersona[i + 1];
            }
        } else {
            System.out.println("Posición invalida o vectór vacío");
        }
    }

    public int getMax() {
        return max;
    }

    public int getIndice() {
        return Indice;
    }
    
    public Persona[] getVectorPersona() {
        return VectorPersona;
    }

}
