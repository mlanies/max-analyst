package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class oa8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oa8 oa8Var = (oa8) n((g86) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oa8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oa8 oa8Var = new oa8(this.Y, continuation);
        oa8Var.X = obj;
        return oa8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        g86 g86Var = (g86) this.X;
        if (!(g86Var instanceof e86)) {
            if (!(g86Var instanceof f86)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaGalleryWidget mediaGalleryWidget = this.Y;
            ((eua) mediaGalleryWidget.a.getValue()).g(new l5g(mediaGalleryWidget, 1));
        }
        return e5f.a;
    }
}
