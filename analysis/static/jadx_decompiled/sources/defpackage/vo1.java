package defpackage;

import android.graphics.Point;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class vo1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap1 b;

    public /* synthetic */ vo1(ap1 ap1Var, int i) {
        this.a = i;
        this.b = ap1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ap1 ap1Var = this.b;
                xo1 xo1Var = ap1Var.b1;
                if (xo1Var != null) {
                    gg1 gg1Var = ap1Var.h1;
                    int[] iArr = new int[2];
                    ap1Var.O0.getLocationOnScreen(iArr);
                    xo1Var.v(gg1Var, new Point(iArr[0], iArr[1]));
                    break;
                }
                break;
            case 1:
                ap1 ap1Var2 = this.b;
                xo1 xo1Var2 = ap1Var2.b1;
                if (xo1Var2 != null) {
                    xo1Var2.y(ap1Var2.h1);
                    break;
                }
                break;
            case 2:
                xo1 xo1Var3 = this.b.b1;
                if (xo1Var3 != null) {
                    xo1Var3.N();
                    break;
                }
                break;
            default:
                ap1 ap1Var3 = this.b;
                xo1 xo1Var4 = ap1Var3.b1;
                if (xo1Var4 != null) {
                    xo1Var4.S(ap1Var3.h1);
                    break;
                }
                break;
        }
    }
}
