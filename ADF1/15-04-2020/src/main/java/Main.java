public class Main {
    public static void main(String [] args) {
        System.out.println("Luyen tap Regex va stream");
        FileManager fileManager = new FileManager();
        fileManager.readEmails();
        StreamExample streamExample = new StreamExample();
        streamExample.sortData();
        streamExample.filterData();
    }
}
