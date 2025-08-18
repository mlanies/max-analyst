package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class z58 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z58(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z58 z58Var = (z58) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z58Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        z58 z58Var = new z58(continuation, this.Y);
        z58Var.X = obj;
        return z58Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        lrb lrbVar = (lrb) this.X;
        boolean z = lrbVar instanceof irb;
        MediaBarWidget mediaBarWidget = this.Y;
        if (z) {
            irb irbVar = (irb) lrbVar;
            up7 up7Var = irbVar.a;
            bc7[] bc7VarArr = MediaBarWidget.d1;
            mediaBarWidget.C0(up7Var, irbVar.b, "SELECTED_MEDIA_ALBUM");
        } else if (lrbVar instanceof krb) {
            bc7[] bc7VarArr2 = MediaBarWidget.d1;
            ((eua) mediaBarWidget.c.getValue()).h(new l5g(mediaBarWidget, 1));
        } else {
            if (!(lrbVar instanceof jrb)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr3 = MediaBarWidget.d1;
            eua euaVar = (eua) mediaBarWidget.c.getValue();
            l5g l5gVar = new l5g(mediaBarWidget, 1);
            euaVar.getClass();
            String[] strArr = eua.h;
            int i = j1c.permissions_audio_for_video_request;
            int i2 = oga.a;
            int i3 = oga.g;
            if (eua.i(l5gVar, strArr)) {
                l5gVar.c(strArr, 171, i2, i, i3);
            } else {
                euaVar.f(l5gVar, strArr, 171);
            }
        }
        return e5f.a;
    }
}
