package one.me.sdk.messagewrite;

import android.content.ClipData;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a09;
import defpackage.a19;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.br7;
import defpackage.bz8;
import defpackage.c09;
import defpackage.c54;
import defpackage.csb;
import defpackage.dy7;
import defpackage.dz8;
import defpackage.e5f;
import defpackage.en3;
import defpackage.eqe;
import defpackage.eua;
import defpackage.ev8;
import defpackage.ez;
import defpackage.f09;
import defpackage.f9g;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fz8;
import defpackage.g09;
import defpackage.h09;
import defpackage.hob;
import defpackage.hp;
import defpackage.i09;
import defpackage.i24;
import defpackage.j03;
import defpackage.j09;
import defpackage.j31;
import defpackage.jac;
import defpackage.je7;
import defpackage.k09;
import defpackage.k56;
import defpackage.kpa;
import defpackage.kt3;
import defpackage.kv8;
import defpackage.l09;
import defpackage.l5g;
import defpackage.lce;
import defpackage.lga;
import defpackage.lv8;
import defpackage.m09;
import defpackage.m58;
import defpackage.mv8;
import defpackage.n09;
import defpackage.nec;
import defpackage.nv8;
import defpackage.o09;
import defpackage.od2;
import defpackage.oec;
import defpackage.oga;
import defpackage.p09;
import defpackage.pnf;
import defpackage.q09;
import defpackage.q0e;
import defpackage.q33;
import defpackage.q7c;
import defpackage.qe5;
import defpackage.qm0;
import defpackage.qv8;
import defpackage.r0e;
import defpackage.rce;
import defpackage.rh4;
import defpackage.rt3;
import defpackage.suc;
import defpackage.sv8;
import defpackage.t03;
import defpackage.t09;
import defpackage.t11;
import defpackage.t33;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.twb;
import defpackage.u33;
import defpackage.uc7;
import defpackage.v3a;
import defpackage.vc7;
import defpackage.vu5;
import defpackage.w09;
import defpackage.w9e;
import defpackage.wmf;
import defpackage.x09;
import defpackage.x53;
import defpackage.x6g;
import defpackage.xoc;
import defpackage.xp7;
import defpackage.xt3;
import defpackage.xy8;
import defpackage.xz7;
import defpackage.xz8;
import defpackage.y09;
import defpackage.yce;
import defpackage.ywe;
import defpackage.yz8;
import defpackage.z09;
import defpackage.z84;
import defpackage.zmf;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zy8;
import defpackage.zz7;
import defpackage.zz8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/MessageWriteWidget;", "Lone/me/sdk/arch/Widget;", "Luc7;", "Lxt3;", "Lev8;", "Lu33;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class MessageWriteWidget extends Widget implements uc7, xt3, ev8, u33 {
    public static final /* synthetic */ bc7[] F0;
    public xz7 A0;
    public rt3 B0;
    public final q0e C0;
    public ywe D0;
    public int E0;
    public final xp7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final qm0 x0;
    public final q7c y0;
    public final q7c z0;

    static {
        hob hobVar = new hob(MessageWriteWidget.class, "rootView", "getRootView()Landroid/widget/LinearLayout;", 0);
        oec oecVar = nec.a;
        F0 = new bc7[]{hobVar, zr6.e(oecVar, MessageWriteWidget.class, "container", "getContainer()Landroid/widget/FrameLayout;", 0), zr6.f(MessageWriteWidget.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0, oecVar), zr6.f(MessageWriteWidget.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0, oecVar), zr6.f(MessageWriteWidget.class, "recordControlsContainer", "getRecordControlsContainer()Landroid/view/ViewGroup;", 0, oecVar), zr6.f(MessageWriteWidget.class, "recordControlsRouter", "getRecordControlsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar)};
    }

    public MessageWriteWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B0(defpackage.csb r4, boolean r5) {
        /*
            android.widget.TextView r0 = r4.getTitleView()
            float r0 = defpackage.qqe.e(r0)
            int r0 = defpackage.i24.I(r0)
            r1 = 0
            if (r5 == 0) goto L20
            android.widget.TextView r2 = r4.getTitleView()
            ecf r2 = defpackage.qqe.a(r2)
            if (r2 == 0) goto L1c
            int r2 = r2.a
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 != r0) goto L20
            return
        L20:
            if (r5 == 0) goto L41
            android.widget.TextView r5 = r4.getTitleView()
            ecf r5 = defpackage.qqe.a(r5)
            if (r5 == 0) goto L2e
            int r1 = r5.a
        L2e:
            if (r1 == r0) goto L41
            ecf r5 = new ecf
            android.content.Context r1 = r4.getContext()
            g27 r2 = new g27
            r3 = 21
            r2.<init>(r3)
            r5.<init>(r1, r0, r2)
            goto L42
        L41:
            r5 = 0
        L42:
            android.widget.TextView r4 = r4.getTitleView()
            defpackage.qqe.d(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.MessageWriteWidget.B0(csb, boolean):void");
    }

    public static final void m0(MessageWriteWidget messageWriteWidget, xy8 xy8Var) {
        dz8 dz8Var;
        ez ezVar;
        messageWriteWidget.getClass();
        String str = null;
        CharSequence charSequence = xy8Var != null ? xy8Var.b : null;
        if (xy8Var == null) {
            charSequence = null;
        }
        if (xy8Var == null) {
            messageWriteWidget.q0().setRightOuterIconActionState(new kv8());
            messageWriteWidget.q0().setText(null);
            messageWriteWidget.q0().setRightInnerIconVisible(true);
        } else {
            messageWriteWidget.q0().setRightOuterIconActionState(xy8Var.d ? mv8.a : nv8.a);
            if (xy8Var.e) {
                messageWriteWidget.q0().setText(null);
                messageWriteWidget.q0().f(charSequence);
            }
            messageWriteWidget.q0().setRightInnerIconVisible(false);
        }
        messageWriteWidget.w0().r(charSequence);
        messageWriteWidget.z0(xy8Var != null ? xy8Var.c : null);
        qm0 qm0Var = messageWriteWidget.x0;
        if (!br7.H(qm0Var)) {
            if (qm0Var.a()) {
                messageWriteWidget.s0().setImageClickListener(null);
                return;
            }
            return;
        }
        messageWriteWidget.s0().setCounter((Integer) null);
        if (xy8Var != null && (dz8Var = xy8Var.c) != null && (ezVar = dz8Var.d) != null) {
            str = ezVar.c;
        }
        if (!(str == null || str.length() == 0)) {
            messageWriteWidget.s0().setDrawOverlay(true);
        }
        messageWriteWidget.s0().setImageClickListener(new a09(messageWriteWidget, 1));
    }

    public static final void n0(MessageWriteWidget messageWriteWidget, zy8 zy8Var) {
        bz8 bz8Var;
        Integer num;
        bz8 bz8Var2;
        messageWriteWidget.getClass();
        dz8 dz8Var = zy8Var != null ? zy8Var.e : null;
        CharSequence charSequence = (zy8Var == null || (bz8Var2 = zy8Var.d) == null) ? null : bz8Var2.a;
        int iIntValue = (zy8Var == null || (bz8Var = zy8Var.d) == null || (num = bz8Var.b) == null) ? 0 : num.intValue();
        if ((zy8Var != null ? zy8Var.d : null) != null && !tpa.f(messageWriteWidget.q0().getText(), charSequence)) {
            messageWriteWidget.q0().setText(charSequence);
            messageWriteWidget.q0().h(iIntValue);
        }
        messageWriteWidget.q0().setRightInnerIconVisible(dz8Var == null);
        messageWriteWidget.q0().setRightOuterIconActionState(dz8Var == null ? new kv8() : lv8.a);
        messageWriteWidget.z0(dz8Var);
    }

    public static final void o0(MessageWriteWidget messageWriteWidget, dz8 dz8Var) {
        if (dz8Var == null) {
            messageWriteWidget.z0(dz8Var);
            return;
        }
        messageWriteWidget.q0().setRightOuterIconActionState(new kv8());
        messageWriteWidget.q0().setRightInnerIconVisible(true);
        if (br7.H(messageWriteWidget.x0) && messageWriteWidget.v0().L0.a.getValue() != null) {
            messageWriteWidget.q0().setText(null);
        }
        messageWriteWidget.z0(dz8Var);
    }

    public final void A0() {
        CharSequence text = q0().getText();
        if ((text == null || w9e.C0(text)) && !v0().t()) {
            return;
        }
        xz8 xz8VarV0 = v0();
        bc7[] bc7VarArr = xz8.V0;
        xz8VarV0.B(text, false);
        q0().setText(null);
    }

    public final void C0(eqe eqeVar, boolean z) {
        csb csbVarS0 = s0();
        csbVarS0.getLocationOnScreen(new int[2]);
        WindowInsets rootWindowInsets = requireView().getRootWindowInsets();
        int i = rootWindowInsets != null ? x6g.f(null, rootWindowInsets).a.f(7).d : 0;
        int i2 = vc7.a;
        Point point = new Point(tu0.G(6 * fk4.d().getDisplayMetrics().density), rh4.q(4, fk4.d().getDisplayMetrics().density, s0().getHeight() + q0().getHeight() + i + (vc7.b(vc7.c) ? vc7.a(getContext()) : 0)));
        ywe yweVar = this.D0;
        if (yweVar != null) {
            yweVar.dismiss();
        }
        ywe yweVar2 = new ywe(getContext(), csbVarS0, new yz8(this, 3), (k56) null, 0, 1, 56);
        yweVar2.d(eqeVar);
        yweVar2.e(point, 8388691, z ? 2500L : 800L);
        yweVar2.setOnDismissListener(new c09(this, 1));
        this.D0 = yweVar2;
    }

    public final void D0(csb csbVar, dz8 dz8Var) {
        Drawable drawableB;
        B0(csbVar, dz8Var.c);
        CharSequence charSequenceB = dz8Var.b.b(csbVar.getContext());
        if (charSequenceB == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        csbVar.setTitle(charSequenceB);
        csbVar.setAttachDescription(dz8Var.d);
        csbVar.setDrawOverlay(false);
        if (dz8Var.g) {
            Integer num = dz8Var.f;
            if (num != null) {
                drawableB = kt3.b(csbVar.getContext(), num.intValue());
                if (drawableB == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                drawableB = null;
            }
            csbVar.setStartIconDrawable(drawableB);
            if (num == null || dz8Var.a != 3) {
                return;
            }
            xz8 xz8VarV0 = v0();
            if (!((t33) ((q33) xz8VarV0.c.getValue())).g.getBoolean("app.onboarding.author_visibility", false)) {
                xz8VarV0.M0.m(null, e5f.a);
            }
            csbVar.setStartIconClickListener(new vu5(this, 18, dz8Var));
        }
    }

    @Override // defpackage.uc7
    public final void O() {
        qv8 qv8Var = q0().c;
        qv8Var.setShowSoftInputOnFocus(true);
        qv8Var.setOnFocusChangeListener(null);
    }

    @Override // defpackage.uc7
    public final void m() {
        q0().e(false);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zz8 zz8Var = new zz8(this, 3);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(lga.y);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        zz8Var.invoke(linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ywe yweVar = this.D0;
        if (yweVar != null) {
            yweVar.dismiss();
        }
        this.D0 = null;
        m();
        this.A0 = null;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        int i2 = 0;
        if (i == 160) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    eua.l(r0(), new l5g(this, 1), strArr, iArr, eua.h, oga.b, oga.c);
                    return;
                }
                i2++;
            }
            return;
        }
        if (i != 181) {
            return;
        }
        int length2 = iArr.length;
        while (i2 < length2) {
            if (iArr[i2] == -1) {
                eua.l(r0(), new l5g(this, 1), strArr, iArr, eua.p, x0(), oga.h);
                return;
            }
            i2++;
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        boolean z;
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 11;
        int i5 = 5;
        m58 m58Var = v0().S0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(m58Var, getViewLifecycleOwner().Q(), fg7Var), new i09(null, this, view), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new j31(vc7.f, this.C0, new t11(3, null, i3), 4), getViewLifecycleOwner().Q(), fg7Var), new a19(null, this), i5), getViewLifecycleScope());
        sv8 sv8VarQ0 = q0();
        final zz8 zz8Var = new zz8(this, i5);
        sv8VarQ0.getClass();
        String[] strArr = {"image/webp", "image/jpeg", "image/png", "image/gif", "image/heic"};
        v3a v3aVar = new v3a() { // from class: hv8
            @Override // defpackage.v3a
            public final bt3 a(View view2, bt3 bt3Var) {
                ys3 sy4Var;
                ys3 sy4Var2;
                Pair pairCreate;
                at3 at3Var = bt3Var.a;
                ClipData clipDataC = at3Var.c();
                Uri uri = null;
                if (clipDataC.getItemCount() == 1) {
                    boolean z2 = clipDataC.getItemAt(0).getUri() != null;
                    bt3 bt3Var2 = z2 ? bt3Var : null;
                    if (z2) {
                        bt3Var = null;
                    }
                    pairCreate = Pair.create(bt3Var2, bt3Var);
                } else {
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    for (int i6 = 0; i6 < clipDataC.getItemCount(); i6++) {
                        ClipData.Item itemAt = clipDataC.getItemAt(i6);
                        if (itemAt.getUri() != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(itemAt);
                        } else {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(itemAt);
                        }
                    }
                    Pair pairCreate2 = arrayList == null ? Pair.create(null, clipDataC) : arrayList2 == null ? Pair.create(clipDataC, null) : Pair.create(bt3.a(clipDataC.getDescription(), arrayList), bt3.a(clipDataC.getDescription(), arrayList2));
                    if (pairCreate2.first == null) {
                        pairCreate = Pair.create(null, bt3Var);
                    } else if (pairCreate2.second == null) {
                        pairCreate = Pair.create(bt3Var, null);
                    } else {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31) {
                            sy4Var = new sy4(bt3Var);
                        } else {
                            zs3 zs3Var = new zs3();
                            zs3Var.b = at3Var.c();
                            zs3Var.c = at3Var.r();
                            zs3Var.o = at3Var.getFlags();
                            zs3Var.X = at3Var.g();
                            zs3Var.Y = at3Var.getExtras();
                            sy4Var = zs3Var;
                        }
                        sy4Var.d((ClipData) pairCreate2.first);
                        bt3 bt3VarBuild = sy4Var.build();
                        if (i7 >= 31) {
                            sy4Var2 = new sy4(bt3Var);
                        } else {
                            zs3 zs3Var2 = new zs3();
                            zs3Var2.b = at3Var.c();
                            zs3Var2.c = at3Var.r();
                            zs3Var2.o = at3Var.getFlags();
                            zs3Var2.X = at3Var.g();
                            zs3Var2.Y = at3Var.getExtras();
                            sy4Var2 = zs3Var2;
                        }
                        sy4Var2.d((ClipData) pairCreate2.second);
                        pairCreate = Pair.create(bt3VarBuild, sy4Var2.build());
                    }
                }
                bt3 bt3Var3 = (bt3) pairCreate.first;
                bt3 bt3Var4 = (bt3) pairCreate.second;
                if (bt3Var3 != null) {
                    at3 at3Var2 = bt3Var3.a;
                    if (at3Var2.c().getItemCount() > 0) {
                        uri = at3Var2.c().getItemAt(0).getUri();
                    }
                }
                if (uri != null) {
                    zz8Var.invoke(uri);
                }
                return bt3Var4;
            }
        };
        WeakHashMap weakHashMap = zmf.a;
        int i6 = Build.VERSION.SDK_INT;
        qv8 qv8Var = sv8VarQ0.c;
        if (i6 >= 31) {
            wmf.c(qv8Var, strArr, v3aVar);
        } else {
            int i7 = 0;
            while (true) {
                if (i7 >= 5) {
                    z = false;
                    break;
                } else {
                    if (strArr[i7].startsWith("*")) {
                        z = true;
                        break;
                    }
                    i7++;
                }
            }
            c54.j("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
            qv8Var.setTag(twb.tag_on_receive_content_mime_types, strArr);
            qv8Var.setTag(twb.tag_on_receive_content_listener, v3aVar);
        }
        yce yceVarW0 = w0();
        yceVarW0.R0 = new en3(yceVarW0, i3, this);
        od2.L(new zn5(tu0.g(q0().getMessageState(), getViewLifecycleOwner().Q(), fg7Var), new j09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(q0().getMessagePosition(), new x09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(w0().F0, i4), getViewLifecycleOwner().Q(), fg7Var), new k09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(w0().L0, new y09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(w0().J0, i4), getViewLifecycleOwner().Q(), fg7Var), new l09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(new t03(((zz7) this.c.getValue()).b, i4), new z09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().F0, getViewLifecycleOwner().Q(), fg7Var), new m09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().B0, getViewLifecycleOwner().Q(), fg7Var), new n09(null, this), i5), getViewLifecycleScope());
        i24.s(new zn5(v0().U0, new w09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t09(v0().J0, this, i), getViewLifecycleOwner().Q(), fg7Var), new o09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t09(v0().L0, this, i2), getViewLifecycleOwner().Q(), fg7Var), new p09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t09(v0().R0, this, i3), getViewLifecycleOwner().Q(), fg7Var), new q09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(v0().N0, i4), getViewLifecycleOwner().Q(), fg7Var), new f09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().T0, getViewLifecycleOwner().Q(), fg7Var), new g09(null, this), i5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((jac) this.o.getValue()).X, getViewLifecycleOwner().Q(), fg7Var), new h09(null, this), i5), getViewLifecycleScope());
    }

    public final void p0(boolean z) {
        if (isAttached()) {
            bc7[] bc7VarArr = F0;
            bc7 bc7Var = bc7VarArr[4];
            q7c q7cVar = this.y0;
            ((ViewGroup) q7cVar.T0(this, bc7Var)).setClipChildren(z);
            ((ViewGroup) q7cVar.T0(this, bc7VarArr[4])).setClipToPadding(z);
            bc7 bc7Var2 = bc7VarArr[1];
            q7c q7cVar2 = this.v0;
            ((FrameLayout) q7cVar2.T0(this, bc7Var2)).setClipChildren(z);
            ((FrameLayout) q7cVar2.T0(this, bc7VarArr[1])).setClipToPadding(z);
            u0().setClipChildren(z);
            u0().setClipToPadding(z);
            ViewParent parent = u0().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
            }
            ViewParent parent2 = u0().getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.setClipToPadding(z);
            }
            ViewParent parent3 = u0().getParent().getParent();
            ViewGroup viewGroup3 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(z);
            }
            ViewParent parent4 = u0().getParent().getParent();
            ViewGroup viewGroup4 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
            if (viewGroup4 != null) {
                viewGroup4.setClipToPadding(z);
            }
        }
    }

    public final sv8 q0() {
        return (sv8) this.w0.T0(this, F0[2]);
    }

    public final eua r0() {
        return (eua) this.s0.getValue();
    }

    public final csb s0() {
        bc7 bc7Var = F0[3];
        return (csb) this.x0.getValue();
    }

    public final j03 t0() {
        return (j03) this.z0.T0(this, F0[5]);
    }

    public final LinearLayout u0() {
        return (LinearLayout) this.u0.T0(this, F0[0]);
    }

    public final xz8 v0() {
        return (xz8) this.a.getValue();
    }

    public final yce w0() {
        return (yce) this.b.getValue();
    }

    public final int x0() {
        boolean zB = r0().b(eua.l);
        boolean zB2 = r0().b(eua.h);
        return (zB || !zB2) ? (zB2 || !zB) ? oga.j : oga.d : oga.i;
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        rce rceVar;
        q0e q0eVar;
        Object value;
        lce lceVar = (lce) x53.i0(w0().L0.b());
        if (lceVar == null || (rceVar = lceVar.b) == null) {
            return;
        }
        String str = (String) x53.j0(i, rceVar.Y);
        if (str != null) {
            yce yceVarW0 = w0();
            rce rceVar2 = new rce(rceVar.a, rceVar.b, rceVar.c, str, rceVar.X, rceVar.Y, rceVar.Z);
            do {
                q0eVar = yceVarW0.I0;
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, rceVar2));
        }
        w0().K0.setValue(null);
    }

    public final void y0() {
        xz8 xz8VarV0 = v0();
        CharSequence text = q0().getText();
        xz8VarV0.getClass();
        pnf.o(xz8VarV0.z0, new fz8(text));
        q0().setText(null);
    }

    public final void z0(dz8 dz8Var) {
        int i = this.E0;
        this.E0 = dz8Var != null ? dz8Var.a : 0;
        qm0 qm0Var = this.x0;
        if (dz8Var == null && br7.H(qm0Var)) {
            s0().setVisibility(8);
            return;
        }
        if (dz8Var == null || br7.H(qm0Var)) {
            if (dz8Var != null) {
                D0(s0(), dz8Var);
                q0().requestFocus();
                if (i != this.E0) {
                    q0().e(true);
                    return;
                }
                return;
            }
            return;
        }
        View viewRequireView = requireView();
        LinearLayout linearLayout = viewRequireView instanceof LinearLayout ? (LinearLayout) viewRequireView : null;
        if (linearLayout != null) {
            br7.b(linearLayout, s0(), 0);
        }
        D0(s0(), dz8Var);
        s0().setVisibility(0);
        q0().requestFocus();
        q0().e(true);
    }

    public MessageWriteWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        Object objV = ay7.v(bundle, "arg_scope_id", suc.class);
        if (objV != null) {
            this.a = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, xz8.class, null);
            Object objV2 = ay7.v(bundle, "arg_scope_id", suc.class);
            if (objV2 != null) {
                this.b = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV2)).a, yce.class, null);
                Object objV3 = ay7.v(bundle, "arg_scope_id", suc.class);
                if (objV3 != null) {
                    this.c = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV3)).a, zz7.class, null);
                    Object objV4 = ay7.v(bundle, "arg_scope_id", suc.class);
                    if (objV4 != null) {
                        this.o = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV4)).a, jac.class, null);
                        f9g f9gVar = f9g.a;
                        this.X = (xp7) f9gVar.getAccessor().c(xp7.class);
                        this.Y = f9gVar.getAccessor().d(hp.class);
                        this.Z = f9gVar.getAccessor().d(qe5.class);
                        this.s0 = f9gVar.getAccessor().d(eua.class);
                        this.t0 = tu0.r(3, new yz8(this, 0));
                        this.u0 = viewBinding(lga.y);
                        this.v0 = viewBinding(lga.w);
                        this.w0 = viewBinding(xoc.X);
                        this.x0 = binding(new yz8(this, 1));
                        int i = lga.x;
                        this.y0 = viewBinding(i);
                        this.z0 = childSlotRouter(i);
                        this.C0 = r0e.a(Boolean.FALSE);
                        return;
                    }
                    throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
                }
                throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
            }
            throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }
}
