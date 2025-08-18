package defpackage;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public abstract class k87 extends LockFreeLinkedListNode implements cm4, nz6 {
    public z87 a;

    @Override // defpackage.nz6
    public final tq9 b() {
        return null;
    }

    public abstract boolean c();

    public abstract void d(Throwable th);

    @Override // defpackage.cm4
    public final void dispose() {
        z87 z87Var = this.a;
        if (z87Var == null) {
            z87Var = null;
        }
        z87Var.removeNode$kotlinx_coroutines_core(this);
    }

    @Override // defpackage.nz6
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(c54.u(this));
        sb.append("[job@");
        z87 z87Var = this.a;
        if (z87Var == null) {
            z87Var = null;
        }
        sb.append(c54.u(z87Var));
        sb.append(']');
        return sb.toString();
    }
}
