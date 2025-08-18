package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x32 extends s32 {
    public final c66 X;

    public x32(c66 c66Var, mn5 mn5Var, lx3 lx3Var, int i, int i2) {
        super(i, i2, lx3Var, mn5Var);
        this.X = c66Var;
    }

    @Override // defpackage.l32
    public final l32 k(lx3 lx3Var, int i, int i2) {
        return new x32(this.X, this.o, lx3Var, i, i2);
    }

    @Override // defpackage.s32
    public final Object n(on5 on5Var, Continuation continuation) {
        Object objK = j1e.k(new w32(this, on5Var, null), continuation);
        return objK == tx3.a ? objK : e5f.a;
    }
}
