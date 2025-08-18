package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class kt5 extends ppd {
    public final jt5 X;

    public kt5(ExecutorService executorService, jt5 jt5Var) {
        super(executorService);
        this.X = jt5Var;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        int iL = l(i) & 536870911;
        boolean zM = s36.m(iL, 1);
        jt5 jt5Var = this.X;
        if (zM) {
            tt5 tt5Var = (tt5) hqdVar;
            tt5Var.A((st5) ((ol7) C(i)));
            tt5Var.G0 = jt5Var;
        } else if (s36.m(iL, 8)) {
            tu0.K(((mt5) hqdVar).a, 300L, new c5(27, jt5Var));
        } else {
            if (!s36.m(iL, 4)) {
                super.r(hqdVar, i);
                return;
            }
            wu5 wu5Var = (wu5) hqdVar;
            pu5 pu5Var = (pu5) ((ol7) C(i));
            wu5Var.A(pu5Var);
            ((d12) wu5Var.a).setOnTrailClick(new vu5(jt5Var, 0, pu5Var));
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (s36.m(i2, 1)) {
            return new tt5(viewGroup);
        }
        if (s36.m(i2, 4)) {
            d12 d12Var = new d12(viewGroup.getContext());
            wu5 wu5Var = new wu5(d12Var);
            d12Var.setTrail(woc.w);
            return wu5Var;
        }
        Continuation continuation = null;
        if (!s36.m(i2, 2)) {
            if (!s36.m(i2, 8)) {
                throw new IllegalArgumentException(wg0.g(i, "Unknown view type ", "!"));
            }
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
            mt5 mt5Var = new mt5(oneMeButton);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            oneMeButton.setSize(c7a.c);
            oneMeButton.setMode(b7a.c);
            oneMeButton.setAppearance(z6a.b);
            oneMeButton.setText(qba.i);
            return mt5Var;
        }
        e11 e11Var = new e11(0, this.X, jt5.class, "onAddChatsClick", "onAddChatsClick()V", 0, 23);
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setImageResource(gpc.h);
        TextView textView = new TextView(context);
        i4f.j.b(textView, du4.b);
        textView.setText(qba.g);
        v3c.y(new jf1(appCompatImageView, textView, continuation, 3), frameLayout);
        float f = 24;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), 8388627);
        float f2 = 18;
        layoutParams2.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        layoutParams2.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        float f3 = 12;
        layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        layoutParams2.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        frameLayout.addView(appCompatImageView, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 8388627);
        layoutParams3.leftMargin = rh4.c(f, fk4.d().getDisplayMetrics().density, tu0.G(f2 * fk4.d().getDisplayMetrics().density) * 2);
        layoutParams3.rightMargin = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        frameLayout.addView(textView, layoutParams3);
        bt5 bt5Var = new bt5(frameLayout);
        tu0.K(frameLayout, 300L, new m6(10, e11Var));
        return bt5Var;
    }
}
