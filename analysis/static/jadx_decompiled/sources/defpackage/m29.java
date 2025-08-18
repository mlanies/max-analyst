package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class m29 extends ppd implements q29 {
    public final xs8 X;
    public final m56 Y;
    public final lk6 Z;
    public final ey1 s0;
    public final c66 t0;
    public final b17 u0;
    public final k56 v0;
    public final yh9 w0;
    public final ArrayList x0;

    public m29(ExecutorService executorService, b69 b69Var, om8 om8Var, mk6 mk6Var, ey1 ey1Var, vq0 vq0Var, yt8 yt8Var, p59 p59Var) {
        super(executorService);
        this.X = b69Var;
        this.Y = om8Var;
        this.Z = mk6Var;
        this.s0 = ey1Var;
        this.t0 = vq0Var;
        this.u0 = yt8Var;
        this.v0 = p59Var;
        this.w0 = new yh9(20);
        this.x0 = new ArrayList(20);
    }

    @Override // defpackage.hl7
    public final void E(List list) {
        throw null;
    }

    @Override // defpackage.hl7
    public final void F(List list, Runnable runnable) {
        super.F(list, new v05(this, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: I */
    public final void y(hqd hqdVar) {
        hqdVar.D();
        kk6 kk6Var = hqdVar instanceof kk6 ? (kk6) hqdVar : null;
        if (kk6Var != null) {
            mk6 mk6Var = (mk6) this.Z;
            mk6Var.getClass();
            ((ht8) kk6Var).I();
            mk6Var.b.remove(kk6Var);
        }
    }

    public final long J(long j) {
        int i;
        ArrayList arrayList = this.x0;
        if (!arrayList.isEmpty()) {
            yh9 yh9Var = this.w0;
            if (yh9Var.e != 0) {
                int size = arrayList.size();
                int i2 = 0;
                y53.P(arrayList.size(), 0, size);
                int i3 = size - 1;
                while (true) {
                    if (i2 > i3) {
                        i = -(i2 + 1);
                        break;
                    }
                    i = (i2 + i3) >>> 1;
                    int iIntValue = Integer.valueOf(tpa.n(((MessageModel) arrayList.get(i)).c, j)).intValue();
                    if (iIntValue >= 0) {
                        if (iIntValue <= 0) {
                            break;
                        }
                        i3 = i - 1;
                    } else {
                        i2 = i + 1;
                    }
                }
                if (i < 0) {
                    int i4 = dv8.b;
                    return ((-1) & 4294967295L) | (i << 32);
                }
                int iB = yh9Var.b(i);
                int i5 = iB >= 0 ? yh9Var.c[iB] : -1;
                if (i5 < 0) {
                    return dv8.a;
                }
                int i6 = dv8.b;
                return (i5 & 4294967295L) | (i << 32);
            }
        }
        return dv8.a;
    }

    public final int K(long j) {
        long J = J(j);
        int i = dv8.b;
        int i2 = (int) (J >> 32);
        if (i2 >= 0) {
            return (int) (J & 4294967295L);
        }
        if (J == dv8.a) {
            return j();
        }
        int iAbs = Math.abs(i2) - 1;
        yh9 yh9Var = this.w0;
        int iB = yh9Var.b(iAbs);
        int i3 = iB >= 0 ? yh9Var.c[iB] : -1;
        return i3 >= 0 ? i3 : j();
    }

    public final MessageModel L(int i) {
        ol7 ol7VarG = G(i);
        if (ol7VarG instanceof MessageModel) {
            return (MessageModel) ol7VarG;
        }
        return null;
    }

    @Override // defpackage.q29
    public final List b() {
        return this.x0;
    }

    @Override // defpackage.q29
    public final int f(long j) {
        long J = J(j);
        int i = dv8.b;
        if (((int) (J >> 32)) < 0) {
            return -1;
        }
        return (int) (J & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hdc
    public final void s(dec decVar, int i, List list) {
        CharSequence charSequenceA;
        xs8 xs8Var;
        hqd hqdVar = (hqd) decVar;
        ol7 ol7Var = (ol7) C(i);
        if (!(hqdVar instanceof qy8)) {
            if (hqdVar instanceof u92) {
                ((u92) hqdVar).A((v92) ol7Var);
                return;
            }
            return;
        }
        MessageModel messageModel = (MessageModel) ol7Var;
        qy8 qy8Var = (qy8) hqdVar;
        boolean z = qy8Var instanceof ht8;
        ht8 ht8Var = z ? (ht8) qy8Var : null;
        if (ht8Var != null) {
            xs8 xs8Var2 = this.X;
            et8 et8Var = new et8(xs8Var2, ht8Var);
            View view = ht8Var.a;
            tu0.K(view, 300L, et8Var);
            View view2 = ht8Var.I0;
            if (view2 instanceof ot8) {
                GestureDetector gestureDetector = new GestureDetector(((zs8) view).getContext(), new p63(ht8Var, new ft8(ht8Var, xs8Var2)));
                gestureDetector.setIsLongpressEnabled(true);
                view2.setOnTouchListener(new q46(gestureDetector, 3));
                view2.setOnClickListener(null);
            } else {
                view2.setOnTouchListener(null);
                tu0.K(view2, 300L, new et8(ht8Var, xs8Var2));
            }
            l7c l7cVar = view2 instanceof l7c ? (l7c) view2 : null;
            if (l7cVar != null) {
                l7cVar.setOnClickListener(new ft8(xs8Var2, ht8Var));
            }
            ad2 ad2Var = new ad2(xs8Var2, 4, ht8Var);
            view2.setOnLongClickListener(ad2Var);
            ((zs8) view).setOnLongClickListener(ad2Var);
            jw8 jw8Var = view2 instanceof jw8 ? (jw8) view2 : null;
            if (jw8Var != null) {
                jw8 jw8Var2 = jw8Var;
                xs8Var = xs8Var2;
                jw8Var2.setReplyClickListener(new vw(2, xs8Var2, xs8.class, "onReplyClick", "onReplyClick(JJ)V", 0, 26));
                jw8Var2.setForwardClickListener(new om8(1, xs8Var, xs8.class, "onForwardClick", "onForwardClick(Lone/me/messages/list/loader/MessageLink$ForwardModel;)V", 0, 2));
            } else {
                xs8Var = xs8Var2;
            }
            xs8 xs8Var3 = xs8Var;
            gt8 gt8Var = new gt8(xs8Var3, 0, ht8Var);
            qpe qpeVar = view2 instanceof qpe ? (qpe) view2 : null;
            if (qpeVar != null) {
                qpeVar.setTextMessageLinkClickListener(gt8Var);
            }
            ck7 ck7Var = view2 instanceof ck7 ? (ck7) view2 : null;
            if (ck7Var != null) {
                ck7Var.setOnLinkLongClickListener(new y98(xs8Var3, 9, ht8Var));
            }
        }
        lu3 lu3Var = qy8Var instanceof lu3 ? (lu3) qy8Var : null;
        if (lu3Var != null) {
            lu3Var.I0 = this.s0;
        }
        ht8 ht8Var2 = z ? (ht8) qy8Var : null;
        KeyEvent.Callback callback = ht8Var2 != null ? ht8Var2.I0 : null;
        l7c l7cVar2 = callback instanceof l7c ? (l7c) callback : null;
        if (l7cVar2 != null) {
            l7cVar2.setChipObserver(new y98(this, 12, qy8Var));
        }
        qy8Var.E(messageModel, list);
        kk6 kk6Var = qy8Var instanceof kk6 ? (kk6) qy8Var : null;
        if (kk6Var != null) {
            mk6 mk6Var = (mk6) this.Z;
            mk6Var.b.add(kk6Var);
            if (mk6Var.c) {
                mk6Var.c = !((ht8) kk6Var).P(mk6Var.d, new vw(2, mk6Var, mk6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 22));
            }
            ((ht8) ((kk6) qy8Var)).P(mk6Var.d, new vw(2, this.Z, lk6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 27));
        }
        ht8 ht8Var3 = z ? (ht8) qy8Var : null;
        b17 b17Var = this.u0;
        if (ht8Var3 != null) {
            je7 je7Var = ht8Var3.N0;
            if (je7Var.a()) {
                ((c17) je7Var.getValue()).setClickListener(b17Var);
            }
        }
        q5g q5gVar = qy8Var instanceof q5g ? (q5g) qy8Var : null;
        if (q5gVar != null) {
            gt8 gt8Var2 = new gt8(this, 1, messageModel);
            kk7 kk7Var = q5gVar.I0;
            kk7Var.a = gt8Var2;
            tc9 tc9Var = q5gVar.J0;
            if (tc9Var != null && (charSequenceA = tc9Var.a()) != null) {
                kk7Var.c(charSequenceA);
            }
            ((p5g) q5gVar.a).setKeyboardListener(b17Var);
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = 3;
        int i3 = 7;
        int i4 = 4;
        int i5 = 0;
        int i6 = 1;
        int i7 = 2;
        if (i == mda.e) {
            t92 t92Var = new t92(viewGroup.getContext());
            u92 u92Var = new u92(t92Var);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
            marginLayoutParams.setMargins(iG, iG, iG, iG);
            t92Var.setLayoutParams(marginLayoutParams);
            return u92Var;
        }
        int i8 = (-2013265921) & i;
        if ((i & 256) != 0) {
            Context context = viewGroup.getContext();
            return new w50(context, new nd1(context), i7);
        }
        if (ry8.a(i8, 0)) {
            am5 am5Var = new am5(viewGroup.getContext());
            lu3 lu3Var = new lu3(am5Var);
            am5Var.setMaxWidth(tu0.G(276 * fk4.d().getDisplayMetrics().density));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            float f = 24;
            marginLayoutParams2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
            marginLayoutParams2.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
            am5Var.setGravity(17);
            am5Var.setLayoutParams(marginLayoutParams2);
            kqe kqeVar = i4f.a;
            os2.f.b(am5Var, du4.b);
            am5Var.setTextAlignment(4);
            am5Var.setGravity(17);
            am5Var.setMovementMethod(LinkMovementMethod.getInstance());
            float f2 = 12;
            float f3 = 4;
            am5Var.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f4 = fk4.d().getDisplayMetrics().density * 12.0f;
            float[] fArr = new float[8];
            while (i5 < 8) {
                fArr[i5] = f4;
                i5++;
            }
            gradientDrawable.setCornerRadii(fArr);
            am5Var.setBackground(gradientDrawable);
            return lu3Var;
        }
        if (ry8.a(i8, 131072)) {
            return new q5g(viewGroup.getContext());
        }
        boolean z = (i & 16) != 0;
        m56 m56Var = this.Y;
        if (z) {
            Context context2 = viewGroup.getContext();
            return new w50(context2, new lp3(context2, (om8) m56Var), i2);
        }
        if ((i & 64) != 0) {
            Context context3 = viewGroup.getContext();
            return new w50(context3, new pa6(context3), 5);
        }
        if ((i & 512) != 0) {
            Context context4 = viewGroup.getContext();
            return new w50(context4, new xkd(context4, (om8) m56Var), 6);
        }
        if ((i & 32) != 0) {
            Context context5 = viewGroup.getContext();
            return new w50(context5, new gi5(context5), i4);
        }
        if (!ry8.c(i8) && (i & 2) != 0 && !ry8.b(i8)) {
            return new l53(viewGroup.getContext(), (om8) m56Var, 2);
        }
        if (ry8.c(i8) && (i & 2) != 0 && !ry8.b(i8)) {
            return new l53(viewGroup.getContext(), (om8) m56Var, 3);
        }
        if (!ry8.c(i8) && ry8.b(i8)) {
            return new l53(viewGroup.getContext(), (om8) m56Var, 0);
        }
        if (ry8.c(i8) && ry8.b(i8)) {
            return new l53(viewGroup.getContext(), (om8) m56Var, 1);
        }
        if (!ry8.c(i8) && (i & 4) != 0 && !ry8.b(i8)) {
            Context context6 = viewGroup.getContext();
            return new w50(context6, new esd(context6), 11);
        }
        if (ry8.c(i8) && (i & 4) != 0 && !ry8.b(i8)) {
            Context context7 = viewGroup.getContext();
            return new w50(context7, new gsd(context7), 9);
        }
        if (ry8.c(i8)) {
            return new w50(viewGroup.getContext());
        }
        if ((i & 4096) != 0) {
            Context context8 = viewGroup.getContext();
            return new w50(context8, new am0(context8), i6);
        }
        if ((i & 128) != 0) {
            return new w50(viewGroup.getContext(), new x2e(viewGroup.getContext(), new kw7(viewGroup.getContext(), 1)), i3);
        }
        if ((i & 16384) != 0) {
            return new w50(viewGroup.getContext(), new x2e(viewGroup.getContext(), new kw7(viewGroup.getContext(), 0)), i3);
        }
        if ((32768 & i) != 0) {
            return new w50(viewGroup.getContext(), new x2e(viewGroup.getContext(), new kw7(viewGroup.getContext(), 2)), i3);
        }
        if ((i & 8) != 0) {
            Context context9 = viewGroup.getContext();
            return new w50(context9, new p50(context9, (om8) m56Var, (p59) this.v0), i5);
        }
        if ((65536 & i) != 0) {
            Context context10 = viewGroup.getContext();
            return new w50(context10, new dif(context10, (om8) m56Var), 10);
        }
        if ((33554432 & i) != 0) {
            return new w50(viewGroup.getContext());
        }
        throw new IllegalStateException(("unsupported view type=" + ry8.e(i8) + " binary=" + Integer.toBinaryString(i)).toString());
    }
}
