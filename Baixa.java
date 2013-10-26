/*
 * 25/10/2013
 * FELLIPE RODRIGUES DE SOUZA
 * FELIPE DA CRUZ
 * RICARDO JOSÉ
 */
package principal;

public class Baixa extends Thread{
    public void run(){
        setPriority(Thread.MIN_PRIORITY);
        for(int i=0;i<5;i++){
            System.out.println("Thread de Baixa prioridade->1");
            
        }
    }//CLOSE RUN
}//CLOSE CLASS
