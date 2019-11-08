/** 
@author Christian Escobarete
Assignment: SAK
Credit: Eric Pogue
*/
public class sak {
    public static void main(String[] args) {
        System.out.println("");
        if (args.length < 1) {
            // Process no arguments.
            System.out.println("This application requires at least one argument. Utilize the \"-Help\" parameter for more "
                +"information.");
                
            Help.printHelp();         
        } else if (args[0].equalsIgnoreCase("-Help")) {
            //goess into args and executes help function
            System.out.println("Executing Help...");
            Help.printHelp();
        } else if (args[0].equalsIgnoreCase("-HttpRequest")) {
            //goes into args and gives httrequest function
            System.out.println("Executing HttpRequest...");
            //if there is no URL then it will display it needs the second parameter
            if (args.length < 2) {
                System.out.println("The -HttpRequest function requires a valid URL as the second parameter.");
            } else {
                //reads URL
                String URL = args[1];
                HttpRequest request = new HttpRequest();
                if (request.readURL(URL)) {
                    System.out.println(request);
                }
            }
        //if -HttpRequestIndex does not have second arguement it will display need second parameter
        } else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
            System.out.println("Executing HttpRequestIndex...");
            if (args.length !=2) {
                System.out.println("[[Please enter a URL...]]");
            //will display the URL 
            } else {
                String indexURL = args[1];
                HttpRequestURLs request = new HttpRequestURLs();
                if (request.readURL(indexURL)) {
                    System.out.println(request);
                }
            }
        }
        System.out.println("");
    }
} 