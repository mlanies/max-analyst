package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fsd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gsd Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsd(gsd gsdVar, Continuation continuation) {
        super(2, continuation);
        this.Y = gsdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fsd fsdVar = (fsd) n((b00) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fsdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fsd fsdVar = new fsd(this.Y, continuation);
        fsdVar.X = obj;
        return fsdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gsd.y(this.Y, (b00) this.X);
        return e5f.a;
    }
}
