package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.Map;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class hn2 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ hn2(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        Object njcVar;
        boolean zTest;
        boolean z = false;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatScreen.k1;
                to2 to2Var = to2.a;
                khe kheVarD = to2Var.getAccessor().d(hp.class);
                khe kheVarD2 = to2Var.getAccessor().d(are.class);
                khe kheVarD3 = to2Var.getAccessor().d(q33.class);
                khe kheVarD4 = to2Var.getAccessor().d(kke.class);
                khe kheVarD5 = to2Var.getAccessor().d(Context.class);
                khe kheVarD6 = to2Var.getAccessor().d(zu8.class);
                to2Var.getAccessor().d(iy2.class);
                return new kz(kheVarD, kheVarD2, kheVarD3, kheVarD4, kheVarD5, kheVarD6, to2Var.getAccessor().d(ak3.class), to2Var.getAccessor().d(ida.class));
            case 1:
                bc7[] bc7VarArr2 = ChatScreen.k1;
                return new jac();
            case 2:
                bc7[] bc7VarArr3 = ChatScreen.k1;
                return (xx6) to2.a.getAccessor().e();
            case 3:
                to2 to2Var2 = to2.a;
                return new p5d(to2Var2.getAccessor().d(kke.class), to2Var2.getAccessor().d(s8g.class), to2Var2.getAccessor().d(zm8.class), to2Var2.getAccessor().d(xb6.class), to2Var2.getAccessor().d(x19.class), to2Var2.getAccessor().d(dc6.class));
            case 4:
                to2 to2Var3 = to2.a;
                return new hjf(to2Var3.getAccessor().d(kke.class), to2Var3.getAccessor().d(s8g.class), to2Var3.getAccessor().d(x19.class), to2Var3.getAccessor().d(xb6.class));
            case 5:
                bc7[] bc7VarArr4 = ChatTitleIconScreen.z0;
                return nyd.a.b();
            case 6:
                bc7[] bc7VarArr5 = ChatsListSearchScreen.J0;
                return new gw2();
            case 7:
                bc7[] bc7VarArr6 = ChatsListSearchScreen.J0;
                return new bh0(dh0.a.getAccessor().d(os3.class), true, null, 46);
            case 8:
                bc7[] bc7VarArr7 = ChatsListWidget.M0;
                p82 p82VarL = ((jz2) ((iy2) ys2.a.getAccessor().c(iy2.class))).l();
                p82VarL.e();
                Iterator it = p82VarL.f.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        e52 e52Var = (e52) ((Map.Entry) it.next()).getValue();
                        try {
                            zTest = p82.N.test(e52Var);
                        } catch (Exception unused) {
                            zTest = true;
                        }
                        if (zTest && p82.m(e52Var, p82.L, false, ((p7b) p82VarL.n).e)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                bc7[] bc7VarArr8 = ChatsListWidget.M0;
                uo3 uo3Var = uo3.b;
                hr3 hr3Var = hr3.a;
                khe kheVarD7 = hr3Var.getAccessor().d(Context.class);
                qn3.a.getClass();
                return new oo3(uo3Var, kheVarD7, pn3.b, hr3Var.getAccessor().d(yx7.class), (kke) hr3Var.getAccessor().c(kke.class), hr3Var.getAccessor().d(b0d.class), hr3Var.getAccessor().d(xj3.class), hr3Var.getAccessor().d(ds3.class), hr3Var.getAccessor().d(iy2.class), hr3Var.getAccessor().d(ck3.class), hr3Var.getAccessor().d(qq3.class), hr3Var.getAccessor().d(yj3.class), hr3Var.getAccessor().d(gq3.class), hr3Var.getAccessor().d(afe.class), hr3Var.getAccessor().d(oc6.class), hr3Var.getAccessor().d(y7d.class), hr3Var.getAccessor().d(l67.class));
            case 10:
                bc7[] bc7VarArr9 = ChatsListWidget.M0;
                return new cn3(ys2.a.getAccessor().d(y7d.class));
            case 11:
                return new mv2();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new mv2();
            case 13:
                bc7[] bc7VarArr10 = ChatsTabWidget.C0;
                return new jx5();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new mib(yea.E, null, 6);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr11 = ComplaintBottomSheet.X;
                return new mg3(laa.a, new eqe(maa.d), 2, false);
            case 16:
                return new gqd(false);
            case LangUtils.HASH_SEED /* 17 */:
                return new gqd(true);
            case 18:
                try {
                    Resources system = Resources.getSystem();
                    int identifier = system.getIdentifier("db_connection_pool_size", "integer", "android");
                    int integer = identifier != 0 ? system.getInteger(identifier) : -1;
                    if (integer <= 0) {
                        integer = 4;
                    }
                    njcVar = Integer.valueOf(integer);
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                boolean z2 = njcVar instanceof njc;
                Object obj = njcVar;
                if (z2) {
                    obj = 4;
                }
                return Integer.valueOf(((Number) obj).intValue());
            case 19:
                return jyc.a.i();
            case 20:
                return new x45("io", ((Number) sd3.b.getValue()).intValue(), 1000L, true, false, 0, 96);
            case 21:
                return new x45("net", 2, 60000L, true, false, 0, 64);
            case 22:
                int i = ft4.o;
                kt4 kt4Var = kt4.SECONDS;
                fh8 fh8Var = new fh8(true, z7.R(1, kt4Var), z7.R(3, kt4Var), new pz2(3), new pz2(4));
                boolean z3 = mqd.a;
                fe feVar = fe.a;
                x45 x45Var = sd3.a;
                return new iba(fh8Var, new rd3(false ? 1 : 0), z3 ? x45Var : (x45) sd3.c.getValue(), z3 ? x45Var : (x45) sd3.d.getValue(), z3 ? x45Var : sd3.e);
            case 23:
                return new jle(sd3.f, new khe(new hn2(26)));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new qj(new khe(new hn2(19)));
            case 25:
                return new w9a(sd3.f);
            case 26:
                return ce.a();
            case 27:
                int i2 = ConfirmAddOpponentToCallBottomSheet.A0;
                b31 b31VarB = n31.a.b();
                je7 je7Var = yi1.a;
                zi1 zi1Var = zi1.a;
                return new ve3(b31VarB, zi1Var.getAccessor().d(q33.class), zi1Var.getAccessor().d(kke.class));
            case 28:
                bc7[] bc7VarArr12 = ConfirmPhoneScreen.C0;
                int i3 = vc7.a;
                return Boolean.valueOf(vc7.b(vc7.c));
            default:
                bc7[] bc7VarArr13 = ConfirmPhoneScreen.C0;
                return wuc.AUTH_OTP;
        }
    }
}
