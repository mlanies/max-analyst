package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes.dex */
public final class g68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g68 g68Var = (g68) n((v8b) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        g68 g68Var = new g68(continuation, this.Y);
        g68Var.X = obj;
        return g68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int iOrdinal = ((v8b) this.X).ordinal();
        MediaBarWidget mediaBarWidget = this.Y;
        if (iOrdinal == 0) {
            bc7[] bc7VarArr = MediaBarWidget.d1;
            j03 j03VarY0 = mediaBarWidget.y0();
            if (!tpa.f(j03VarY0.c(), "media_gallery_widget")) {
                coc cocVar = new coc(new MediaGalleryWidget(mediaBarWidget.a, null, 2, null), null, null, null, false, -1);
                cocVar.d("media_gallery_widget");
                j03VarY0.a.R(cocVar);
            }
            mediaBarWidget.A0().setVisibility(0);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr2 = MediaBarWidget.d1;
            j03 j03VarY02 = mediaBarWidget.y0();
            if (!tpa.f(j03VarY02.c(), "permissions_widget")) {
                coc cocVar2 = new coc(new MediaBarPermissionWidget(), null, null, null, false, -1);
                cocVar2.d("permissions_widget");
                j03VarY02.a.R(cocVar2);
            }
            mediaBarWidget.A0().setVisibility(8);
        }
        return e5f.a;
    }
}
