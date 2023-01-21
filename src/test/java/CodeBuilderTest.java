import org.example.CodeBuilder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeBuilderTest {

    @Test
    public void testCodeBuilder() {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");

        String expectedOutput = "public class Person\n{\n" +
                "  public String name;\n" +
                "  public int age;\n" +
                "}";

        assertEquals(expectedOutput, cb.toString());
    }
}
