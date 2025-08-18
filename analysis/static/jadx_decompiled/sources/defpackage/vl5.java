package defpackage;

import android.widget.TextView;

/* loaded from: classes2.dex */
public final class vl5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ vl5(TextView textView, Runnable runnable, int i) {
        this.a = i;
        this.b = textView;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.removeCallbacks(this.c);
                break;
            default:
                this.b.removeCallbacks(this.c);
                break;
        }
    }
}
