package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes.dex */
public final class op6 implements ksd {
    public final bt0 a = new bt0();
    public boolean b;
    public final boolean c;
    public final /* synthetic */ rp6 o;

    public op6(rp6 rp6Var, boolean z) {
        this.o = rp6Var;
        this.c = z;
    }

    @Override // defpackage.ksd
    public final void N(bt0 bt0Var, long j) {
        byte[] bArr = naf.a;
        bt0 bt0Var2 = this.a;
        bt0Var2.N(bt0Var, j);
        while (bt0Var2.b >= PlaybackStateCompat.ACTION_PREPARE) {
            a(false);
        }
    }

    public final void a(boolean z) {
        long jMin;
        boolean z2;
        synchronized (this.o) {
            this.o.j.i();
            while (true) {
                try {
                    rp6 rp6Var = this.o;
                    if (rp6Var.c < rp6Var.d || this.c || this.b || rp6Var.f() != 0) {
                        break;
                    } else {
                        this.o.k();
                    }
                } finally {
                }
            }
            this.o.j.m();
            this.o.b();
            rp6 rp6Var2 = this.o;
            jMin = Math.min(rp6Var2.d - rp6Var2.c, this.a.b);
            rp6 rp6Var3 = this.o;
            rp6Var3.c += jMin;
            z2 = z && jMin == this.a.b && rp6Var3.f() == 0;
        }
        this.o.j.i();
        try {
            rp6 rp6Var4 = this.o;
            rp6Var4.n.S(rp6Var4.m, z2, this.a, jMin);
        } finally {
        }
    }

    @Override // defpackage.ksd, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        rp6 rp6Var = this.o;
        byte[] bArr = naf.a;
        synchronized (rp6Var) {
            if (this.b) {
                return;
            }
            boolean z = this.o.f() == 0;
            rp6 rp6Var2 = this.o;
            if (!rp6Var2.h.c) {
                if (this.a.b > 0) {
                    while (this.a.b > 0) {
                        a(true);
                    }
                } else if (z) {
                    rp6Var2.n.S(rp6Var2.m, true, null, 0L);
                }
            }
            synchronized (this.o) {
                this.b = true;
            }
            this.o.n.flush();
            this.o.a();
        }
    }

    @Override // defpackage.ksd, java.io.Flushable
    public final void flush() {
        rp6 rp6Var = this.o;
        byte[] bArr = naf.a;
        synchronized (rp6Var) {
            this.o.b();
        }
        while (this.a.b > 0) {
            a(false);
            this.o.n.flush();
        }
    }

    @Override // defpackage.ksd
    public final oue p() {
        return this.o.j;
    }
}
