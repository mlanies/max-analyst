package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public abstract class ht8 extends qy8 implements bv8, kk6 {
    public static final int[] R0 = {R.attr.state_enabled, R.attr.state_pressed};
    public static final int[] S0 = {R.attr.state_enabled};
    public final View I0;
    public long J0;
    public zof K0;
    public o00 L0;
    public final je7 M0;
    public final je7 N0;
    public final boolean O0;
    public long P0;
    public ValueAnimator Q0;

    public ht8(Context context, ViewGroup viewGroup) {
        zs8 zs8Var = new zs8(context);
        super(zs8Var);
        this.I0 = viewGroup;
        this.J0 = -1L;
        this.K0 = zof.b;
        this.M0 = tu0.r(3, new j78(7));
        this.N0 = tu0.r(3, new zj7(6, this));
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        zs8Var.setPaddingRelative(iG, 0, iG, 0);
        ys8 ys8Var = new ys8();
        View view = zs8Var.u0;
        if (view != null) {
            zs8Var.removeView(view);
        }
        zs8Var.u0 = viewGroup;
        zs8Var.addView(viewGroup, ys8Var);
        viewGroup.setClipChildren(false);
        this.O0 = true;
    }

    public static boolean Q(ry8 ry8Var, o00 o00Var) {
        if (ry8Var == null) {
            return false;
        }
        x38 x38Var = o00Var instanceof x38 ? (x38) o00Var : null;
        int i = ry8Var.a;
        boolean z = x38Var != null && x38Var.c() && ry8.c(i);
        return ((i & 4096) == 0 && (i & 128) == 0 && (i & 16384) == 0 && (32768 & i) == 0 && ((i & 2) == 0 || z) && ((!ry8.b(i) || z) && (((i & 4) == 0 || z) && (i & 65536) == 0))) ? false : true;
    }

    @Override // defpackage.hqd
    public void D() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d2  */
    @Override // defpackage.qy8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(one.me.messages.list.loader.MessageModel r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht8.E(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    public final void G(MessageModel messageModel) {
        z07 z07Var = messageModel.u0.e;
        je7 je7Var = this.N0;
        if (z07Var == null) {
            if (je7Var.a()) {
                ((c17) je7Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        c17 c17Var = (c17) je7Var.getValue();
        z07 z07Var2 = messageModel.u0.e;
        int i = c17.v0;
        c17Var.a(messageModel.a, z07Var2, false);
        zs8 zs8Var = (zs8) this.a;
        View view = (View) je7Var.getValue();
        ys8 ys8Var = new ys8();
        if (zs8Var.v0 == null) {
            zs8Var.v0 = view;
            zs8Var.addView(view, ys8Var);
        }
        ((View) je7Var.getValue()).setVisibility(0);
    }

    public final void H(MessageModel messageModel, boolean z) {
        KeyEvent.Callback callback = this.I0;
        if (callback instanceof l7c) {
            l7c l7cVar = (l7c) callback;
            l7cVar.setIsIncoming(messageModel.D0);
            if (!z) {
                l7cVar.setStackFromEnd(!messageModel.D0 && Q(new ry8(messageModel.I0), messageModel.u0.d));
            }
            ix8 ix8Var = messageModel.B0;
            if (ix8Var != null) {
                l7cVar.f(ix8Var, z);
            } else {
                l7cVar.q(z);
            }
        }
    }

    public final void I() {
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        KeyEvent.Callback callback = this.I0;
        nk6 nk6Var = callback instanceof nk6 ? (nk6) callback : null;
        if (nk6Var != null) {
            nk6Var.e(null, null);
        }
    }

    public final ShapeDrawable J() {
        float[] fArrCopyOf;
        Drawable background = this.I0.getBackground();
        vs8 vs8Var = background instanceof vs8 ? (vs8) background : null;
        if (vs8Var != null) {
            float[] fArr = vs8Var.p;
            fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        } else {
            fArrCopyOf = (float[]) this.M0.getValue();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArrCopyOf, null, null));
        shapeDrawable.getPaint().setColor(qp4.u0.j(this.a).d().a.b.l);
        shapeDrawable.setAlpha(150);
        return shapeDrawable;
    }

    public final void K(xs8 xs8Var, String str) {
        o00 o00Var = this.L0;
        View view = this.I0;
        if (o00Var == null) {
            long j = this.J0;
            b69 b69Var = (b69) xs8Var;
            b69Var.getClass();
            bc7[] bc7VarArr = MessagesListWidget.X0;
            b69Var.a.z0(j, view);
            return;
        }
        long j2 = this.J0;
        b69 b69Var2 = (b69) xs8Var;
        b69Var2.getClass();
        bc7[] bc7VarArr2 = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = b69Var2.a;
        if (messagesListWidget.x0().H(o00Var, j2, str)) {
            return;
        }
        messagesListWidget.z0(j2, view);
    }

    public void L(MessageModel messageModel) {
    }

    public void M(is0 is0Var) {
    }

    public void O(v83 v83Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean P(jk6 jk6Var, a66 a66Var) {
        nk6 nk6Var;
        if (jk6Var == null) {
            I();
            return false;
        }
        long j = this.J0;
        long j2 = jk6Var.a;
        View view = this.I0;
        List list = jk6Var.b;
        if (j == j2 && this.Q0 != null) {
            nk6Var = view instanceof nk6 ? (nk6) view : null;
            if (nk6Var != null) {
                nk6Var.e(list, a66Var);
            }
        } else {
            if (j != j2) {
                I();
                return false;
            }
            view.setForeground(J());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(J().getAlpha(), 0);
            valueAnimatorOfInt.setStartDelay(300L);
            valueAnimatorOfInt.setDuration(800L);
            valueAnimatorOfInt.addUpdateListener(new z00(12, this));
            valueAnimatorOfInt.addListener(new mf(5, this));
            valueAnimatorOfInt.start();
            this.Q0 = valueAnimatorOfInt;
            nk6Var = view instanceof nk6 ? (nk6) view : null;
            if (nk6Var != null) {
                nk6Var.e(list, a66Var);
            }
        }
        return true;
    }

    public final void R(MessageModel messageModel) {
        int i;
        Drawable background = this.I0.getBackground();
        vs8 vs8Var = background instanceof vs8 ? (vs8) background : null;
        if (vs8Var != null) {
            boolean zB = ns0.b(messageModel.I0 & 2080374784);
            is0 is0VarD = qp4.u0.j(this.a).a().d(zB);
            boolean z = messageModel.u0.b;
            int i2 = is0VarD.c.a;
            int i3 = messageModel.I0;
            int i4 = i3 & 2080374784;
            if (ns0.c(i4)) {
                i = 1;
            } else if (ns0.a(i4)) {
                i = 2;
            } else if ((1073741824 & i3) != 0) {
                i = 4;
            } else {
                if ((i3 & 536870912) == 0) {
                    throw new IllegalStateException(("unknown bubble type " + ns0.d(i4)).toString());
                }
                i = 3;
            }
            if (vs8.b(vs8Var, zB, i, messageModel.t0, messageModel.s0, i2, z)) {
                vs8Var.invalidateSelf();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mr2
    public final void a(is0 is0Var) {
        View view = this.I0;
        x5d x5dVar = view instanceof x5d ? (x5d) view : null;
        ls0 ls0Var = is0Var.d;
        if (x5dVar != null) {
            x5dVar.setSenderNameColor(ls0Var.d);
        }
        u5d u5dVar = view instanceof u5d ? (u5d) view : null;
        if (u5dVar != null) {
            u5dVar.setAliasColor(ls0Var.f);
        }
        qpe qpeVar = view instanceof qpe ? (qpe) view : null;
        if (qpeVar != null) {
            qpeVar.setTextMessageColors(is0Var);
        }
        jw8 jw8Var = view instanceof jw8 ? (jw8) view : null;
        if (jw8Var != null) {
            jw8Var.c(is0Var);
        }
        l7c l7cVar = view instanceof l7c ? (l7c) view : null;
        if (l7cVar != null) {
            l7cVar.k(is0Var, !Q(this.H0, this.L0));
        }
        Drawable background = view.getBackground();
        vs8 vs8Var = background instanceof vs8 ? (vs8) background : null;
        if (vs8Var != null) {
            pq9 pq9Var = qp4.u0;
            View view2 = this.a;
            int[] iArr = pq9Var.j(view2).a().g().a.o;
            bc7[] bc7VarArr = vs8.z;
            vs8Var.u.o1(vs8Var, bc7VarArr[0], iArr);
            vs8Var.v.o1(vs8Var, bc7VarArr[1], pq9Var.j(view2).a().k().a.o);
            vs8Var.invalidateSelf();
        }
        M(is0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mr2
    public final void e(v83 v83Var) {
        Paint paint;
        View view = this.I0;
        k34 k34Var = view instanceof k34 ? (k34) view : null;
        if (k34Var != null) {
            k34Var.setDateBackgroundColor(v83Var.b.g);
        }
        Drawable foreground = view.getForeground();
        ShapeDrawable shapeDrawable = foreground instanceof ShapeDrawable ? (ShapeDrawable) foreground : null;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            paint.setColor(qp4.u0.j(this.a).d().a.b.l);
        }
        O(v83Var);
    }
}
