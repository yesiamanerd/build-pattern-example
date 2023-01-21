import org.example.CodeElement;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeElementTest {
    @Test
    public void testCodeElement() {
        CodeElement ce = new CodeElement("Person", "");
        ce.elements.add(new CodeElement("name", "String"));
        ce.elements.add(new CodeElement("age", "int"));

        String expectedOutput = "public class Person\n{\n  public String name;\n  public int age;\n}";
        assertEquals(expectedOutput, ce.toString());
    }
}

