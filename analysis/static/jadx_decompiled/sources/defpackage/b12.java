package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class b12 implements dbe {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public x02 d;
    public long e;
    public long f;
    public long g;

    public b12() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new x02(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            v02 v02Var = new v02(1, this);
            z02 z02Var = new z02();
            z02Var.s0 = v02Var;
            arrayDeque.add(z02Var);
        }
        this.c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.m54
    public final void a(long j) {
        this.g = j;
    }

    @Override // defpackage.dbe
    public final void b(long j) {
        this.e = j;
    }

    @Override // defpackage.m54
    public final void d(ibe ibeVar) {
        fm9.f(ibeVar == this.d);
        x02 x02Var = (x02) ibeVar;
        long j = this.g;
        if (j == -9223372036854775807L || x02Var.Z >= j) {
            long j2 = this.f;
            this.f = 1 + j2;
            x02Var.w0 = j2;
            this.c.add(x02Var);
        } else {
            x02Var.v();
            this.a.add(x02Var);
        }
        this.d = null;
    }

    public abstract c12 e();

    @Override // defpackage.m54
    public final Object f() {
        fm9.k(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        x02 x02Var = (x02) arrayDeque.pollFirst();
        this.d = x02Var;
        return x02Var;
    }

    @Override // defpackage.m54
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            x02 x02Var = (x02) priorityQueue.poll();
            int i = oaf.a;
            x02Var.v();
            arrayDeque.add(x02Var);
        }
        x02 x02Var2 = this.d;
        if (x02Var2 != null) {
            x02Var2.v();
            arrayDeque.add(x02Var2);
            this.d = null;
        }
    }

    public abstract void g(x02 x02Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        return null;
     */
    @Override // defpackage.m54
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kbe c() {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r7.c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            x02 r3 = (defpackage.x02) r3
            int r4 = defpackage.oaf.a
            long r3 = r3.Z
            long r5 = r7.e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            x02 r1 = (defpackage.x02) r1
            r3 = 4
            boolean r4 = r1.f(r3)
            java.util.ArrayDeque r5 = r7.a
            if (r4 == 0) goto L41
            java.lang.Object r7 = r0.pollFirst()
            kbe r7 = (defpackage.kbe) r7
            r7.a(r3)
            r1.v()
            r5.add(r1)
            return r7
        L41:
            r7.g(r1)
            boolean r3 = r7.i()
            if (r3 == 0) goto L63
            c12 r7 = r7.e()
            java.lang.Object r0 = r0.pollFirst()
            kbe r0 = (defpackage.kbe) r0
            long r2 = r1.Z
            r0.c = r2
            r0.X = r7
            r0.Y = r2
            r1.v()
            r5.add(r1)
            return r0
        L63:
            r1.v()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b12.c():kbe");
    }

    public abstract boolean i();

    @Override // defpackage.m54
    public void release() {
    }
}
