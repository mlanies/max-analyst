package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fzd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jzd Y;
    public final /* synthetic */ wm3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzd(jzd jzdVar, wm3 wm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jzdVar;
        this.Z = wm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fzd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fzd(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ds3 ds3Var = (ds3) this.Y.Y.getValue();
            List listSingletonList = Collections.singletonList(this.Z);
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
