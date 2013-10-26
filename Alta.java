/*
 * 25/10/2013
 * FELLIPE RODRIGUES DE SOUZA
 * FELIPE DA CRUZ
 * RICARDO JOSÉ
 */
package principal;

public class Alta extends Thread{
    public void run(){
        setPriority(Thread.MAX_PRIORITY);
        for(int i=0;i<5;i++){
            System.out.println("Thread de Alta prioridade->10");
            try{
                sleep(100);
            }catch(InterruptedException e){
                System.exit(0);
            }
        }
    }//CLOSE RUN
}//CLOSE CLASS
