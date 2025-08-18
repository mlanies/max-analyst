package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class j05 extends yqc implements sf6 {
    public static final ByteBuffer o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final qy5 e;
    public final long f;
    public final AtomicLong g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentLinkedQueue i;
    public volatile boolean j;
    public long k;
    public boolean l;
    public long m;
    public p54 n;

    public j05(qy5 qy5Var, f1f f1fVar, hj9 hj9Var, x99 x99Var, long j) {
        super(qy5Var, hj9Var);
        this.e = qy5Var;
        this.f = j;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        x99Var.m(f1fVar);
    }

    @Override // defpackage.q3a
    public final void b(lv4 lv4Var, long j, qy5 qy5Var, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j);
    }

    @Override // defpackage.wqc
    public final p54 d() {
        if (this.n == null) {
            p54 p54Var = (p54) this.h.poll();
            this.n = p54Var;
            if (!this.l) {
                if (p54Var == null) {
                    p54 p54Var2 = new p54(2);
                    this.n = p54Var2;
                    p54Var2.X = o;
                } else {
                    long j = this.m;
                    p54Var.X.getClass();
                    this.m = j - r0.capacity();
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.wqc
    public final boolean f() {
        p54 p54Var = this.n;
        p54Var.getClass();
        this.n = null;
        if (p54Var.f(4)) {
            this.j = true;
        } else {
            p54Var.Z = this.k + this.f + p54Var.Z;
            this.i.add(p54Var);
        }
        if (!this.l) {
            int size = this.i.size() + this.h.size();
            long j = this.m;
            p54Var.X.getClass();
            long jCapacity = j + r0.capacity();
            this.m = jCapacity;
            this.l = size >= 10 && (size >= 200 || jCapacity >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        return true;
    }

    @Override // defpackage.yqc
    public final sf6 j(lv4 lv4Var, qy5 qy5Var, int i) {
        return this;
    }

    @Override // defpackage.yqc
    public final p54 k() {
        return (p54) this.i.peek();
    }

    @Override // defpackage.yqc
    public final qy5 l() {
        return this.e;
    }

    @Override // defpackage.yqc
    public final boolean m() {
        return this.j && this.i.isEmpty();
    }

    @Override // defpackage.yqc
    public final void o() {
    }

    @Override // defpackage.yqc
    public final void p() {
        p54 p54Var = (p54) this.i.remove();
        p54Var.v();
        p54Var.Z = 0L;
        this.h.add(p54Var);
    }
}
