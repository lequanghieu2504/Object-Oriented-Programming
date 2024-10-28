package GUI;

import DTO.Item;
import DTO.ItemList;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class AntiqueShop {

    public static void main(String[] args) {
        ItemList obj = new ItemList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of vase items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. exit");
            System.out.println("input your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Item tmp = new Vase();
                    tmp.Input();
                    if (obj.addItem(tmp)) {
                        System.out.println("added");
                    }
                    break;
                case 2:
                    Item tmp2 = new Statue();
                    tmp2.Input();
                    if (obj.addItem(tmp2)) {
                        System.out.println("added");
                    }
                    break;
                case 3:
                    Item tmp3 = new Painting();
                    tmp3.Input();
                    if (obj.addItem(tmp3)) {
                        System.out.println("added");
                    }
                    break;
                case 4:
                    obj.displayAll();
                    break;
                case 5:
                    sc = new Scanner(System.in);
                    System.out.println("Input a creator:");
                    String creator = sc.nextLine();
                    Item item = obj.findItem(creator);
                    if(item==null){
                        System.out.println("Can not find this creator!");
                    }else{
                        System.out.println(item);
                    }
                    break;
                case 8:
                    obj.displayItemsByType("Vase");
                    break;
            }
        }while (choice <= 9);            //end whileDF
    }
}