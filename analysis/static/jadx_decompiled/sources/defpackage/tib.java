package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class tib extends vib {
    public final int a;

    public tib(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tib) && lz7.i(this.a, ((tib) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.a;
    }

    public final String toString() {
        return zr6.i("Loading(itemViewType=", lz7.U(this.a), ")");
    }
}
