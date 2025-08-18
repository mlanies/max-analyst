package defpackage;

import com.facebook.soloader.SoLoader;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes.dex */
public abstract class mhe {
    public static void a(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            parentFile.toString();
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static void b(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                a(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a((File) arrayList.get(size));
        }
    }

    public static void c(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("cannot list directory " + file2);
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    file2.toString();
                    e.getMessage();
                }
            }
        }
    }

    public static rh5 d(File file, File file2) throws Throwable {
        boolean z;
        try {
            return new rh5(file2);
        } catch (FileNotFoundException e) {
            z = true;
            try {
                if (!file.setWritable(true)) {
                    throw e;
                }
                rh5 rh5Var = new rh5(file2);
                if (!file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                return rh5Var;
            } catch (Throwable th) {
                th = th;
                if (z && !file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                file.getCanonicalPath();
            }
            throw th;
        }
    }

    @om4
    public static String getClassLoaderLdLoadLibrary() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
            } catch (Exception unused) {
                return null;
            }
        }
        throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
    }

    @om4
    public static Method getNativeLoadRuntimeMethod() {
        return null;
    }
}
