package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bza extends ffe implements a66 {
    public final /* synthetic */ dza X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bza(dza dzaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = dzaVar;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bza bzaVar = (bza) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bzaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bza(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((ti9) this.X.c.g.getValue()).setValue(this.Y);
        return e5f.a;
    }
}
