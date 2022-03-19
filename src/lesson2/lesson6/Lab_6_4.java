package lesson2.lesson6;
public class Lab_6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String[] subUrl = url.split(":");
        String protocol = subUrl[0];
        System.out.println("Protocol is: " +protocol);
        String domain = subUrl[1];
        String[] dom = domain.split("[.]");
        String domainName = dom[0].substring(2);
        System.out.println("Domain name is: " +domainName);
        System.out.println("subDomain is: " + dom[1]);
    }
}
