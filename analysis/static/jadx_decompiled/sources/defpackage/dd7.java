package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class dd7 extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] c;
    public final TextView a;
    public final yj b;

    static {
        oi9 oi9Var = new oi9(dd7.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;");
        nec.a.getClass();
        c = new bc7[]{oi9Var};
    }

    public dd7(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        textView.setId(xoc.B0);
        i4f.q.b(textView, du4.b);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLetterSpacing(0.0f);
        textView.setSingleLine(true);
        this.a = textView;
        this.b = new yj(10, this, (y5a) y5a.g.getValue());
        b(getTabItem().c, qp4.u0.j(this));
        setLayoutParams(new ViewGroup.LayoutParams(tu0.G(72 * fk4.d().getDisplayMetrics().density), -2));
        setClipToPadding(false);
        addView(textView);
    }

    public static final void a(dd7 dd7Var) {
        dd7Var.setText(dd7Var.getTabItem().b);
        cd7 cd7VarB = b(dd7Var.getTabItem().c, qp4.u0.j(dd7Var));
        dd7Var.getClass();
        dd7Var.a.setTextColor(cd7VarB.a);
        dd7Var.requestLayout();
        dd7Var.invalidate();
    }

    public static cd7 b(int i, fka fkaVar) {
        int iS = au1.s(i);
        if (iS == 0) {
            return new cd7(fkaVar.getText().e);
        }
        if (iS == 1) {
            return new cd7(fkaVar.getText().g);
        }
        if (iS == 2) {
            return new cd7(fkaVar.d().c.b.e);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final y5a getTabItem() {
        bc7 bc7Var = c[0];
        return (y5a) this.b.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setTextColor(b(getTabItem().c, fkaVar).a);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(y5a.a(getTabItem(), null, z ? 1 : 2, null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(y5a y5aVar) {
        this.b.o1(this, c[0], y5aVar);
    }
}
