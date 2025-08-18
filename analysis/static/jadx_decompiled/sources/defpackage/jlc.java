package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public abstract class jlc implements Closeable {
    public final Object[] X;
    public final Context a;
    public final iba o;
    public final Class b = OneMeRoomDatabase.class;
    public final String c = "cache.db";
    public final khe Y = new khe(new lwa(15, this));

    public jlc(Context context, iba ibaVar, Object[] objArr) {
        this.a = context;
        this.o = ibaVar;
        this.X = objArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Y.a()) {
            ilc ilcVar = (ilc) this.Y.getValue();
            k36 k36Var = ilcVar.a;
            if (tpa.f(k36Var != null ? Boolean.valueOf(k36Var.isOpen()) : null, Boolean.TRUE)) {
                ReentrantReadWriteLock.WriteLock writeLock = ilcVar.i.writeLock();
                writeLock.lock();
                try {
                    v47 v47Var = ilcVar.e;
                    v47Var.getClass();
                    v47Var.getClass();
                    ilcVar.h().close();
                } finally {
                    writeLock.unlock();
                }
            }
        }
    }

    public final ilc m() {
        return (ilc) this.Y.getValue();
    }

    public final q1a n() {
        return new q1a(2, new l5(13, this));
    }
}
