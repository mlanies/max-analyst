package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class o36 implements xde {
    public final boolean X;
    public final khe Y = new khe(new ie(2, this));
    public boolean Z;
    public final Context a;
    public final String b;
    public final l0f c;
    public final boolean o;

    public o36(Context context, String str, l0f l0fVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = l0fVar;
        this.o = z;
        this.X = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        khe kheVar = this.Y;
        if (kheVar.a()) {
            ((n36) kheVar.getValue()).close();
        }
    }

    @Override // defpackage.xde
    public final k36 getReadableDatabase() {
        return ((n36) this.Y.getValue()).a(false);
    }

    @Override // defpackage.xde
    public final k36 getWritableDatabase() {
        return ((n36) this.Y.getValue()).a(true);
    }

    @Override // defpackage.xde
    public final void setWriteAheadLoggingEnabled(boolean z) {
        khe kheVar = this.Y;
        if (kheVar.a()) {
            ((n36) kheVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.Z = z;
    }
}
