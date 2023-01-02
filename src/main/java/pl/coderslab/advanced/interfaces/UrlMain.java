package pl.coderslab.advanced.interfaces;

public class UrlMain {

    public static void main(String[] args) {
        Url url=new StandardUrl();
        String param = url.getParam("param1", "url_example?param1=99&param2=string");
        System.out.println(param);

        Url extenedUrl=new ExtenedUrl();
        String result=extenedUrl.getParam("param1", "url_example/param1.55/param2.byte");
        String result2=extenedUrl.getParam("param2", "url_example/param1.55/param2.byte");
        System.out.println(result);
        System.out.println(result2);

    }

}
