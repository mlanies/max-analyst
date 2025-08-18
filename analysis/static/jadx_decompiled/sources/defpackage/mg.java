package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ mg(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.b;
        switch (this.a) {
            case 0:
                view.setVisibility(0);
                break;
            case 1:
                view.setVisibility(0);
                break;
            case 2:
                view.setVisibility(8);
                view.setAlpha(1.0f);
                break;
            case 3:
                view.setVisibility(8);
                break;
            case 4:
                WeakHashMap weakHashMap = zmf.a;
                mmf.c(view);
                break;
            case 5:
                view.requestApplyInsets();
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
        }
    }
}
