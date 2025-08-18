package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class qa8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qa8 qa8Var = (qa8) n((k86) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qa8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qa8 qa8Var = new qa8(this.Y, continuation);
        qa8Var.X = obj;
        return qa8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        k86 k86Var = (k86) this.X;
        boolean z = k86Var instanceof h86;
        MediaGalleryWidget mediaGalleryWidget = this.Y;
        if (z) {
            bc7[] bc7VarArr = MediaGalleryWidget.Z;
            mediaGalleryWidget.m0().x0(0);
            z96.r(mediaGalleryWidget.o0(), true, 2);
        } else if (k86Var instanceof j86) {
            bc7[] bc7VarArr2 = MediaGalleryWidget.Z;
            z96 z96VarO0 = mediaGalleryWidget.o0();
            q4d q4dVar = ((j86) k86Var).a;
            z96VarO0.getClass();
            z96VarO0.u(q4dVar.a, true);
        } else {
            if (!(k86Var instanceof i86)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr3 = MediaGalleryWidget.Z;
            z96 z96VarO02 = mediaGalleryWidget.o0();
            b86 b86Var = ((i86) k86Var).a;
            z96VarO02.getClass();
            hm9.n("z96", "selectAlbum " + b86Var);
            ((ad) z96VarO02.J0.getValue()).f("MEDIA_SEND_ALBUM_CHANGED");
            q0e q0eVar = z96VarO02.B0;
            b86 b86Var2 = (b86) q0eVar.getValue();
            if (!tpa.f(b86Var2, b86Var)) {
                try {
                    x77 x77Var = z96VarO02.H0;
                    if (x77Var != null) {
                        x77Var.cancel(null);
                    }
                    vxd vxdVar = z96VarO02.I0;
                    if (vxdVar != null) {
                        vxdVar.cancel((CancellationException) null);
                    }
                } catch (Throwable unused) {
                }
                z96VarO02.z0.m(null, Boolean.FALSE);
                q0eVar.m(null, b86Var);
                z96VarO02.w0.m(null, nz4.a);
                z96VarO02.I0 = pnf.n(z96VarO02, z96VarO02.o, null, new u96(b86Var2, z96VarO02, b86Var, null), 2);
            }
        }
        return e5f.a;
    }
}
