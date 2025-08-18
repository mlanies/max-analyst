package defpackage;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class rq6 implements Closeable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Closeable o;

    public /* synthetic */ rq6(int i, Object obj, Closeable closeable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = closeable;
    }

    private final void m() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                k36 k36Var = (k36) this.o;
                if (k36Var != null) {
                    k36Var.close();
                    break;
                }
                break;
        }
    }
}
