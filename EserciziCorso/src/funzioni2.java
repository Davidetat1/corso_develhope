public class funzioni2 {
    public static void main(String args[]) {
            String fullName = "Davide Tatone";
            System.out.println("la stringa " + fullName + " è lunga " + length(fullName) + " caratteri");
        }
        public static int length(String fullName){
            int stringLength = fullName.length();
            return stringLength;
        }
    }