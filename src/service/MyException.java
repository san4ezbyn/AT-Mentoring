package service;

public class MyException extends Exception {

    private int caseTwo;

    public MyException(int caseTwo) {
        this.caseTwo = caseTwo;
            }
            public String getCaseTwo(){
        return ("Case " + caseTwo+ " is not supported.\n");
            }

}