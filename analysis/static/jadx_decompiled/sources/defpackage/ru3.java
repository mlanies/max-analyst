package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes.dex */
public final class ru3 extends a3a {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru3(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.a3a
    public void a() {
        switch (this.d) {
            case 5:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (zIsLoggable) {
                    Objects.toString(cVar);
                }
                he0 he0Var = cVar.h;
                if (he0Var != null) {
                    he0Var.r = false;
                    dd4 dd4Var = new dd4(27, cVar);
                    if (he0Var.p == null) {
                        he0Var.p = new ArrayList();
                    }
                    he0Var.p.add(dd4Var);
                    cVar.h.d(false);
                    cVar.A(true);
                    cVar.F();
                }
                cVar.h = null;
                break;
        }
    }

    @Override // defpackage.a3a
    public final void b() {
        q0e q0eVar;
        Object value;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                uu3 uu3Var = (uu3) obj;
                if (uu3Var.router.i().m()) {
                    return;
                }
                f(false);
                uu3Var.getOnBackPressedDispatcher().d();
                if (uu3Var.isBeingDestroyed) {
                    return;
                }
                f(true);
                return;
            case 1:
                crd crdVar = CallIncomingScreen.Z;
                e91 e91VarM0 = ((CallIncomingScreen) obj).m0();
                do {
                    q0eVar = e91VarM0.t0;
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, new b91(false)));
                return;
            case 2:
                ((l91) obj).h();
                return;
            case 3:
                yxc yxcVar = CallScreen.R0;
                ((CallScreen) obj).s0(false);
                return;
            case 4:
                bc7[] bc7VarArr = ChatMembersScreen.u0;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (chatMembersScreen.o0().r()) {
                    chatMembersScreen.o0().q();
                    return;
                } else {
                    chatMembersScreen.getRouter().C();
                    return;
                }
            case 5:
                c cVar = (c) obj;
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(cVar);
                }
                cVar.A(true);
                he0 he0Var = cVar.h;
                ru3 ru3Var = cVar.i;
                if (he0Var == null) {
                    if (ru3Var.a) {
                        cVar.T();
                        return;
                    } else {
                        cVar.g.d();
                        return;
                    }
                }
                ArrayList arrayList = cVar.n;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(c.G(cVar.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        au1.r(it.next());
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = cVar.h.a.iterator();
                while (it3.hasNext()) {
                    a aVar = ((v16) it3.next()).b;
                    if (aVar != null) {
                        aVar.y0 = false;
                    }
                }
                Iterator it4 = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                while (it4.hasNext()) {
                    yd4 yd4Var = (yd4) it4.next();
                    ArrayList arrayList2 = yd4Var.c;
                    yd4Var.j(arrayList2);
                    yd4Var.c(arrayList2);
                }
                Iterator it5 = cVar.h.a.iterator();
                while (it5.hasNext()) {
                    a aVar2 = ((v16) it5.next()).b;
                    if (aVar2 != null && aVar2.T0 == null) {
                        cVar.g(aVar2).k();
                    }
                }
                cVar.h = null;
                cVar.l0();
                if (Log.isLoggable("FragmentManager", 3)) {
                    boolean z = ru3Var.a;
                    cVar.toString();
                    return;
                }
                return;
            case 6:
                bc7[] bc7VarArr2 = InputNameScreen.B0;
                ((InputNameScreen) obj).r0();
                return;
            case 7:
                ((m56) obj).invoke(this);
                return;
            case 8:
                bc7[] bc7VarArr3 = ProfileEditAdminPermissionsWidget.x0;
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) obj;
                int iOrdinal = profileEditAdminPermissionsWidget.n0().ordinal();
                if (iOrdinal == 0) {
                    profileEditAdminPermissionsWidget.getRouter().C();
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    profileEditAdminPermissionsWidget.o0().x();
                    return;
                }
            case 9:
                ((hzc) obj).q();
                return;
            default:
                bc7[] bc7VarArr4 = StartConversationScreen.I0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                startConversationScreen.getClass();
                eha searchView = ((cla) startConversationScreen.v0.T0(startConversationScreen, StartConversationScreen.I0[4])).getSearchView();
                if (searchView != null) {
                    searchView.b();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a3a
    public void c(ge0 ge0Var) {
        switch (this.d) {
            case 5:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
                c cVar = (c) this.e;
                if (zIsLoggable) {
                    Objects.toString(cVar);
                }
                if (cVar.h != null) {
                    Iterator it = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList = ((yd4) it.next()).c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            d63.V(((ovd) it2.next()).k, arrayList2);
                        }
                        List listD0 = x53.D0(x53.H0(arrayList2));
                        int size = listD0.size();
                        for (int i = 0; i < size; i++) {
                            ((nvd) listD0.get(i)).c(ge0Var);
                        }
                    }
                    Iterator it3 = cVar.n.iterator();
                    if (it3.hasNext()) {
                        au1.r(it3.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.a3a
    public void d() {
        switch (this.d) {
            case 5:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (zIsLoggable) {
                    Objects.toString(cVar);
                }
                cVar.x();
                cVar.y(new m16(cVar), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru3(Widget widget, int i) {
        super(true);
        this.d = i;
        this.e = widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru3(StartConversationScreen startConversationScreen, boolean z) {
        super(z);
        this.d = 10;
        this.e = startConversationScreen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru3(boolean z, m56 m56Var) {
        super(z);
        this.d = 7;
        this.e = m56Var;
    }
}
