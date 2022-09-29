class juice{
 int a=10;
 //price for the milkshaking = a
   int banana(int banana){
   int bananamilkshake= banana+a;
   System.out.println(bananamilkshake);
   return bananamilkshake;
   }

   int apple(int apple){
   int applemilkshake= apple+a;
   System.out.println(applemilkshake);
   return applemilkshake;
   }

   float oreo(float oreo){
   float oreomilkshake= oreo+a;
   System.out.println(oreomilkshake);
   return oreomilkshake;
   }


 public static void main(String[]args){
 juice nayagra=new juice();
 nayagra.banana(40);
 nayagra.apple(50);
 nayagra.oreo(75.50f);
 }
}
