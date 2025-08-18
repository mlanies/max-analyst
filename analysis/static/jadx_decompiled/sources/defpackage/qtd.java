package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class qtd extends hdc {
    public static final /* synthetic */ bc7[] s0;
    public final g17 X;
    public final k56 Y;
    public final yj Z = new yj(this);
    public final int o;

    static {
        oi9 oi9Var = new oi9(qtd.class, "isSecure", "isSecure()Z");
        nec.a.getClass();
        s0 = new bc7[]{oi9Var};
    }

    public qtd(int i, g17 g17Var, qk2 qk2Var) {
        this.o = i;
        this.X = g17Var;
        this.Y = qk2Var;
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.o;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, final int i) {
        final ptd ptdVar = (ptd) decVar;
        bc7 bc7Var = s0[0];
        boolean zBooleanValue = ((Boolean) this.Z.b).booleanValue();
        eg3 eg3Var = ptdVar.H0;
        eg3Var.setSecure(zBooleanValue);
        eg3Var.addTextChangedListener(new otd(ptdVar, i));
        eg3Var.setOnKeyListener(new View.OnKeyListener() { // from class: ntd
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (i2 != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                jg3 jg3Var = (jg3) ptdVar.G0;
                int i3 = i;
                int i4 = i3 - 1;
                l17 l17VarH0 = jg3Var.H0(i3);
                String strA = l17VarH0 != null ? ((ptd) l17VarH0).A() : null;
                if (!(!(strA == null || strA.length() == 0))) {
                    l17 l17VarH02 = jg3Var.H0(i4);
                    if (l17VarH02 != null) {
                        ptd ptdVar2 = (ptd) l17VarH02;
                        ptdVar2.B("");
                        ptdVar2.H0.requestFocus();
                    }
                } else if (l17VarH0 != null) {
                    ((ptd) l17VarH0).B("");
                }
                return true;
            }
        });
        ira iraVar = new ira(eg3Var.getContext(), ptdVar.G0, i, ptdVar.F0);
        eg3Var.setCustomSelectionActionModeCallback(iraVar);
        eg3Var.setCustomInsertionActionModeCallback(iraVar);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        eg3 eg3Var = new eg3(viewGroup.getContext(), null);
        eg3Var.setId(vwb.one_me_codeinput_edit_text_view);
        eg3Var.setMinimumWidth(tu0.G(40 * fk4.d().getDisplayMetrics().density));
        eg3Var.setMinimumHeight(tu0.G(52 * fk4.d().getDisplayMetrics().density));
        eg3Var.setInputType(2);
        eg3Var.setGravity(17);
        eg3Var.setFilters(new InputFilter[]{eg3.c});
        i4f.b.b(eg3Var, du4.b);
        eg3Var.setClipToOutline(true);
        eg3Var.setOutlineProvider(new ix3(tu0.G(12 * fk4.d().getDisplayMetrics().density)));
        eg3Var.setSingleLine(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tu0.G(2 * fk4.d().getDisplayMetrics().density), eg3Var.getLineHeight());
        eg3Var.setTextCursorDrawable(gradientDrawable);
        eg3Var.onThemeChanged(qp4.u0.j(eg3Var));
        eg3Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return new ptd(this, this.o, this.X, eg3Var);
    }
}
