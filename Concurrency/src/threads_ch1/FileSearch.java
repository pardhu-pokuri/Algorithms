package threads_ch1;

import java.io.File;

public class FileSearch implements Runnable{

	private String path;
	private String fileName;
	
	public FileSearch(String path, String fileName) {
		this.path = path;
		this.fileName = fileName;
	}
	
	
	@Override
	public void run() {
		
		File file = new File(path);
		try{
			if(file.isDirectory()){
				processDirectory(file);
			}else{
				processFile(file);
			}
		}catch(InterruptedException e){
			System.out.println("Directory Search aborted");
		}
	}


	private void processFile(File file) throws InterruptedException {
		
		if(file.getName().contains(fileName)){
			System.out.println("File found at : " + file.getAbsolutePath());
		}
		
		if(Thread.currentThread().isInterrupted()){
			throw new InterruptedException();
		}
	}


	private void processDirectory(File file) throws InterruptedException {
		
		File[] files = file.listFiles();
		
		for(File eachFile : files){
			
			if(eachFile.isDirectory()){
				processDirectory(eachFile);
			}else{
				processFile(eachFile);
			}
		}
		/*
		 * You can throw InterruptedException back to run method and handle the interruption of thread in run method instead of other methods called by run method.
		 * We throw exceptions backs to run method when there are multiple methods that gets called by run method. 
		 */
		if(Thread.currentThread().isInterrupted()){
			throw new InterruptedException();
		}
		
	}



}
