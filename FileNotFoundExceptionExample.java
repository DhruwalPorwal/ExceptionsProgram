import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileNotFoundExceptionExample 
{
	public FileInputStream fileOpen()
	{
		File file = new File("Java.txt");
		FileInputStream fileInputStream = null;
		try
		{
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return fileInputStream;
	}
	public static void main(String[] args)
		{
			FileNotFoundExceptionExample  i = new FileNotFoundExceptionExample ();
			i.fileOpen();
		}
}
