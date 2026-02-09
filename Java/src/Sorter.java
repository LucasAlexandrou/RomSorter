import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;


public class Sorter {
    public static void sortRoms(Map<String, List<Path>> romsMap, Path startPath) {
        System.out.println("--------------------------------");
        System.out.println("Sorting files by extension...");

        Map<String, String> extensionMap = ExtensionMapper.getExtensionMap();
        int totalMoved = 0;
        int totalFailed = 0;

        for(String extension : romsMap.keySet()) {
            //System.out.println(extension + " : " + romsMap.get(extension));
            List<Path> files = romsMap.get(extension);

            String folderName = extensionMap.get(extension);
            Path targetFolder = startPath.resolve(folderName);

            try {
                if (!Files.exists(targetFolder)) {
                    Files.createDirectories(targetFolder);
                    System.out.println("Creating directory " + targetFolder);
                } else {
                    System.out.println("Directory " + targetFolder + " already exists");
                }

                for (Path file : files) {
                    Path targetPath = targetFolder.resolve(file.getFileName());

                    try {
                        Files.move(file, targetPath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Moved file " + file.getFileName() + " to " + folderName);
                        totalMoved++;
                    } catch (IOException e) {
                        System.out.println("Failed to move file " + file.getFileName() + " to " + folderName);
                        totalFailed++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Could not create directory " + folderName + ": " + e.getMessage());
                totalFailed += files.size();
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Sorting complete.");
        System.out.println("Files moved successfully: " + totalMoved);
        System.out.println("Files failed to move: " + totalFailed);
    }
}
