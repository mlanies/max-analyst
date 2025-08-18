package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ td6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw2(gw2 gw2Var, td6 td6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2Var;
        this.Z = td6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dw2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ds3 ds3Var = (ds3) this.Y.w0.getValue();
            List listSingletonList = Collections.singletonList(this.Z.v0);
            ol3 ol3Var = ol3.b;
            this.X = 1;
            obj = ds3Var.e(listSingletonList, ol3Var, this);
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
