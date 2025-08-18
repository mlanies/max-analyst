package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final /* synthetic */ class shb extends v8 implements a66 {
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shb(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.s0 = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [znc] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws InterruptedException, IOException {
        e52 e52VarR;
        Object next;
        String str;
        switch (this.s0) {
            case 0:
                xhb xhbVar = (xhb) this.a;
                bc7[] bc7VarArr = ProfileInviteScreen.Y;
                xhbVar.E((List) obj);
                return e5f.a;
            case 1:
                gz3 gz3Var = (gz3) obj;
                jib jibVar = (jib) this.a;
                if (jibVar.y0.compareAndSet(false, true) && (e52VarR = jibVar.r()) != null) {
                    jibVar.q(e52VarR);
                    boolean zF = tpa.f(gz3Var, ez3.a);
                    s35 s35Var = jibVar.C0;
                    if (zF) {
                        pnf.o(s35Var, new mhb(new eqe(yea.f1), new eqe(yea.d1), Collections.singletonList(new mg3(wea.N, new eqe(yea.c1), 3, false))));
                    } else {
                        if (!tpa.f(gz3Var, fz3.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pnf.o(s35Var, new mhb(new eqe(yea.f1), new eqe(yea.e1), Collections.singletonList(new mg3(wea.N, new eqe(yea.c1), 3, false))));
                    }
                }
                return e5f.a;
            case 2:
                kjb kjbVar = (kjb) this.a;
                int i = ProfileMemberPermissionsScreen.o;
                kjbVar.E((List) obj);
                return e5f.a;
            case 3:
                lgd lgdVar = (lgd) this.a;
                bc7[] bc7VarArr2 = SettingMediaScreen.Y;
                lgdVar.E((List) obj);
                return e5f.a;
            case 4:
                chd chdVar = (chd) this.a;
                bc7[] bc7VarArr3 = SettingsPrivacyScreen.Z;
                chdVar.E((List) obj);
                return e5f.a;
            case 5:
                hid hidVar = (hid) this.a;
                bc7[] bc7VarArr4 = SettingsStorageScreen.X;
                hidVar.E((List) obj);
                return e5f.a;
            case 6:
                l17 l17Var = (l17) obj;
                bud budVar = (bud) this.a;
                budVar.getClass();
                if (l17Var != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = ((ptd) l17Var).H0.animate();
                    viewPropertyAnimatorAnimate.translationY(fk4.d().getDisplayMetrics().density * (-10.0f)).setDuration(200L).setInterpolator((AccelerateDecelerateInterpolator) budVar.b.getValue()).withEndAction(new flc(viewPropertyAnimatorAnimate, 20, budVar)).start();
                }
                return e5f.a;
            case 7:
                z2e z2eVar = (z2e) obj;
                StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) this.a;
                if (z2eVar == null) {
                    bc7[] bc7VarArr5 = StickerPreviewScreen.A0;
                    stickerPreviewScreen.getClass();
                } else {
                    gw7 gw7Var = stickerPreviewScreen.Z;
                    q7c q7cVar = stickerPreviewScreen.u0;
                    gic gicVar = stickerPreviewScreen.y0;
                    gic gicVar2 = stickerPreviewScreen.x0;
                    gic gicVar3 = stickerPreviewScreen.z0;
                    String str2 = z2eVar.Y;
                    if (str2 == null || str2.length() == 0) {
                        String str3 = z2eVar.X;
                        if (str3 == null || str3.length() == 0) {
                            i2e i2eVar = (i2e) gicVar2.getValue();
                            ay7.b((FrameLayout) q7cVar.T0(stickerPreviewScreen, StickerPreviewScreen.A0[5]), i2eVar, -1);
                            i2eVar.a(z2eVar);
                            i2eVar.setVisibility(0);
                            if (br7.H(gicVar3)) {
                                ((a4g) gicVar3.getValue()).setVisibility(8);
                            }
                            if (br7.H(gicVar)) {
                                ((iw7) gicVar.getValue()).setVisibility(8);
                            }
                        } else {
                            iw7 iw7Var = (iw7) gicVar.getValue();
                            ay7.b((FrameLayout) q7cVar.T0(stickerPreviewScreen, StickerPreviewScreen.A0[5]), iw7Var, -1);
                            iw7Var.a(z2eVar, tu0.G(160 * fk4.d().getDisplayMetrics().density));
                            iw7Var.setVisibility(0);
                            iw7Var.b(gw7Var);
                            if (br7.H(gicVar2)) {
                                ((i2e) gicVar2.getValue()).setVisibility(8);
                            }
                            if (br7.H(gicVar3)) {
                                ((a4g) gicVar3.getValue()).setVisibility(8);
                            }
                        }
                    } else {
                        a4g a4gVar = (a4g) gicVar3.getValue();
                        ay7.b((FrameLayout) q7cVar.T0(stickerPreviewScreen, StickerPreviewScreen.A0[5]), a4gVar, -1);
                        a4gVar.a(z2eVar, tu0.G(160 * fk4.d().getDisplayMetrics().density));
                        a4gVar.setVisibility(0);
                        a4gVar.b(gw7Var);
                        if (br7.H(gicVar2)) {
                            ((i2e) gicVar2.getValue()).setVisibility(8);
                        }
                        if (br7.H(gicVar)) {
                            ((iw7) gicVar.getValue()).setVisibility(8);
                        }
                    }
                    bc7[] bc7VarArr6 = StickerPreviewScreen.A0;
                    bc7 bc7Var = bc7VarArr6[6];
                    q7c q7cVar2 = stickerPreviewScreen.v0;
                    as6 as6Var = (as6) q7cVar2.T0(stickerPreviewScreen, bc7Var);
                    boolean z = z2eVar.v0;
                    as6Var.setIcon(z ? woc.K : woc.J);
                    ((as6) q7cVar2.T0(stickerPreviewScreen, bc7VarArr6[6])).setLabel(z ? cja.c : cja.a);
                }
                return e5f.a;
            case 8:
                cla claVar = (cla) this.a;
                bc7[] bc7VarArr7 = StickerPreviewScreen.A0;
                claVar.setTitle((CharSequence) obj);
                return e5f.a;
            case 9:
                StickerPreviewScreen stickerPreviewScreen2 = (StickerPreviewScreen) this.a;
                bc7[] bc7VarArr8 = StickerPreviewScreen.A0;
                stickerPreviewScreen2.getClass();
                if (((wm9) obj) instanceof g43) {
                    bc7 bc7Var2 = StickerPreviewScreen.A0[1];
                    String strH = ey8.h(((Number) stickerPreviewScreen2.a.a(stickerPreviewScreen2)).longValue(), "chats?id=");
                    Iterator it = stickerPreviewScreen2.getRouter().e().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            String str4 = ((coc) next).b;
                            if (str4 == null || !w9e.p0(str4, strH, false)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    coc cocVar = (coc) next;
                     = cocVar != null ? cocVar.b : 0;
                    coc cocVar2 = (coc) x53.j0(y53.L(stickerPreviewScreen2.getRouter().e()) - 1, stickerPreviewScreen2.getRouter().e());
                    if ( == 0 || length() == 0 || !(cocVar2 == null || (str = cocVar2.b) == null || !w9e.p0(str, strH, false))) {
                        stickerPreviewScreen2.getRouter().C();
                    } else {
                        stickerPreviewScreen2.getRouter().D();
                    }
                }
                return e5f.a;
            case 10:
                o35 o35Var = (o35) obj;
                StickerPreviewScreen stickerPreviewScreen3 = (StickerPreviewScreen) this.a;
                bc7[] bc7VarArr9 = StickerPreviewScreen.A0;
                stickerPreviewScreen3.getClass();
                if (o35Var instanceof qnd) {
                    wha whaVar = new wha(stickerPreviewScreen3);
                    qnd qndVar = (qnd) o35Var;
                    whaVar.e(new kia(qndVar.a));
                    whaVar.h(stickerPreviewScreen3.getContext().getString(qndVar.b));
                    whaVar.i();
                }
                return e5f.a;
            case 11:
                w3e w3eVar = (w3e) obj;
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) this.a;
                bc7[] bc7VarArr10 = StickerSetBottomSheet.A0;
                if (w3eVar == null) {
                    stickerSetBottomSheet.getClass();
                } else {
                    stickerSetBottomSheet.getClass();
                    bc7[] bc7VarArr11 = StickerSetBottomSheet.A0;
                    bc7 bc7Var3 = bc7VarArr11[3];
                    ((View) stickerSetBottomSheet.z0.getValue()).setVisibility(8);
                    List list = w3eVar.X;
                    int size = list.size();
                    String str5 = String.format(stickerSetBottomSheet.getContext().getResources().getQuantityString(uga.a, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    int i2 = w3eVar.Y;
                    int i3 = i2 == 2 ? vga.b : vga.a;
                    b7a b7aVar = i2 == 2 ? b7a.b : b7a.a;
                    v5e v5eVar = (v5e) stickerSetBottomSheet.v0.T0(stickerSetBottomSheet, bc7VarArr11[1]);
                    ?? B = w3eVar.b.b(stickerSetBottomSheet.getContext());
                    v5eVar.a.setText(B != 0 ? B : "");
                    v5eVar.b.setText(str5);
                    OneMeButton oneMeButton = v5eVar.c;
                    oneMeButton.setText(i3);
                    oneMeButton.setMode(b7aVar);
                    oneMeButton.setVisibility(0);
                    stickerSetBottomSheet.x0.E(list);
                }
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                szc szcVar = (szc) obj;
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.a;
                bc7[] bc7VarArr12 = StickersSearchScreen.u0;
                stickersSearchScreen.getClass();
                int iS = au1.s(szcVar.a);
                a3g a3gVar = stickersSearchScreen.t0;
                qm0 qm0Var = stickersSearchScreen.Z;
                qm0 qm0Var2 = stickersSearchScreen.s0;
                if (iS == 0) {
                    View view = stickersSearchScreen.getView();
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        ay7.b(viewGroup, (View) qm0Var.getValue(), -1);
                    }
                    ((View) qm0Var.getValue()).setVisibility(0);
                    j47.P(qm0Var2);
                    stickersSearchScreen.m0().setVisibility(8);
                    a3gVar.E(nz4.a);
                    stickersSearchScreen.m0().setRefreshingNext(false);
                } else if (iS == 1) {
                    a3gVar.E(szcVar.b);
                    j47.P(qm0Var);
                    j47.P(qm0Var2);
                    stickersSearchScreen.m0().setVisibility(0);
                    stickersSearchScreen.m0().setRefreshingNext(stickersSearchScreen.n0().r());
                } else {
                    if (iS != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    View view2 = stickersSearchScreen.getView();
                    ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                    if (viewGroup2 != null) {
                        View view3 = (View) qm0Var2.getValue();
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.topMargin = ((eha) stickersSearchScreen.Y.T0(stickersSearchScreen, StickersSearchScreen.u0[2])).getMeasuredHeight();
                        ay7.a(viewGroup2, view3, layoutParams);
                    }
                    ((View) qm0Var2.getValue()).setVisibility(0);
                    j47.P(qm0Var);
                    stickersSearchScreen.m0().setVisibility(8);
                }
                return e5f.a;
            case 13:
                StickersSearchScreen stickersSearchScreen2 = (StickersSearchScreen) this.a;
                bc7[] bc7VarArr13 = StickersSearchScreen.u0;
                stickersSearchScreen2.getClass();
                if (((wm9) obj) instanceof g43) {
                    mr0.G(stickersSearchScreen2);
                    stickersSearchScreen2.getRouter().C();
                }
                return e5f.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                String str6 = (String) obj;
                q5e q5eVar = (q5e) this.a;
                String name = q5e.class.getName();
                ir6 ir6Var = hm9.m;
                if (ir6Var != null) {
                    q5eVar.getClass();
                    if (ir6Var.c()) {
                        ir6Var.d(us7.X, name, wg0.i("Stickers search. start, q:", str6), null);
                    }
                }
                q5eVar.x0.o1(q5eVar, q5e.z0[0], j47.S(q5eVar.a, ((w9a) q5eVar.c).b(), vx3.b, new p5e(str6, q5eVar, null)));
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                String str7 = (String) obj;
                g6e g6eVar = (g6e) this.a;
                String name2 = g6e.class.getName();
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null) {
                    g6eVar.getClass();
                    if (ir6Var2.c()) {
                        ir6Var2.d(us7.X, name2, wg0.i("Stickers sets search. start, q:", str7), null);
                    }
                }
                g6eVar.i.o1(g6eVar, g6e.j[0], j47.T(g6eVar.c, null, vx3.b, new f6e(str7, g6eVar, null), 1));
                return e5f.a;
            case 16:
                s6e s6eVar = (s6e) obj;
                w6e w6eVar = (w6e) this.a;
                w6eVar.getClass();
                if (s6eVar.a != null && s6eVar.b != null && s6eVar.c != null) {
                    kl7 kl7VarL = j1e.l();
                    List list2 = s6eVar.a;
                    iqe iqeVar = (list2 == null || list2.isEmpty()) ? null : new iqe(w6eVar.q(list2));
                    eqe eqeVar = new eqe(hja.p);
                    Integer numValueOf = Integer.valueOf(fja.c);
                    cfd cfdVar = cfd.a;
                    vfd vfdVar = new vfd(9223372036854775806L, 0, eqeVar, null, iqeVar, numValueOf, cfdVar, null, null, 0, null, 1928);
                    l6e.c.getClass();
                    kl7VarL.add(new x0d(vfdVar, new c64(":stickers/recent"), gja.m, 9223372036854775806L, 1));
                    List list3 = s6eVar.b;
                    kl7VarL.add(new x0d(new vfd(9223372036854775805L, 0, new eqe(hja.d), null, (list3 == null || list3.isEmpty()) ? null : new iqe(w6eVar.q(list3)), Integer.valueOf(woc.J), cfdVar, null, null, 0, null, 1928), new c64(":stickers/favorite"), gja.h, 9223372036854775805L, 3));
                    List list4 = s6eVar.c;
                    if (list4 != null && !list4.isEmpty()) {
                        kl7VarL.add(new t0d(gja.s, new eqe(hja.r)));
                        List<m3e> list5 = s6eVar.c;
                        if (list5 != null && !list5.isEmpty()) {
                            for (m3e m3eVar : list5) {
                                long j = m3eVar.a;
                                String str8 = m3eVar.b;
                                kl7VarL.add(new w0d(j, m3eVar.c, str8 == null ? "" : str8, w6eVar.q(m3eVar.h), m3eVar.g, list5.size() > 1));
                            }
                        }
                    }
                    kl7 kl7VarD = j1e.d(kl7VarL);
                    w6eVar.X.setValue(kl7VarD);
                    String name3 = w6e.class.getName();
                    ir6 ir6Var3 = hm9.m;
                    if (ir6Var3 != null && ir6Var3.c()) {
                        ir6Var3.d(us7.X, name3, zr6.h(kl7VarD.getSize(), "process sections. finish, size:"), null);
                    }
                }
                return e5f.a;
            case LangUtils.HASH_SEED /* 17 */:
                xnd xndVar = (xnd) obj;
                StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) this.a;
                bc7[] bc7VarArr14 = StickersShowcaseScreen.v0;
                stickersShowcaseScreen.getClass();
                int iOrdinal = xndVar.a.ordinal();
                p71 p71Var = stickersShowcaseScreen.u0;
                qm0 qm0Var3 = stickersShowcaseScreen.Z;
                qm0 qm0Var4 = stickersShowcaseScreen.s0;
                if (iOrdinal == 0) {
                    View view4 = stickersShowcaseScreen.getView();
                    ViewGroup viewGroup3 = view4 instanceof ViewGroup ? (ViewGroup) view4 : null;
                    if (viewGroup3 != null) {
                        ay7.b(viewGroup3, (View) qm0Var3.getValue(), -1);
                    }
                    ((View) qm0Var3.getValue()).setVisibility(0);
                    j47.P(qm0Var4);
                    stickersShowcaseScreen.m0().setVisibility(8);
                    p71Var.E(nz4.a);
                    stickersShowcaseScreen.m0().setRefreshingNext(false);
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    p71Var.E(xndVar.b);
                    j47.P(qm0Var3);
                    j47.P(qm0Var4);
                    stickersShowcaseScreen.m0().setVisibility(0);
                    stickersShowcaseScreen.m0().setRefreshingNext(stickersShowcaseScreen.n0().r());
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    View view5 = stickersShowcaseScreen.getView();
                    ViewGroup viewGroup4 = view5 instanceof ViewGroup ? (ViewGroup) view5 : null;
                    if (viewGroup4 != null) {
                        View view6 = (View) qm0Var4.getValue();
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams2.topMargin = ((cla) stickersShowcaseScreen.X.T0(stickersShowcaseScreen, StickersShowcaseScreen.v0[1])).getMeasuredHeight();
                        ay7.a(viewGroup4, view6, layoutParams2);
                    }
                    qm0Var4.getValue();
                    ((View) qm0Var4.getValue()).setVisibility(0);
                    j47.P(qm0Var3);
                    stickersShowcaseScreen.m0().setVisibility(8);
                }
                return e5f.a;
            case 18:
                vnd vndVar = (vnd) obj;
                StickersShowcaseScreen stickersShowcaseScreen2 = (StickersShowcaseScreen) this.a;
                bc7[] bc7VarArr15 = StickersShowcaseScreen.v0;
                stickersShowcaseScreen2.getClass();
                if (vndVar instanceof vnd) {
                    vha vhaVar = stickersShowcaseScreen2.t0;
                    if (vhaVar != null) {
                        vhaVar.a();
                    }
                    wha whaVar2 = new wha(stickersShowcaseScreen2);
                    whaVar2.e(new kia(vndVar.a));
                    whaVar2.h(stickersShowcaseScreen2.getContext().getString(vndVar.b));
                    stickersShowcaseScreen2.t0 = whaVar2.i();
                }
                return e5f.a;
            case 19:
                StickersShowcaseScreen stickersShowcaseScreen3 = (StickersShowcaseScreen) this.a;
                bc7[] bc7VarArr16 = StickersShowcaseScreen.v0;
                stickersShowcaseScreen3.getClass();
                if (((wm9) obj) instanceof g43) {
                    stickersShowcaseScreen3.getRouter().C();
                }
                return e5f.a;
            case 20:
                a8e a8eVar = (a8e) this.a;
                a8eVar.getClass();
                kl7 kl7VarL2 = j1e.l();
                for (d2e d2eVar : (List) obj) {
                    String str9 = d2eVar.s0;
                    if (str9 == null) {
                        str9 = "";
                    }
                    if (str9.length() == 0) {
                        str9 = d2eVar.o;
                    }
                    String str10 = str9;
                    String str11 = ((se5) ((qe5) a8eVar.t0.getValue())).w() ? d2eVar.z0 : null;
                    long j2 = d2eVar.a;
                    long j3 = d2eVar.v0;
                    kl7VarL2.add(new z2e(j2, j3, j3, str10, d2eVar.w0, str11, d2eVar.b, d2eVar.c, false, false, 0L, 7744));
                }
                a8eVar.x0.setValue(j1e.d(kl7VarL2));
                return e5f.a;
            case 21:
                v6f v6fVar = (v6f) obj;
                cge cgeVar = (cge) this.a;
                cgeVar.getClass();
                ap8 ap8Var = new ap8(new mqc(new tfe(cgeVar, v6fVar, null)), v6fVar, 14);
                int i4 = ft4.o;
                return new zn5(new ac(new ac(nu0.Q(ap8Var, z7.R(500, kt4.MILLISECONDS)), 18, new vp5(cgeVar, v6fVar, , 10)), 19, new ufe(cgeVar, null)), new vfe(cgeVar, null), 5);
            case 22:
                cge cgeVar2 = (cge) this.a;
                cgeVar2.getClass();
                return new m32(new rfe(cgeVar2, (d7f) obj, null), hz4.a, -2, 1, 0);
            case 23:
                uj3 uj3Var = (uj3) obj;
                j5f j5fVar = (j5f) this.a;
                j5fVar.getClass();
                boolean z2 = uj3Var.Y;
                q0e q0eVar = j5fVar.h;
                if (z2 || uj3Var.c() || uj3Var.s()) {
                    q0eVar.setValue(null);
                } else {
                    q0eVar.m(null, new g5f(uj3Var.n()));
                }
                return e5f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((UploadFileAttachWorker) this.a).g((ly8) obj);
                return e5f.a;
            default:
                jff jffVar = (jff) obj;
                gdf gdfVar = (gdf) this.a;
                gdfVar.getClass();
                if (!(jffVar instanceof jff)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecyclerView recyclerView = gdfVar.f;
                if (tpa.f(jffVar.a, "video_fetching_autoplay") && recyclerView != null) {
                    String str12 = gdfVar.e;
                    ir6 ir6Var4 = hm9.m;
                    if (ir6Var4 != null && ir6Var4.c()) {
                        ir6Var4.d(us7.X, str12, "Player autoplay. Handle fetch event, try start autoplay.", null);
                    }
                    if (recyclerView.getScrollState() == 0) {
                        gdfVar.e(recyclerView, false);
                    }
                }
                return e5f.a;
        }
    }
}
