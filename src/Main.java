import java.io.*;

public class Test {
    public boolean copy(InputStream is, OutputStream os) throws IOException{
        int count = 0;
        byte[] buffer = new byte[1024];
        while ((count = is.read(buffer))>=0)
            os.write(buffer,0,count);
        return  true;
    }
    public void copy(String[] a,String[] b,String ending){
        int index;
        String temp = null;
        System.out.println(temp.length());
        int length = a.length;
        for(index = 0;index<a.length;index++){
            if(true){
                if(temp ==ending)
                    break;
                b[index] = temp;
            }
        }
    }
    public void readFile(File file){
        InputStream is =null;
        OutputStream os = null;
        try{
            is = new BufferedInputStream(new FileInputStream(file));
            os = new ByteArrayOutputStream();
            copy(is,os);
            is.close();
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }
    }
}