import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class RomScanner {
    public static void scanRoms(File file) {
        Path startPath = file.toPath();
        try (Stream<Path> paths = Files.walk(startPath)) {
            paths.forEach(path -> {
                if (Files.isRegularFile(path)) {
                    String fileName = path.getFileName().toString();
                    System.out.println("Found Rom file: " + fileName);

                    int dotIndex = fileName.lastIndexOf('.');
                    if (dotIndex != -1) {
                        String extension = fileName.substring(dotIndex + 1).toLowerCase();
                        System.out.println("Extension: " + extension);
                    }
                }

            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
