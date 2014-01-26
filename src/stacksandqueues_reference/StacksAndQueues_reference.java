/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues_reference;

/**
 *
 * @author pad
 */
public class StacksAndQueues_reference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*stacks myStack=new stacks(10);
        myStack.push("1");
        myStack.push("2");*/
        queues myQueue=new queues(10);
        myQueue.enqueue("1");
        myQueue.enqueue("2");
        myQueue.dequeue();
        myQueue.enqueue("3");
    }
}
