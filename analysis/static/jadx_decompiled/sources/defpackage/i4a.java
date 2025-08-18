package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class i4a extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] c;
    public final yj a;
    public final TextView b;

    static {
        oi9 oi9Var = new oi9(i4a.class, "appearance", "getAppearance()Lone/me/pinbars/unknowncontact/OneMeActionButton$Appearance;");
        nec.a.getClass();
        c = new bc7[]{oi9Var};
    }

    public i4a(Context context) {
        super(context, null);
        this.a = new yj(this);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        i4f.D.b(textView, du4.b);
        textView.setGravity(17);
        this.b = textView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        float f = 40;
        setMinimumHeight(tu0.G(fk4.d().getDisplayMetrics().density * f));
        setMinimumWidth(tu0.G(f * fk4.d().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
        float f2 = 16;
        float f3 = 10;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        addView(textView);
        onThemeChanged(qp4.u0.j(this));
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = qp4.u0.j(this).d().a.a.h;
        return new RippleDrawable(ColorStateList.valueOf(i), null, new ColorDrawable(-1));
    }

    public final h4a getAppearance() {
        bc7 bc7Var = c[0];
        return (h4a) this.a.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        int i;
        int iOrdinal = getAppearance().ordinal();
        if (iOrdinal == 0) {
            i = isEnabled() ? fkaVar.getText().j : fkaVar.d().c.b.g;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = isEnabled() ? fkaVar.getText().b : fkaVar.d().c.b.c;
        }
        this.b.setTextColor(i);
        setBackground(getBackgroundDrawable());
        invalidate();
    }

    public final void setAppearance(h4a h4aVar) {
        this.a.o1(this, c[0], h4aVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        onThemeChanged(qp4.u0.j(this));
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
