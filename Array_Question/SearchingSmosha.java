public class SearchingSmosha {
    public static int SearchingFood(String menus[],String eat){
       // we can only apply here linear searching technique 
       // we can't apply binary search technique beacause data will not sorted here 
       
        for(int i = 0 ;i<= menus.length ;i++){
            if(menus[i] == eat){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String args[]){
        String menus[] = {"Dhosha","chholebathure","momos","samosha","cock","chai & coffee","sandwish"};
        // we want to eat so searching in menu 
        String eat = "samosha";
        // creating a function 

        int index = SearchingFood(menus,eat);
        if(index == -1){
            System.out.println("not found samsosha");
        }
        else{
            System.out.println("found that position in menus at "+index);
        }
    }
}
