package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class dz0 extends ppd {
    public final wmc X;

    public dz0(wmc wmcVar, ExecutorService executorService) {
        super(executorService);
        this.X = wmcVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        if (!(hqdVar instanceof cz0)) {
            hqdVar.A((ol7) C(i));
            return;
        }
        cz0 cz0Var = (cz0) hqdVar;
        ol7 ol7Var = (ol7) C(i);
        if (ol7Var instanceof e01) {
            View view = cz0Var.a;
            ufd ufdVar = (ufd) view;
            ufdVar.setThemeDepended(pfd.b);
            cz0Var.A(ol7Var);
            boolean z = ((e01) ol7Var).t0;
            wmc wmcVar = this.X;
            if (z) {
                ufdVar.setEnabled(true);
                tu0.K(view, 300L, new bz0(cz0Var, wmcVar, (e01) ol7Var, 0));
            } else {
                ufdVar.setEnabled(false);
                view.setOnClickListener(null);
            }
            ufdVar.setOnSwitchCheckedListener(new bk(2, wmcVar));
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i == y7a.g) {
            return new cz0(new ufd(viewGroup.getContext(), null));
        }
        int i2 = y7a.f;
        pq9 pq9Var = qp4.u0;
        if (i == i2) {
            TextView textView = new TextView(viewGroup.getContext());
            i4f.u.b(textView, du4.b);
            textView.setTextColor(pq9Var.p(textView).c.getText().g);
            return new az0(textView, 1);
        }
        if (i != y7a.e) {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
        TextView textView2 = new TextView(viewGroup.getContext());
        i4f.n.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
        return new az0(textView2, 0);
    }
}
