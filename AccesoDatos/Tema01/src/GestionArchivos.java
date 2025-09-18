import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class GestionArchivos {
    boolean crearArchivo(String directorio, String archivo){
        File archv = new File (directorio, archivo);
        Path p = Paths.get(directorio,archivo);
        if(archv.exists()){
            return (false);
        }
        try{
        Files.createFile(p);
        return (Files.exists(p));
        }
        catch(IOException excep){
            return (false);
        }
    }

    void listarDirectorio(String directorio){
    Path p = Paths.get(directorio);
        if (!Files.isDirectory(p)){
            System.out.println("No es un directorio");
            return;
        }
        else {
            try (Stream<Path> lista = Files.list(p)){
                String tipo, permisos;
                for (File pat: lista){
                    if(pat.isDirectory()){
                        tipo= "d";
                    }
                    else if (pat.isFile()){
                        tipo= "f";
                    }


                    System.out.println("Fichero: "+pat.getName()+" "+tipo+" "+ pat.length()+ " bytes "+permisos);

                }
            }
            catch (IOException excep){
                System.out.println(excep.getMessage());
            }
        }
    }
    void verInfo(String directorio, String archivo){}
}
