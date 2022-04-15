public class EsMayor {

    public int devuelveMayor(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    
    public int esMayor(int a, int b){
        if(a > b){
            return 1;
        }if(b > a){
            return 0;
        }
        return -1;
    }


}
