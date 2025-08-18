package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t32 extends s32 {
    public t32(int i, int i2, int i3, lx3 lx3Var, mn5 mn5Var) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? hz4.a : lx3Var, mn5Var);
    }

    @Override // defpackage.l32
    public final l32 k(lx3 lx3Var, int i, int i2) {
        return new t32(i, i2, lx3Var, this.o);
    }

    @Override // defpackage.l32
    public final mn5 l() {
        return this.o;
    }

    @Override // defpackage.s32
    public final Object n(on5 on5Var, Continuation continuation) {
        Object objD = this.o.d(on5Var, continuation);
        return objD == tx3.a ? objD : e5f.a;
    }
}
