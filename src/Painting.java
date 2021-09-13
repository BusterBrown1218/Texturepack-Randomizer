import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Random;

public class Painting {
    public Painting() {
        //Creating a File object for directory
        File directoryPath = new File("./assets/minecraft/textures/painting");
        //Creating filter for directories files
        FileFilter fileFilter = new FileFilter(){
            public boolean accept(File dir) {
                if (dir.isFile()) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        int i = 0;
        File[] list = directoryPath.listFiles(fileFilter);
        ArrayList fixedList = new ArrayList();
        //Getting a list of files without .mcmeta
        System.out.println("Randomizing paintings!");
        for(File fileName : list) {
            if (!fileName.toString().contains(".mcmeta")) {
                fixedList.add(fileName.getName());
                fileName.renameTo(new File("./assets/minecraft/textures/painting/" + i + ".png"));
                i++;
            }
        }

        Random rand = new Random();
        int upperbound = fixedList.size();
        int rand_int;
        int size = fixedList.size();
        for(int counter = 0; counter < size; counter++) {
            File renameBack = new File("./assets/minecraft/textures/painting/" + counter + ".png");
            rand_int = rand.nextInt(upperbound);
            File rename = new File("./assets/minecraft/textures/painting/" + fixedList.get(rand_int));
            renameBack.renameTo(rename);
            fixedList.remove(rand_int);
            upperbound = fixedList.size();
        }
    }
}
