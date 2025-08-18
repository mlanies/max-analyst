package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* loaded from: classes.dex */
public final class l91 implements um1 {
    public final je7 X;
    public final je7 Y = tu0.r(3, new k11(13));
    public Activity Z;
    public final kr1 a;
    public final nb5 b;
    public final z01 c;
    public final os1 o;
    public final je7 s0;
    public final je7 t0;
    public Drawable u0;
    public boolean v0;
    public final je7 w0;
    public final je7 x0;
    public final ru3 y0;

    public l91(kr1 kr1Var, nb5 nb5Var, z01 z01Var, os1 os1Var, je7 je7Var, je7 je7Var2) {
        this.a = kr1Var;
        this.b = nb5Var;
        this.c = z01Var;
        this.o = os1Var;
        this.X = je7Var2;
        this.s0 = je7Var;
        je7 je7VarR = tu0.r(3, new k11(14));
        this.t0 = je7VarR;
        this.u0 = (ColorDrawable) je7VarR.getValue();
        final int i = 0;
        this.w0 = tu0.r(3, new k56(this) { // from class: f91
            public final /* synthetic */ l91 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new g91(this.b);
                    default:
                        return new h91(this.b);
                }
            }
        });
        final int i2 = 1;
        this.x0 = tu0.r(3, new k56(this) { // from class: f91
            public final /* synthetic */ l91 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new g91(this.b);
                    default:
                        return new h91(this.b);
                }
            }
        });
        this.y0 = new ru3(2, this);
    }

    public static znc c() {
        return y8a.a.o().f().C();
    }

    public static void e(l91 l91Var) {
        l91Var.v0 = false;
        ((cb5) l91Var.b).c(50L);
        l91Var.y0.f(false);
    }

    public final boolean b() {
        return ((wr1) this.a).p();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[PHI: r5
      0x0056: PHI (r5v3 android.app.RemoteAction) = (r5v1 android.app.RemoteAction), (r5v4 android.app.RemoteAction) binds: [B:20:0x0095, B:11:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.PictureInPictureParams d() {
        /*
            r9 = this;
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            kl7 r1 = defpackage.j1e.l()
            z01 r2 = r9.c
            r3 = r2
            a11 r3 = (defpackage.a11) r3
            boolean r3 = r3.d()
            java.lang.Class<ya1> r4 = defpackage.ya1.class
            r5 = 0
            java.lang.String r6 = "Required value was null."
            if (r3 == 0) goto L5a
            android.app.Activity r9 = r9.Z
            if (r9 == 0) goto L54
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.x7a.g0
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.b8a.i0
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            y8a r7 = defpackage.y8a.a
            v4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.c(r4)
            ya1 r4 = (defpackage.ya1) r4
            a11 r2 = (defpackage.a11) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L4a
            r5.<init>(r3, r8, r9, r2)
            goto L54
        L4a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L54:
            if (r5 == 0) goto L98
        L56:
            r1.add(r5)
            goto L98
        L5a:
            android.app.Activity r9 = r9.Z
            if (r9 == 0) goto L95
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.x7a.h0
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.b8a.h0
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            y8a r7 = defpackage.y8a.a
            v4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.c(r4)
            ya1 r4 = (defpackage.ya1) r4
            a11 r2 = (defpackage.a11) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L8b
            r5.<init>(r3, r8, r9, r2)
            goto L95
        L8b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L95:
            if (r5 == 0) goto L98
            goto L56
        L98:
            kl7 r9 = defpackage.j1e.d(r1)
            android.app.PictureInPictureParams$Builder r9 = r0.setActions(r9)
            java.lang.String r0 = "2:3"
            android.util.Rational r0 = android.util.Rational.parseRational(r0)
            android.app.PictureInPictureParams$Builder r9 = r9.setAspectRatio(r0)
            android.app.PictureInPictureParams r9 = r9.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l91.d():android.app.PictureInPictureParams");
    }

    public final void f(boolean z) {
        Activity activity = this.Z;
        if (activity == null) {
            return;
        }
        boolean zB = y8a.a.o().f().B(z);
        hm9.n("PipAppController", "try to hide call indicator hasCall=" + b());
        if (zB) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
            boolean z2 = false;
            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
            if (childAt != null && qp4.u0.b(childAt.getContext()).j()) {
                z2 = true;
            }
            dy7.j(activity, z2);
        }
    }

    public final void g(boolean z) {
        Activity activity = this.Z;
        if (activity == null) {
            return;
        }
        boolean zB = b();
        coc cocVar = (coc) x53.q0(c().e());
        uu3 uu3Var = cocVar != null ? cocVar.a : null;
        boolean z2 = !((uu3Var instanceof iq9) || uu3Var == null);
        hm9.n("PipAppController", "try to show call indicator hasCall=" + zB + " canShow=" + z2 + ".");
        if (z2 && zB && y8a.a.o().f().b(new CallIndicatorWidget(), z)) {
            dy7.j(activity, true);
        }
        if (zB) {
            return;
        }
        hm9.n("PipAppController", "can't show indicator due to call is absent, try to force close indicator.");
        f(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l91.h():void");
    }

    public final void i(boolean z) {
        Activity activity = this.Z;
        if (activity == null) {
            return;
        }
        if (!z) {
            activity.getWindow().setBackgroundDrawable(this.u0);
        } else {
            this.u0 = activity.getWindow().getDecorView().getBackground();
            activity.getWindow().setBackgroundDrawable((ColorDrawable) this.t0.getValue());
        }
    }

    public final void j() {
        Activity activity = this.Z;
        if (activity == null) {
            return;
        }
        coc cocVar = (coc) x53.q0(c().e());
        boolean z = (cocVar != null ? cocVar.a : null) instanceof iq9;
        coc cocVar2 = (coc) x53.q0(c().e());
        Object obj = cocVar2 != null ? cocVar2.a : null;
        zvc zvcVar = obj instanceof zvc ? (zvc) obj : null;
        boolean z2 = zvcVar != null && zvcVar.P();
        if (z) {
            dy7.j(activity, true);
            dy7.i(activity, true);
        } else if (!z && !b() && !z2) {
            dy7.j(activity, false);
            dy7.i(activity, false);
        } else if (b()) {
            dy7.j(activity, true);
            dy7.i(activity, false);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) throws Throwable {
        super.onDestroyed(conversationDestroyedInfo);
        this.y0.f(false);
        ConversationEndReason reason = conversationDestroyedInfo.getReason();
        if ((reason instanceof ConversationEndReason.Hangup) || (reason instanceof ConversationEndReason.EndedForAll)) {
            j47.f0(hz4.a, new k91(2, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        Activity activity = this.Z;
        if (activity == null) {
            return;
        }
        if (activity != null ? activity.isInPictureInPictureMode() : false) {
            activity.setPictureInPictureParams(d());
        }
    }
}
