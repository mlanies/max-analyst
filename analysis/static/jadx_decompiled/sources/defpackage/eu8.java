package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class eu8 implements Closeable {
    public final Closeable X;
    public final /* synthetic */ int a;
    public final bt0 b;
    public final boolean c;
    public final Object o;

    public eu8(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = z;
                bt0 bt0Var = new bt0();
                this.b = bt0Var;
                Inflater inflater = new Inflater(true);
                this.o = inflater;
                this.X = new c07(new y7c(bt0Var), inflater);
                break;
            default:
                this.c = z;
                bt0 bt0Var2 = new bt0();
                this.b = bt0Var2;
                Deflater deflater = new Deflater(-1, true);
                this.o = deflater;
                this.X = new gg4(bt0Var2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                ((gg4) this.X).close();
                break;
            default:
                ((c07) this.X).close();
                break;
        }
    }
}
