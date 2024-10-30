import java.io.File;

public class RenombrarDirectorios {
    
    public void RenombrarDirectorios(String path){
        //validemos que el path sea un directorio
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directorio valido");
            return;
        }
        //Aca vamos a cambiar los nombres
        System.out.println("La ruta path es valida");
    }
    public void RenombrarDirectoriosInteros(File directorio){
        // listar todos los archivos y/o carpetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles();
        if (directoriosArchivosInternos == null) {
            return;
        }
        for (File directorioArchivo : directoriosArchivosInternos) {
            if (directorioArchivo.isDirectory()) { // si es carpeta cambio el nombre
                String nombreOriginal = directorioArchivo.getName();
            }
        }
    }
}
