class Outer {
    private String outerMessage = "Hello from Outer!";

    private class Inner {
        public String getInnerMessage() {
            return "Hello from Inner! " + outerMessage;
        }
    }

    public String getMessageFromInner() {
        Inner innerObject = new Inner();
        return innerObject.getInnerMessage();
    }
}

public class inner{
    public static void main(String[] args) {
        Outer outerObject = new Outer();
        String message = outerObject.getMessageFromInner();
        System.out.println(message);
    }
}