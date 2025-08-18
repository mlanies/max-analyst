package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o5f implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ File b;
    public final /* synthetic */ rh5 c;
    public final /* synthetic */ p5f o;

    public o5f(p5f p5fVar, boolean z, File file, rh5 rh5Var) {
        this.o = p5fVar;
        this.a = z;
        this.b = file;
        this.c = rh5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rh5 rh5Var = this.c;
        p5f p5fVar = this.o;
        boolean z = this.a;
        try {
            if (z) {
                try {
                    mhe.c(p5fVar.a);
                } catch (Throwable th) {
                    Objects.toString(p5fVar.a);
                    rh5Var.close();
                    throw th;
                }
            }
            p5f.i(this.b, (byte) 1, z);
            Objects.toString(p5fVar.a);
            rh5Var.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
