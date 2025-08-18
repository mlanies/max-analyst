package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class s5d extends dle implements u5d {
    public s5d() {
        super(new w8c(5));
    }

    public final int h0() {
        if (!br7.H((je7) this.c)) {
            return 0;
        }
        return rh4.c(4, fk4.d().getDisplayMetrics().density, L());
    }

    @Override // defpackage.u5d
    public final void setAlias(Layout layout) {
        if (layout != null) {
            ((t5d) Q()).setLayout(layout);
            Q().setVisibility(0);
            t();
        } else {
            je7 je7Var = (je7) this.c;
            if (je7Var.a()) {
                ((t5d) je7Var.getValue()).setVisibility(8);
            }
        }
    }

    @Override // defpackage.u5d
    public final void setAliasColor(int i) {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            ((t5d) je7Var.getValue()).setTextColor(i);
        }
    }
}
