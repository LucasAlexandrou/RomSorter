import java.util.HashMap;
import java.util.Map;

public class ExtensionMapper {
    public static Map<String, String> getExtensionMap() {
        Map<String, String> map = new HashMap<>();

        //ROMS

        //Gameboy
        map.put("gb", "gb");
        map.put("gbc", "gbc");
        map.put("gba", "gba");

        //NES
        map.put("nes", "nes");
        map.put("fds", "nes");

        //SNES
        map.put("sfc", "snes");
        map.put("smc", "snes");

        //N64
        map.put("n64", "n64");
        map.put("z64", "n64");
        map.put("v64", "n64");
        map.put("u64", "n64");

        //Gamecube
        map.put("gcm", "gc");
        map.put("ciso", "gc");

        //WiiU
        map.put("wua", "wiiu");
        map.put("wux", "wiiu");
        map.put("wud", "wiiu");

        //Switch
        map.put("xci", "switch");
        map.put("nsp", "switch");
        map.put("nca", "switch");

        //Virtual Boy
        map.put("vb", "virtualboy");

        //DS
        map.put("nds", "nds");

        //3DS
        map.put("3ds", "n3ds");
        map.put("cia", "n3ds");
        map.put("cci", "n3ds");

        // PC Engine
        map.put("pce", "pcengine");

        // Pico 8
        map.put("pico8", "pico8");

        //SEGA
        map.put("gg", "gamegear");
        map.put("md", "megadrive");
        map.put("gen", "megadrive");
        map.put("sms", "mastersystem");
        map.put("32X", "sega32x");
        map.put("32x", "sega32x");

        //Atari
        map.put("a26", "atari2600");
        map.put("a52", "atari5200");
        map.put("a78", "atari7800");

        //Neo Geo
        map.put("ngp", "neogeopocket");
        map.put("ngc", "neogeopocketcolor");

        //WonderSwan
        map.put("ws", "wonderswan");
        map.put("wsc", "wonderswancolor");

        //Compressed
        map.put("zip", "Compressed");
        map.put("7z", "Compressed");
        map.put("rar", "Compressed");
        map.put("tar", "Compressed");
        map.put("gz", "Compressed");

        //Disc Based
        map.put("rvz", "Disc-Based");
        map.put("iso", "Disc-Based");
        map.put("bin", "Disc-Based");
        map.put("cue", "Disc-Based");
        map.put("chd", "Disc-Based");

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
