package util;

import java.io.IOException;
import java.util.Base64;

public class EncrptDecrypt {

	public static void main(String[] args) throws Exception {

		System.out.println("data given:" + args[0]);
		String encryptedValue = base64Encode(args[0].getBytes());
		System.out.println("data encrypted:" + encryptedValue);
		String decryptedValue = base64Decode(encryptedValue).toString();
		System.out.println("data decrypted:" + decryptedValue);

	}

	private static String base64Encode(byte[] bytes) {
		return Base64.getEncoder().encodeToString(bytes);
	}

	private static byte[] base64Decode(String property) throws IOException {
		return Base64.getDecoder().decode(property);
	}

}
