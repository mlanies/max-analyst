package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class jpf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ lpf c;
    public final /* synthetic */ ViewTreeObserver o;

    public /* synthetic */ jpf(View view, lpf lpfVar, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = view;
        this.c = lpfVar;
        this.o = viewTreeObserver;
        this.X = viewGroup;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.X;
                ViewTreeObserver viewTreeObserver = this.o;
                lpf lpfVar = this.c;
                if (!zIsAttachedToWindow) {
                    mpf.a(lpfVar, viewTreeObserver, (ViewGroup) view2);
                    break;
                } else {
                    view.addOnAttachStateChangeListener(new jpf(view, lpfVar, viewTreeObserver, (ViewGroup) view2, 2));
                    break;
                }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                this.b.removeOnAttachStateChangeListener(this);
                mpf.a(this.c, this.o, (ViewGroup) this.X);
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                mpf.a(this.c, this.o, (ViewGroup) this.X);
                break;
        }
    }
}
