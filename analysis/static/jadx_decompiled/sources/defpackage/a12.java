package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class a12 implements cbe {
    public long X;
    public long Y;
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public w02 o;

    public a12() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new w02(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            v02 v02Var = new v02(0, this);
            y02 y02Var = new y02();
            y02Var.Z = v02Var;
            arrayDeque.add(y02Var);
        }
        this.c = new PriorityQueue();
    }

    public abstract w4d a();

    @Override // defpackage.cbe
    public final void b(long j) {
        this.X = j;
    }

    public abstract void d(w02 w02Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        return null;
     */
    @Override // defpackage.l54
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jbe c() {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = r12.b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r12.c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            w02 r3 = (defpackage.w02) r3
            int r4 = defpackage.maf.a
            long r3 = r3.Y
            long r5 = r12.X
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            w02 r1 = (defpackage.w02) r1
            r3 = 4
            boolean r4 = r1.f(r3)
            java.util.ArrayDeque r5 = r12.a
            if (r4 == 0) goto L41
            java.lang.Object r12 = r0.pollFirst()
            jbe r12 = (defpackage.jbe) r12
            r12.a(r3)
            r1.v()
            r5.add(r1)
            return r12
        L41:
            r12.d(r1)
            boolean r3 = r12.g()
            if (r3 == 0) goto L66
            w4d r9 = r12.a()
            java.lang.Object r12 = r0.pollFirst()
            jbe r12 = (defpackage.jbe) r12
            long r7 = r1.Y
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r12
            r6.w(r7, r9, r10)
            r1.v()
            r5.add(r1)
            return r12
        L66:
            r1.v()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a12.c():jbe");
    }

    @Override // defpackage.l54
    public final Object f() {
        np8.f(this.o == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        w02 w02Var = (w02) arrayDeque.pollFirst();
        this.o = w02Var;
        return w02Var;
    }

    @Override // defpackage.l54
    public void flush() {
        ArrayDeque arrayDeque;
        this.Y = 0L;
        this.X = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            w02 w02Var = (w02) priorityQueue.poll();
            int i = maf.a;
            w02Var.v();
            arrayDeque.add(w02Var);
        }
        w02 w02Var2 = this.o;
        if (w02Var2 != null) {
            w02Var2.v();
            arrayDeque.add(w02Var2);
            this.o = null;
        }
    }

    public abstract boolean g();

    @Override // defpackage.l54
    public final void l(hbe hbeVar) {
        np8.d(hbeVar == this.o);
        w02 w02Var = (w02) hbeVar;
        if (w02Var.f(Integer.MIN_VALUE)) {
            w02Var.v();
            this.a.add(w02Var);
        } else {
            long j = this.Y;
            this.Y = 1 + j;
            w02Var.v0 = j;
            this.c.add(w02Var);
        }
        this.o = null;
    }

    @Override // defpackage.l54
    public void release() {
    }
}
