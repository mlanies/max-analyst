package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tqe extends ffe implements a66 {
    public /* synthetic */ float X;
    public final /* synthetic */ vqe Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqe(vqe vqeVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vqeVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tqe tqeVar = (tqe) n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tqeVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tqe tqeVar = new tqe(this.Y, continuation);
        tqeVar.X = ((Number) obj).floatValue();
        return tqeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        float f = this.X;
        vqe vqeVar = this.Y;
        vqeVar.b.setTextSize(0, vqeVar.o + f);
        return e5f.a;
    }
}
