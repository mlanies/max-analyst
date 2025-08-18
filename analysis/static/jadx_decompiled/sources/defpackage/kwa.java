package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;

/* loaded from: classes.dex */
public final class kwa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PhotoViewerWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwa(Continuation continuation, PhotoViewerWidget photoViewerWidget) {
        super(2, continuation);
        this.Y = photoViewerWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kwa kwaVar = (kwa) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kwaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kwa kwaVar = new kwa(continuation, this.Y);
        kwaVar.X = obj;
        return kwaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        q35 q35Var = (q35) this.X;
        bc7[] bc7VarArr = PhotoViewerWidget.X;
        PhotoViewerWidget photoViewerWidget = this.Y;
        photoViewerWidget.getClass();
        if (q35Var instanceof k35) {
            k35 k35Var = (k35) q35Var;
            if (tpa.f(k35Var.a.x(), photoViewerWidget.m0()) && k35Var.a.j() == photoViewerWidget.n0()) {
                sb8 sb8VarY = photoViewerWidget.p0().y(photoViewerWidget.n0(), photoViewerWidget.m0());
                jb8 jb8Var = sb8VarY instanceof jb8 ? (jb8) sb8VarY : null;
                if (jb8Var != null) {
                    if (photoViewerWidget.o0().getFailure()) {
                        photoViewerWidget.p0().A(photoViewerWidget.n0(), photoViewerWidget.m0());
                        photoViewerWidget.o0().r(jb8Var.o, photoViewerWidget.o0().getFailure());
                    } else {
                        photoViewerWidget.p0().B(photoViewerWidget.n0(), photoViewerWidget.m0());
                    }
                }
            }
        } else if (q35Var instanceof m35) {
            m35 m35Var = (m35) q35Var;
            if (tpa.f(m35Var.a.Y, photoViewerWidget.m0())) {
                jb8 jb8Var2 = m35Var.a;
                if (jb8Var2.a == photoViewerWidget.n0()) {
                    photoViewerWidget.o0().r(jb8Var2.o, true);
                }
            }
        }
        return e5f.a;
    }
}
