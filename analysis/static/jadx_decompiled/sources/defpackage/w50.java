package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.CancellationException;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class w50 extends ht8 {
    public final /* synthetic */ int T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w50(Context context, ViewGroup viewGroup, int i) {
        super(context, viewGroup);
        this.T0 = i;
    }

    @Override // defpackage.ht8, defpackage.hqd
    public void D() {
        switch (this.T0) {
            case 0:
                p50 p50Var = (p50) this.I0;
                p50Var.removeOnAttachStateChangeListener(p50Var.U0);
                x77 x77Var = p50Var.T0;
                if (x77Var != null) {
                    x77Var.cancel(null);
                }
                p50Var.T0 = null;
                x77 x77Var2 = p50Var.S0;
                if (x77Var2 != null) {
                    x77Var2.cancel(null);
                }
                p50Var.S0 = null;
                break;
            case 4:
                ((gi5) this.I0).z();
                break;
            case 9:
                gsd gsdVar = (gsd) this.I0;
                gsdVar.removeOnAttachStateChangeListener(gsdVar.M0);
                x77 x77Var3 = gsdVar.N0;
                if (x77Var3 != null) {
                    x77Var3.cancel(null);
                }
                gsdVar.N0 = null;
                break;
            case 10:
                dif difVar = (dif) this.I0;
                difVar.removeOnAttachStateChangeListener(difVar.G0);
                vxd vxdVar = difVar.H0;
                if (vxdVar != null) {
                    vxdVar.cancel((CancellationException) null);
                }
                difVar.H0 = null;
                vxd vxdVar2 = difVar.I0;
                if (vxdVar2 != null) {
                    vxdVar2.cancel((CancellationException) null);
                }
                difVar.I0 = null;
                break;
        }
    }

    @Override // defpackage.ht8
    public void L(MessageModel messageModel) {
        o50 o50Var;
        o50 o50Var2;
        switch (this.T0) {
            case 0:
                o00 o00Var = messageModel.u0.d;
                k50 k50Var = o00Var instanceof k50 ? (k50) o00Var : null;
                if (k50Var != null) {
                    ((p50) this.I0).setAudio(k50Var);
                    break;
                }
                break;
            case 2:
                o00 o00Var2 = messageModel.u0.d;
                y01 y01Var = o00Var2 instanceof y01 ? (y01) o00Var2 : null;
                if (y01Var != null) {
                    ((nd1) this.I0).c(y01Var);
                    break;
                }
                break;
            case 3:
                o00 o00Var3 = messageModel.u0.d;
                bk3 bk3Var = o00Var3 instanceof bk3 ? (bk3) o00Var3 : null;
                if (bk3Var != null) {
                    ((lp3) this.I0).i(bk3Var);
                    break;
                }
                break;
            case 4:
                o00 o00Var4 = messageModel.u0.d;
                zf5 zf5Var = o00Var4 instanceof zf5 ? (zf5) o00Var4 : null;
                if (zf5Var != null) {
                    ((gi5) this.I0).setFileInfo(zf5Var);
                    break;
                }
                break;
            case 5:
                o00 o00Var5 = messageModel.u0.d;
                oa6 oa6Var = o00Var5 instanceof oa6 ? (oa6) o00Var5 : null;
                if (oa6Var != null) {
                    ((pa6) this.I0).b(oa6Var, ns0.b(messageModel.I0 & 2080374784));
                    break;
                }
                break;
            case 6:
                o00 o00Var6 = messageModel.u0.d;
                tjd tjdVar = o00Var6 instanceof tjd ? (tjd) o00Var6 : null;
                if (tjdVar != null) {
                    xkd xkdVar = (xkd) this.I0;
                    boolean zB = ns0.b(messageModel.I0 & 2080374784);
                    xkdVar.getClass();
                    xkdVar.t0 = qp4.u0.j(xkdVar).a().d(zB);
                    je7 je7Var = xkdVar.C0;
                    String str = tjdVar.c;
                    if (str != null) {
                        View view = (View) je7Var.getValue();
                        ((AppCompatTextView) view).setText(str);
                        view.setVisibility(0);
                    } else if (je7Var.a()) {
                        ((View) je7Var.getValue()).setVisibility(8);
                    }
                    je7 je7Var2 = xkdVar.D0;
                    String str2 = tjdVar.d;
                    if (str2 != null) {
                        View view2 = (View) je7Var2.getValue();
                        ((AppCompatTextView) view2).setText(str2);
                        view2.setVisibility(0);
                    } else if (je7Var2.a()) {
                        ((View) je7Var2.getValue()).setVisibility(8);
                    }
                    je7 je7Var3 = xkdVar.E0;
                    String str3 = tjdVar.e;
                    if (str3 != null) {
                        View view3 = (View) je7Var3.getValue();
                        ((AppCompatTextView) view3).setText(str3);
                        view3.setVisibility(0);
                    } else if (je7Var3.a()) {
                        ((View) je7Var3.getValue()).setVisibility(8);
                    }
                    je7 je7Var4 = xkdVar.F0;
                    yt6 yt6Var = tjdVar.f;
                    if (yt6Var != null) {
                        View view4 = (View) je7Var4.getValue();
                        ((bu6) view4).setImageAttach(yt6Var);
                        view4.setVisibility(0);
                    } else if (je7Var4.a()) {
                        ((View) je7Var4.getValue()).setVisibility(8);
                    }
                    GestureDetector gestureDetector = new GestureDetector(xkdVar.getContext(), new p63(xkdVar, 4, new zja(xkdVar, 23, tjdVar)));
                    gestureDetector.setIsLongpressEnabled(true);
                    xkdVar.setOnTouchListener(new q46(gestureDetector, 8));
                    break;
                }
                break;
            case 7:
                o00 o00Var7 = messageModel.u0.d;
                v2e v2eVar = o00Var7 instanceof v2e ? (v2e) o00Var7 : null;
                if (v2eVar != null) {
                    KeyEvent.Callback callback = this.I0;
                    t2e t2eVar = callback instanceof t2e ? (t2e) callback : null;
                    if (t2eVar != null) {
                        t2eVar.a(v2eVar.a);
                        break;
                    }
                }
                break;
            case 9:
                o00 o00Var8 = messageModel.u0.d;
                bsd bsdVar = o00Var8 instanceof bsd ? (bsd) o00Var8 : null;
                if (bsdVar != null) {
                    gsd gsdVar = (gsd) this.I0;
                    gsdVar.setModel(bsdVar);
                    gsdVar.M0 = new o50(gsdVar, 9, bsdVar);
                    if (gsdVar.isAttachedToWindow() && (o50Var = gsdVar.M0) != null) {
                        o50Var.onViewAttachedToWindow(gsdVar);
                    }
                    gsdVar.addOnAttachStateChangeListener(gsdVar.M0);
                    break;
                }
                break;
            case 10:
                o00 o00Var9 = messageModel.u0.d;
                wgf wgfVar = o00Var9 instanceof wgf ? (wgf) o00Var9 : null;
                if (wgfVar != null) {
                    ((dif) this.I0).n(wgfVar);
                    break;
                }
                break;
            case 11:
                o00 o00Var10 = messageModel.u0.d;
                bsd bsdVar2 = o00Var10 instanceof bsd ? (bsd) o00Var10 : null;
                if (bsdVar2 != null) {
                    esd esdVar = (esd) this.I0;
                    esdVar.setModel(bsdVar2);
                    esdVar.E0 = new o50(esdVar, 8, bsdVar2);
                    if (esdVar.isAttachedToWindow() && (o50Var2 = esdVar.E0) != null) {
                        o50Var2.onViewAttachedToWindow(esdVar);
                    }
                    esdVar.addOnAttachStateChangeListener(esdVar.E0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ht8
    public void M(is0 is0Var) {
        switch (this.T0) {
            case 0:
                ((p50) this.I0).b();
                break;
            case 2:
                ((nd1) this.I0).b();
                break;
            case 3:
                ((lp3) this.I0).e();
                break;
            case 4:
                ((gi5) this.I0).y(is0Var);
                break;
            case 5:
                ((pa6) this.I0).d(is0Var);
                break;
            case 6:
                ((xkd) this.I0).n(is0Var);
                break;
            case 8:
                KeyEvent.Callback callback = this.I0;
                k34 k34Var = callback instanceof k34 ? (k34) callback : null;
                if (k34Var != null) {
                    k34Var.setDateTextColor(is0Var.d.m);
                    break;
                }
                break;
            case 9:
                ((gsd) this.I0).x(is0Var);
                break;
        }
    }

    @Override // defpackage.ht8
    public void O(v83 v83Var) {
        switch (this.T0) {
            case 1:
                View view = this.I0;
                am0 am0Var = view instanceof am0 ? (am0) view : null;
                if (am0Var != null) {
                    am0Var.setDateTextColor(v83Var.g.a);
                    break;
                }
                break;
            case 7:
                View view2 = this.I0;
                x2e x2eVar = view2 instanceof x2e ? (x2e) view2 : null;
                if (x2eVar != null) {
                    x2eVar.setDateTextColor(v83Var.g.a);
                    break;
                }
                break;
            case 9:
                gsd gsdVar = (gsd) this.I0;
                gsdVar.D0.onThemeChanged(qp4.u0.b(gsdVar.getContext()).i());
                if (!gsdVar.w()) {
                    gsdVar.getDate$message_list_release().setTextColor$message_list_release(v83Var.g.a);
                    break;
                }
                break;
            case 10:
                dif difVar = (dif) this.I0;
                difVar.setDateTextColor(v83Var.g.a);
                difVar.p(v83Var);
                break;
            case 11:
                esd esdVar = (esd) this.I0;
                esdVar.setDateTextColor(v83Var.g.a);
                esdVar.x0.onThemeChanged(qp4.u0.b(esdVar.getContext()).i());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(Context context) {
        super(context, new ppe(context));
        this.T0 = 8;
    }
}
