package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class cq6 implements zl4, fq6 {
    public final f2a X;
    public long Z;
    public final je7 a;
    public final File c;
    public final xtc o;
    public final AtomicBoolean Y = new AtomicBoolean();
    public final String b = "";

    public cq6(f2a f2aVar, khe kheVar, File file, xtc xtcVar) {
        this.a = kheVar;
        this.c = file;
        this.o = xtcVar;
        this.X = f2aVar;
    }

    @Override // defpackage.fq6
    public final void a() {
        if (this.Y.get()) {
            return;
        }
        this.o.b(new aq6(this, 1));
    }

    @Override // defpackage.fq6
    public final void b() {
        if (this.Y.get()) {
            return;
        }
        this.o.b(new aq6(this, 0));
    }

    public final void c(boolean z) {
        if (this.Y.compareAndSet(false, true)) {
            xtc xtcVar = this.o;
            if (!xtcVar.h()) {
                xtcVar.g();
            }
            if (z) {
                hm9.n("dq6", "cancelDownload");
                ((iq6) this.a.getValue()).a(this.c, null);
            }
        }
    }

    @Override // defpackage.fq6
    public final void d() {
    }

    @Override // defpackage.fq6
    public final void e(File file) {
        if (this.Y.get()) {
            return;
        }
        this.o.b(new vs5(this, 3, file));
    }

    @Override // defpackage.fq6
    public final void f() {
        if (this.Y.get()) {
            return;
        }
        this.o.b(new aq6(this, 2));
    }

    @Override // defpackage.zl4
    public final void g() {
        c(true);
    }

    @Override // defpackage.fq6
    public final String getDownloadContext() {
        return this.c.getAbsolutePath();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.Y.get();
    }

    @Override // defpackage.fq6
    public final void j(float f, long j) {
        if (this.Y.get()) {
            return;
        }
        this.o.b(new bq6(this, f, j, 0));
    }
}
