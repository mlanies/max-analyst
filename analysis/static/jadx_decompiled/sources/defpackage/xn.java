package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class xn implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    public final /* synthetic */ yn b;

    public xn(yn ynVar, sn snVar) {
        this.b = ynVar;
        this.a = snVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.P0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
