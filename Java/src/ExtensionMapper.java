import java.util.HashMap;
import java.util.Map;

public class ExtensionMapper {
    public static Map<String, String> getExtensionMap() {
        Map<String, String> map = new HashMap<>();

        //ROMS
        map.put("gb", "gb");
        map.put("gbc", "gbc");
        map.put("gba", "gba");

        map.put("nes", "nes");
        map.put("sfc", "snes");

        map.put("vb", "virtualboy");

        map.put("nds", "nds");

        map.put("pce", "pcengine");

        map.put("pico8", "pico8");

        map.put("gg", "gamegear");
        map.put("md", "megadrive");

        map.put("ws", "wonderswan");
        map.put("wsc", "wonderswancolor");

        //Compressed
        map.put("zip", "Compressed");
        map.put("7z", "Compressed");

        //Disc Based
        map.put("iso", "Disc-Based");
        map.put("bin", "Disc-Based");
        map.put("cue", "Disc-Based");

        //Music
        map.put("mp3", "music");
        map.put("flac", "music");
        map.put("aac", "music");
        map.put("aiff", "music");
        map.put("wav", "music");

        //Images
        map.put("png", "images");
        map.put("jpg", "images");
        map.put("jpeg", "images");
        map.put("gif", "images");
        map.put("bmp", "images");

        //Videos
        map.put("mp4", "videos");
        map.put("avi", "videos");
        map.put("mov", "videos");
        map.put("mkv", "videos");


        return map;
    }
}
