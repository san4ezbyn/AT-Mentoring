package service;

// для эксепшенов пожалуйста создай соответствующий пакет
public class CaseTwoNotExistException extends Exception {

    private int caseTwo;

    public CaseTwoNotExistException(int caseTwo) {
        this.caseTwo = caseTwo;
    }
// пожалуйста используй для этого метод getMessage()
    public String getCaseTwo() {
        return ("[CaseTwoNotExistException]: Case " + caseTwo + " is not supported.\n");
    }

}
