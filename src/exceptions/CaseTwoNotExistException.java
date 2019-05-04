package exceptions;

public class CaseTwoNotExistException extends Exception {

    private int caseTwo;

    public CaseTwoNotExistException(int caseTwo) {
        this.caseTwo = caseTwo;
    }

    public String getMessage() {

        return ("[CaseTwoNotExistException]: Case " + caseTwo + " is not supported.\n");
    }
}
