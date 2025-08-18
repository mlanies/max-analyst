package defpackage;

import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class a68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a68 a68Var = (a68) n((r86) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        a68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        a68 a68Var = new a68(continuation, this.Y);
        a68Var.X = obj;
        return a68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        r86 r86Var = (r86) this.X;
        if (!(r86Var instanceof l86)) {
            boolean z = r86Var instanceof m86;
            MediaBarWidget mediaBarWidget = this.Y;
            if (z) {
                bc7[] bc7VarArr = MediaBarWidget.d1;
                p58 p58VarB0 = mediaBarWidget.B0();
                p58VarB0.x0.m(null, ((m86) r86Var).a);
            } else if (r86Var instanceof n86) {
                n86 n86Var = (n86) r86Var;
                up7 up7VarH = ay7.H(n86Var.c);
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                mediaBarWidget.C0(up7VarH, n86Var.a, n86Var.b);
            } else if (r86Var instanceof p86) {
                bc7[] bc7VarArr3 = MediaBarWidget.d1;
                ew1 ew1VarS0 = mediaBarWidget.s0();
                int i = ((p86) r86Var).a;
                ew1VarS0.s0 = i;
                ew1VarS0.t0 = i;
                ViewGroup.LayoutParams layoutParams = ew1VarS0.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = i;
                layoutParams.height = i;
                ew1VarS0.setLayoutParams(layoutParams);
            } else if (r86Var instanceof q86) {
                mediaBarWidget.E0 = ((q86) r86Var).a;
                MediaBarWidget.o0(mediaBarWidget);
            } else {
                if (!(r86Var instanceof o86)) {
                    throw new NoWhenBranchMatchedException();
                }
                MediaBarWidget.n0(mediaBarWidget, ((o86) r86Var).a);
            }
        }
        return e5f.a;
    }
}
