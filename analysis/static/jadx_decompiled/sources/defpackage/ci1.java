package defpackage;

import android.view.ViewStub;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class ci1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ ci1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 1;
        int i2 = 0;
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                yxc yxcVar = CallScreen.R0;
                return new ji1(callScreen);
            case 1:
                yxc yxcVar2 = CallScreen.R0;
                return tpa.u(callScreen.getContext());
            case 2:
                yxc yxcVar3 = CallScreen.R0;
                return new z21(callScreen.getContext());
            case 3:
                yxc yxcVar4 = CallScreen.R0;
                tta ttaVar = (tta) callScreen.X.getValue();
                je7 je7VarC = yi1.c();
                zi1 zi1Var = zi1.a;
                ir1 ir1VarB = zi1Var.b();
                je7 je7Var = iyc.l;
                je7 je7VarB = yi1.b();
                khe kheVar = callScreen.c;
                c11 c11Var = new c11(je7VarB, (ivc) kheVar.getValue());
                tta ttaVar2 = (tta) callScreen.X.getValue();
                khe kheVar2 = callScreen.o;
                z21 z21Var = (z21) kheVar2.getValue();
                ty2 ty2Var = new ty2();
                ty2Var.a = ttaVar2;
                ty2Var.b = z21Var;
                ty2Var.c = d04.k;
                ty2Var.o = new pqa(fqa.c);
                ty2Var.X = y21.h;
                ty2Var.Z = aa.h;
                bn1 bn1Var = new bn1(callScreen.getContext());
                zi1Var.getAccessor().d(q33.class);
                je7 je7VarD = yi1.d();
                ivc ivcVar = (ivc) kheVar.getValue();
                ir1 ir1VarB2 = zi1Var.b();
                je7 je7VarA = yi1.a();
                je7 je7Var2 = iyc.b;
                return new el1(je7VarC, ttaVar, ir1VarB, c11Var, ty2Var, bn1Var, new eo1(new ci1(callScreen, 10), ir1VarB2, je7Var, yi1.c(), je7Var2, je7VarA, iyc.a()), (z21) kheVar2.getValue(), ivcVar, je7VarD);
            case 4:
                yxc yxcVar5 = CallScreen.R0;
                uv3 uv3Var = new uv3();
                uv3Var.h = new di1(callScreen, i);
                uv3Var.i = new di1(callScreen, 2);
                return uv3Var;
            case 5:
                yxc yxcVar6 = CallScreen.R0;
                ViewStub viewStub = new ViewStub(callScreen.getContext());
                viewStub.setId(rvb.call_bottom_unavailable_control);
                return viewStub;
            case 6:
                yxc yxcVar7 = CallScreen.R0;
                return new ki1(callScreen);
            case 7:
                yxc yxcVar8 = CallScreen.R0;
                q21 q21Var = new q21(callScreen.getContext(), null);
                q21Var.setLayoutParams(new ti3(-1, 0));
                q21Var.setVisibility(8);
                return q21Var;
            case 8:
                yxc yxcVar9 = CallScreen.R0;
                return new ui1(callScreen);
            case 9:
                yxc yxcVar10 = CallScreen.R0;
                return Integer.valueOf(((ivc) callScreen.c.getValue()).a);
            case 10:
                yxc yxcVar11 = CallScreen.R0;
                return callScreen.getViewLifecycleScope();
            case 11:
                yxc yxcVar12 = CallScreen.R0;
                CallEventsWidget callEventsWidget = new CallEventsWidget(callScreen.s0, null);
                callScreen.z0().b(callEventsWidget);
                callEventsWidget.o.add(new fi1(callScreen));
                callEventsWidget.a = new f9(callScreen, 9, callEventsWidget);
                return callEventsWidget;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yxc yxcVar13 = CallScreen.R0;
                return new ti1(callScreen);
            case 13:
                yxc yxcVar14 = CallScreen.R0;
                return new ei1(i2, callScreen);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ui1 ui1Var = (ui1) callScreen.D0.getValue();
                ki1 ki1Var = (ki1) callScreen.E0.getValue();
                je7 je7Var3 = callScreen.G0;
                je7 je7Var4 = callScreen.A0;
                return new wd1(callScreen.z0, ui1Var, ki1Var, (ti1) callScreen.F0.getValue(), (fm1) callScreen.Y.getValue(), je7Var3, je7Var4, (en1) callScreen.D0().Q0.getValue(), (ugf) callScreen.D0().L0.getValue(), (b) callScreen.D0().P0.getValue());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yxc yxcVar15 = CallScreen.R0;
                ViewPager2 viewPager2 = new ViewPager2(callScreen.getContext());
                viewPager2.setId(rvb.call_modes_view_pager);
                viewPager2.setAdapter((wd1) callScreen.H0.getValue());
                viewPager2.setLayoutParams(new ti3(-1, -1));
                viewPager2.setOrientation(1);
                return viewPager2;
            case 16:
                yxc yxcVar16 = CallScreen.R0;
                ViewStub viewStub2 = new ViewStub(callScreen.getContext());
                viewStub2.setId(rvb.call_user_talking_view_label);
                return viewStub2;
            case LangUtils.HASH_SEED /* 17 */:
                yxc yxcVar17 = CallScreen.R0;
                dm1 dm1Var = new dm1(callScreen.getContext(), null);
                dm1Var.setLayoutParams(new ti3(-1, -2));
                dm1Var.setVisibility(8);
                boolean zIsLaidOut = dm1Var.isLaidOut();
                i1b i1bVar = callScreen.z0;
                if (!zIsLaidOut || dm1Var.isLayoutRequested()) {
                    dm1Var.addOnLayoutChangeListener(new ii1(callScreen, i2));
                } else {
                    i1bVar.c();
                }
                dm1Var.setControlsMediator(callScreen.z0());
                dm1Var.setCallSpeakerMediator((fm1) callScreen.Y.getValue());
                dm1Var.setPipBoundariesController(i1bVar);
                callScreen.z0().b(dm1Var);
                i1bVar.a(dm1Var, h1b.a);
                return dm1Var;
            case 18:
                yxc yxcVar18 = CallScreen.R0;
                ViewStub viewStub3 = new ViewStub(callScreen.getContext());
                viewStub3.setId(rvb.call_change_mode_tip_view);
                return viewStub3;
            default:
                yxc yxcVar19 = CallScreen.R0;
                u21 u21Var = new u21(callScreen.getContext());
                u21Var.setVisibility(8);
                u21Var.setTranslationY(fk4.d().getDisplayMetrics().density * (-50.0f));
                return u21Var;
        }
    }
}
