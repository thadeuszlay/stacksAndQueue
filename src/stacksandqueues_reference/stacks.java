/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues_reference;

import java.util.Arrays;

/**
 *
 * @author pad
 */
public class stacks {
    private int stackSize;
    private String[] theStack;
    
    private int topOfStack=-1;
    
    //constructor
    stacks(int size){
        stackSize=size;
        theStack=new String[size];
        
        //fill stack array
        Arrays.fill(theStack, "-1");
    }
//-------------------------------------------
    
    public void push(String input){
        //check whether the stack is full
        if (topOfStack+1<stackSize){
            topOfStack++;
            theStack[topOfStack]=input;
            displayContent();
        }else{
            System.out.println("Stack is full!");
        }
    }
    
    public void pop(){
        //if there is something to delete (=pop)
        if (topOfStack>-1){
            theStack[topOfStack]="-1";
            displayContent();
        }else{
            System.out.println("Nothing to delete");
        }
    }
    
    public void displayContent(){
        System.out.println("Stack content:");
        for (int i=0; i<stackSize; i++){
            if (theStack[i]=="-1"){
                System.out.println(i+" | ");
            }else{
                System.out.println(i+" | "+theStack[i]);
            }
        }
    }
}
