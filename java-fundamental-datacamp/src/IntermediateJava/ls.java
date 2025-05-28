package IntermediateJava;

public class ls {
    static boolean isFile(String elem) {
        return elem.substring(0, 3).contains("/f");
    }

    static boolean isHidden(String elem) {
        return elem.contains(".");
    }

    static boolean isNonLocal(String elem) {
        return elem.substring(3, elem.length()).contains("/");       
    }

    public static void main(String[] args) {
        int hiddenCounter = 0, directoryCounter = 0, nestedCounter = 0;

        for (String elem: DIRECTORY_CONTENT) {
            if (isFile(elem)) {
                if (!isHidden(elem)) System.out.print(elem.substring(2));
                else if (isHidden(elem) && !isNonLocal(elem)) hiddenCounter++;
                else nestedCounter++;
            } else directoryCounter++;
        }
        printer(hiddenCounter, directoryCounter, nestedCounter);
    }
    static String[] DIRECTORY_CONTENT = {"/d .Trash", "/f .history", "/d Applications", "/f tmp", "/f script", "/d Documents", "/f Documents/.bankAccounts", "/f .sshKeys", "/d Pictures", "/f content", "/f Documents/file"};

    static void printer(int hiddenCounter, int directoryCounter, int nestedCounter) {
        System.out.println();
        System.out.println("With : \n" + hiddenCounter + " hidden files, \n" + directoryCounter + " directories, \nAnd " + nestedCounter + " nested files");
    }
}
