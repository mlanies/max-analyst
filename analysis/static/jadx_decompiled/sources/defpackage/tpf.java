package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class tpf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ vpf o;

    public /* synthetic */ tpf(View view, ViewTreeObserver viewTreeObserver, vpf vpfVar, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = viewTreeObserver;
        this.o = vpfVar;
        this.X = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.X;
                vpf vpfVar = this.o;
                ViewTreeObserver viewTreeObserver = this.c;
                if (!zIsAttachedToWindow) {
                    cd6.a(vpfVar, view2, viewTreeObserver);
                    break;
                } else {
                    view.addOnAttachStateChangeListener(new tpf(view, viewTreeObserver, vpfVar, view2, 1));
                    break;
                }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                cd6.a(this.o, this.X, this.c);
                break;
        }
    }
}
