package org.free.lessons.serialization;

import java.io.*;

/**
 * Java serialization class
 * Credit: hyperskill.org (from JetBrains)
 */
public class SerializationUtil {
    public static void serialize(Object obj, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
                try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)) {
                    objectOutputStream.writeObject(obj);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object deserialize( String fileName) {
        Object obj = null;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
                try (ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)) {
                    obj = objectInputStream.readObject();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
