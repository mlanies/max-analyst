package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s3d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ f4d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3d(Continuation continuation, f4d f4dVar) {
        super(2, continuation);
        this.Y = f4dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        s3d s3dVar = (s3d) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        s3dVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        s3d s3dVar = new s3d(continuation, this.Y);
        s3dVar.X = obj;
        return s3dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.E((List) this.X);
        return e5f.a;
    }
}
