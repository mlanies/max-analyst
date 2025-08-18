package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hhf extends ffe implements a66 {
    public final /* synthetic */ nif X;
    public final /* synthetic */ wgf Y;
    public final /* synthetic */ gef Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf(nif nifVar, wgf wgfVar, gef gefVar, Continuation continuation) {
        super(2, continuation);
        this.X = nifVar;
        this.Y = wgfVar;
        this.Z = gefVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hhf hhfVar = (hhf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hhfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hhf(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wgf wgfVar = this.Y;
        this.X.a(wgfVar.a, wgfVar, this.Z);
        return e5f.a;
    }
}
