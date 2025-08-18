package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public final class s48 extends hdc {
    public final tg X;
    public final o20 Y;
    public final xp7 Z;
    public final t48 o;
    public final cq7 s0;
    public final jic t0;
    public boolean u0;

    public s48(Context context, t48 t48Var, tg tgVar, o20 o20Var, xp7 xp7Var, cq7 cq7Var) throws Resources.NotFoundException {
        this.o = t48Var;
        this.X = tgVar;
        this.Y = o20Var;
        this.Z = xp7Var;
        this.s0 = cq7Var;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(jtb.compose_view_item_height);
        this.t0 = dimensionPixelSize <= 0 ? null : new jic(0.0f, dimensionPixelSize, dimensionPixelSize, 12);
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.Z.f.b();
    }

    @Override // defpackage.hdc
    public final long k(int i) {
        up7 up7Var;
        r4d r4dVarI = this.Z.f.i(i);
        if (r4dVarI == null || (up7Var = r4dVarI.a) == null) {
            return 0L;
        }
        return up7Var.b;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        u48 u48Var = (u48) decVar;
        r4d r4dVarI = this.Z.f.i(i);
        if (r4dVarI != null) {
            boolean z = r4dVarI.e;
            boolean z2 = z != u48Var.P0;
            u48Var.P0 = z;
            u48Var.L0 = r4dVarI;
            hm9.n("u48", "Dispose");
            SimpleDraweeView simpleDraweeView = u48Var.M0;
            simpleDraweeView.animate().cancel();
            dq7 dq7Var = u48Var.Q0;
            if (dq7Var != null) {
                dq7Var.a();
            }
            BitmapDrawable bitmapDrawableB = null;
            u48Var.Q0 = null;
            cq7 cq7Var = u48Var.K0;
            up7 up7Var = r4dVarI.a;
            dq7 dq7VarA = cq7Var.a(u48Var, up7Var);
            dq7VarA.c();
            u48Var.Q0 = dq7VarA;
            if (u48Var.I0) {
                tg tgVar = u48Var.F0;
                boolean z3 = z2 && tgVar.p();
                r4d r4dVar = u48Var.L0;
                if (r4dVar != null) {
                    simpleDraweeView.animate().cancel();
                    View view = u48Var.O0;
                    if (z3) {
                        if (r4dVar.e) {
                            simpleDraweeView.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.5f).setDuration(100L).setInterpolator(tgVar.a.n());
                            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(100L).setInterpolator(tgVar.a.n());
                        } else {
                            simpleDraweeView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100L).setInterpolator(tgVar.a.n());
                            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).setInterpolator(tgVar.a.n());
                        }
                    } else if (r4dVar.e) {
                        simpleDraweeView.setScaleX(0.8f);
                        simpleDraweeView.setScaleY(0.8f);
                        simpleDraweeView.setAlpha(0.5f);
                        view.setScaleX(0.8f);
                        view.setScaleY(0.8f);
                    } else {
                        simpleDraweeView.setScaleX(1.0f);
                        simpleDraweeView.setScaleY(1.0f);
                        simpleDraweeView.setAlpha(1.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                    }
                }
            }
            if ((up7Var instanceof j00) && !awa.b(r4dVarI.c, up7Var)) {
                bitmapDrawableB = u48Var.H0.b(((j00) up7Var).u0, false);
            }
            ((la6) simpleDraweeView.getHierarchy()).i(bitmapDrawableB, 1);
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new u48(LayoutInflater.from(viewGroup.getContext()).inflate(yyb.row_media_bar_selected, viewGroup, false), this.X, this.o, this.Y, this.u0, this.t0, this.s0);
    }

    @Override // defpackage.hdc
    public final void x(dec decVar) {
        ((u48) decVar).M0.animate().cancel();
    }
}
