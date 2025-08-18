package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class zk9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;

    public /* synthetic */ zk9(int i, View view, boolean z) {
        this.a = i;
        this.b = z;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a7g a7gVar;
        View view = this.c;
        boolean z = this.b;
        switch (this.a) {
            case 0:
                if (z) {
                    view.setVisibility(0);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    view.setVisibility(8);
                    break;
                }
                break;
            default:
                if (z) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        a7gVar = vmf.c(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        a7gVar = new a7g(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                        }
                        a7gVar = null;
                    }
                    if (a7gVar != null) {
                        a7gVar.a.x(8);
                        break;
                    }
                }
                ((InputMethodManager) lt3.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }

    public /* synthetic */ zk9(View view) {
        this.a = 2;
        this.c = view;
        this.b = false;
    }
}
