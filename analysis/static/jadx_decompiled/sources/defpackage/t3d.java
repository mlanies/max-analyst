package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* loaded from: classes2.dex */
public final class t3d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SelectAlbumWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3d(Continuation continuation, SelectAlbumWidget selectAlbumWidget) {
        super(2, continuation);
        this.Y = selectAlbumWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        t3d t3dVar = (t3d) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        t3dVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        t3d t3dVar = new t3d(continuation, this.Y);
        t3dVar.X = obj;
        return t3dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        d3d d3dVar = (d3d) this.X;
        if (!(d3dVar instanceof d3d)) {
            throw new NoWhenBranchMatchedException();
        }
        bc7[] bc7VarArr = SelectAlbumWidget.Y;
        this.Y.n0().j(d3dVar.a);
        return e5f.a;
    }
}
