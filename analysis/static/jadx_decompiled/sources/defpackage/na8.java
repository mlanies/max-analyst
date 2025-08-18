package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class na8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        na8 na8Var = (na8) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        na8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        na8 na8Var = new na8(this.Y, continuation);
        na8Var.X = obj;
        return na8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        list.size();
        bc7[] bc7VarArr = MediaGalleryWidget.Z;
        MediaGalleryWidget mediaGalleryWidget = this.Y;
        mediaGalleryWidget.m0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        ((p76) mediaGalleryWidget.o.getValue()).E(list);
        mediaGalleryWidget.n0().X.m(null, Integer.valueOf(list.size()));
        return e5f.a;
    }
}
