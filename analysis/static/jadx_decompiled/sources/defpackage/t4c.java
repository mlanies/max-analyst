package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class t4c extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] o;
    public final je7 a;
    public final ix3 b;
    public final yj c;

    static {
        oi9 oi9Var = new oi9(t4c.class, "size", "getSize()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButton$Size;");
        nec.a.getClass();
        o = new bc7[]{oi9Var};
    }

    public t4c(Context context) {
        super(context, null);
        this.a = tu0.r(3, new xda(context, 19));
        ix3 ix3Var = new ix3(tu0.G(32 * fk4.d().getDisplayMetrics().density));
        this.b = ix3Var;
        this.c = new yj(this);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClipToOutline(true);
        setOutlineProvider(ix3Var);
        setBackgroundColor(qp4.u0.j(this).b().a.g);
        setClickable(true);
        addView(getTextView());
    }

    public static final void a(t4c t4cVar, s4c s4cVar) {
        float f;
        float f2;
        int iG;
        TextView textView = t4cVar.getTextView();
        int iOrdinal = s4cVar.ordinal();
        if (iOrdinal == 0) {
            f = 32.0f;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f = 44.0f;
        }
        textView.setTextSize(f);
        int iOrdinal2 = s4cVar.ordinal();
        if (iOrdinal2 == 0) {
            f2 = fk4.d().getDisplayMetrics().density * 32.0f;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = fk4.d().getDisplayMetrics().density * 50.0f;
        }
        t4cVar.b.a = f2;
        ViewGroup.LayoutParams layoutParams = t4cVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int iOrdinal3 = s4cVar.ordinal();
        if (iOrdinal3 == 0) {
            iG = tu0.G(64 * fk4.d().getDisplayMetrics().density);
        } else {
            if (iOrdinal3 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iG = tu0.G(80 * fk4.d().getDisplayMetrics().density);
        }
        layoutParams.height = iG;
        layoutParams.width = iG;
        t4cVar.setLayoutParams(layoutParams);
    }

    private final TextView getTextView() {
        return (TextView) this.a.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final s4c getSize() {
        bc7 bc7Var = o[0];
        return (s4c) this.c.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        getTextView().setTextColor(fkaVar.getText().e);
        setBackgroundColor(fkaVar.b().a.g);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setSize(s4c s4cVar) {
        this.c.o1(this, o[0], s4cVar);
    }

    public final void setText(CharSequence charSequence) {
        getTextView().setText(charSequence);
        b();
    }
}
