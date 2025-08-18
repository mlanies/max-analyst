package defpackage;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class p36 implements yde {
    public final SQLiteProgram a;

    public p36(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.yde
    public final void W(int i) {
        this.a.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.yde
    public final void f(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // defpackage.yde
    public final void h(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.yde
    public final void j(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.yde
    public final void k(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}
