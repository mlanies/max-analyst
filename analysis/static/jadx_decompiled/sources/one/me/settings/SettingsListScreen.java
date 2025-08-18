package one.me.settings;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ad0;
import defpackage.add;
import defpackage.an9;
import defpackage.b46;
import defpackage.bc7;
import defpackage.c64;
import defpackage.cgd;
import defpackage.cla;
import defpackage.dgd;
import defpackage.e09;
import defpackage.egb;
import defpackage.egd;
import defpackage.em;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fgd;
import defpackage.fm;
import defpackage.ggd;
import defpackage.gh7;
import defpackage.hbc;
import defpackage.hcd;
import defpackage.hgd;
import defpackage.hm9;
import defpackage.hob;
import defpackage.iba;
import defpackage.icd;
import defpackage.igd;
import defpackage.j47;
import defpackage.je7;
import defpackage.jp8;
import defpackage.khe;
import defpackage.l67;
import defpackage.lfd;
import defpackage.lha;
import defpackage.lwa;
import defpackage.mfd;
import defpackage.nec;
import defpackage.ng3;
import defpackage.od2;
import defpackage.osf;
import defpackage.p7b;
import defpackage.pcd;
import defpackage.pnf;
import defpackage.pyc;
import defpackage.q7c;
import defpackage.s35;
import defpackage.s36;
import defpackage.tu0;
import defpackage.ucd;
import defpackage.v3c;
import defpackage.vcd;
import defpackage.w4d;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wg0;
import defpackage.wid;
import defpackage.x27;
import defpackage.x77;
import defpackage.xcd;
import defpackage.y51;
import defpackage.ycd;
import defpackage.yfd;
import defpackage.zgd;
import defpackage.zn5;
import defpackage.zr6;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/settings/SettingsListScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Llfd;", "Lem;", "Lng3;", "Lad0;", "<init>", "()V", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SettingsListScreen extends SectionRecyclerWidget implements lfd, em, ng3, ad0 {
    public static final /* synthetic */ bc7[] B0 = {new hob(SettingsListScreen.class, "settingsCollapsingContent", "getSettingsCollapsingContent()Lone/me/settings/ui/collapsingtoolbar/SettingsTopBarContent;", 0), zr6.e(nec.a, SettingsListScreen.class, "settingsPinnedToolbar", "getSettingsPinnedToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final y51 A0;
    public final je7 X;
    public final khe Y;
    public final je7 Z;
    public final x27 o = x27.d;
    public final q7c s0;
    public final q7c t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final ExecutorService x0;
    public fm y0;
    public final mfd z0;

    public SettingsListScreen() {
        yfd yfdVar = yfd.a;
        this.X = yfdVar.getAccessor().d(l67.class);
        this.Y = new khe(new hbc(28));
        this.Z = createViewModelLazy(add.class, new jp8(29, igd.s0));
        this.s0 = viewBinding(lha.j);
        this.t0 = viewBinding(lha.i);
        this.u0 = tu0.r(3, new lwa(27, this));
        this.v0 = yfdVar.getAccessor().d(eua.class);
        this.w0 = yfdVar.getAccessor().d(an9.class);
        ExecutorService executorServiceA = ((iba) yfdVar.getAccessor().c(iba.class)).a();
        this.x0 = executorServiceA;
        this.z0 = new mfd(this, executorServiceA);
        this.A0 = new y51(executorServiceA, 5);
        w7c w7cVar = q0().C0;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, gh7VarQ, fg7Var), new egd(this, null), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(q0().E0, this.lifecycleOwner.Q(), fg7Var), new fgd(this, null), 5), getLifecycleScope());
    }

    @Override // defpackage.cm
    public final void V(fm fmVar, int i) {
        if (fmVar == null) {
            return;
        }
        float fAbs = Math.abs(i) / fmVar.getTotalScrollRange();
        ((cla) this.t0.T0(this, B0[1])).setTitleAlpha(fAbs);
        p0().setAlpha(1.0f - fAbs);
    }

    @Override // defpackage.lfd
    public final void X(long j, boolean z) {
    }

    @Override // defpackage.ad0
    public final void a(String str, RectF rectF, Rect rect) {
        add addVarQ0 = q0();
        j47.T(addVarQ0.a, ((w9a) addVarQ0.r()).b(), null, new ucd(rectF, addVarQ0, str, null), 2);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getO() {
        return this.o;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        add addVarQ0 = q0();
        addVarQ0.getClass();
        int i2 = lha.d;
        s35 s35Var = addVarQ0.z0;
        if (i != i2) {
            if (i == lha.c) {
                pnf.o(s35Var, zgd.b);
                return;
            } else {
                if (i == lha.b) {
                    addVarQ0.u();
                    return;
                }
                return;
            }
        }
        Long lT = addVarQ0.t();
        if (lT != null) {
            long jLongValue = lT.longValue();
            cgd.c.getClass();
            wg0.k(":neuro-avatars?id=" + jLongValue, s35Var);
        }
    }

    @Override // defpackage.lfd
    public final void i(long j) {
        c64 c64Var;
        c64 c64Var2;
        add addVarQ0 = q0();
        addVarQ0.getClass();
        if (j == hcd.FOLDERS.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/folder-list");
        } else if (j == hcd.APPEARANCE.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/appearance");
        } else if (j == hcd.NOTIFICATIONS.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/notifications");
        } else if (j == hcd.PRIVACY.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/privacy");
        } else if (j == hcd.MESSAGES.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/messages");
        } else if (j == hcd.SUPPORT.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":webview/faq");
        } else if (j == hcd.DEV_MENU.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/dev");
        } else if (j == hcd.BATTERY.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/media");
        } else if (j == hcd.STORAGE.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/caching");
        } else if (j == hcd.ABOUT.a) {
            cgd.c.getClass();
            c64Var2 = new c64(":settings/aboutapp");
        } else {
            if (j == hcd.ESIA_CONNECT.a) {
                cgd cgdVar = cgd.c;
                long jQ = ((p7b) addVarQ0.s()).b.q(pyc.c, -1L);
                b46 b46Var = osf.c;
                cgdVar.getClass();
                c64Var = new c64(":webapp:root?bot_id=" + jQ + "&entry_point=settings");
            } else {
                if (j == hcd.INVITE_FRIENDS.a) {
                    bc7[] bc7VarArr = add.K0;
                    bc7 bc7Var = bc7VarArr[0];
                    w4d w4dVar = addVarQ0.H0;
                    x77 x77Var = (x77) w4dVar.T0(addVarQ0, bc7Var);
                    if (x77Var == null || !x77Var.isActive()) {
                        ((l67) addVarQ0.x0.getValue()).a("click_link", "main", "invite_friends");
                        w4dVar.o1(addVarQ0, bc7VarArr[0], pnf.n(addVarQ0, ((w9a) addVarQ0.r()).c(), null, new xcd(addVarQ0, null), 2));
                        return;
                    }
                    return;
                }
                if (j == hcd.SAVED_MESSAGES.a) {
                    pnf.n(addVarQ0, ((w9a) addVarQ0.r()).a(), null, new ycd(addVarQ0, null), 2);
                    return;
                }
                icd icdVar = (icd) addVarQ0.J0.c((int) j);
                if (icdVar == null) {
                    return;
                }
                cgd cgdVar2 = cgd.c;
                b46 b46Var2 = osf.c;
                cgdVar2.getClass();
                StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
                sb.append(icdVar.c);
                sb.append("&entry_point=settings");
                String str = icdVar.d;
                if (str != null && str.length() != 0) {
                    sb.append("&start_param=");
                    sb.append(str);
                }
                c64Var = new c64(sb.toString());
            }
            c64Var2 = c64Var;
        }
        pnf.o(addVarQ0.z0, c64Var2);
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: m0, reason: from getter */
    public final y51 getA0() {
        return this.A0;
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: n0, reason: from getter */
    public final mfd getZ0() {
        return this.z0;
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333) {
            if (i2 == -1) {
                add addVarQ0 = q0();
                j47.T(addVarQ0.a, ((w9a) addVarQ0.r()).b(), null, new pcd(addVarQ0, intent != null ? intent.getData() : null, null), 2);
                return;
            }
            return;
        }
        if (i == 666 && i2 == -1) {
            if (intent == null) {
                hm9.p(SettingsListScreen.class.getName(), "data from ActAvatarCrop is null", null);
                q0().w();
            } else {
                add addVarQ02 = q0();
                j47.T(addVarQ02.a, ((w9a) addVarQ02.r()).b(), null, new vcd(intent, addVarQ02, null), 2);
            }
        }
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        q0().q();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dgd dgdVar = new dgd(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(lha.f);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v3c.y(new egb(3, null, 1), coordinatorLayout);
        dgdVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.v0.getValue()).b(strArr)) {
            q0().u();
        }
        q0().q();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        fm fmVar = this.y0;
        if (fmVar != null) {
            fmVar.a(s36.D(this, fmVar, getViewLifecycleOwner()));
        }
        p0().setAvatarClickedListener(new e09(0, q0(), add.class, "openUserAvatars", "openUserAvatars()V", 0, 7));
        p0().setNicknameClickListener(new e09(0, q0(), add.class, "copyProfileLink", "copyProfileLink()V", 0, 8));
        p0().setUserPhoneClickListener(new e09(0, q0(), add.class, "copyUserPhone", "copyUserPhone()V", 0, 9));
        od2.L(new zn5(tu0.g(q0().z0, this.lifecycleOwner.Q(), fg7.X), new hgd(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().A0, this.lifecycleOwner.Q(), fg7.o), new ggd(this, null), 5), getLifecycleScope());
    }

    public final wid p0() {
        return (wid) this.s0.T0(this, B0[0]);
    }

    public final add q0() {
        return (add) this.Z.getValue();
    }
}
