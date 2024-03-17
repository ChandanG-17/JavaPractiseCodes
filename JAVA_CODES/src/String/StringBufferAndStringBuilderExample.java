package String;

public class StringBufferAndStringBuilderExample {
	public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println("StringBuffer Output: " + stringBuffer.toString());

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(" is");
        stringBuilder.append(" awesome");
        System.out.println("StringBuilder Output: " + stringBuilder.toString());
    }
}
