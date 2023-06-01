public class Random {

    private static Random rnd;

    public static Random getInstance(){
        if(rnd == null){
            rnd = new Random();
        }
        return rnd;
    }

    public static void freeInstance(){
        rnd = null;
    }

    private Random(){

    }

    public int random(int max, int min){
        int a =(int)((Math.random() * (max - min)) + min );
        return a;
    }
}


