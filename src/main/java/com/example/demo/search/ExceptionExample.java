package com.example.demo.search;

public class ExceptionExample {
//    public static void method() throws UserException, FileNotFoundException {
//
//        FileReader file = new FileReader("file.text");
//        BufferedReader fileInput = new BufferedReader(file);
//
//
//        throw new UserException("file not found");
//
//    }
    void m() throws UserException {
        throw new UserException("m method");
    }
    void n() throws UserException {
        m();
    }
    void  p(){
        try {
            n();
        } catch (UserException e) {
            System.out.println("try example");
        }
    }
    //main method
    public static void main(String[] args){
        ExceptionExample obj=new ExceptionExample();
//        obj.p();
        // printing the hashcode
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        // calling the garbage collector using gc()
        System.gc();
        System.out.println("End of the garbage collection");
    }
    // defining the finalize method
    protected void finalize()
    {
        System.out.println("Called the finalize() method");
    }
}
