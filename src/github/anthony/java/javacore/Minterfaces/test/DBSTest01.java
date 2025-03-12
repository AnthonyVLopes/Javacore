package github.anthony.java.javacore.Minterfaces.test;

import github.anthony.java.javacore.Minterfaces.domain.DataBaseLoader;
import github.anthony.java.javacore.Minterfaces.domain.FileLoader;

public class DBSTest01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();


    }
}
