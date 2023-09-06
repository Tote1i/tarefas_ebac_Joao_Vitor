public class Customer {
    private String gradeRequest;
    private boolean hasCompanyContract;

    //  Construtor
    public Customer(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }


    public String getGradeRequest() {
        return gradeRequest;
    }

    public boolean HasCompanyContract() {
        return hasCompanyContract;
    }
}
