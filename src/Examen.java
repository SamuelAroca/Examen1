import java.util.*;

//Profe ahi puede ver todos los intentos que hice... pero solo encontre una solucion
public class Examen {

    static int[][] m = {{0,4,0,2,0,0},
                        {4,0,3,0,3,0},
                        {0,3,0,0,0,2},
                        {2,0,0,0,3,0},
                        {0,3,0,3,0,1},
                        {0,0,2,0,1,0}};

    static int[] numPueblos = new int [6];
    static List<Integer> solucion = new ArrayList<>();
    static int sumaDistancia = 0;

    public static void rPueblo(int i, int j){

        numPueblos[i] = 7;

        if (m[i][j] != 0){
            solucion.add(j);
            sumaDistancia += m[i][j]; //Sumatoria de la distancia
        }
        else {
            for (int k = 0; k < 3; k++){
                if (m[i][k] != 0 && numPueblos[k] != 7) {
                    solucion.add(k); // Añadir los pueblos
                    sumaDistancia += m[i][k];//Sumatoria de la distancia
                    rPueblo(k,j);
                }
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduzca el pueblo donde quiere empezar: ");
            int i = scanner.nextInt();
            System.out.println("Introduzca el pueblo donde quiere terminar: ");
            int j = scanner.nextInt();
            
            rPueblo(i,j);

            System.out.println("Recorrido desde el pueblo "+(i)+" Hasta el pueblo "+ (j) +": "+ solucion);
            System.out.println("Distancia recorrida: "+ sumaDistancia);
        }
    }
}

    /*
    List<Integer> solucion = new ArrayList<>();
    int[] a = {0,4,0,2,0,0};
    int[] b = {4,0,3,0,3,0};
    int[] c = {0,3,0,0,0,2};
    int[] d = {2,0,0,0,3,0};
    int[] e = {0,3,0,3,0,1};
    int[] f = {0,0,2,0,1,0};

     */
    /*
    public void print(){
        System.out.println();
        for (int[] ints : m){
            for (int j = 0; j < m.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
     */
    /*
    public void sinbacktracking(int n){
        for (int i = n; i < a.length; i++) {
            if (a[i] != 0){
                solucion.add(a[i]);
                break;
            }
        }
        for (int i = n; i < b.length; i++) {
            if (b[i] != 0){
                solucion.add(b[i]);
                break;
            }
        }
        for (int i = n; i < c.length; i++) {
            if (c[i] != 0){
                solucion.add(c[i]);
                break;
            }
        }
        for (int i = n; i < d.length; i++) {
            if (d[i] != 0){
                solucion.add(d[i]);
                break;
            }
        }
        for (int i = n; i < e.length; i++) {
            if (e[i] != 0){
                solucion.add(e[i]);
                break;
            }
        }
        for (int i = n; i < f.length; i++) {
            if (f[i] != 0){
                solucion.add(f[i]);
                break;
            }
        }
        int sumador = 0;
        for (Integer integer : solucion) {
            sumador += integer;
        }
        System.out.println(solucion);

        System.out.println("La suma de las distancias entre el pueblo 1 al 5 son: " + sumador);

    }

     */
    /*
    public void backtracking(int[][]m, int i, int j){
            int contador = 0;
            if (i != m.length -1 || j != m[i].length -1){
                if (m[i][j] != 0)
                    contador += m[i][j];
                    if (contador != 0)
                        solucion.add(contador);
                    if (j==m[i].length-1){
                        i++;
                        j=0;
                    }else {
                        j++;
                    }
            }
            backtracking(m,i,j);

        int sumador = 0;
        for (Integer integer : solucion) {
            sumador += integer;
        }
        System.out.println(sumador);
        System.out.println(solucion);
    }

     */
    /*
    public void backtracking(int etapa){
        int contador = 0;

        for (int i = 0; i < m.length; i++) {
            if (aceptable(i,etapa)){
                contador += i;
                System.out.println(contador);
                m[i][etapa] = 0;
                if (etapa == m.length - 1){
                    //print();
                }else {
                    backtracking(etapa + 1);
                }
                //m[i][etapa] = 0;
            }else {
                i++;
            }
        }
    }

    public boolean aceptable(int i, int j){

        if (m[i][j] == 0){

            return false;
        }
        return true;
    }
     */
    /*

    public void resolver(){
        //print();
        //sinbacktracking(0);
        //backtracking(2);
    }
    /*
    public static void main(String[] args) {

        Examen examen = new Examen();

        examen.resolver();
    }

     */
//}
