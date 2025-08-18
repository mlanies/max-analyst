package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zdc {
    public int a;
    public SparseArray b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public long n;
    public int o;

    public final void a(int i) {
        if ((this.e & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
    }

    public final int b() {
        return this.h ? this.c - this.d : this.f;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
    }
}
