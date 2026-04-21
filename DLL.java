/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms1;

/**
 *
 * @author fhad4
 * @param <E>
 */
public class DLL <E> {
    
    DoubleNode head = null;
    DoubleNode tail = null;
    
    public boolean empty(){
    
        return head == null;
    }
    
    public void insertFirst(E data){
    
        DoubleNode newNode = new DoubleNode(data);
        
        if(empty()){
        
            head = tail = newNode;
        }else{
        
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
                    
        }
    }
    
    public void insertLast(E data){
    
        DoubleNode newNode = new DoubleNode(data);
        
        if(empty()){
        
            insertFirst(data);
            return;
        }
        
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
    }
    
    public void insert(E data){
    
        insertLast(data);
    }
    
    public void insertInBetween(E Data, E data1, E data2){

        DoubleNode newNode = new DoubleNode(Data);
        DoubleNode cur = head;
        
        if(empty()){
        
            System.out.println("The list is empty!");
              return;
        }
        
        while(cur.next != null){

           if(cur.data == data1 && cur.next.data == data2){
   
                newNode.next = cur.next;
                newNode.prev = cur;
                cur.next.prev = newNode;
                cur.next = newNode;
                return;
            }
            
            cur = cur.next;
        }
       
            System.out.println("Data not found!");
    }
    
    public void insertAfterNode(E data, E data1){
        
        DoubleNode newNode = new DoubleNode(data);
        DoubleNode cur = head;
         
        if(empty()){
         
             System.out.println("The list is empty!");
               return;
         }
        
        if(head.data == data1){
        
            newNode.next = head.next;
            newNode.prev = head;
            head.next.prev = newNode;
            head.next = newNode;
            return;
        }
        
        if(tail.data == data1){
        
            insertLast(data);
            return;
        }
        
        while(cur != null){
         
             if(cur.data == data1){
             
                 newNode.next = cur.next;
                 newNode.prev = cur;
                 cur.next.prev = newNode;
                 cur.next = newNode;
                 return;
             }
         
             cur = cur.next;
         }
        
         System.out.println("Data not found!");
    }
    
    public void deleteFirst(){
 
        if(empty()){
        
            System.out.println("The list is empty!");
              return;
        }
        
        head = head.next;
    }
    
    public void deleteLast(){
       
        if(empty()){
        
             System.out.println("The list is empty!");
               return;
        }
        
        if(head == tail){
        
            deleteFirst();
            return;
        }
        
        tail.prev.next = null;
    }
    
    public void deleteNode(E data){
        
        DoubleNode cur = head;
        
        if(empty()){
        
             System.out.println("The list is empty!");
               return;
        }
         
        if(head == tail){
         
            deleteFirst();
            return;
         }
         
        if (head.data == data){
         
            deleteFirst();
            return;
         }
         
        if(tail.data == data){
         
            deleteLast();
            return;
         }
        
        while(cur.next != null){
        
            if(cur.next.data == data){
            
                cur.next = cur.next.next;
            }
            
            cur = cur.next;
        }
        
        System.out.println("Data not found!");
    }
    
    public void deleteAfterNode(E data){
        
        DoubleNode cur = head;
        
        if(empty()){
            
            System.out.println("The list is empty!");
        }
        
        if(head == tail){
            
            System.out.println("Only one node!");
        }
        
        while(cur.next != null){
            
            if(cur.data == data){
                
                cur.next.prev = cur;
                cur.next = cur.next.next;
            }
            
            cur = cur.next;
        }
    }
    
    public int countNodes(){
    
        int count = 0;
        DoubleNode cur = head;
        
        if(empty()){
        
            System.out.println("The list is empty!");
        }
        
        while(cur != null){
        
            count++;
            cur = cur.next;
        }
        
        return count;
    }
    
    public void searchNodes(E data){
    
       int count = 0; 
       DoubleNode cur = head;
       
       if(empty()){
       
           System.out.println("The list is empty!");
           return;
       }
       
       while(cur != null){
         
           if(cur.data == data ){
           
               count++;
           }
           
           cur = cur.next;
       }
       
       if(count > 0){
           
            System.out.printf("The value %s was found %d time(s) in the list.\n", data, count);
       }else{
           
            System.out.printf("The value %s was not found in the list.\n", data);
        }
    }
    
    public void displayList(){
    
        int count = 0;
        DoubleNode cur = head;
        
               if(empty()){
       
           System.out.println("The list is empty!");
           return;
       }
               
        while(cur !=  null){
        
            System.out.printf("The element number %d is %s \n", count+1 , cur.data);
            count++;
            cur = cur.next;       
        }
    }
    
    public void dispalyFirst(){
    
        if(empty()){
        
            System.out.println("The list is empty!");
            return;
        }
        
        System.out.println("The first element is " + head.data);
    }
    
    public void displayLast(){
        
        if(empty()){
       
           System.out.println("The list is empty!");
           return;
       }
              
        System.out.println("The last element is " + tail.data);    
    }
    
    public void displayPreSussNode(E data){
    
        DoubleNode cur = head;
        
        if(empty()){
        
            System.out.println("the list is empty!");
            return;
        }
        
        while(cur != null){
    
            if(cur.data == data && cur.prev != null && cur.next != null){
            
                System.out.println("The predecessor is " + cur.prev.data);
                System.out.println("The successor is " + cur.next.data);
                return;
            }
            
            if(cur.data == data && cur.prev != null && cur.next == null){
            
               System.out.println("The predecessor is " + cur.prev.data);
               System.out.println("There is no successor.");
               return;
        } 
         
            if(cur.data == data && cur.prev == null && cur.next != null){
                
             System.out.println("There is no predecessor.");
             System.out.println("The successor is " + cur.next.data);
             return;
        }  
            
            cur = cur.next;
      }
        
        System.out.println("Data not found!");
    }  
    public void displayCount(){
    
        System.out.printf("The number of nodes is %d \n", countNodes());
    }
    
        
    public void ConvertLinkedListToArray(){
        
        DLL dll = new DLL();
        int array[] = new int [dll.countNodes()];
        DoubleNode cur = head;
        int i = 1;
   
        while(cur != null){
            
            array[i] = (int) cur.data;
            System.out.println(array[i]);
            i++;
            cur = cur.next;         
        }
    }
    
    public void sumRecursion(){
    
        System.out.println(sumRecursion(head));
    }
    
    private int sumRecursion(DoubleNode num){
        
        if(num == null){
        
            return 0;
        }
        
        return (int) num.data + sumRecursion(num.next);
    }
    
    
    public void maxRecursion(){
        
        System.out.println(maxRecursion(head));
    } 
        
    private int maxRecursion(DoubleNode num){
        
        if(num.next == null){
            
            return (int)num.data;
        }
      
        if((int)num.data > maxRecursion(num.next)){
            
           return (int)num.data;
        }else{
            
            return maxRecursion(num.next);
        }
    }
    
    public void searchRecursion(int data){
    
        System.out.println(searchRecursion(head, data));
    }
    
    private String searchRecursion(DoubleNode num, int data){
    
        if(num == null){
        
            return "The value was not found in the list!";
        }
        
        if((int)num.data == data){
        
            return "The value exists in the list!";
        }
        
        return searchRecursion(num.next, data);
    }
    
    public void search5and6Recursion(){
        
       search5and6Recursion(head);
    }
    
    private void search5and6Recursion(DoubleNode num){
        
        if(num == null){
 
            return;
        }
        
        if((int)num.data % 5 == 0 || (int)num.data % 6 == 0){
            
            System.out.println(num.data);
        }
        
         search5and6Recursion(num.next);
    }
}
