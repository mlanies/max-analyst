package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hs3 extends ffe implements a66 {
    public final /* synthetic */ js3 X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs3(js3 js3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = js3Var;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hs3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hs3(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        js3 js3Var = this.X;
        List list = ((dn3) js3Var.b.getValue()).c;
        if (list != null) {
            return js3.a(js3Var, list, this.Y);
        }
        return null;
    }
}
