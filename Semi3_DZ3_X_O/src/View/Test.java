package View;

public class Test {
    public static void main(String[] args) {

//        char[] testField = {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
//
//        StringBuilder builder = new StringBuilder();
//        builder.append('X').append('X');

//        if(builder.toString().equals("XX")) System.out.println("Da");

//        if(testField[0] == 'X') System.out.println("Da");

        System.out.println(testReturn());

    }

    static String testReturn(){
        StringBuilder builder = new StringBuilder();
        builder.append('X').append('X').append('E');
        String s = "testReturn";
        return "test " + s;
    }
}
