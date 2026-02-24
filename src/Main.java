//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Array;
import java.util.Scanner;

void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   /**
   System.out.println("contagem de 0 a 100");

   for(int i = 0; i <= 100; i++) {
      System.out.println(i);
   }
   int y =0;



   int p = scanner.nextInt();
   for( int i = 0; i <= p; i+=2) {
      System.out.println(i);

   }

   int r =0;
   int n = scanner.nextInt();
   for(int i = 0;i<=n; i++){
      r += i;
   }
   System.out.println(r);

   int n = scanner.nextInt();
   int x = 0;
   for(int i = 0; i <=10; i++) {
      x = n * i;
      System.out.println(x);
   }


   int senhaCerta = 1234;
   while (true){
      System.out.println("Digite a senha:");
      int senha = scanner.nextInt();
      if (senha ==  senhaCerta){
         System.out.println("Senha valida!");
         break;
      }
      else{
         System.out.println("Senha invalida!");
      }
   }


   System.out.println("Digite os numeros");

   int i = 0;
   double r = 0;
   double media = 0;

   while (true){
      int x = scanner.nextInt();
      if (x == 0) break;
      i++;
      r = r + x;
      media = r / i;

   }
   System.out.println(media);
    **/

   int t = scanner.nextInt();
   String a ="*";
   for (int i = 1; i <= t; ++i) {
      System.out.print(a.repeat(i));
      System.out.println();
   }






}
