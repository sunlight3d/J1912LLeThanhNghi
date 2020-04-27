/*
Assert hay dung trong viet test case, bieu thuc trong assert la false, chuong trinh dung lai, ko chay tiep
"C:\Program Files\Java\jdk-13.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.3.1\lib\idea_rt.jar=58293:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\Documents\code\J1912LLeThanhNghi\ADF2\27-04-2020\target\classes;C:\Users\User\.m2\repository\org\apache\maven\plugins\maven-compiler-plugin\3.8.1\maven-compiler-plugin-3.8.1.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-plugin-api\3.0\maven-plugin-api-3.0.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-model\3.0\maven-model-3.0.jar;C:\Users\User\.m2\repository\org\sonatype\sisu\sisu-inject-plexus\1.4.2\sisu-inject-plexus-1.4.2.jar;C:\Users\User\.m2\repository\org\sonatype\sisu\sisu-inject-bean\1.4.2\sisu-inject-bean-1.4.2.jar;C:\Users\User\.m2\repository\org\sonatype\sisu\sisu-guice\2.1.7\sisu-guice-2.1.7-noaop.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-artifact\3.0\maven-artifact-3.0.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-utils\2.0.4\plexus-utils-2.0.4.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-core\3.0\maven-core-3.0.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-settings\3.0\maven-settings-3.0.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-settings-builder\3.0\maven-settings-builder-3.0.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-repository-metadata\3.0\maven-repository-metadata-3.0.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-model-builder\3.0\maven-model-builder-3.0.jar;C:\Users\User\.m2\repository\org\apache\maven\maven-aether-provider\3.0\maven-aether-provider-3.0.jar;C:\Users\User\.m2\repository\org\sonatype\aether\aether-impl\1.7\aether-impl-1.7.jar;C:\Users\User\.m2\repository\org\sonatype\aether\aether-spi\1.7\aether-spi-1.7.jar;C:\Users\User\.m2\repository\org\sonatype\aether\aether-api\1.7\aether-api-1.7.jar;C:\Users\User\.m2\repository\org\sonatype\aether\aether-util\1.7\aether-util-1.7.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-interpolation\1.14\plexus-interpolation-1.14.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-classworlds\2.2.3\plexus-classworlds-2.2.3.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-component-annotations\1.5.5\plexus-component-annotations-1.5.5.jar;C:\Users\User\.m2\repository\org\sonatype\plexus\plexus-sec-dispatcher\1.3\plexus-sec-dispatcher-1.3.jar;C:\Users\User\.m2\repository\org\sonatype\plexus\plexus-cipher\1.4\plexus-cipher-1.4.jar;C:\Users\User\.m2\repository\org\apache\maven\shared\maven-shared-utils\3.2.1\maven-shared-utils-3.2.1.jar;C:\Users\User\.m2\repository\commons-io\commons-io\2.5\commons-io-2.5.jar;C:\Users\User\.m2\repository\org\apache\maven\shared\maven-shared-incremental\1.1\maven-shared-incremental-1.1.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-java\0.9.10\plexus-java-0.9.10.jar;C:\Users\User\.m2\repository\org\ow2\asm\asm\6.2\asm-6.2.jar;C:\Users\User\.m2\repository\com\thoughtworks\qdox\qdox\2.0-M8\qdox-2.0-M8.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-compiler-api\2.8.4\plexus-compiler-api-2.8.4.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-compiler-manager\2.8.4\plexus-compiler-manager-2.8.4.jar;C:\Users\User\.m2\repository\org\codehaus\plexus\plexus-compiler-javac\2.8.4\plexus-compiler-javac-2.8.4.jar Main x 10
* */
public class Main {
    public static void main(String[] args) {
//        System.out.println("arguments[0] = "+args[0]);
//        System.out.println("arguments[1] = "+args[1]);
        System.out.println("haha");
        Calculation calculation = new Calculation();
        //calculation.doSomething();
        try {
            calculation.doSomething2(9);
        }catch (SoNayDangGhetException e) {
            System.err.println("ko the tinh dc. Error: "+e.toString());
        } finally {
            System.out.println("I am here");
        }

    }
}
