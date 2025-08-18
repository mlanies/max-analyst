package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mee implements lee {
    public final lee a;
    public final Executor b;
    public final tj3 c;

    public mee(zgf zgfVar) {
        lee leeVar = zgfVar.e;
        Objects.requireNonNull(leeVar);
        this.a = leeVar;
        this.b = zgfVar.d;
        this.c = zgfVar.f;
    }

    @Override // defpackage.lee
    public final void a(see seeVar) {
        this.b.execute(new flc(this, 23, seeVar));
    }

    @Override // defpackage.lee
    public final bm7 b(int i, int i2) {
        return new dw6(1, new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // defpackage.lee
    public final void c(kee keeVar) {
        this.b.execute(new flc(this, 24, keeVar));
    }

    @Override // defpackage.lee
    public final void release() {
    }
}
