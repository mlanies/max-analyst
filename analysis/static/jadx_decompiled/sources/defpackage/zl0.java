package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.profile.ProfileScreen;
import ru.ok.messages.media.attaches.MessageAttachmentsLayout;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class zl0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zl0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = 19;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return ((am0) obj).performLongClick();
            case 1:
                b46 b46Var = CallLinkInfoScreen.B0;
                dd1 dd1VarN0 = ((CallLinkInfoScreen) obj).n0();
                CharSequence charSequence = ((rc1) dd1VarN0.u0.a.getValue()).c;
                if (charSequence != null) {
                    pnf.o(dd1VarN0.v0, new fa1(charSequence));
                }
                return true;
            case 2:
                fk3 fk3Var = (fk3) obj;
                o9g o9gVar = fk3Var.P0;
                if (o9gVar != null) {
                    long j = fk3Var.R0;
                    buc bucVar = CallHistoryPageScreen.u0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) o9gVar.b;
                    if (!((s81) callHistoryPageScreen.o0().s0.getValue()).a) {
                        callHistoryPageScreen.p0().y0 = Long.valueOf(j);
                        dy7.c(2).I((List) callHistoryPageScreen.s0.getValue()).Y(fk3Var).R(fk4.d().getDisplayMetrics().density * 12.0f).build().q(callHistoryPageScreen);
                    }
                }
                return fk3Var.P0 != null;
            case 3:
                ((MediaBarPreviewLayout) obj).T0.getClass();
                return true;
            case 4:
                ts8 ts8Var = ((MessageAttachmentsLayout) obj).a;
                ps8 ps8Var = ts8Var.z0;
                ts8Var.w0.h(0);
                ps8Var.getClass();
                return true;
            case 5:
                ((mk9) obj).n(new fj0(i));
                return true;
            case 6:
                ((fl9) obj).n(new fj0(i));
                return true;
            case 7:
                ((kl9) obj).n(new fj0(i));
                return true;
            case 8:
                cnb cnbVarR0 = ((ProfileScreen) ((qlb) obj).X).r0();
                pnf.o(cnbVarR0.z0, new ylb((List) ((zcb) cnbVarR0.F0.getValue()).l.getValue()));
                return true;
            case 9:
                return ((xkd) obj).performLongClick();
            case 10:
                return ((ppe) obj).performLongClick();
            case 11:
                zef zefVar = (zef) obj;
                Long l = zefVar.Z;
                if (l != null) {
                    long jLongValue = l.longValue();
                    a66 a66Var = zefVar.X;
                    if (a66Var != null) {
                        Long lValueOf = Long.valueOf(jLongValue);
                        ViewGroup viewGroup = (ViewGroup) zefVar.b;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        a66Var.invoke(lValueOf, viewGroup);
                    }
                }
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((dif) obj).performLongClick();
            default:
                return ((ohf) obj).performLongClick();
        }
    }
}
