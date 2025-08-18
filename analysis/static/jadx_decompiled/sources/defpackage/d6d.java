package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* loaded from: classes.dex */
public final class d6d implements wqc {
    public final wqc a;
    public final int b;
    public long c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ e6d f;

    public d6d(e6d e6dVar, wqc wqcVar, int i) {
        this.f = e6dVar;
        this.a = wqcVar;
        this.b = i;
    }

    @Override // defpackage.wqc
    public final Surface a() {
        return this.a.a();
    }

    @Override // defpackage.wqc
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.wqc
    public final p54 d() {
        return this.a.d();
    }

    @Override // defpackage.wqc
    public final void e() {
        e6d e6dVar = this.f;
        e6dVar.l.decrementAndGet();
        if (e6dVar.b ? this.e : e6dVar.n == e6dVar.a.size() - 1) {
            this.a.e();
        } else if (e6dVar.l.get() == 0) {
            e6dVar.g.d(new u3c(12, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // defpackage.wqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r7 = this;
            wqc r0 = r7.a
            p54 r0 = r0.d()
            defpackage.fm9.l(r0)
            long r1 = r7.c
            long r3 = r0.Z
            long r1 = r1 + r3
            e6d r3 = r7.f
            boolean r4 = r3.b
            r5 = 4
            r6 = 1
            if (r4 == 0) goto L48
            long r3 = r3.x
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L20
            boolean r1 = r7.d
            if (r1 == 0) goto L48
        L20:
            e6d r1 = r7.f
            boolean r1 = r1.y
            r2 = 0
            if (r1 == 0) goto L47
            boolean r1 = r7.d
            if (r1 != 0) goto L47
            java.nio.ByteBuffer r1 = r0.X
            r1.getClass()
            r1.limit(r2)
            r0.b = r5
            wqc r0 = r7.a
            boolean r0 = r0.f()
            defpackage.fm9.k(r0)
            r7.d = r6
            e6d r7 = r7.f
            java.util.concurrent.atomic.AtomicInteger r7 = r7.l
            r7.decrementAndGet()
        L47:
            return r2
        L48:
            boolean r1 = r0.f(r5)
            if (r1 == 0) goto La0
            e6d r1 = r7.f
            java.util.concurrent.atomic.AtomicInteger r1 = r1.l
            r1.decrementAndGet()
            e6d r1 = r7.f
            int r2 = r1.n
            zw6 r1 = r1.a
            int r1 = r1.size()
            int r1 = r1 - r6
            if (r2 < r1) goto L68
            e6d r1 = r7.f
            boolean r1 = r1.b
            if (r1 == 0) goto La0
        L68:
            int r1 = r7.b
            if (r1 != r6) goto L80
            e6d r1 = r7.f
            boolean r2 = r1.b
            if (r2 != 0) goto L80
            boolean r1 = r1.q
            if (r1 == 0) goto L80
            wqc r0 = r7.a
            boolean r0 = r0.f()
            defpackage.fm9.k(r0)
            goto L87
        L80:
            r0.v()
            r1 = 0
            r0.Z = r1
        L87:
            e6d r0 = r7.f
            java.util.concurrent.atomic.AtomicInteger r0 = r0.l
            int r0 = r0.get()
            if (r0 != 0) goto L9f
            e6d r0 = r7.f
            bie r0 = r0.g
            u3c r1 = new u3c
            r2 = 12
            r1.<init>(r2, r7)
            r0.d(r1)
        L9f:
            return r6
        La0:
            wqc r7 = r7.a
            boolean r7 = r7.f()
            defpackage.fm9.k(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6d.f():boolean");
    }

    @Override // defpackage.wqc
    public final int g(Bitmap bitmap, uue uueVar) {
        if (this.f.b) {
            long j = -9223372036854775807L;
            while (true) {
                if (!uueVar.hasNext()) {
                    break;
                }
                long next = uueVar.next();
                if (this.c + next <= this.f.x) {
                    j = next;
                } else {
                    if (!this.f.y) {
                        return 2;
                    }
                    if (j == -9223372036854775807L) {
                        if (this.e) {
                            return 2;
                        }
                        this.e = true;
                        e();
                        return 3;
                    }
                    p44 p44Var = new p44(uueVar.a(), j);
                    this.e = true;
                    uueVar = p44Var;
                }
            }
        }
        return this.a.g(bitmap, uueVar.a());
    }

    @Override // defpackage.wqc
    public final boolean h(long j) {
        long j2 = this.c + j;
        e6d e6dVar = this.f;
        if (!e6dVar.b || j2 < e6dVar.x) {
            return this.a.h(j);
        }
        if (!this.f.y || this.e) {
            return false;
        }
        this.e = true;
        e();
        return false;
    }
}
