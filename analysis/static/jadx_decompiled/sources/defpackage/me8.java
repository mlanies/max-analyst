package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class me8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        me8 me8Var = (me8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        me8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        me8 me8Var = new me8(continuation, this.Y);
        me8Var.X = obj;
        return me8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ht3 ht3Var = (ht3) this.X;
        boolean z = ht3Var instanceof et3;
        MediaPickerScreen mediaPickerScreen = this.Y;
        if (z) {
            MediaPickerScreen.m0(mediaPickerScreen, false);
            cla claVarO0 = mediaPickerScreen.o0();
            CharSequence charSequenceB = ((et3) ht3Var).a.b(mediaPickerScreen.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            claVarO0.setTitle(charSequenceB);
            j03 j03Var = (j03) mediaPickerScreen.b.T0(mediaPickerScreen, MediaPickerScreen.B0[0]);
            if (!tpa.f(j03Var.c(), "MEDIA_GALLERY_WIDGET_TAG")) {
                coc cocVar = new coc(new MediaGalleryWidget(mediaPickerScreen.c, mediaPickerScreen.n0(), null), null, null, null, false, -1);
                cocVar.d("MEDIA_GALLERY_WIDGET_TAG");
                j03Var.a.R(cocVar);
            }
        } else if (ht3Var instanceof ft3) {
            MediaPickerScreen.m0(mediaPickerScreen, true);
        } else {
            if (!(ht3Var instanceof gt3)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaPickerScreen.m0(mediaPickerScreen, false);
            j03 j03Var2 = (j03) mediaPickerScreen.b.T0(mediaPickerScreen, MediaPickerScreen.B0[0]);
            if (!tpa.f(j03Var2.c(), "MEDIA_GALLERY_WIDGET_PERMISSION_TAG")) {
                coc cocVar2 = new coc(new MediaPickerPermissionWidget(mediaPickerScreen.c, null), null, null, null, false, -1);
                cocVar2.d("MEDIA_GALLERY_WIDGET_PERMISSION_TAG");
                j03Var2.a.R(cocVar2);
            }
        }
        return e5f.a;
    }
}
