package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class q21 extends ConstraintLayout {
    public final no1 G0;
    public p21 H0;

    public q21(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new ti3(-1, -1));
        setBackgroundColor(qp4.u0.p(this).c.b().k);
        setFocusable(true);
        setClickable(true);
        no1 no1Var = new no1(context, null);
        no1Var.setId(rvb.call_user_full_avatar);
        no1Var.setMode(jo1.b);
        this.G0 = no1Var;
        new ViewStub(context).setId(rvb.call_recall);
        new ViewStub(context).setId(rvb.call_cancel);
        addView(no1Var, -1, 0);
        dj3 dj3VarQ = fp3.q(this);
        int id = no1Var.getId();
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.a(this);
    }

    public final void setClickListener(p21 p21Var) {
        this.H0 = p21Var;
    }

    public final void setName(CharSequence charSequence) {
        this.G0.setName(charSequence);
    }

    public final void setStatus(CharSequence charSequence) {
        this.G0.setStatus(charSequence);
    }
}
