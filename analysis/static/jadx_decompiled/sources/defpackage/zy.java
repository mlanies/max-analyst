package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class zy {
    public final String a;
    public final yy b;
    public final File c;
    public final File d;
    public final File e;

    public zy(File file, q64 q64Var) {
        this.b = q64Var == null ? yy.f : q64Var;
        this.c = file;
        this.d = new File(file.getPath() + ".new");
        this.e = new File(file.getPath() + ".bak");
        StringBuilder sb = new StringBuilder("AtomicFile-");
        sb.append(file.getName());
        this.a = sb.toString();
    }

    public final void a(FileOutputStream fileOutputStream) throws IOException {
        boolean z;
        try {
            fileOutputStream.getFD().sync();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        String str = this.a;
        yy yyVar = this.b;
        if (!z) {
            yyVar.a(str + ": Failed to sync file output stream", null);
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            yyVar.a(str + ": Failed to close file output stream", e);
        }
        File file = this.d;
        if (file.delete()) {
            return;
        }
        yyVar.a(str + ": Failed to delete new file " + file, null);
    }

    public final void b(FileOutputStream fileOutputStream) throws IOException {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            this.b.a(zr6.l(new StringBuilder(), this.a, ": Failed to close file output stream"), e);
        }
        e(this.d, this.c);
    }

    public final FileInputStream c() {
        File file = this.e;
        boolean zExists = file.exists();
        File file2 = this.c;
        if (zExists) {
            e(file, file2);
        }
        File file3 = this.d;
        boolean zExists2 = file3.exists();
        String str = this.a;
        yy yyVar = this.b;
        if (zExists2 && file2.exists() && !file3.delete()) {
            yyVar.a(str + ": Failed to delete outdated new file " + file3, null);
        }
        try {
            if (file2.canRead()) {
                return new FileInputStream(file2);
            }
        } catch (Throwable th) {
            yyVar.a(str + ": Fail to create FileInputStream for file " + file2, th);
        }
        return null;
    }

    public final byte[] d() throws IOException {
        FileInputStream fileInputStreamC = c();
        if (fileInputStreamC == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[fileInputStreamC.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamC.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    return bArr;
                }
                i += i2;
                int iAvailable = fileInputStreamC.available();
                if (iAvailable > bArr.length - i) {
                    byte[] bArr2 = new byte[iAvailable + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamC.close();
        }
    }

    public final void e(File file, File file2) {
        boolean zIsDirectory = file2.isDirectory();
        String str = this.a;
        yy yyVar = this.b;
        if (zIsDirectory && !file2.delete()) {
            yyVar.a(str + ": Failed to delete file which is a directory " + file2, null);
        }
        if (file.renameTo(file2)) {
            return;
        }
        yyVar.a(str + ": Failed to rename " + file + " to " + file2, null);
    }

    public final FileOutputStream f() throws ErrnoException {
        FileOutputStream fileOutputStream;
        File file = this.e;
        if (file.exists()) {
            e(file, this.c);
        }
        File file2 = this.d;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException unused) {
            File parentFile = file2.getParentFile();
            boolean zMkdir = parentFile.mkdir();
            String str = this.a;
            yy yyVar = this.b;
            if (!zMkdir) {
                yyVar.a(str + "Couldn't create directory for AtomicFile " + file2, null);
                return null;
            }
            try {
                Os.chmod(parentFile.getAbsolutePath(), HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED);
            } catch (ErrnoException unused2) {
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException e) {
                yyVar.a(str + ": Couldn't create AtomicFile " + file2, e);
                fileOutputStream = null;
            }
        }
        return fileOutputStream;
    }
}
