package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class qvd extends vh0 {
    public final Object i;
    public final xjc j;
    public final lhe k;
    public final uy l;
    public final ArrayDeque m;
    public nv7 n;
    public nv7 o;
    public long p;
    public long q;
    public long r;
    public float s;
    public long t;
    public boolean u;

    public qvd(xjc xjcVar) {
        this.j = xjcVar;
        Object obj = new Object();
        this.i = obj;
        this.k = new lhe(obj);
        this.l = new uy(4, (byte) 0);
        this.m = new ArrayDeque();
        n();
    }

    @Override // defpackage.vh0, defpackage.m60
    public final ByteBuffer a() {
        ByteBuffer byteBufferA = m() ? this.k.a() : super.a();
        synchronized (this.i) {
            try {
                if (!this.m.isEmpty() && (this.l.f() <= this.p || d())) {
                    au1.r(this.m.remove());
                    l(this.l.h());
                    throw null;
                }
            } finally {
            }
        }
        return byteBufferA;
    }

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        int iA0;
        long j = this.t;
        j60 j60Var = this.b;
        long jA0 = oaf.a0(j, 1000000L, j60Var.a * j60Var.d, RoundingMode.FLOOR);
        float fB = this.j.b(jA0);
        synchronized (this.i) {
            if (fB != this.s) {
                nv7 nv7Var = this.o;
                long jB = nv7Var.b(nv7Var.b - 1);
                nv7 nv7Var2 = this.n;
                long jB2 = jA0 - nv7Var2.b(nv7Var2.b - 1);
                this.n.a(jA0);
                nv7 nv7Var3 = this.o;
                if (m()) {
                    lhe lheVar = this.k;
                    synchronized (lheVar.b) {
                        jB2 = lheVar.c.g(jB2);
                    }
                }
                nv7Var3.a(jB2 + jB);
                this.s = fB;
                if (m()) {
                    lhe lheVar2 = this.k;
                    synchronized (lheVar2.b) {
                        vud vudVar = lheVar2.c;
                        if (vudVar.c != fB) {
                            vudVar.c = fB;
                            vudVar.i = true;
                        }
                    }
                    lhe lheVar3 = this.k;
                    synchronized (lheVar3.b) {
                        vud vudVar2 = lheVar3.c;
                        if (vudVar2.d != fB) {
                            vudVar2.d = fB;
                            vudVar2.i = true;
                        }
                    }
                }
                this.k.flush();
                this.u = false;
                super.a();
            }
        }
        int iLimit = byteBuffer.limit();
        long jA = this.j.a(jA0);
        if (jA != -9223372036854775807L) {
            long j2 = jA - jA0;
            j60 j60Var2 = this.b;
            iA0 = (int) oaf.a0(j2, j60Var2.a * j60Var2.d, 1000000L, RoundingMode.CEILING);
            int i = this.b.d;
            int i2 = i - (iA0 % i);
            if (i2 != i) {
                iA0 += i2;
            }
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + iA0));
        } else {
            iA0 = -1;
        }
        long jPosition = byteBuffer.position();
        if (m()) {
            this.k.b(byteBuffer);
            if (iA0 != -1 && byteBuffer.position() - jPosition == iA0) {
                this.k.c();
                this.u = true;
            }
        } else {
            ByteBuffer byteBufferK = k(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                byteBufferK.put(byteBuffer);
            }
            byteBufferK.flip();
        }
        this.t = (byteBuffer.position() - jPosition) + this.t;
        o();
        byteBuffer.limit(iLimit);
    }

    @Override // defpackage.vh0, defpackage.m60
    public final boolean d() {
        return super.d() && this.k.d();
    }

    @Override // defpackage.m60
    public final long f(long j) {
        long j2 = 0;
        double dMin = 0.0d;
        while (j2 < j) {
            long jA = this.j.a(j2);
            if (jA == -9223372036854775807L) {
                jA = Long.MAX_VALUE;
            }
            dMin += (Math.min(jA, j) - j2) / r4.b(j2);
            j2 = jA;
        }
        return Math.round(dMin);
    }

    @Override // defpackage.vh0
    public final j60 g(j60 j60Var) {
        return this.k.e(j60Var);
    }

    @Override // defpackage.vh0
    public final void h() {
        n();
        this.k.flush();
    }

    @Override // defpackage.vh0
    public final void i() {
        if (this.u) {
            return;
        }
        this.k.c();
        this.u = true;
    }

    @Override // defpackage.vh0
    public final void j() {
        n();
        this.k.reset();
    }

    public final void l(long j) {
        long jRound;
        int i = this.n.b - 1;
        while (i > 0 && this.n.b(i) > j) {
            i--;
        }
        nv7 nv7Var = this.n;
        if (i == nv7Var.b - 1) {
            if (this.q < nv7Var.b(i)) {
                this.q = this.n.b(i);
                this.r = this.o.b(i);
            }
            jRound = j - this.q;
            if (m()) {
                lhe lheVar = this.k;
                synchronized (lheVar.b) {
                    jRound = lheVar.c.g(jRound);
                }
            }
        } else {
            int i2 = i + 1;
            jRound = Math.round(((this.o.b(i2) - this.o.b(i)) / (this.n.b(i2) - this.n.b(i))) * (j - this.q));
        }
        this.q = j;
        this.r += jRound;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.i) {
            z = this.s != 1.0f;
        }
        return z;
    }

    public final void n() {
        synchronized (this.i) {
            nv7 nv7Var = new nv7(1);
            this.n = nv7Var;
            this.o = new nv7(1);
            nv7Var.a(0L);
            this.o.a(0L);
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.s = 1.0f;
        }
        this.t = 0L;
        this.u = false;
    }

    public final void o() {
        long j;
        synchronized (this.i) {
            if (m()) {
                lhe lheVar = this.k;
                synchronized (lheVar.b) {
                    vud vudVar = lheVar.c;
                    long j2 = vudVar.n;
                    vudVar.j.getClass();
                    j = j2 - ((r1.l * r1.c) * 2);
                }
                j60 j60Var = this.b;
                this.p = this.n.b(r3.b - 1) + oaf.a0(j, 1000000L, j60Var.a * j60Var.d, RoundingMode.FLOOR);
            } else {
                long j3 = this.t;
                j60 j60Var2 = this.b;
                this.p = oaf.a0(j3, 1000000L, j60Var2.a * j60Var2.d, RoundingMode.FLOOR);
            }
        }
    }
}
