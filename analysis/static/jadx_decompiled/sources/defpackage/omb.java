package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class omb extends ffe implements a66 {
    public final /* synthetic */ cnb X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omb(cnb cnbVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = cnbVar;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        omb ombVar = (omb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ombVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new omb(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cnb cnbVar = this.X;
        zfc.a((zfc) cnbVar.o.getValue(), this.Y);
        pnf.o(cnbVar.A0, pkb.b);
        return e5f.a;
    }
}
