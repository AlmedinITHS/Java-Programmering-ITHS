package OvningarLecture3Classes.TasksOvningar;

public class ContainerClass {
    public String CompanyName;
    public String adress;
    public String workSpace;

    public ContainerClass(String CompanyName, String adress, String workSpace) {
        this.CompanyName = CompanyName;
        this.adress = adress;
        this.workSpace = workSpace;
    }
    public void printWorkDetails() {
        System.out.println("Company name: " + CompanyName);
        System.out.println("Position: " + adress);
        System.out.println("Workspace: " + workSpace);
    
}

}