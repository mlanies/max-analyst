package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public abstract class qy8 extends hqd implements mr2 {
    public final int F0;
    public final int G0;
    public ry8 H0;

    public qy8(View view) {
        super(view);
        this.F0 = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        this.G0 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        v3c.y(new xh0(this, view, null, 19), view);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        E((MessageModel) ol7Var, nz4.a);
    }

    public abstract void E(MessageModel messageModel, List list);

    public final void F(MessageModel messageModel, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = marginLayoutParams.bottomMargin;
        boolean z = marginLayoutParams instanceof ys8;
        ys8 ys8Var = z ? (ys8) marginLayoutParams : null;
        boolean z2 = ys8Var != null ? ys8Var.a : true;
        int i3 = messageModel.I0;
        int i4 = 2080374784 & i3;
        boolean zC = ns0.c(i4);
        int i5 = this.F0;
        if (zC) {
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.bottomMargin = i5;
        } else {
            boolean zA = ns0.a(i4);
            int i6 = this.G0;
            if (zA) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i6;
            } else if ((536870912 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i6;
            } else if ((1073741824 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i5;
            } else if (ry8.a(i3, 0) || ry8.a(i3, 131072)) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i5;
            }
        }
        if (!ry8.a(i3, 0) && !ry8.a(i3, 131072) && z) {
            ((ys8) marginLayoutParams).a = ns0.b(i4);
        }
        if (i == marginLayoutParams.topMargin && i2 == marginLayoutParams.bottomMargin && (!z || z2 == ((ys8) marginLayoutParams).a)) {
            return;
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
