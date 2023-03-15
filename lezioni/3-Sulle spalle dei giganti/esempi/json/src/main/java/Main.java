package main.java;

import java.io.FileNotFoundException;

import com.google.gson.JsonParseException;

import main.java.data.ApiResponse;
import main.java.io.ApiResponseParser;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("use: java Main <path-to-file>");
            return;
        }

        try {
            ApiResponse response = ApiResponseParser.fromFile(args[0]);
            System.out.println(response);
        } catch (FileNotFoundException e) {
            System.err.println("File '" + args[0] + "' not found");
        } catch (JsonParseException e) {
            System.err.println("Could not parse file '" + args[0] + "' as a JSON file");
        }
    }
}