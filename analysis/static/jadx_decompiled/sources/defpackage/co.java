package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class co extends tu0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ WeakReference p;
    public final /* synthetic */ io q;

    public co(io ioVar, int i, int i2, WeakReference weakReference) {
        this.q = ioVar;
        this.n = i;
        this.o = i2;
        this.p = weakReference;
    }

    @Override // defpackage.tu0
    public final void w(int i) {
    }

    @Override // defpackage.tu0
    public final void x(Typeface typeface) {
        int i = this.n;
        if (i != -1) {
            typeface = ho.a(typeface, i, (this.o & 2) != 0);
        }
        io ioVar = this.q;
        if (ioVar.m) {
            ioVar.l = typeface;
            TextView textView = (TextView) this.p.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new eo(textView, typeface, ioVar.j, 0));
                } else {
                    textView.setTypeface(typeface, ioVar.j);
                }
            }
        }
    }
}
