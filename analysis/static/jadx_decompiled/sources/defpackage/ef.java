package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class ef implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ef(View view, int i) {
        this.a = i;
        this.b = view;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.b;
        switch (this.a) {
            case 0:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = zmf.a;
                mmf.c(view);
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = zmf.a;
                mmf.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }
}
