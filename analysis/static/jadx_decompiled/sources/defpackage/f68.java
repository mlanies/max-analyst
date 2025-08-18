package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;

/* loaded from: classes.dex */
public final class f68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f68 f68Var = (f68) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        f68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f68 f68Var = new f68(continuation, this.Y);
        f68Var.X = obj;
        return f68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        MediaBarWidget mediaBarWidget = this.Y;
        if (zBooleanValue) {
            bc7[] bc7VarArr = MediaBarWidget.d1;
            mediaBarWidget.getClass();
            j03 j03Var = (j03) mediaBarWidget.A0.T0(mediaBarWidget, MediaBarWidget.d1[8]);
            if (!tpa.f(j03Var.c(), "partial_media_access_widget")) {
                coc cocVar = new coc(new PartialMediaAccessWidget(null, 1, null), null, null, null, false, -1);
                cocVar.d("partial_media_access_widget");
                j03Var.a.R(cocVar);
            }
        } else {
            bc7[] bc7VarArr2 = MediaBarWidget.d1;
            mediaBarWidget.getClass();
            ((j03) mediaBarWidget.A0.T0(mediaBarWidget, MediaBarWidget.d1[8])).a();
        }
        MediaBarWidget.o0(mediaBarWidget);
        return e5f.a;
    }
}
