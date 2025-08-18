package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class pa8 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        pa8 pa8Var = (pa8) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pa8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pa8 pa8Var = new pa8(this.Y, continuation);
        pa8Var.X = ((Boolean) obj).booleanValue();
        return pa8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = this.X;
        bc7[] bc7VarArr = MediaGalleryWidget.Z;
        this.Y.m0().setRefreshingNext(z);
        return e5f.a;
    }
}
