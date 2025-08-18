package defpackage;

import android.text.Layout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g29 extends ffe implements a66 {
    public final /* synthetic */ ie7 X;
    public final /* synthetic */ je7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g29(ie7 ie7Var, khe kheVar, Continuation continuation) {
        super(2, continuation);
        this.X = ie7Var;
        this.Y = kheVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g29 g29Var = (g29) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g29Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new g29(this.X, (khe) this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.a.b((Layout) this.Y.getValue());
        return e5f.a;
    }
}
