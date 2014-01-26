/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues_reference;

import java.util.*;
/**
 *
 * @author pad
 */
public class queues {
    int queueSize;
    String[] theQueue;
    int queueLength=-1;
    
    queues(int size){
        queueSize=size;
        theQueue=new String[queueSize];
        
        Arrays.fill(theQueue, "-1");
    }
    public void enqueue(String input){
        //if there's still place in the queue Array
        if (queueLength<queueSize){
            queueLength++;
            String[] inputQ=new String[queueSize];
            inputQ[0]=input;
            String[] tempQ=new String[queueSize];
            tempQ=theQueue;

            //theQueue=ArrayUtils.addAll(inputQ, tempQ);
            //merege
            for (int j=1; j<queueSize; j++){
                inputQ[j]=theQueue[j-1];
            }
            theQueue=inputQ;
            displayQueue();
        }else{
            System.out.println("Queue is full");
        }
    }
    
    public void dequeue(){
        //if there's still something in the queue
        if (queueLength>0){
            theQueue[queueLength]="-1";
            queueLength--;
            displayQueue();
        }else{
            System.out.println("Queue is empty");   
        }
    }
    
    public void displayQueue(){
        System.out.println("Content of Queue:");
        for (int i=0; i<queueSize; i++){
            if (theQueue[i]=="-1"){
                System.out.println(i+" |");
            }else{
            System.out.println(i+" | "+theQueue[i]);
            }
        }
    }
}
