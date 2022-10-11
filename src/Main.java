public class Main {
    public static void main(String[] args) {
boolean sucsess = Data.validate("test","test","tаest");
if(sucsess){
    System.out.println("Данные верны!");
}else{
    System.out.println("Данные не верны!");
}
    }
}