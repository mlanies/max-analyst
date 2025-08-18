package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import java.util.List;
import one.me.chatscreen.ChatScreen;
import one.me.profile.ProfileScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class qq0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ugf videoLayoutUpdatesController;
        Object value;
        switch (this.a) {
            case 0:
                ((BottomAppBar$Behavior) this.b).getClass();
                throw null;
            case 1:
                view.removeOnLayoutChangeListener(this);
                dm1 dm1Var = (dm1) this.b;
                dm1Var.A(dm1Var.Q0);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ap1 ap1Var = (ap1) this.b;
                ap1Var.K(ap1Var.f1);
                return;
            case 3:
                ip1 ip1Var = (ip1) this.b;
                if (ip1Var.c == null || (videoLayoutUpdatesController = ip1Var.getVideoLayoutUpdatesController()) == null) {
                    return;
                }
                videoLayoutUpdatesController.a(ip1Var, ip1Var.v0);
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                bc7[] bc7VarArr = ChatScreen.k1;
                ChatScreen chatScreen = (ChatScreen) this.b;
                if (qqe.c(chatScreen.N0().getTitle())) {
                    ChatScreen.w0(chatScreen, chatScreen.N0(), true);
                    return;
                }
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                dw8 dw8Var = (dw8) this.b;
                ViewGroup viewGroup = (ViewGroup) dw8Var.b;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                int iQ = rh4.q(10, fk4.d().getDisplayMetrics().density, viewGroup.getMeasuredWidth()) - dw8Var.L();
                int i9 = iQ >= 0 ? iQ : 0;
                ViewGroup viewGroup2 = (ViewGroup) dw8Var.b;
                f46.D(i9, dw8Var.Q(), viewGroup2 != null ? viewGroup2 : null);
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                String str = ((m89) this.b).f;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, ey8.h(((m89) this.b).b.c, "Scroll: Highlighted from args message with id="), null);
                }
                m89 m89Var = (m89) this.b;
                g39 g39Var = m89Var.e;
                long j = m89Var.b.c;
                List list = ((m89) this.b).b.d;
                q0e q0eVar = g39Var.o;
                do {
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, new jk6(j, list)));
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                g9a g9aVar = (g9a) this.b;
                g9aVar.getEditText().getHitRect(g9aVar.A0);
                Rect rect = g9aVar.B0;
                rect.set(g9aVar.A0);
                rect.left = rect.right;
                rect.right = g9aVar.getRight();
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                ((eha) this.b).G0.start();
                return;
            case 9:
                cla.e((cla) this.b);
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                bc7[] bc7VarArr2 = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                if (qqe.c(profileScreen.p0().getTitle())) {
                    ProfileScreen.m0(profileScreen, profileScreen.p0(), true);
                    return;
                }
                return;
            case 11:
                view.removeOnLayoutChangeListener(this);
                ((k56) this.b).invoke();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((o0d) this.b).adjustDropDownSizeAndPosition();
                return;
            case 13:
                uwe uweVar = (uwe) this.b;
                uweVar.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                uweVar.V0 = iArr[0];
                view.getWindowVisibleDisplayFrame(uweVar.O0);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                view.removeOnLayoutChangeListener(this);
                ((lsf) this.b).f();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                bc7[] bc7VarArr3 = WebAppRootScreen.G0;
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.b;
                if (qqe.c(webAppRootScreen.y0().getTitle())) {
                    WebAppRootScreen.D0(webAppRootScreen.y0(), true);
                    return;
                }
                return;
        }
    }
}
