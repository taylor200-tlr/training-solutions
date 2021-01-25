package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {
    private Path path = Path.of("src", "main", "resources", "secret.dat");

    private byte[] fileReader(Path path) {
        byte[] result;
        try {
            result = Files.readAllBytes(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return result;
    }

    public String decodeSecret(byte[] secret) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        for (int i = 0; i < secret.length; i++) {
            secret[i] += 10;
            stringBuilder.append(Character.toString(secret[i]));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Path path = Path.of("src", "main", "resources", "secret.dat");
        Secret secret = new Secret();
        System.out.println(secret.decodeSecret(secret.fileReader(path)) );
    }
}
