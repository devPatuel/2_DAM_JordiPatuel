import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class GestionArchivos {
    boolean crearArchivo(String directorio, String archivo) {
        File archv = new File(directorio, archivo);
        Path p = Paths.get(directorio, archivo);
        if (archv.exists()) {
            return (false);
        }
        try {
            Files.createFile(p);
            return (Files.exists(p));
        } catch (IOException excep) {
            return (false);
        }
    }
}

