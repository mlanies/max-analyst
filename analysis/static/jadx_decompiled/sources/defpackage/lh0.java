package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* loaded from: classes.dex */
public final class lh0 extends mof {
    public final /* synthetic */ int a;
    public final Object b;

    public lh0() {
        this.a = 5;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.mof
    public void a(int i) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((mof) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 6:
            default:
                return;
            case 7:
                ((pz7) this.b).f(false);
                return;
        }
    }

    @Override // defpackage.mof
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((mof) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // defpackage.mof
    public final void c(int i) {
        int i2;
        final View[] viewArr;
        final View[] viewArr2;
        int i3 = 4;
        final int i4 = 0;
        final int i5 = 1;
        switch (this.a) {
            case 0:
                mh0 mh0Var = (mh0) this.b;
                yq3 yq3Var = (yq3) mh0Var.G0.o.f.get(i);
                int iC0 = f46.c0(yq3Var.a);
                switch (au1.s(yq3Var.a)) {
                    case 0:
                        i2 = 3;
                        break;
                    case 1:
                    case 4:
                    case 6:
                        i2 = 1;
                        break;
                    case 2:
                    case 3:
                    case 5:
                        i2 = 2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i6 = mh0Var.G0.j() == 1 ? 2 : 1;
                kh0 kh0Var = mh0Var.F0;
                Integer numD = ((an9) kh0Var.c.getValue()).d();
                if (numD != null) {
                    int iIntValue = numD.intValue();
                    long jF = ((t33) ((q33) kh0Var.a.getValue())).F();
                    int iS = au1.s(i6) + ey8.g(i2, ((au1.s(iC0) * 961) + iIntValue) * 31, 31);
                    int iS2 = au1.s(iC0);
                    if (iS2 == 0) {
                        zh9 zh9Var = kh0Var.e;
                        int iB = zh9Var.b(iS);
                        if ((iB >= 0 ? zh9Var.c[iB] : -1L) == jF) {
                            return;
                        } else {
                            zh9Var.d(iS, jF);
                        }
                    } else if (iS2 == 1) {
                        zh9 zh9Var2 = kh0Var.d;
                        int iB2 = zh9Var2.b(iS);
                        if ((iB2 >= 0 ? zh9Var2.c[iB2] : -1L) == jF) {
                            return;
                        } else {
                            zh9Var2.d(iS, jF);
                        }
                    } else {
                        if (iS2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zh9 zh9Var3 = kh0Var.f;
                        int iB3 = zh9Var3.b(iS);
                        if ((iB3 >= 0 ? zh9Var3.c[iB3] : -1L) == jF) {
                            return;
                        } else {
                            zh9Var3.d(iS, jF);
                        }
                    }
                    kh0Var.b(iC0, iIntValue, i2, i6, jF, "showed");
                    return;
                }
                return;
            case 1:
                h71.w((h71) this.b, i);
                return;
            case 2:
                ChatMediaTabWidget chatMediaTabWidget = (ChatMediaTabWidget) this.b;
                an9.g((an9) chatMediaTabWidget.c.getValue(), ChatMediaTabWidget.m0(chatMediaTabWidget));
                return;
            case 3:
                bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
                ck2 ck2VarD0 = ((ChatMediaViewerScreen) this.b).D0();
                ck2VarD0.a1.o1(ck2VarD0, ck2.d1[1], j47.S(ck2VarD0.a, ((w9a) ck2VarD0.t0).a(), vx3.b, new kj2(ck2VarD0, i, null)));
                return;
            case 4:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                bc7[] bc7VarArr2 = ChatsTabWidget.C0;
                if (((Number) chatsTabWidget.p0().v0.a.getValue()).intValue() != i) {
                    String str = ((ChatsTabWidget) this.b).b;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, str, zr6.h(i, "ONEME-6453|chats_list_lf | tabs page selected, pos:"), null);
                    }
                    spa spaVarR0 = ((ChatsTabWidget) this.b).r0();
                    ((an9) ((ChatsTabWidget) this.b).w0.getValue()).f(wuc.CHATS_LIST_TAB, new spa(spaVarR0.a, 3, spaVarR0.c, spaVarR0.d, spaVarR0.e));
                    ((ChatsTabWidget) this.b).q0(i);
                }
                ((ChatsTabWidget) this.b).p0().u0.m(null, Integer.valueOf(i));
                return;
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((mof) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 6:
                p04 p04Var = (p04) this.b;
                znc zncVar = (znc) p04Var.s0.get(i);
                int i7 = p04Var.t0;
                if (i != i7) {
                    znc zncVar2 = (znc) p04Var.s0.get(i7);
                    if (zncVar2 != null) {
                        Iterator it2 = zncVar2.e().iterator();
                        while (it2.hasNext()) {
                            ((coc) it2.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (zncVar != null) {
                        Iterator it3 = zncVar.e().iterator();
                        while (it3.hasNext()) {
                            ((coc) it3.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    p04Var.t0 = i;
                    return;
                }
                return;
            case 7:
                ((pz7) this.b).f(false);
                return;
            case 8:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                bd7 bd7Var = (bd7) x53.j0(i, (List) mediaKeyboardWidget.w0.a);
                if (bd7Var != null) {
                    cc8 cc8Var = (cc8) mediaKeyboardWidget.c.getValue();
                    cc8Var.getClass();
                    pnf.o(cc8Var.X, new xb8(bd7Var));
                    bd7 bd7Var2 = bd7.Z;
                    q7c q7cVar = mediaKeyboardWidget.u0;
                    q7c q7cVar2 = mediaKeyboardWidget.s0;
                    q7c q7cVar3 = mediaKeyboardWidget.t0;
                    if (bd7Var == bd7Var2) {
                        bc7[] bc7VarArr3 = MediaKeyboardWidget.C0;
                        viewArr = new View[]{(View) q7cVar3.T0(mediaKeyboardWidget, bc7VarArr3[6])};
                        viewArr2 = new View[]{(View) q7cVar2.T0(mediaKeyboardWidget, bc7VarArr3[5]), (View) q7cVar.T0(mediaKeyboardWidget, bc7VarArr3[7])};
                    } else {
                        bc7[] bc7VarArr4 = MediaKeyboardWidget.C0;
                        viewArr = new View[]{(View) q7cVar2.T0(mediaKeyboardWidget, bc7VarArr4[5]), (View) q7cVar.T0(mediaKeyboardWidget, bc7VarArr4[7])};
                        viewArr2 = new View[]{(View) q7cVar3.T0(mediaKeyboardWidget, bc7VarArr4[6])};
                    }
                    AnimatorSet animatorSet = mediaKeyboardWidget.B0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new yl(valueAnimatorOfFloat, i3, viewArr));
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new yl(valueAnimatorOfFloat2, i3, viewArr2));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                    animatorSet2.addListener(new fh(animatorSet2, new k56() { // from class: jc8
                        @Override // defpackage.k56
                        public final Object invoke() {
                            e5f e5fVar = e5f.a;
                            View[] viewArr3 = viewArr;
                            switch (i4) {
                                case 0:
                                    bc7[] bc7VarArr5 = MediaKeyboardWidget.C0;
                                    for (View view : viewArr3) {
                                        view.setVisibility(0);
                                    }
                                    break;
                                default:
                                    bc7[] bc7VarArr6 = MediaKeyboardWidget.C0;
                                    for (View view2 : viewArr3) {
                                        view2.setVisibility(8);
                                    }
                                    break;
                            }
                            return e5fVar;
                        }
                    }, 1));
                    animatorSet2.addListener(new fh(animatorSet2, new k56() { // from class: jc8
                        @Override // defpackage.k56
                        public final Object invoke() {
                            e5f e5fVar = e5f.a;
                            View[] viewArr3 = viewArr2;
                            switch (i5) {
                                case 0:
                                    bc7[] bc7VarArr5 = MediaKeyboardWidget.C0;
                                    for (View view : viewArr3) {
                                        view.setVisibility(0);
                                    }
                                    break;
                                default:
                                    bc7[] bc7VarArr6 = MediaKeyboardWidget.C0;
                                    for (View view2 : viewArr3) {
                                        view2.setVisibility(8);
                                    }
                                    break;
                            }
                            return e5fVar;
                        }
                    }, 0));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    mediaKeyboardWidget.B0 = animatorSet2;
                }
                mediaKeyboardWidget.o0().post(new nn6(11, mediaKeyboardWidget));
                return;
            case 9:
                bc7[] bc7VarArr5 = ProfileAvatarsScreen.z0;
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) this.b;
                ProfileAvatarsScreen.w0(profileAvatarsScreen, profileAvatarsScreen.B0().b.getTitle(), i);
                return;
            default:
                p04 p04Var2 = (p04) this.b;
                znc zncVar3 = (znc) p04Var2.s0.get(i);
                int i8 = p04Var2.t0;
                if (i != i8) {
                    znc zncVar4 = (znc) p04Var2.s0.get(i8);
                    if (zncVar4 != null) {
                        Iterator it4 = zncVar4.e().iterator();
                        while (it4.hasNext()) {
                            ((coc) it4.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (zncVar3 != null) {
                        Iterator it5 = zncVar3.e().iterator();
                        while (it5.hasNext()) {
                            ((coc) it5.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    p04Var2.t0 = i;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ lh0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
