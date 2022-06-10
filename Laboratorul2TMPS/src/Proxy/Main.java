package Proxy;

public class Main {
    public static void main(String[] args)
    {
        OfficeInternetAccess access = new ProxyInternetAccess("Sorin Tolocica");
        access.grantInternetAccess();
    }
}
