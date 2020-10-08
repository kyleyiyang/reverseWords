public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        String A = "Let's take LeetCode contest";
        System.out.println(A);
        String arr[]= A.split(" ");
        String f="";
        for (String s : arr) {
            char[] ch = s.toCharArray();
            for (int i=0; i<Math.floor(s.length()/2); i++) {
                Character temp = ch[i];
                ch[i] = ch[s.length()-i-1];
                ch[s.length()-i-1] = temp;
            }
            if (s==arr[arr.length-1]) {
                f=f+String.valueOf(ch);
            } else {
                f=f+String.valueOf(ch)+" ";
            }
        }
        System.out.println(f);
     }
}
