import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class RomScanner {
    public static void scanRoms(File file) {
        Path startPath = file.toPath();
        HashMap<String, List<Path>> romsMap = new HashMap<>();

        //Max depth of 1 to avoid sorting any already sorted roms/files
        try (Stream<Path> paths = Files.walk(startPath,1)) {
            paths.forEach(path -> {
                if (Files.isRegularFile(path)) {
                    String fileName = path.getFileName().toString();
                    System.out.println("Found Rom file: " + fileName);

                    int dotIndex = fileName.lastIndexOf('.');
                    if (dotIndex != -1) {
                        String extension = fileName.substring(dotIndex + 1).toLowerCase();
                        System.out.println("Extension: " + extension);
                        // If that extension was not already in the map create a new array list
                        if (!romsMap.containsKey(extension)) {
                            romsMap.put(extension, new ArrayList<>());
                        }
                        // If that extension was already in the map add the file to it
                        romsMap.get(extension).add(path);
                    }
                }
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Sorter.sortRoms(romsMap, startPath);
    }
}
