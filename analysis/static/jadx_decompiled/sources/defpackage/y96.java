package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y96 extends ffe implements a66 {
    public final /* synthetic */ z96 X;
    public final /* synthetic */ boolean Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y96(z96 z96Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = z96Var;
        this.Y = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        y96 y96Var = (y96) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        y96Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new y96(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        hm9.n("z96", "updateUiItemsBySelections()");
        z96 z96Var = this.X;
        Iterable<u86> iterable = (Iterable) z96Var.w0.getValue();
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (u86 u86Var : iterable) {
            int iT = this.Y ? 0 : z96Var.t(u86Var.c);
            arrayList.add(u86.b(u86Var, null, null, null, iT, !((Boolean) z96Var.v0.getValue()).booleanValue() || iT > 0, 0, null, 1855));
        }
        z96Var.w0.m(null, arrayList);
        return e5f.a;
    }
}
