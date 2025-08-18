package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xr extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c62 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ zr s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr(c62 c62Var, boolean z, zr zrVar, Continuation continuation) {
        super(2, continuation);
        this.Y = c62Var;
        this.Z = z;
        this.s0 = zrVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xr(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            c62 c62Var = this.Y;
            String str = c62Var.b.a;
            bc7[] bc7VarArr = zr.J0;
            zr zrVar = this.s0;
            tfg.A(str, this.Z, ((p7b) zrVar.u()).a);
            ao7 ao7Var = (ao7) zrVar.B0.getValue();
            Context contextT = zrVar.t();
            this.X = 1;
            if (ao7.a(ao7Var, contextT, c62Var.b, this) == tx3Var) {
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
