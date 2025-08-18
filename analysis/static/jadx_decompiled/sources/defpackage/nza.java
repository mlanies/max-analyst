package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nza extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pza Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nza(pza pzaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = pzaVar;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nza) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nza(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            kq8 kq8Var = this.Y.o;
            this.X = 1;
            xp8 xp8Var = (xp8) kq8Var;
            xp8Var.getClass();
            Object objK = j1e.k(new rp8(xp8Var, this.Z, null), this);
            if (objK != tx3Var) {
                objK = e5fVar;
            }
            if (objK == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
