
export function feladat1(szinek){

}

public class Feladat1{
    public int feladat1(String[] szinek){
        int keverheto;
        printf("Adja meg a szineket (piros, kék, zöld, '0' a kilépés):");
        for(int i=1; i != 0){
            int j = 0;
            scanf("%s",&szinek[j]);
            if(szinek[j] == 0){
                i++;
            }
            else{
                j++;
                continue;
            }
        }
        if(szinek.lenght == 1 || szinek.lenght == 0){
            keverheto = 0;
        }
        if(szinek.lenght == 2){
            keverheto = 1;
        }
        if(szinek.lenght == 3){
            keverheto = 4;
        }
        return keverheto;
    }
}
