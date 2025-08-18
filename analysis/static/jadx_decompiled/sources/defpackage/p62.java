package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p62 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k72 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p62(k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p62 p62Var = (p62) n((o22) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p62Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p62 p62Var = new p62(this.Y, continuation);
        p62Var.X = obj;
        return p62Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        o22 o22Var = (o22) this.X;
        k72 k72Var = this.Y;
        q0e q0eVar = k72Var.c;
        m22 m22Var = (m22) q0eVar.getValue();
        m22 m22VarA = null;
        if (m22Var != null) {
            o22 o22Var2 = (o22) k72Var.h.getValue();
            boolean z = false;
            boolean z2 = o22Var2 != null && o22Var2.b(o22Var);
            n22 n22Var = o22Var != null ? o22Var.b : null;
            int i = n22Var == null ? -1 : o62.$EnumSwitchMapping$0[n22Var.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    String str = o22Var.c;
                    if (((str == null || str.length() == 0) ^ true) && !o22Var.f) {
                    }
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            m22VarA = m22.a(m22Var, z2, z, k72Var.w.get(), 1);
        }
        q0eVar.setValue(m22VarA);
        k72Var.d.setValue(((f22) k72Var.g.getValue()).a(k72Var));
        return e5f.a;
    }
}
