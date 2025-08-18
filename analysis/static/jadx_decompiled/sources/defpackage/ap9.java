package defpackage;

import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ap9 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ ap9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        e5f e5fVar = e5f.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
                wp9 wp9VarR0 = neuroAvatarsScreen.r0();
                wp9VarR0.c.a(null);
                wp9VarR0.b.i.setValue(null);
                return e5fVar;
            case 1:
                bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
                s5a s5aVarP0 = neuroAvatarsScreen.p0();
                w7c w7cVar = neuroAvatarsScreen.r0().u0;
                j4d j4dVar = ((k4d) w7cVar.a.getValue()).a;
                l2b l2bVar = ((k4d) w7cVar.a.getValue()).b;
                h4d h4dVar = j4dVar instanceof h4d ? (h4d) j4dVar : null;
                Long lValueOf = h4dVar != null ? Long.valueOf(h4dVar.c) : null;
                j2b j2bVar = l2bVar instanceof j2b ? (j2b) l2bVar : null;
                boolean zF = tpa.f(lValueOf, j2bVar != null ? Long.valueOf(j2bVar.b) : null);
                boolean z = true;
                boolean z2 = !zF;
                i4d i4dVar = j4dVar instanceof i4d ? (i4d) j4dVar : null;
                String str = i4dVar != null ? i4dVar.a : null;
                k2b k2bVar = l2bVar instanceof k2b ? (k2b) l2bVar : null;
                boolean z3 = !tpa.f(str, k2bVar != null ? k2bVar.a : null);
                if (j4dVar == null || (!z3 && !z2)) {
                    z = false;
                }
                s5aVarP0.setCloseBadgeVisibility(z);
                return e5fVar;
            case 2:
                bc7[] bc7VarArr3 = NeuroAvatarsScreen.M0;
                return neuroAvatarsScreen.o0() != null ? wuc.AUTH_AVATARS : wuc.SETTINGS_PROFILE_AVATARS;
            case 3:
                bc7 bc7Var = NeuroAvatarsScreen.M0[11];
                Long l = (Long) neuroAvatarsScreen.F0.a(neuroAvatarsScreen);
                afc afcVarO0 = neuroAvatarsScreen.o0();
                khe kheVar = new khe(new ap9(neuroAvatarsScreen, 5));
                lt7 lt7Var = lt7.a;
                lt7Var.getClass();
                return new wp9(l, afcVarO0, kheVar, new khe(new m57(19)), new khe(new m57(16)), lt7Var.getAccessor().d(kke.class), lt7Var.getAccessor().d(gh3.class));
            case 4:
                bc7[] bc7VarArr4 = NeuroAvatarsScreen.M0;
                return kt3.b(neuroAvatarsScreen.getContext(), woc.h0);
            default:
                bc7 bc7Var2 = NeuroAvatarsScreen.M0[10];
                return new vo9((e8b) neuroAvatarsScreen.E0.a(neuroAvatarsScreen));
        }
    }
}
