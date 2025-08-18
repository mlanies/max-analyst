package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class tl5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl5 b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ wl5 o;

    public /* synthetic */ tl5(yl5 yl5Var, TextView textView, wl5 wl5Var, int i) {
        this.a = i;
        this.b = yl5Var;
        this.c = textView;
        this.o = wl5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yl5 yl5Var = this.b;
                boolean z = yl5Var.b;
                wl5 wl5Var = this.o;
                TextView textView = this.c;
                if (!z) {
                    textView.invalidate();
                    wl5Var.c.set(false);
                    break;
                } else {
                    pla.a(textView, new tl5(textView, textView, yl5Var, wl5Var));
                    break;
                }
            case 1:
                yl5 yl5Var2 = this.b;
                boolean z2 = yl5Var2.b;
                wl5 wl5Var2 = this.o;
                TextView textView2 = this.c;
                if (!z2) {
                    textView2.invalidate();
                    wl5Var2.c.set(false);
                    break;
                } else {
                    pla.a(textView2, new tl5(textView2, textView2, yl5Var2, wl5Var2));
                    break;
                }
            default:
                qqe.b(this.c, this.b);
                this.o.c.set(false);
                break;
        }
    }

    public tl5(View view, TextView textView, yl5 yl5Var, wl5 wl5Var) {
        this.a = 2;
        this.c = textView;
        this.b = yl5Var;
        this.o = wl5Var;
    }
}
