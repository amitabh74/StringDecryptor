
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Decryptor {

	private static String token = "47p+dpG0XJWS0Uzcxi1qjg=="; //"mEbJoIRllYXnEMKND1RmV/iKkIlZiiBJ";
	 private static final String ENCRYPT_KEY = "HG58YZ3CR9";
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		  encryptor.setPassword(ENCRYPT_KEY);
		  encryptor.setAlgorithm("PBEWithMD5AndTripleDES");
		  try{
			  token = encryptor.decrypt(token);
			  System.out.println("decrypted: " + token);
		  }catch(Exception e){
			 
			 e.printStackTrace();
		 }

	}

}
