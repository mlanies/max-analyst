package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hr extends ffe implements a66 {
    public kr X;
    public int Y;
    public final /* synthetic */ kr Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(kr krVar, Continuation continuation) {
        super(2, continuation);
        this.Z = krVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hr(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        kr krVar;
        kr krVar2;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            krVar = this.Z;
            nn7 nn7Var = (nn7) krVar.v0.getValue();
            this.X = krVar;
            this.Y = 1;
            obj = j47.t0(((w9a) ((kke) nn7Var.c.getValue())).b(), new mn7(nn7Var, true, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                krVar2 = this.X;
                od2.a0(obj);
                krVar2.x0 = (Map) obj;
                return e5f.a;
            }
            krVar = this.X;
            od2.a0(obj);
        }
        krVar.w0 = (Map) obj;
        kr krVar3 = this.Z;
        nn7 nn7Var2 = (nn7) krVar3.v0.getValue();
        this.X = krVar3;
        this.Y = 2;
        Object objT0 = j47.t0(((w9a) ((kke) nn7Var2.c.getValue())).b(), new mn7(nn7Var2, false, null), this);
        if (objT0 == tx3Var) {
            return tx3Var;
        }
        obj = objT0;
        krVar2 = krVar3;
        krVar2.x0 = (Map) obj;
        return e5f.a;
    }
}
