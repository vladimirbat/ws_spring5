import org.springframework.security.crypto.password.StandardPasswordEncoder;


public class Encoder {
public static void main(String[] args) {
	StandardPasswordEncoder enc = new StandardPasswordEncoder();
	String s = enc.encode("mariano");
	System.out.println(s);
}
}
