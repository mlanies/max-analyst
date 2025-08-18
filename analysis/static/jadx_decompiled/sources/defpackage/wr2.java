package defpackage;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class wr2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ wr2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 6;
        int i6 = 3;
        Continuation continuation = null;
        final int i7 = 1;
        final ChatTitleIconScreen chatTitleIconScreen = this.b;
        boolean z = false;
        z = false;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatTitleIconScreen.z0;
                chatTitleIconScreen.r0().y0.m(null, new ds2(null, null, null));
                return e5f.a;
            case 1:
                bc7[] bc7VarArr2 = ChatTitleIconScreen.z0;
                int iOrdinal = chatTitleIconScreen.q0().ordinal();
                if (iOrdinal == 0) {
                    return wuc.CREATE_CHAT_INFO;
                }
                if (iOrdinal == 1) {
                    return wuc.CREATE_CHANNEL_INFO;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                bc7[] bc7VarArr3 = ChatTitleIconScreen.z0;
                cla claVar = new cla(chatTitleIconScreen.getContext(), 6);
                claVar.setId(zia.j);
                claVar.setLayoutParams(new ti3(-1, -2));
                claVar.setForm(uka.a);
                int iOrdinal2 = chatTitleIconScreen.q0().ordinal();
                if (iOrdinal2 == 0) {
                    i = aja.s;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = aja.t;
                }
                claVar.setTitle(i);
                claVar.setLeftActions(new kka(new l(27, claVar)));
                return claVar;
            case 3:
                bc7[] bc7VarArr4 = ChatTitleIconScreen.z0;
                TextView textView = new TextView(chatTitleIconScreen.getContext());
                textView.setId(zia.f);
                textView.setLayoutParams(new ti3(0, -2));
                textView.setGravity(17);
                float f = 12;
                textView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
                int iOrdinal3 = chatTitleIconScreen.q0().ordinal();
                if (iOrdinal3 == 0) {
                    i2 = aja.n;
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = aja.o;
                }
                textView.setText(i2);
                v3c.y(new v9(i6, continuation, i5), textView);
                return textView;
            case 4:
                bc7[] bc7VarArr5 = ChatTitleIconScreen.z0;
                s5a s5aVar = new s5a(chatTitleIconScreen.getContext());
                s5aVar.setId(zia.h);
                float f2 = 96;
                s5aVar.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                s5a.j(s5aVar, kt3.b(chatTitleIconScreen.getContext(), woc.h0), null, 30);
                s5aVar.setAvatarShape(j5a.a);
                final int i8 = z ? 1 : 0;
                tu0.K(s5aVar, 300L, new View.OnClickListener() { // from class: vr2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String strO;
                        str = null;
                        final String str = null;
                        ChatTitleIconScreen chatTitleIconScreen2 = chatTitleIconScreen;
                        switch (i8) {
                            case 0:
                                bc7[] bc7VarArr6 = ChatTitleIconScreen.z0;
                                mr0.G(chatTitleIconScreen2);
                                chatTitleIconScreen2.r0().getClass();
                                List listM = y53.M(new mg3(zia.b, new eqe(aja.j), 3, false), new mg3(zia.c, new eqe(aja.k), 3, false), new mg3(zia.a, new eqe(aja.i), 2, false));
                                bc7[] bc7VarArr7 = BottomSheetWidget.x0;
                                lg3 lg3VarE = wg0.e(aja.h, 6, null);
                                Iterator it = listM.iterator();
                                while (it.hasNext()) {
                                    lg3VarE.a((mg3) it.next());
                                }
                                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                                confirmationBottomSheetE.setTargetController(chatTitleIconScreen2);
                                uu3 parentController = chatTitleIconScreen2;
                                while (parentController.getParentController() != null) {
                                    parentController = parentController.getParentController();
                                }
                                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                                znc zncVarT = focVar != null ? focVar.T() : null;
                                confirmationBottomSheetE.z0(chatTitleIconScreen2);
                                if (zncVarT != null) {
                                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                                    zncVarT.G(cocVar);
                                    return;
                                }
                                return;
                            default:
                                bc7[] bc7VarArr8 = ChatTitleIconScreen.z0;
                                mr0.G(chatTitleIconScreen2);
                                chatTitleIconScreen2.p0().setProgressEnabled(true);
                                ks2 ks2VarR0 = chatTitleIconScreen2.r0();
                                int iOrdinal4 = ks2VarR0.c.ordinal();
                                if (iOrdinal4 != 0) {
                                    if (iOrdinal4 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ks2VarR0.D0.o1(ks2VarR0, ks2.I0[0], pnf.n(ks2VarR0, ((w9a) ((kke) ks2VarR0.Z.getValue())).b(), null, new is2(ks2VarR0, null), 2));
                                    return;
                                }
                                final p82 p82Var = (p82) ks2VarR0.t0.getValue();
                                final List listL0 = ys.l0(ks2VarR0.b);
                                final String str2 = ks2VarR0.G0;
                                String str3 = ((ds2) ks2VarR0.y0.getValue()).b;
                                if (str3 != null && (strO = j47.O(str3)) != null) {
                                    str = strO;
                                }
                                v02 v02Var = new v02(13, ks2VarR0);
                                p82Var.getClass();
                                Callable callable = new Callable() { // from class: n82
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        p82 p82Var2 = p82Var;
                                        p82Var2.getClass();
                                        StringBuilder sb = new StringBuilder("createMultiChat, contacts.size() = ");
                                        List list = listL0;
                                        sb.append(list.size());
                                        hm9.n("p82", sb.toString());
                                        j92 j92Var = j92.b;
                                        String str4 = str;
                                        String str5 = str2;
                                        e52 e52VarB = p82Var2.b(j92Var, list, str5, str4);
                                        o10 o10Var = new o10();
                                        o10Var.a = p10.b;
                                        o10Var.l = 3;
                                        o10Var.c = list;
                                        o10Var.d = str5;
                                        ((s8g) p82Var2.w.get()).a(new i8d(new h8d(e52VarB.a, o10Var.a(), 1), (byte) 0));
                                        return e52VarB;
                                    }
                                };
                                ztc ztcVarB = muc.b();
                                w4d w4dVar = cqc.a;
                                new q1a(1, new bqc(0, callable)).m(ztcVarB).i(p82Var.u).k(new iq1(v02Var, 2, new p4c(12)));
                                return;
                        }
                    }
                });
                s5aVar.setCloseBadgeClickListener(new wr2(chatTitleIconScreen, z ? 1 : 0));
                return s5aVar;
            case 5:
                bc7[] bc7VarArr6 = ChatTitleIconScreen.z0;
                cka ckaVar = new cka(chatTitleIconScreen.getContext());
                ckaVar.setId(zia.i);
                ckaVar.setLayoutParams(new ti3(0, -2));
                float f3 = 12;
                ckaVar.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(f3 * fk4.d().getDisplayMetrics().density), 0);
                int iOrdinal4 = chatTitleIconScreen.q0().ordinal();
                if (iOrdinal4 == 0) {
                    i3 = aja.q;
                } else {
                    if (iOrdinal4 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = aja.r;
                }
                ckaVar.setHint(z7.B(ckaVar.getContext(), i3));
                ckaVar.setText(chatTitleIconScreen.r0().G0);
                ckaVar.setBackgroundColorAttr(Integer.valueOf(wfa.L));
                qyc qycVar = (qyc) ((y7d) chatTitleIconScreen.b.getValue());
                qycVar.getClass();
                ckaVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) qycVar.q(PmsKey.f75maxthemelength, 200))});
                v3c.y(new xr2(i6, continuation, z ? 1 : 0), ckaVar);
                final int i9 = z ? 1 : 0;
                ckaVar.b(new m56() { // from class: ur2
                    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
                    @Override // defpackage.m56
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r9) {
                        /*
                            r8 = this;
                            e5f r0 = defpackage.e5f.a
                            one.me.startconversation.chattitleicon.ChatTitleIconScreen r1 = r1
                            int r8 = r2
                            switch(r8) {
                                case 0: goto L1c;
                                default: goto L9;
                            }
                        L9:
                            java.lang.String r9 = (java.lang.String) r9
                            bc7[] r8 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.z0
                            ks2 r8 = r1.r0()
                            java.lang.CharSequence r9 = defpackage.w9e.b1(r9)
                            java.lang.String r9 = r9.toString()
                            r8.H0 = r9
                            return r0
                        L1c:
                            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                            bc7[] r8 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.z0
                            java.lang.String r8 = r9.toString()
                            one.me.sdk.uikit.common.button.OneMeButton r2 = r1.p0()
                            ks2 r3 = r1.r0()
                            r3.getClass()
                            boolean r4 = defpackage.w9e.C0(r8)
                            r5 = 1
                            r4 = r4 ^ r5
                            if (r4 == 0) goto L4f
                            int r8 = r8.length()
                            y7d r3 = r3.o
                            qyc r3 = (defpackage.qyc) r3
                            r3.getClass()
                            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f75maxthemelength
                            r6 = 200(0xc8, float:2.8E-43)
                            long r6 = (long) r6
                            long r3 = r3.q(r4, r6)
                            int r3 = (int) r3
                            if (r8 > r3) goto L4f
                            goto L50
                        L4f:
                            r5 = 0
                        L50:
                            r2.setEnabled(r5)
                            ks2 r8 = r1.r0()
                            java.lang.String r9 = r9.toString()
                            java.lang.CharSequence r9 = defpackage.w9e.b1(r9)
                            java.lang.String r9 = r9.toString()
                            r8.G0 = r9
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur2.invoke(java.lang.Object):java.lang.Object");
                    }
                });
                return ckaVar;
            case 6:
                bc7[] bc7VarArr7 = ChatTitleIconScreen.z0;
                xh4 xh4Var = new xh4(chatTitleIconScreen.getContext());
                xh4Var.setId(zia.g);
                ti3 ti3Var = new ti3(0, -2);
                float f4 = 12;
                ti3Var.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f4));
                ti3Var.setMarginEnd(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                xh4Var.setLayoutParams(ti3Var);
                xh4Var.setMaxCount(((qyc) ((y7d) chatTitleIconScreen.b.getValue())).r());
                xh4Var.setHint(new eqe(aja.p));
                xh4Var.setText(chatTitleIconScreen.r0().H0);
                xh4Var.setBackgroundColorAttr(Integer.valueOf(wfa.L));
                xh4Var.setHintColorAttr(wfa.X);
                v3c.y(new xh0(i6, continuation, 4), xh4Var);
                xh4Var.t0.addTextChangedListener(new vf1(new m56() { // from class: ur2
                    @Override // defpackage.m56
                    public final Object invoke(Object v) {
                        /*
                            this = this;
                            e5f r0 = defpackage.e5f.a
                            one.me.startconversation.chattitleicon.ChatTitleIconScreen r1 = r1
                            int r8 = r2
                            switch(r8) {
                                case 0: goto L1c;
                                default: goto L9;
                            }
                        L9:
                            java.lang.String r9 = (java.lang.String) r9
                            bc7[] r8 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.z0
                            ks2 r8 = r1.r0()
                            java.lang.CharSequence r9 = defpackage.w9e.b1(r9)
                            java.lang.String r9 = r9.toString()
                            r8.H0 = r9
                            return r0
                        L1c:
                            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                            bc7[] r8 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.z0
                            java.lang.String r8 = r9.toString()
                            one.me.sdk.uikit.common.button.OneMeButton r2 = r1.p0()
                            ks2 r3 = r1.r0()
                            r3.getClass()
                            boolean r4 = defpackage.w9e.C0(r8)
                            r5 = 1
                            r4 = r4 ^ r5
                            if (r4 == 0) goto L4f
                            int r8 = r8.length()
                            y7d r3 = r3.o
                            qyc r3 = (defpackage.qyc) r3
                            r3.getClass()
                            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f75maxthemelength
                            r6 = 200(0xc8, float:2.8E-43)
                            long r6 = (long) r6
                            long r3 = r3.q(r4, r6)
                            int r3 = (int) r3
                            if (r8 > r3) goto L4f
                            goto L50
                        L4f:
                            r5 = 0
                        L50:
                            r2.setEnabled(r5)
                            ks2 r8 = r1.r0()
                            java.lang.String r9 = r9.toString()
                            java.lang.CharSequence r9 = defpackage.w9e.b1(r9)
                            java.lang.String r9 = r9.toString()
                            r8.G0 = r9
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur2.invoke(java.lang.Object):java.lang.Object");
                    }
                }, 2, xh4Var));
                return xh4Var;
            default:
                bc7[] bc7VarArr8 = ChatTitleIconScreen.z0;
                OneMeButton oneMeButton = new OneMeButton(chatTitleIconScreen.getContext(), null);
                oneMeButton.setId(zia.e);
                ti3 ti3Var2 = new ti3(0, -2);
                float f5 = 12;
                ti3Var2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f5));
                ti3Var2.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f5));
                ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = tu0.G(f5 * fk4.d().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(ti3Var2);
                int iOrdinal5 = chatTitleIconScreen.q0().ordinal();
                if (iOrdinal5 == 0) {
                    i4 = aja.l;
                } else {
                    if (iOrdinal5 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = aja.m;
                }
                oneMeButton.setText(i4);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setAppearance(z6a.o);
                ks2 ks2VarR0 = chatTitleIconScreen.r0();
                String str = chatTitleIconScreen.r0().G0;
                ks2VarR0.getClass();
                if (!w9e.C0(str)) {
                    int length = str.length();
                    qyc qycVar2 = (qyc) ks2VarR0.o;
                    qycVar2.getClass();
                    if (length <= ((int) qycVar2.q(PmsKey.f75maxthemelength, 200))) {
                        z = true;
                    }
                }
                oneMeButton.setEnabled(z);
                tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: vr2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String strO;
                        str = null;
                        final String str2 = null;
                        ChatTitleIconScreen chatTitleIconScreen2 = chatTitleIconScreen;
                        switch (i7) {
                            case 0:
                                bc7[] bc7VarArr62 = ChatTitleIconScreen.z0;
                                mr0.G(chatTitleIconScreen2);
                                chatTitleIconScreen2.r0().getClass();
                                List listM = y53.M(new mg3(zia.b, new eqe(aja.j), 3, false), new mg3(zia.c, new eqe(aja.k), 3, false), new mg3(zia.a, new eqe(aja.i), 2, false));
                                bc7[] bc7VarArr72 = BottomSheetWidget.x0;
                                lg3 lg3VarE = wg0.e(aja.h, 6, null);
                                Iterator it = listM.iterator();
                                while (it.hasNext()) {
                                    lg3VarE.a((mg3) it.next());
                                }
                                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                                confirmationBottomSheetE.setTargetController(chatTitleIconScreen2);
                                uu3 parentController = chatTitleIconScreen2;
                                while (parentController.getParentController() != null) {
                                    parentController = parentController.getParentController();
                                }
                                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                                znc zncVarT = focVar != null ? focVar.T() : null;
                                confirmationBottomSheetE.z0(chatTitleIconScreen2);
                                if (zncVarT != null) {
                                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                                    zncVarT.G(cocVar);
                                    return;
                                }
                                return;
                            default:
                                bc7[] bc7VarArr82 = ChatTitleIconScreen.z0;
                                mr0.G(chatTitleIconScreen2);
                                chatTitleIconScreen2.p0().setProgressEnabled(true);
                                ks2 ks2VarR02 = chatTitleIconScreen2.r0();
                                int iOrdinal42 = ks2VarR02.c.ordinal();
                                if (iOrdinal42 != 0) {
                                    if (iOrdinal42 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ks2VarR02.D0.o1(ks2VarR02, ks2.I0[0], pnf.n(ks2VarR02, ((w9a) ((kke) ks2VarR02.Z.getValue())).b(), null, new is2(ks2VarR02, null), 2));
                                    return;
                                }
                                final p82 p82Var = (p82) ks2VarR02.t0.getValue();
                                final List listL0 = ys.l0(ks2VarR02.b);
                                final String str22 = ks2VarR02.G0;
                                String str3 = ((ds2) ks2VarR02.y0.getValue()).b;
                                if (str3 != null && (strO = j47.O(str3)) != null) {
                                    str2 = strO;
                                }
                                v02 v02Var = new v02(13, ks2VarR02);
                                p82Var.getClass();
                                Callable callable = new Callable() { // from class: n82
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        p82 p82Var2 = p82Var;
                                        p82Var2.getClass();
                                        StringBuilder sb = new StringBuilder("createMultiChat, contacts.size() = ");
                                        List list = listL0;
                                        sb.append(list.size());
                                        hm9.n("p82", sb.toString());
                                        j92 j92Var = j92.b;
                                        String str4 = str2;
                                        String str5 = str22;
                                        e52 e52VarB = p82Var2.b(j92Var, list, str5, str4);
                                        o10 o10Var = new o10();
                                        o10Var.a = p10.b;
                                        o10Var.l = 3;
                                        o10Var.c = list;
                                        o10Var.d = str5;
                                        ((s8g) p82Var2.w.get()).a(new i8d(new h8d(e52VarB.a, o10Var.a(), 1), (byte) 0));
                                        return e52VarB;
                                    }
                                };
                                ztc ztcVarB = muc.b();
                                w4d w4dVar = cqc.a;
                                new q1a(1, new bqc(0, callable)).m(ztcVarB).i(p82Var.u).k(new iq1(v02Var, 2, new p4c(12)));
                                return;
                        }
                    }
                });
                return oneMeButton;
        }
    }
}
