public class ejercicioDos {

    public static int i,j;
    public static void main(String args[]) {
        int[] num = new int[20];
        i = 0;
        j = 0;
        System.out.println(" ");
        for (i=0; i <19;i++){
            num[i] = (int)(Math.random()*100);
        }
        i = 0;

        System.out.print("Numeros pares ");
        while(i < 19){
            if (num[i]%2==0){
                System.out.print(num[i]+",");
            }
            i = i + 1;
        }
        System.out.println(" ");
        System.out.print("Numeros impares ");
        while (j < 19){
            if (num[j]%2!=0){
                System.out.print(num[j]+",");
            }
            j = j + 1;
        }
        System.out.println(" ");
    }
}
