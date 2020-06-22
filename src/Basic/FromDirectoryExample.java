package Basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		// path
		Path path =  Paths.get("c:/program files");	//저 위치에 있는 정보를 가져옴
		try {
			Stream<Path> stream = Files.list(path);	//예외처리 해야함
			stream.forEach((t) ->
				System.out.println(t.getFileName()));
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//file
		Paths.get(".project");	//streamProgect 하위..root 디렉토리
		try {
			Stream<String> strstream = Files.lines(path);
			strstream.forEach(t -> System.out.println(t.toString()));
			strstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
