package TDA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la base de datos: ");
        int max = sc.nextInt();
        boolean conti = true;
        Vector v = new Vector(max);

        do {
            byte opcion;
            System.out.println("Bienvenido a la base de datos de empleados");
            System.out.println("");
            System.out.println("1. Insertar.");
            System.out.println("2. Mostrar el Vector.");
            System.out.println("3. Buscar.");
            System.out.println("4. Eliminar.");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextByte();

            switch (opcion) {
                case 1:
                    Persona p1 = new Persona();
                    System.out.println("Ingrese los datos de la persona a ingresar");
                    System.out.println("");
                    System.out.println("Nombre: ");
                    String nombre = sc.next();
                    p1.setNombre(nombre);
                    System.out.println("Apellido: ");
                    String apellido = sc.next();
                    p1.setApellido(apellido);
                    System.out.println("Peso: ");
                    float peso = sc.nextFloat();
                    p1.setPeso(peso);
                    System.out.println("Altura: ");
                    float altura = sc.nextFloat();
                    p1.setAltura(altura);

                    v.Insertar(p1);
                    System.out.println("Usuario ingresado correctamente");
                    break;

                case 2:
                    System.out.println("El vectór tiene los siguientes campos: ");
                    System.out.println("");
                    v.MostrarVector();
                    break;

                case 3:
                    System.out.println("Busqueda por NOMBRE");
                    System.out.println("¿A quien desea buscar? ");
                    String nombreB = sc.next();
                    v.BuscarPersona(nombreB);
                    break;

                case 4:
                    System.out.println("Busqueda por NOMBRE");
                    System.out.println("¿A quien desea Eliminar? ");
                    String nombreE = sc.next();
                    int l = v.BuscarPersona(nombreE);
                    System.out.println("¿Seguro que desea elminar a " + nombreE + " ? (s/n): ");
                    String opsE = sc.next();

                    if (l!=-1 && opsE.equals("s")) {
                        v.Eliminar(l);
                        System.out.println(nombreE + " eliminado correctamente");
                    }else if (l==-1 && opsE.equals("s")){
                        System.out.println("No se a encontrado a la persona");
                    }
                    break;
                case 5:
                    System.out.println("¡Gracias por usar la base de datos!");

                default:
                    throw new AssertionError();
            }

            if (conti) {
                System.out.println("¿Desea realizar otra acción? (s/n): ");
                String rs = sc.next();

                if (rs.equals("n")) {
                    conti = false;
                    System.out.println("¡Gracias por usar la base de datos!");
                }
            }

        } while (conti);
        sc.close();
    }

}
