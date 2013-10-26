/*
 * 25/10/2013
 * FELLIPE RODRIGUES DE SOUZA
 * FELIPE DA CRUZ
 * RICARDO JOSÉ
 */
package principal;

public class Normal extends Thread{
    public void run(){
        setPriority(Thread.NORM_PRIORITY);
        for(int i=0;i<5;i++){
            System.out.println("Thread de prioridade normal->5");
            
        }
    }//CLOSE RUN
}//CLOSE CLASS
