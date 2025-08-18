package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public final class rh5 implements Closeable, qq6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ rh5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void m() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                FileOutputStream fileOutputStream = (FileOutputStream) this.b;
                try {
                    FileLock fileLock = (FileLock) this.c;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    return;
                } finally {
                    fileOutputStream.close();
                }
            case 1:
                return;
            default:
                ((InputStream) this.c).close();
                return;
        }
    }

    @Override // defpackage.qq6
    public long getContentLength() {
        return ((byte[]) this.c).length;
    }

    @Override // defpackage.qq6
    public String getContentType() {
        return (String) this.b;
    }

    @Override // defpackage.qq6
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) this.c);
    }

    public rh5(File file) throws IOException {
        this.a = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.b = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.c = fileLockLock;
        } catch (Throwable th) {
            ((FileOutputStream) this.b).close();
            throw th;
        }
    }
}
