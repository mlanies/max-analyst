package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zid extends ffe implements a66 {
    public final /* synthetic */ String X;
    public final /* synthetic */ ajd Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zid(String str, ajd ajdVar, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = ajdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zid zidVar = (zid) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zidVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zid(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        khe kheVar = j15.a;
        pnf.o(this.Y.X, j15.a(this.X));
        return e5f.a;
    }
}
