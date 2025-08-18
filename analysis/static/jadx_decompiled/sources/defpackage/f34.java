package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class f34 implements i8e {
    public final m56 a;
    public du4 b = du4.b;

    public f34(o59 o59Var) {
        this.a = o59Var;
    }

    @Override // defpackage.i8e
    public final Object a(int i) {
        if (i < 0) {
            return null;
        }
        return (CharSequence) this.a.invoke(Integer.valueOf(i));
    }

    @Override // defpackage.i8e
    public final c8e b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(new TextView(viewGroup.getContext()));
        return new l34(frameLayout, this.b);
    }

    @Override // defpackage.i8e
    public final void c(c8e c8eVar, int i) {
        ((l34) c8eVar).o.setText((CharSequence) a(i));
    }
}
