package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ax2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ dn3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        dn3 dn3Var = (dn3) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ax2 ax2Var = new ax2(3, continuation, 0);
                ax2Var.Y = dn3Var;
                od2.a0(e5f.a);
                return ax2Var.Y;
            default:
                ax2 ax2Var2 = new ax2(3, continuation, 1);
                ax2Var2.Y = dn3Var;
                return ax2Var2.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                return this.Y;
            default:
                od2.a0(obj);
                return this.Y.a;
        }
    }
}
