class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countFive = 0;
        int countTen = 0;
        
        int l = bills.length;
        for(int i=0; i<l; i++){
            if(countFive < 0 || countTen < 0){
                break;
            }
            if(bills[i] == 5){
                countFive += 5;
            }else if(bills[i] == 10){
                countFive -= 5;
                countTen += 10;
            }else if(bills[i] == 20){
                if(countTen>=10){
                    countFive -= 5;
                    countTen -= 10;
                }else if(countFive < 15 || countTen < 10){
                    countFive -= 15;
                    System.out.println(countFive);
                }
            }
        }if(countFive < 0 || countTen < 0){
            return false;
        }else if(countFive >= 0 && countTen >= 0){
            return true;
        }return false;
    }
}
