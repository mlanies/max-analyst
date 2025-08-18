package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class tb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ys1 ys1Var = ys1.a;
        vx3 vx3Var = vx3.b;
        ph phVar = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                ((m56) obj).invoke(Long.valueOf(((ba) obj2).a));
                return;
            case 1:
                ((cm0) obj).G0.invoke((ov5) obj2);
                return;
            case 2:
                long itemId = ((ol7) obj2).getItemId();
                b46 b46Var = CallLinkInfoScreen.B0;
                ((CallLinkInfoScreen) ((bkg) obj).b).n0().q(itemId);
                return;
            case 3:
                b46 b46Var2 = CallLinkInfoScreen.B0;
                if (((rc1) obj).d instanceof pc1) {
                    CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) obj2;
                    callLinkInfoScreen.m0().e(ys1Var, false);
                    callLinkInfoScreen.n0().q(r7a.f);
                    return;
                }
                return;
            case 4:
                b46 b46Var3 = CallLinkInfoScreen.B0;
                CallLinkInfoScreen callLinkInfoScreen2 = (CallLinkInfoScreen) obj;
                callLinkInfoScreen2.m0().e(ys1Var, false);
                callLinkInfoScreen2.n0().q(((mc1) obj2).getItemId());
                return;
            case 5:
                bf1 bf1Var = (bf1) obj;
                ey1 ey1Var = bf1Var.F0;
                if (ey1Var != null) {
                    bf1Var.h();
                    bc7[] bc7VarArr = CallOpponentsListWidget.H0;
                    eo1 eo1Var = ((CallOpponentsListWidget) ey1Var.b).r0().c;
                    eo1Var.h.o1(eo1Var, eo1.k[0], j47.S((sx3) eo1Var.a.invoke(), ((w9a) ((kke) eo1Var.c.getValue())).b(), vx3Var, new do1(eo1Var, ((gg1) obj2).a, null)));
                    return;
                }
                return;
            case 6:
                int[] iArr = new int[2];
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                appCompatImageView.getLocationOnScreen(iArr);
                Point point = new Point(iArr[0], iArr[1]);
                point.y = appCompatImageView.getHeight() + point.y;
                dm1 dm1Var = (dm1) obj2;
                cm1 cm1Var = dm1Var.M0;
                if (cm1Var != null) {
                    gg1 gg1Var = dm1Var.R0;
                    yxc yxcVar = CallScreen.R0;
                    ((CallScreen) ((w4d) cm1Var).b).D0().x(gg1Var, point);
                    return;
                }
                return;
            case 7:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                if (onClickListener != null) {
                    onClickListener.onClick((d12) obj2);
                    return;
                }
                return;
            case 8:
                ((m56) ((ze1) obj).G0).invoke(((CharSequence) obj2).toString());
                return;
            case 9:
                CharSequence text = ((z32) obj2).H0.getText();
                if (text == null) {
                    return;
                }
                ((m56) obj).invoke(text);
                return;
            case 10:
                ((m56) obj).invoke((qm8) obj2);
                return;
            case 11:
                ((m56) obj).invoke((c62) obj2);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((m56) obj).invoke((um8) obj2);
                return;
            case 13:
                ((m56) obj).invoke((wm8) obj2);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((m56) obj).invoke((vq2) obj2);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr2 = ChatStatusBottomWidget.c;
                ChatStatusBottomWidget chatStatusBottomWidget = (ChatStatusBottomWidget) obj;
                switch (zq2.$EnumSwitchMapping$0[((yq2) obj2).ordinal()]) {
                    case -1:
                    case 9:
                        return;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        rq2 rq2VarM0 = chatStatusBottomWidget.m0();
                        pnf.n(rq2VarM0, ((w9a) rq2VarM0.u()).b(), null, new mp2(rq2VarM0, null), 2);
                        return;
                    case 2:
                        rq2 rq2VarM02 = chatStatusBottomWidget.m0();
                        rq2VarM02.getClass();
                        pnf.n(rq2VarM02, null, null, new qq2(rq2VarM02, null), 3);
                        return;
                    case 3:
                        chatStatusBottomWidget.m0().x();
                        return;
                    case 4:
                        rq2 rq2VarM03 = chatStatusBottomWidget.m0();
                        rq2VarM03.S0.o1(rq2VarM03, rq2.f1[7], j47.S(rq2VarM03.a, ((w9a) rq2VarM03.u()).b(), vx3Var, new op2(rq2VarM03, null)));
                        return;
                    case 5:
                        rq2 rq2VarM04 = chatStatusBottomWidget.m0();
                        rq2VarM04.T0.o1(rq2VarM04, rq2.f1[8], j47.S(rq2VarM04.a, ((w9a) rq2VarM04.u()).b(), vx3Var, new lq2(rq2VarM04, null)));
                        return;
                    case 6:
                        rq2 rq2VarM05 = chatStatusBottomWidget.m0();
                        pnf.n(rq2VarM05, ((w9a) rq2VarM05.u()).b(), null, new rp2(rq2VarM05, null), 2);
                        return;
                    case 7:
                        rq2 rq2VarM06 = chatStatusBottomWidget.m0();
                        e52 e52Var = (e52) rq2VarM06.Y0.a.getValue();
                        String strQ = e52Var != null ? e52Var.q() : null;
                        pnf.o(rq2VarM06.b1, new bp2(new gqe(u8a.e, ys.m0(new Object[]{strQ != null ? strQ : ""})), y53.M(new mg3(t8a.s, new eqe(u8a.d), 1, false), new mg3(t8a.q, new eqe(u8a.a), 2, false))));
                        return;
                    case 8:
                        rq2 rq2VarM07 = chatStatusBottomWidget.m0();
                        e52 e52Var2 = (e52) rq2VarM07.Y0.a.getValue();
                        String strQ2 = e52Var2 != null ? e52Var2.q() : null;
                        pnf.o(rq2VarM07.b1, new bp2(new gqe(u8a.c, ys.m0(new Object[]{strQ2 != null ? strQ2 : ""})), y53.M(new mg3(t8a.r, new eqe(u8a.b), 1, false), new mg3(t8a.q, new eqe(u8a.a), 2, false))));
                        return;
                }
            case 16:
                ((m56) obj).invoke(Long.valueOf(((nl2) obj2).a));
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((q23) obj).F0.toggle();
                ((View.OnClickListener) obj2).onClick(view);
                return;
            case 18:
                int i = ConfirmAddOpponentToCallBottomSheet.A0;
                ve3 ve3Var = (ve3) ((ConfirmAddOpponentToCallBottomSheet) obj).y0.getValue();
                boolean zIsChecked = ((yz2) obj2).isChecked();
                Long l = ((y21) ((l31) ve3Var.b).k.getValue()).a;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (ve3Var.X != null) {
                        return;
                    }
                    ve3Var.X = pnf.n(ve3Var, ((w9a) ((kke) ve3Var.o.getValue())).b(), null, new ue3(ve3Var, zIsChecked, jLongValue, null), 2);
                    return;
                }
                return;
            case 19:
                ((m56) obj).invoke(Long.valueOf(((nn3) obj2).a));
                return;
            case 20:
                ((m56) obj).invoke((jq3) obj2);
                return;
            case 21:
                wq3 wq3Var = ((gr3) obj).F0;
                int i2 = ((yq3) obj2).a;
                wq3Var.getClass();
                return;
            case 22:
                wq3 wq3Var2 = ((sr3) obj).F0;
                int i3 = ((yq3) obj2).a;
                wq3Var2.getClass();
                return;
            case 23:
                bc7[] bc7VarArr3 = ContextMenuPopupWindow.u0;
                ContextMenuPopupWindow contextMenuPopupWindow = (ContextMenuPopupWindow) obj;
                contextMenuPopupWindow.getClass();
                bc7[] bc7VarArr4 = ContextMenuPopupWindow.u0;
                bc7 bc7Var = bc7VarArr4[6];
                fs fsVar = contextMenuPopupWindow.Z;
                if (!((Boolean) fsVar.a(contextMenuPopupWindow)).booleanValue()) {
                    bc7 bc7Var2 = bc7VarArr4[6];
                    fsVar.b(contextMenuPopupWindow, Boolean.TRUE);
                    uu3 targetController = contextMenuPopupWindow.getTargetController();
                    xt3 xt3Var = targetController instanceof xt3 ? (xt3) targetController : null;
                    if (xt3Var != null) {
                        bc7 bc7Var3 = bc7VarArr4[0];
                        xt3Var.y(((tt3) obj2).a, (Bundle) contextMenuPopupWindow.a.a(contextMenuPopupWindow));
                    }
                }
                contextMenuPopupWindow.dismiss();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((st3) obj).e.invoke();
                cu3 cu3Var = (cu3) obj2;
                if (cu3Var.c) {
                    cu3Var.dismiss();
                    return;
                }
                return;
            case 25:
                ((m56) obj).invoke((tt3) obj2);
                return;
            case 26:
                ey1 ey1Var2 = ((lu3) obj).I0;
                if (ey1Var2 != null) {
                    long j = ((pw8) obj2).a;
                    bc7[] bc7VarArr5 = MessagesListWidget.X0;
                    l89 l89VarB = ((MessagesListWidget) ey1Var2.b).x0().B();
                    l89VarB.getClass();
                    l89VarB.f(j47.S(l89VarB.c, l89VarB.b, vx3Var, new c89(l89VarB, j, null)));
                    return;
                }
                return;
            case 27:
                ((m56) obj).invoke(Integer.valueOf(((uy3) obj2).a));
                return;
            case 28:
                qx4 qx4Var = ((mw4) obj).F0;
                if (qx4Var != null) {
                    KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) ((bkg) obj2).b;
                    View view2 = keyboardEmojiWidget.getView();
                    if (view2 != null) {
                        pag.F(view2, mi6.KEYBOARD_TAP);
                    }
                    cc8 cc8Var = (cc8) keyboardEmojiWidget.b.getValue();
                    long j2 = qx4Var.Y;
                    if (j2 != 0) {
                        phVar = (ph) ((gj) cc8Var.o.getValue()).i(j2).getValue();
                    } else {
                        cc8Var.getClass();
                    }
                    CharSequence charSequence = qx4Var.c;
                    pnf.o(cc8Var.X, new wb8(phVar != null ? cc8Var.b.d(j2, phVar.c, phVar.e, charSequence, tu0.G(20 * fk4.d().getDisplayMetrics().density)) : cc8Var.b.b(tu0.G(20 * fk4.d().getDisplayMetrics().density), charSequence)));
                    return;
                }
                return;
            default:
                ky4 ky4Var = (ky4) obj2;
                d02 d02Var = ky4Var.J0;
                if (d02Var != null) {
                    ((ViewGroup) ky4Var.a).setBackground(ky4Var.F0);
                    ((m56) obj).invoke(Integer.valueOf(d02Var.a));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ tb(Object obj, m56 m56Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = m56Var;
    }
}
