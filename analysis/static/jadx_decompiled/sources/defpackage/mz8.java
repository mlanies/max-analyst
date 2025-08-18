package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mz8 extends ffe implements e66 {
    public int X;
    public /* synthetic */ yy8 Y;
    public /* synthetic */ bz8 Z;
    public /* synthetic */ boolean s0;
    public final /* synthetic */ xz8 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz8(xz8 xz8Var, Continuation continuation) {
        super(4, continuation);
        this.t0 = xz8Var;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        mz8 mz8Var = new mz8(this.t0, (Continuation) obj4);
        mz8Var.Y = (yy8) obj;
        mz8Var.Z = (bz8) obj2;
        mz8Var.s0 = zBooleanValue;
        return mz8Var.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            yy8 yy8Var = this.Y;
            bz8 bz8Var = this.Z;
            boolean z = this.s0;
            this.Y = null;
            this.X = 1;
            obj = xz8.q(this.t0, yy8Var, bz8Var, z, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
