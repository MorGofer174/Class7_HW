public class CarFactory {

       public static Drivable getCar (String carType) {

           try {
               if(carType == null){
                   return null;
               }
            if (carType.equalsIgnoreCase("Fiat")) {
                   return new Fiat();
            } else if (carType.equalsIgnoreCase("BMW")) {
                   return new BMW();
            } else if (carType.equalsIgnoreCase("Porche")) {
                   return new Porche();
            }

            } catch (Exception e) {
                    e.printStackTrace();
                }
           return null;
            }}


