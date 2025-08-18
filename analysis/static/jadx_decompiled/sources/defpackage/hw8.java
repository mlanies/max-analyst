package defpackage;

import android.graphics.Paint;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class hw8 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ iw8 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public hw8(iw8 iw8Var, int i) {
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = iw8Var;
                super(9, bool);
                break;
            default:
                fw8 fw8Var = fw8.a;
                this.o = iw8Var;
                super(9, fw8Var);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        float f;
        float f2;
        switch (this.c) {
            case 0:
                iw8 iw8Var = this.o;
                iw8Var.o = null;
                iw8Var.s0 = null;
                iw8Var.t0 = null;
                iw8Var.u0 = null;
                je7 je7Var = iw8Var.v0;
                if (je7Var.a()) {
                    ((s5a) je7Var.getValue()).setVisibility(8);
                }
                iw8Var.z0 = null;
                je7 je7Var2 = iw8Var.C0;
                if (je7Var2.a()) {
                    ((OneMeDraweeView) je7Var2.getValue()).setVisibility(8);
                }
                iw8Var.x0 = null;
                iw8Var.w0 = null;
                iw8Var.requestLayout();
                iw8Var.invalidate();
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    iw8 iw8Var2 = this.o;
                    Paint paint = iw8Var2.G0;
                    if (zBooleanValue) {
                        f = fk4.d().getDisplayMetrics().density;
                        f2 = 4.0f;
                    } else {
                        f = fk4.d().getDisplayMetrics().density;
                        f2 = 2.0f;
                    }
                    paint.setStrokeWidth(f * f2);
                    iw8Var2.requestLayout();
                    iw8Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
