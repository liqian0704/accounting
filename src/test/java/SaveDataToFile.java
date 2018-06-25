import java.io.*;

/**
 * 把控制台输入的数据保存到一个文件里，实现数据持久化
 * Created by yp-tc-2646 on 17/11/29.
 */
public class SaveDataToFile {



            public static void main(String[] args) throws IOException {
                String content = "";
                try
                {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    content = br.readLine();
                    br.close();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }

                File file = new File("\\Users\\yp-tc-2646\\\\content.txt");
                if(file.exists() && file.isFile())
                {
                    System.out.println("用来保存记录内容的文件已存在");
                }
                else
                {
                    try
                    {
                        file.createNewFile();
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
                }

                try
                {
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(content);
                    bw.close();
                    fw.close();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }

    }


