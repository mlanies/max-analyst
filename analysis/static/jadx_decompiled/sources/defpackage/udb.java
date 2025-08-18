package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class udb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ feb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udb(feb febVar, Continuation continuation) {
        super(2, continuation);
        this.Y = febVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        udb udbVar = (udb) n((pdb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        udbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        udb udbVar = new udb(this.Y, continuation);
        udbVar.X = obj;
        return udbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.y0.setValue((pdb) this.X);
        return e5f.a;
    }
}
