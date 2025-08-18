package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class x6 implements efb {
    public final int a;
    public final vfd b;
    public final int c;

    public /* synthetic */ x6(int i, vfd vfdVar) {
        this(i, vfdVar, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return this.a == x6Var.a && tpa.f(this.b, x6Var.b) && dy7.o(this.c, x6Var.c);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        if (ol7Var instanceof x6) {
            return this.a == ((x6) ol7Var).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.c;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if ((ol7Var instanceof x6) && !(((x6) ol7Var).b.Z instanceof ffd)) {
            return equals(ol7Var);
        }
        return false;
    }

    public final String toString() {
        return "ActionItem(actionId=" + this.a + ", model=" + this.b + ", itemViewType=" + dy7.J(this.c) + ")";
    }

    public x6(int i, vfd vfdVar, int i2) {
        this.a = i;
        this.b = vfdVar;
        this.c = i2;
    }
}
