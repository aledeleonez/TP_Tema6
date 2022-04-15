public class Tabla {

    public int[][] crearTabla(int min, int max){
        int tabla[][] = new int[10][10];

        for (int x=0; x < tabla.length; x++) {
            for (int y=0; y < tabla[x].length; y++) {
              tabla[x][y] = (int) (Math.random() * (max - min) + min);
            }
        }
        return tabla;
    }

    public int mayorTabla(int tabla[][]){
        int mayor = 0;
        for (int x=0; x < tabla.length; x++) {
            for (int y=0; y < tabla[x].length; y++) {
                if(tabla[x][y] > mayor){
                    mayor = tabla[x][y];
                }
            }
        }
        return mayor;
    }

    public void imprimirTabla(int tabla[][]){
        for (int x=0; x < tabla.length; x++) {
            for (int y=0; y < tabla[x].length; y++) {
              System.out.println(tabla[x][y]);
            }
        }
    }
    
}
