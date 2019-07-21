package _05_vault;

public class Bond {
public static void main(String[] args) {
	Vault johnathon = new Vault();
	Bond jimmy = new Bond();
	jimmy.findCode(johnathon);
	System.out.println(jimmy.findCode(johnathon));
}
int findCode(Vault v){
for (int i = 0; i <= 1000000; i++) {

	if (v.tryCode(i)) {
		return i;
	}
}
return -1;
}
}