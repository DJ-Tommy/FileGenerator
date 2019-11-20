import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public static void main(String[] args) {


    }

    public void createCopyFiles () {

    }

    public void writeFile(String path, String content) {


    }

    public String generateConent() {

        return null;
    }



    public static void WriteSoveraFile(String fileName, String path, String contents) throws IOException {

        BufferedWriter bw = null;

        try {
            String outputFolderPath = "d:\\Java\\File Generator\\Trash" ;
            File folder = new File( String.format("%1$s/Sovera/%2$s/", outputFolderPath, path) );

            if (! folder.exists()) {
                folder.mkdirs();

/*          if (this.rcmdWriter != null)
              this.rcmdWriter.close();
*/
            }

            File file = new File( String.format("%1$s/%2$s", folder.getAbsolutePath(),fileName) );

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                bw = new BufferedWriter(fw);
                bw.write(contents);
                bw.close();
            }
/*      else {
            file.delete();  // want to delete the file??  or just overwrite it??
            file.createNewFile();*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
