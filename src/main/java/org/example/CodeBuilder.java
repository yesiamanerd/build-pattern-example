package org.example;

public class CodeBuilder
{
    protected CodeElement root;

    public CodeBuilder(String className)
    {
        root = new CodeElement(className, null);
    }

    public CodeBuilder addField(String name, String type) {
        root.elements.add(new CodeElement(name, type));
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}