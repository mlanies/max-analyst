package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class p5f extends qk4 {
    public final Context d;

    public p5f(Context context, String str) {
        super(f(context, str), 1);
        this.d = context;
    }

    public static File f(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    public static void i(File file, byte b, boolean z) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException unused) {
        }
    }

    @Override // defpackage.nud
    public final void d(int i) {
        File file = this.a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        rh5 rh5Var = null;
        try {
            try {
                rh5 rh5VarD = mhe.d(file, new File(file, "dso_lock"));
                try {
                    Objects.toString(file);
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!h(rh5VarD, i)) {
                        Objects.toString(file);
                        rh5Var = rh5VarD;
                    }
                    if (rh5Var != null) {
                        Objects.toString(file);
                        rh5Var.close();
                    } else {
                        Objects.toString(file);
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    rh5Var = rh5VarD;
                    if (rh5Var != null) {
                        Objects.toString(file);
                        rh5Var.close();
                    } else {
                        Objects.toString(file);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (!file.canWrite() || file.setWritable(false)) {
                throw th3;
            }
            throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
        }
    }

    public byte[] e() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarG = g(false);
        try {
            dle[] dleVarArrM = eVarG.m();
            parcelObtain.writeInt(dleVarArrM.length);
            for (dle dleVar : dleVarArrM) {
                parcelObtain.writeString((String) dleVar.b);
                parcelObtain.writeString((String) dleVar.c);
            }
            eVarG.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                eVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract e g(boolean z);

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.rh5 r16, int r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5f.h(rh5, int):boolean");
    }
}
