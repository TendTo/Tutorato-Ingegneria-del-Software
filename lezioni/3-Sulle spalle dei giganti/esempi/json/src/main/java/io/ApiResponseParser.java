package main.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import main.java.data.ApiResponse;

public class ApiResponseParser {

    public static ApiResponse fromFile(String path) throws FileNotFoundException {
        FileReader file = new FileReader(path);
        BufferedReader reader = new BufferedReader(file);
        return new Gson().fromJson(reader, ApiResponse.class);
    }
}
