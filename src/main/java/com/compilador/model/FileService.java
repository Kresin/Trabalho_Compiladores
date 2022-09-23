package com.compilador.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Gabriel.Kresin
 */
public class FileService {
    
    public String loadFileContent(String filePath) {
        BufferedReader bufferedReader = getBufferedReader(filePath);
        String fileContent = "";
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {                
                fileContent += line + "\n";
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo");
            }
        }
        return fileContent;
    }
    
    private BufferedReader getBufferedReader(String filePath) {
        File file = new File(filePath);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
        return new BufferedReader(fileReader);
    }
    
    public void saveFile(String filePath, String content){
        filePath = addExtentionIfNeeded(filePath);
        BufferedWriter bufferedWriter = getBufferedWriter(filePath);
        try {
            bufferedWriter.write(content);
        } catch (IOException ex) {
            System.out.println("Erro ao escrever no arquivo");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException ex) {
                System.out.println("Erro ao fechar arquivo após a escrita");
            }
        }
    }
    
    private BufferedWriter getBufferedWriter(String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo para escrita");
        }
        return new BufferedWriter(fileWriter);
    }
    
    private String addExtentionIfNeeded(String filePath) {
        if (FilenameUtils.getExtension(filePath).isEmpty()) {
            return filePath + ".txt";
        }
        return filePath;
    }
    
    public boolean validateFileFormat(String filePath) {
        return !(FilenameUtils.getExtension(filePath).isEmpty() || !FilenameUtils.getExtension(filePath).equals("txt"));
    }
    
}
