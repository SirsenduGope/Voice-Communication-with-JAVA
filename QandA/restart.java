import java.io.*;
class ShutDown{
    public static void main(String args[]) throws IOException {
    	Runtime r = Runtime.getRuntime();
    	r.exec("shutdown -s -t 0");
        System.exit(0);               
    }
}

//public static void shutdown() throws RuntimeException, IOException {
//    String shutdownCommand;
//    String operatingSystem = System.getProperty("os.name");
//
//    if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
//        shutdownCommand = "shutdown -h now";
//    }
//    else if ("Windows".equals(operatingSystem)) {
//        shutdownCommand = "shutdown.exe -s -t 0";
//    }
//    else {
//        throw new RuntimeException("Unsupported operating system.");
//    }
//
//    Runtime.getRuntime().exec(shutdownCommand);
//    System.exit(0);
//}