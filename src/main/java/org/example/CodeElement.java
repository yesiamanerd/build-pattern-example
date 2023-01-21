package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class CodeElement {
    public String name, type;
    public ArrayList<CodeElement> elements = new ArrayList<CodeElement>();
    private final int indentSize = 2;
    private final String newLine = "\n";

    public CodeElement(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    private String toStringImpl(int indent)
    {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("public class %s%s{%s", name, newLine, newLine));

        for (CodeElement e : elements) {
            sb.append(String.join("", Collections.nCopies((indent + 1) * indentSize, " ")));
            sb.append(String.format("public %s %s;%s", e.type, e.name, newLine));
        }

        sb.append(String.format("%s}", i));
        return sb.toString();
    }

    public String toString()
    {
        return toStringImpl(0);
    }
}
