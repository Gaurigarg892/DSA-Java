class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] == 5){
           int money_5 = 1;
           int money_10 = 0;
           int money_20 =0;

           for(int i=1 ; i< bills.length ; i++ ){
            if(bills[i] == 5){
                money_5 ++;
            }
            else if(bills[i] == 10 &&money_5 >= 1){
                money_5--;
                money_10 ++;
            }
            else if(bills[i] == 20 ){
               if(money_5 >=1 && money_10 >=1){
                money_10 --;
                money_5--;
               }
                else if (money_5 >= 3){
                money_5 = money_5 -3;
               }
               else{
                return false;
               }
            }
            else{
                return false;
            }
           }
        }
        else{
            return false;
        }
        return true;
    }
}