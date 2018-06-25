import java.io.*;

/**
 * 把Student类的对象序列化到文件O:\\Java\\com\\jieke\\io\\student.txt
 * 并从该文件中反序列化，向console显示结果
 * Created by yp-tc-2646 on 17/11/29.
 */
public class UseStudentNew {

        public static void main(String[] args)
        {
            StudentNew st = new StudentNew("Tom",'M',20,3.6);
            File file = new File("\\Users\\yp-tc-2646\\student.txt");
            try
            {
                file.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                //Student对象序列化过程
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(st);
                oos.flush();
                oos.close();
                fos.close();

                //Student对象反序列化过程
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                StudentNew st1 = (StudentNew) ois.readObject();
                System.out.println("name = " + st1.getName());
                System.out.println("sex = " + st1.getSex());
                System.out.println("year = " + st1.getYear());
                System.out.println("gpa = " + st1.getGpa());
                ois.close();
                fis.close();
            }
            catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

