package Task1;

public class HelloWorld {
    public static void main(String[]args){
        StringBuilder builder = new StringBuilder();
        int quantity = 0;
        String greeting;

        for(int i = 0;i < 100;i++){
            builder.append("Hello World ").append(i+1).append("\n");
            quantity = i;

        }

        greeting = builder.toString();

        System.out.format("%s times of Hello World are \n",quantity+1);
        System.out.println(greeting);

    }
}

