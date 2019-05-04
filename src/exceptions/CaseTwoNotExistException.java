package exceptions;

// для эксепшенов пожалуйста создай соответствующий пакет
public class CaseTwoNotExistException extends Exception {

    private int caseTwo;

    public CaseTwoNotExistException(int caseTwo) {
        this.caseTwo = caseTwo;
    }
<<<<<<< HEAD:src/exceptions/CaseTwoNotExistException.java

    public String getMessage() {
=======
// пожалуйста используй для этого метод getMessage()
    public String getCaseTwo() {
>>>>>>> 97d0f13fdec67333d9ac9ac7b623587ecd2455a9:src/service/CaseTwoNotExistException.java
        return ("[CaseTwoNotExistException]: Case " + caseTwo + " is not supported.\n");
    }

}
