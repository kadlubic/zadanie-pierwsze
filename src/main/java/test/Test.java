package test;

import writer.IWriter;

public class Test {
    private IWriter writer;
    private String myName;

    public Test(IWriter writer, String myName)
    {
        this.writer = writer;
        this.myName = myName;
    }

    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Test() {
    }

    public void run(){
        String s = "This is my test, "+ myName;
        writer.writer(s);
    }
}
