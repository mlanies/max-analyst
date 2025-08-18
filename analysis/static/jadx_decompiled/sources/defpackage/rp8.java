package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rp8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xp8 Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp8(xp8 xp8Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = xp8Var;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rp8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rp8(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xp8 xp8Var = this.Y;
            j31 j31Var = new j31(new m58(xp8Var.i, 4), xp8Var.h, new jf1(xp8Var, this.Z, (Continuation) null, 4), 4);
            pp8 pp8Var = new pp8(xp8Var, null);
            this.X = 1;
            if (od2.r(j31Var, pp8Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
