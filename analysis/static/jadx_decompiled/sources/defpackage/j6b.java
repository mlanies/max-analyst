package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j6b extends ffe implements a66 {
    public final /* synthetic */ k56 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6b(zja zjaVar, Continuation continuation) {
        super(2, continuation);
        this.X = zjaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        j6b j6bVar = (j6b) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        j6bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j6b((zja) this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.invoke();
        return e5f.a;
    }
}
