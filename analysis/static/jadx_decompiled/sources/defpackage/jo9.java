package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jo9 extends ffe implements a66 {
    public final /* synthetic */ String X;
    public final /* synthetic */ Rect Y;
    public final /* synthetic */ mo9 Z;
    public final /* synthetic */ RectF s0;
    public final /* synthetic */ int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo9(String str, Rect rect, mo9 mo9Var, RectF rectF, int i, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = rect;
        this.Z = mo9Var;
        this.s0 = rectF;
        this.t0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jo9 jo9Var = (jo9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jo9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jo9(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        mo9 mo9Var = this.Z;
        y7d y7dVar = (y7d) mo9Var.d.getValue();
        String str = this.X;
        mo9Var.i.m(null, new fd0(c37.i(str, this.Y, y7dVar), str, c37.h(this.s0), this.t0));
        return e5f.a;
    }
}
