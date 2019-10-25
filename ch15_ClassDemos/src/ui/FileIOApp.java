package ui;

import java.io.IOException;
import java.nio.file.*;

public class FileIOApp {

	public static void main(String[] args) throws IOException {
		// create directory
		String dirString = "c:/tem/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("It's already there");
		}
			
		String fileString = "temp.txt";	
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		else {
			System.out.println("That's already there");
		}
		
		System.out.println(filePath.getNameCount());
		System.out.println(filePath.toString());
		System.out.println(filePath.toAbsolutePath());
		System.out.println(Files.isWritable(filePath));
		System.out.println(Files.isHidden(filePath));
		System.out.println(filePath.getRoot());
		for (int i = 0; i < filePath.getNameCount(); i++) {
			System.out.println(filePath.getName(i));
		}
		
		// display files in a directory	
		System.out.println("Directory: " + dirPath.toAbsolutePath());
		System.out.println("Files:");
		DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
		for (Path p: dirStream) {
			if(Files.isRegularFile(p)) {
				System.out.println("\t"+p.getFileName());
			}
		}
	}

}
