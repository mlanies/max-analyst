package defpackage;

import android.widget.LinearLayout;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final /* synthetic */ class vc1 implements em {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb5 b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ vc1(wb5 wb5Var, Widget widget, int i) {
        this.a = i;
        this.b = wb5Var;
        this.c = widget;
    }

    @Override // defpackage.cm
    public final void V(fm fmVar, int i) {
        Widget widget = this.c;
        wb5 wb5Var = this.b;
        switch (this.a) {
            case 0:
                b46 b46Var = CallLinkInfoScreen.B0;
                float interpolation = wb5Var.getInterpolation(Math.abs(i) / fmVar.getTotalScrollRange());
                float f = 1.0f - interpolation;
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) widget;
                callLinkInfoScreen.getClass();
                bc7[] bc7VarArr = CallLinkInfoScreen.C0;
                bc7 bc7Var = bc7VarArr[0];
                q7c q7cVar = callLinkInfoScreen.Z;
                ((LinearLayout) q7cVar.T0(callLinkInfoScreen, bc7Var)).setAlpha(f);
                LinearLayout linearLayout = (LinearLayout) q7cVar.T0(callLinkInfoScreen, bc7VarArr[0]);
                int i2 = f <= 0.1f ? 4 : 0;
                if (linearLayout.getVisibility() != i2) {
                    linearLayout.setVisibility(i2);
                }
                ((cla) callLinkInfoScreen.t0.T0(callLinkInfoScreen, bc7VarArr[2])).setTitleAlpha(interpolation);
                break;
            case 1:
                bc7[] bc7VarArr2 = CallOpponentsListWidget.H0;
                float interpolation2 = wb5Var.getInterpolation(Math.abs(i) / fmVar.getTotalScrollRange());
                float f2 = 1.0f - interpolation2;
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) widget;
                callOpponentsListWidget.n0().setAlpha(f2);
                dy7.M(callOpponentsListWidget.n0(), f2 > 0.1f);
                callOpponentsListWidget.q0().setTitleAlpha(interpolation2);
                break;
            case 2:
                bc7[] bc7VarArr3 = ProfileEditScreen.y0;
                float interpolation3 = wb5Var.getInterpolation(Math.abs(i) / fmVar.getTotalScrollRange());
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) widget;
                ((LinearLayout) profileEditScreen.t0.T0(profileEditScreen, ProfileEditScreen.y0[3])).setAlpha(1.0f - interpolation3);
                profileEditScreen.m0().setTitleAlpha(interpolation3);
                break;
            default:
                bc7[] bc7VarArr4 = ProfileScreen.D0;
                float interpolation4 = wb5Var.getInterpolation(Math.abs(i) / fmVar.getTotalScrollRange());
                ProfileScreen profileScreen = (ProfileScreen) widget;
                ((LinearLayout) profileScreen.s0.T0(profileScreen, ProfileScreen.D0[3])).setAlpha(1.0f - interpolation4);
                profileScreen.p0().setTitleAlpha(interpolation4);
                break;
        }
    }
}
