/** Required functionality
     * 
     * 1) Adding todo items
     * 2) List the todo items
     * 3) Marking a todo item as done
     * 4) Remove a todo item
     * 5) Remove all done todo items
     * 6) Search for todo items
     * 7) Edit todo items
     * 8) Mark todo items as not done
     * 9) XML file loading and saving (bonus)
     * 
     **/
package todolist;

import java.util.ArrayList;
import static todolist.AllFunctions.*;
import static todolist.InputInt.inputInt;





public class TodoList {
     
    static ArrayList<MyItem> list  = new ArrayList<>();
   
    public static void SwitchTest(){
        int choice;
        int i;
        
        System.out.println("Choose: ");
        
        choice = inputInt();
         
     
        
        switch (choice) {
            case 1:                
                addToArray();
                     break;
            case 2:                 
                toList();
                     break;
            case 3:  
                toMark();
                     break;
            case 4:  
                toRemove();
                     break;
            case 5:  
                toRemoveAllDone();
                     break;
            case 6: 
                toSearch();
                     break;
            case 7: 
                toEdit();                
                     break;
            case 8:
                toMarkUndo();
                     break;
            case 9:  
                     break;
            default: 
                System.out.println("Sorry wrong choice");
                     break;
        }
        
        
        
    
        
    }
        
    
    public static void main(String[] args) {
              
      while(true){ 
         
        printMenu();    
        
        SwitchTest();
        
       }
    
   
       
    }

    private static void printMenu() {
             System.out.println("1 - add");
             System.out.println("2 - list");
             System.out.println("3 - mark as done");
             System.out.println("4 - remove");
             System.out.println("5 - remove done items");
             System.out.println("6 - search for undo items");
             System.out.println("7 - edit");
             System.out.println("8 - mark as undo");
             System.out.println("9 - XML");
        
        
    }
        
        
        
    
}
    

