package guianamancio.javafunctions;

public class exercise5 {

    public static void main(String[] args) {
        System.out.println("\nCompare and contrast the classic for loop versus foreach. What are the pros and cons of both sides?\n");
        System.out.println("\nAnswer:");
        System.out.println(" a for loop is defined with an boolean expression to indicate when it should terminate. A for each loop iterates once for each item in a collection.\n");
        System.out.println("Pros and Cons");
        System.out.println("The possibility of programming error is eliminated. It makes the code more readable. There is no use of index or rather a counter in this loop.");
        System.out.println("It cannot traverse through the elements in reverse fashion. You cannot skip any element as the concept of index is not there. You cannot choose to traverse to odd or even indexed elements too.");
        System.out.println("The advantage of the for-each loop is that it eliminates the possibility of bugs and makes the code more readable. It is known as the for-each loop because it traverses each element one by one.");
        System.out.println("The disadvantages of the enhanced for loop is that it cannot traverse the elements in reverse order. Here, you do not have the option to skip any element because it does not work on an index basis. Moreover, you cannot traverse the odd or even elements only.");
    }
}
