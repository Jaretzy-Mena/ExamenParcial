import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        System.out.println("Bienvenido al libro de calificaciones");
        System.out.println("Por favor ingrese la cantidad de estudiantes que hay en el grupo");
        int std=lector.nextInt();

        while(std<=0){
            System.out.println("Disculpe no se permiten valores menores o iguales a cero");
            System.out.println("Ingrese la cantidad de estudiantes del grupo");
            std=lector.nextInt();
        }

        int[]notas=new int[std];

        for(int i=0; i<notas.length; i++){

            System.out.print("Nota["+(i+1)+"] = ");
            notas[i]=lector.nextInt();
            
            while(notas[i]<0||notas[i]>100){
                System.out.println("No son valido valores menores a cero ni mayores de cien");
                System.out.println("Por facor vuelva a intentarlo");
                System.out.print("Nota["+(i+1)+"] = ");
                notas[i]=lector.nextInt();
            }

        }        

        for(int i=0;i<notas.length; i++){

            int Reprobados, Regular, Bueno, MuyBueno, Excelente;

            while(notas[i]>=0||notas[i]<=59){
                System.out.println("Reprobados ");

            }
            while(notas[i]>=60||notas[i]<=69){
                System.out.println("Regular ");
                
            }
            while(notas[i]>=70||notas[i]<=79){
                System.out.println("Bueno ");
                
            }
            while(notas[i]>=80||notas[i]<=89){
                System.out.println("Muy bueno ");
                
            }
            while(notas[i]>=90||notas[i]<=100){
                System.out.println("Excelente ");
                
            }
        }

        for(int i=0;i<notas.length; i++){
            System.out.println("Nota "+notas[i]);
        }

        System.out.println("Cantidad de estudiantes ("+std+")");

        lector.close();
    }
}
