class Help {
    public static void printHelp() {
        //Welcomes the user and gives examples to use help function, HttpRequest, or HttpRequestIndex
        System.out.println("\nHello welcome to the sandbox(sak) please choose which function you want by copying");
        System.out.println("and pasting the examples in the command line.");
        System.out.println("\nHighlight the arguement you want:");
        System.out.println("To copy arguement: (Ctrl+c)");
        System.out.println("To paste arguement: (Ctrl+v)");
        System.out.println("\nHttpRequest [URL] examples:");
        System.out.println("java sak -HttpRequest https://www.cnn.com");
        System.out.println("java sak -HttpRequest https://sak-cae2.azurewebsites.net/sak-cae2.json");
        System.out.println("\nHttpRequestIndex [URL] example:");
        System.out.println("java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");
    }
}