public class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder example = new StringBuilder("I am mutable!");
        example.append(" add this");
        example.insert(5, "add here ");
        example.setCharAt(23, 'A');
        example.delete(3,8);
        example.setCharAt(16, '?');
        example.deleteCharAt(7);
        example.replace(18, 20, "ll");
        System.out.println(example);
    }
}
