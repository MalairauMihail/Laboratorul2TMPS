package Proxy;

public class ProxyInternetAccess  implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess  realaccess;
    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }
    @Override
    public void grantInternetAccess()
    {
        if (getRole(employeeName) > 4)
        {
            realaccess = new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
        }
        else
        {
            System.out.println("Nu este permis accesul la internet. Ai nivelul mai mic de 5");
        }
    }
    public int getRole(String emplName) {
        return 4;
    }
}