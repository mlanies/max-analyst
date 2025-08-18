package com.facebook.soloader;

import defpackage.dle;
import defpackage.mhe;
import defpackage.rh5;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class e implements Closeable {
    public static void a(rh5 rh5Var, byte[] bArr, File file) {
        int i;
        InputStream inputStream = (InputStream) rh5Var.c;
        dle dleVar = (dle) rh5Var.b;
        Object obj = dleVar.b;
        File file2 = new File(file, (String) dleVar.b);
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    int iAvailable = inputStream.available();
                    if (iAvailable > 1) {
                        SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), iAvailable);
                    }
                    int i2 = 0;
                    while (i2 < Integer.MAX_VALUE && (i = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
                        randomAccessFile.write(bArr, 0, i);
                        i2 += i;
                    }
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (file2.setExecutable(true, false)) {
                        randomAccessFile.close();
                    } else {
                        throw new IOException("cannot make file executable: " + file2);
                    }
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
                e.toString();
                mhe.b(file2);
                throw e;
            }
        } finally {
            if (file2.exists() && !file2.setWritable(false)) {
                file2.toString();
                Objects.toString(file);
                file.canWrite();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract dle[] m();

    public abstract void n(File file);
}
