package defpackage;

import android.os.Handler;
import android.view.View;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* loaded from: classes2.dex */
public final class e6c implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public e6c(sv8 sv8Var, Handler handler, sv8 sv8Var2, enf enfVar) {
        this.a = 1;
        this.b = sv8Var;
        this.c = handler;
        this.o = null;
        this.X = sv8Var2;
        this.Y = enfVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                hm9.n(((h6c) this.c).a, "onDetach");
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.o;
                rLottieDrawable.removeDrawableLoadListener((f6c) this.X);
                rLottieDrawable.removeOnAllFramesRenderedListener((g6c) this.Y);
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                ((Handler) this.c).removeCallbacksAndMessages(null);
                k56 k56Var = (k56) this.o;
                if (k56Var != null) {
                    k56Var.invoke();
                }
                ((View) this.X).removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.Y);
                break;
        }
    }

    public e6c(RLottieImageView rLottieImageView, h6c h6cVar, RLottieDrawable rLottieDrawable, f6c f6cVar, g6c g6cVar) {
        this.a = 0;
        this.b = rLottieImageView;
        this.c = h6cVar;
        this.o = rLottieDrawable;
        this.X = f6cVar;
        this.Y = g6cVar;
    }
}
