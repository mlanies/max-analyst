package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e96 extends ffe implements a66 {
    public final /* synthetic */ z96 X;
    public final /* synthetic */ boolean Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e96(z96 z96Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = z96Var;
        this.Y = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e96 e96Var = (e96) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        e96Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new e96(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        z96 z96Var = this.X;
        Iterable<u86> iterable = (Iterable) z96Var.w0.getValue();
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (u86 u86VarB : iterable) {
            if (u86VarB.h != 0) {
                u86VarB = u86.b(u86VarB, null, null, null, 0, false, 0, null, 1983);
            }
            u86 u86VarB2 = u86VarB;
            if (this.Y) {
                u86VarB2 = u86.b(u86VarB2, null, null, null, 0, false, 0, u86VarB2.c.v0, 991);
            }
            arrayList.add(u86VarB2);
        }
        z96Var.w0.m(null, arrayList);
        return e5f.a;
    }
}
