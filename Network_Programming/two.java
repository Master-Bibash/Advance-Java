
import java.net.URI;



class two{
     public static void main(String[] args) {
        try {
            URI opaqueURI = new URI("mailto:userexample.com");
            URI hierarichialURI = new URI("http://www.example.com");
            URI relativeURI = URI.create("/path/to/resources.html");
            URI myUrl =  URI.create("http://www.facebook.com");
            URI resolvedURi = hierarichialURI.resolve(relativeURI);
            URI relativizeURI = resolvedURi.relativize(relativeURI);
            System.out.println("Resolved URi"+resolvedURi.toString());
            System.out.println("relativizeURI is "+relativizeURI.toString());

        } catch (Exception e) {
          e.printStackTrace();
        }


          }
}