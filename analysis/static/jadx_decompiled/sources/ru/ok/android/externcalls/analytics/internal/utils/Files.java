package ru.ok.android.externcalls.analytics.internal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class Files {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BUFFER_SIZE = 4096;
    public static final byte[] SEPARATOR = {44};
    private static AtomicReference<byte[]> BUF = new AtomicReference<>();

    private Files() {
    }

    public static void cat(File file, File file2, boolean z) throws IOException {
        if (file == null || file.getParentFile() == null || file2 == null || length(file2) == 0) {
            return;
        }
        if (!file.exists()) {
            mkdirs(file.getParentFile());
            try {
                if (file2.renameTo(file)) {
                    return;
                }
            } catch (SecurityException e) {
                throw new IOException("Can't grab file due to security restrictions", e);
            }
        }
        InputStream fileInputStream = new FileInputStream(file2);
        if (z) {
            fileInputStream = new GZIPInputStream(fileInputStream);
        }
        try {
            long length = length(file);
            OutputStream fileOutputStream = new FileOutputStream(file, true);
            byte[] bArrObtainBuf = obtainBuf();
            if (z) {
                try {
                    fileOutputStream = new GZIPOutputStream(fileOutputStream, BUFFER_SIZE, true);
                } finally {
                    releaseBuf(bArrObtainBuf);
                }
            }
            if (length > 0) {
                try {
                    fileOutputStream.write(SEPARATOR);
                } finally {
                }
            }
            while (true) {
                int i = fileInputStream.read(bArrObtainBuf);
                if (i < 0) {
                    fileOutputStream.close();
                    fileInputStream.close();
                    delete(file2);
                    return;
                }
                fileOutputStream.write(bArrObtainBuf, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void delete(File file) throws IOException {
        if (file == null || deleteFile(file) || deleteFile(file)) {
            return;
        }
        throw new IOException("Cannot delete file " + file);
    }

    private static boolean deleteDirectory(File file) {
        File[] fileArrListFiles;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!deleteFile(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static boolean deleteFile(File file) {
        try {
            if (file.isDirectory()) {
                return deleteDirectory(file);
            }
            if (file.exists()) {
                return file.delete();
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isCompressed(File file) throws IOException {
        if (file != null && length(file) != 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    new GZIPInputStream(fileInputStream, BUFFER_SIZE).close();
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } catch (ZipException unused) {
            }
        }
        return false;
    }

    public static long length(File file) {
        if (file == null) {
            return 0L;
        }
        try {
            return file.length();
        } catch (SecurityException unused) {
            return 0L;
        }
    }

    public static void mkdirs(File file) throws IOException {
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            throw new IOException("Cannot create directory " + file.getAbsolutePath());
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is expected to be a directory");
    }

    public static void mkfile(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IOException("missing parent file for " + file.getPath());
        }
        mkdirs(parentFile);
        if (!file.exists() || file.isFile()) {
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is expected to be a file");
    }

    private static byte[] obtainBuf() {
        byte[] andSet = BUF.getAndSet(null);
        return andSet != null ? andSet : new byte[BUFFER_SIZE];
    }

    public static String readTextFile(File file, boolean z) throws IOException {
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        InputStreamReader inputStreamReader = new InputStreamReader(z ? new GZIPInputStream(new FileInputStream(file)) : new FileInputStream(file));
        while (true) {
            try {
                int i = inputStreamReader.read(cArr);
                if (i < 0) {
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static void releaseBuf(byte[] bArr) {
        BUF.set(bArr);
    }

    public static long length(File... fileArr) {
        long length = 0;
        if (fileArr == null) {
            return 0L;
        }
        for (File file : fileArr) {
            length += length(file);
        }
        return length;
    }

    public static long length(Collection<File> collection) {
        long length = 0;
        if (collection == null) {
            return 0L;
        }
        Iterator<File> it = collection.iterator();
        while (it.hasNext()) {
            length += length(it.next());
        }
        return length;
    }
}
