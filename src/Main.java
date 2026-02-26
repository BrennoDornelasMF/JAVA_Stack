import java.util.Scanner;

void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.println("contagem de 0 a 100");

   for(int i = 0; i <= 100; i++) {
      System.out.println(i);
   }
 



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

   int u = scanner.nextInt();
   int x = 0;
   for(int i = 0; i <=10; i++) {
      x = u * i;
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
   double b = 0;
   double media = 0;

   while (true){
      int o = scanner.nextInt();
      if (o == 0) break;
      i++;
      b = b + x;
      media = b / i;

   }
   System.out.println(media);


   int t = scanner.nextInt();
   String a ="*";
   for (int c = 1; c <= t; ++c) {
      System.out.print(a.repeat(c));
      System.out.println();
   }

scanner.close();

}
