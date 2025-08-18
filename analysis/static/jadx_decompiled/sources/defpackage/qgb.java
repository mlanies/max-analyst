package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qgb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vgb Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ RectF s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgb(vgb vgbVar, String str, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.Y = vgbVar;
        this.Z = str;
        this.s0 = rectF;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qgb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qgb(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gv4 gv4Var = this.Y.b;
            this.X = 1;
            if (gv4Var.h(this.Z, this.s0, this) == tx3Var) {
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
