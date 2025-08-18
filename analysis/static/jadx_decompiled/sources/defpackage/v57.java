package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v57 extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ eaa Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v57(je7 je7Var, eaa eaaVar, Continuation continuation) {
        super(2, continuation);
        this.X = je7Var;
        this.Y = eaaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v57) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v57(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String strO = kp.o((zua) this.X.getValue(), this.Y.a);
        if (strO == null) {
            strO = "";
        }
        return new iqe(strO);
    }
}
