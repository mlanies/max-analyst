package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.ColorDrawable;
import java.util.Collections;
import java.util.function.ToLongFunction;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class k11 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ k11(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        tnd tndVar = tnd.a;
        int i = 2;
        switch (this.a) {
            case 0:
                float fC = fk4.c() * 40.0f;
                return new float[]{fC, fC, fC, fC, fC, fC, fC, fC};
            case 1:
                int i2 = p11.Y0;
                return -231920335;
            case 2:
                return Boolean.valueOf(((se5) ((qe5) ((khe) yi1.d()).getValue())).s());
            case 3:
                float f = fk4.d().getDisplayMetrics().density * 32.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 4:
                return new AnimatorSet();
            case 5:
                return n31.a.d();
            case 6:
                return new xa5(50L);
            case 7:
                return new xa5(50L);
            case 8:
                float f2 = fk4.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 9:
                int i3 = CallEventsWidget.Y;
                zi1 zi1Var = zi1.a;
                return new h61(zi1Var.b(), yi1.b(), (kke) zi1Var.getAccessor().c(kke.class), n31.a.c());
            case 10:
                buc bucVar = CallHistoryPageScreen.u0;
                return Collections.singletonList(new tt3(0, new eqe(c0c.call_history_item_call_context_action_remove), Integer.valueOf(wfa.U), Integer.valueOf(ytb.ic_delete_22), Integer.valueOf(wfa.P)));
            case 11:
                z71.c.Z1(null, null, null);
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                crd crdVar = CallIncomingScreen.Z;
                return (eua) n31.a.getAccessor().c(eua.class);
            case 13:
                return new xj1();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ColorDrawable(0);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr = CallJoinLinkPreviewWidget.B0;
                return wuc.CALL_JOIN_LINK_PREVIEW;
            case 16:
                b46 b46Var = CallLinkInfoScreen.B0;
                return wuc.CALL_CREATE_GROUP_LINK;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr2 = CallMoreBottomSheet.x0;
                return new acc();
            case 18:
                fs4 fs4Var = new fs4(11);
                final we1 we1Var = new we1(i);
                return fs4Var.thenComparingLong(new ToLongFunction() { // from class: df1
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((Number) we1Var.invoke(obj)).longValue();
                    }
                }).thenComparing(new fs4(12)).reversed();
            case 19:
                bc7[] bc7VarArr3 = CallOpponentsListWidget.H0;
                return wuc.ADMIN_CALL_SETTINGS;
            case 20:
                bc7[] bc7VarArr4 = CallOpponentsListWidget.H0;
                return tndVar;
            case 21:
                bc7[] bc7VarArr5 = CallOpponentsListWidget.H0;
                float f3 = fk4.d().getDisplayMetrics().density * 12.0f;
                return new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
            case 22:
                return n31.a.d();
            case 23:
                bc7[] bc7VarArr6 = xg1.x0;
                return 262952;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                bc7[] bc7VarArr7 = xg1.x0;
                return null;
            case 25:
                yxc yxcVar = CallScreen.R0;
                return (hl1) n31.a.getAccessor().c(hl1.class);
            case 26:
                yxc yxcVar2 = CallScreen.R0;
                return tndVar;
            case 27:
                yxc yxcVar3 = CallScreen.R0;
                return wuc.CALL;
            case 28:
                yxc yxcVar4 = CallScreen.R0;
                return new tta(n31.a.getAccessor().d(eua.class));
            default:
                yxc yxcVar5 = CallScreen.R0;
                return new gm1();
        }
    }
}
