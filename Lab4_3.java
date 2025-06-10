/*Write a Java program with a Calculator class having multiple constructors:
1)One that takes no arguments and sets values to 0
2)One that takes two arguments and performs addition immediately
3)One that takes three arguments: two numbers and a string for the operation to perform*/

class Calculate{
    int a,b;
    //1
    Calculate(){
        this.a = a;
        this.b = b;
        System.out.println("Values set to 0.");
    }
    //2
    Calculate(int a,int b){
        this.a = a;
        this.b = b;
        int sum = a+b;
        System.out.println("Addition: "+sum);
    }
    //3
    Calculate(int a,int b,String str){
        this.a = a;
        this.b = b;

        switch(str.toLowerCase()){
            case "add":
              System.out.println("Addition: "+(a+b));
              break;
            case "subtract":
              System.out.println("Subtraction: "+(a-b));
              break;
            case "multiply":
              System.out.println("Multiplication: "+(a*b));
              break;
            case "divide":
            if(b!=0){
              System.out.println("Division: "+(a/b));
            }
            else{
              System.out.println("Not determined.");  
            }
              break;
            default:
              System.out.println("Invalid operator.");  
        }
    }
}
public class Constructor {
    public static void main(String[] args){
        Calculate c1 = new Calculate();
        Calculate c2 = new Calculate(5,7);
        Calculate c3 = new Calculate(21,3,"Divide");
    }
}
