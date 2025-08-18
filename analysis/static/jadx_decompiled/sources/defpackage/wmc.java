package defpackage;

import android.location.Location;
import android.util.Range;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.google.android.gms.location.LocationResult;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.stickerssearch.StickersSearchScreen;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;

/* loaded from: classes.dex */
public final class wmc implements nr8, mde, qj3, h6d, rpa, a76, w2e, u4, uq8, im7 {
    public static wmc b;
    public static final xmc c = new xmc(0, false, false, 0, 0);
    public Object a;

    public /* synthetic */ wmc(Object obj, boolean z) {
        this.a = obj;
    }

    public static synchronized wmc h() {
        try {
            if (b == null) {
                b = new wmc();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @Override // defpackage.uq8
    public void Q(wq8 wq8Var) {
        Toolbar toolbar = (Toolbar) this.a;
        e7 e7Var = toolbar.a.s0;
        if (e7Var == null || !e7Var.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.U0.b).iterator();
            while (it.hasNext()) {
                ((e16) it.next()).a.t(wq8Var);
            }
        }
        uq8 uq8Var = toolbar.c1;
        if (uq8Var != null) {
            uq8Var.Q(wq8Var);
        }
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        adc adcVar = (adc) this.a;
        adcVar.i(adcVar.T, adcVar.S);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        v6f v6fVar = (v6f) obj;
        b32 b32Var = (b32) this.a;
        b32Var.getClass();
        if (v6fVar.a()) {
            String str = v6fVar.h.a;
            long j = b32Var.o;
            String str2 = b32Var.Z;
            if (j != 0) {
                hm9.n(str2, "updateChatAvatar");
                e52 e52VarC = b32Var.b().C(j);
                if (e52VarC != null) {
                    ((k4a) b32Var.a()).m(b32Var.o, e52VarC.b.a, null, str, b32Var.X);
                } else {
                    hm9.p(str2, "updateChatAvatar: chat not found, chatId=" + j, null);
                }
            } else {
                hm9.n(str2, "updateProfileAvatar");
                ((k4a) b32Var.a()).H(2, 0L, b32Var.X, null, null, str, null, null);
            }
            b32Var.s().d(b32Var.b);
        }
    }

    @Override // defpackage.u4
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        if (!swipeDismissBehavior.x(view)) {
            return false;
        }
        WeakHashMap weakHashMap = zmf.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // defpackage.nr8
    public void c(wq8 wq8Var, boolean z) {
        cn cnVar;
        wq8 wq8VarK = wq8Var.k();
        int i = 0;
        boolean z2 = wq8VarK != wq8Var;
        if (z2) {
            wq8Var = wq8VarK;
        }
        dn dnVar = (dn) this.a;
        cn[] cnVarArr = dnVar.W0;
        int length = cnVarArr != null ? cnVarArr.length : 0;
        while (true) {
            if (i < length) {
                cnVar = cnVarArr[i];
                if (cnVar != null && cnVar.h == wq8Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                cnVar = null;
                break;
            }
        }
        if (cnVar != null) {
            if (!z2) {
                dnVar.p(cnVar, z);
            } else {
                dnVar.n(cnVar.a, cnVar, wq8VarK);
                dnVar.p(cnVar, true);
            }
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        adc adcVar = (adc) this.a;
        c54.p("In-progress recording shouldn't be null", adcVar.q != null);
        if (adcVar.q.w0) {
            return;
        }
        Objects.toString(th);
        adcVar.i(th, adcVar.C == null ? 8 : 6);
    }

    @Override // defpackage.im7
    public void f(Object obj) {
        le6 le6Var = (le6) obj;
        le6Var.getClass();
        List list = ((LocationResult) this.a).a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        le6Var.a.c.p1(new er7(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }

    @Override // defpackage.w2e
    public void g(z2e z2eVar) {
        f5e f5eVar = f5e.c;
        bc7[] bc7VarArr = StickersSearchScreen.u0;
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.a;
        stickersSearchScreen.getClass();
        bc7 bc7Var = StickersSearchScreen.u0[0];
        long jLongValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
        f5eVar.P1().b(":stickers/preview?sticker_id=" + z2eVar.a + "&chat_id=" + jLongValue, null);
    }

    @Override // defpackage.mde
    public Object get() {
        o90 o90Var = (o90) this.a;
        int i = o90Var.c;
        if (i == -1) {
            i = 5;
        }
        int i2 = o90Var.b;
        if (i2 == -1) {
            i2 = 2;
        }
        int i3 = o90Var.e;
        if (i3 == -1) {
            i3 = 1;
        }
        Range range = o90.g;
        Range range2 = o90Var.d;
        int iF = range.equals(range2) ? 44100 : wmd.F(range2, i3, i2, ((Integer) range2.getUpper()).intValue());
        List list = n90.e;
        a8g a8gVar = new a8g();
        a8gVar.a = -1;
        a8gVar.b = -1;
        a8gVar.c = -1;
        a8gVar.o = -1;
        a8gVar.a = Integer.valueOf(i);
        a8gVar.o = Integer.valueOf(i2);
        a8gVar.c = Integer.valueOf(i3);
        a8gVar.b = Integer.valueOf(iF);
        return a8gVar.c();
    }

    @Override // defpackage.rpa
    public Object i() {
        return this.a;
    }

    @Override // defpackage.h6d
    public void j(j6d j6dVar) {
        fm6 fm6Var = (fm6) this.a;
        fm6Var.D0.j(fm6Var);
    }

    @Override // defpackage.w2e
    public void k(z2e z2eVar) {
        bc7[] bc7VarArr = StickersSearchScreen.u0;
        q5e q5eVarN0 = ((StickersSearchScreen) this.a).n0();
        long j = q5eVarN0.b;
        if (j > 0) {
            ((s8g) q5eVarN0.X.getValue()).a(new v8d(new u8d(j, z2eVar.a, 1)));
            pnf.o(q5eVarN0.t0, g43.b);
        }
        xx6 xx6Var = (xx6) e5e.a.getAccessor().e();
        if (xx6Var != null) {
            xx6Var.f(bcd.a0(new wx6(ux6.b, 1), new wx6(ux6.Y, 1)), wuc.CHAT);
        }
    }

    @Override // defpackage.rpa
    public boolean l() {
        return true;
    }

    public void m(long j) {
        boolean zEquals;
        gg1 gg1Var;
        ConversationParticipant me2;
        ParticipantId externalId;
        bc7[] bc7VarArr = CallMoreBottomSheet.x0;
        CallMoreBottomSheet callMoreBottomSheet = (CallMoreBottomSheet) this.a;
        ie1 ie1Var = (ie1) callMoreBottomSheet.t0.getValue();
        ie1Var.getClass();
        long j2 = y7a.x;
        el1 el1Var = ie1Var.c;
        if (j == j2) {
            pnf.o(el1Var.M0, new rj1(true));
        } else if (j == y7a.z) {
            pnf.o(el1Var.M0, new rj1(false));
        } else if (j == y7a.s) {
            pnf.o(el1Var.M0, nj1.D);
        } else if (j == y7a.u) {
            vvc vvcVar = (vvc) ((lvc) ie1Var.Z.getValue());
            vvcVar.getClass();
            kvc kvcVar = ((wvc) vvcVar.t0.getValue()).b;
            if (kvcVar == null || (gg1Var = kvcVar.c) == null) {
                zEquals = false;
            } else {
                Conversation conversationA = ((fw3) vvcVar.b.getValue()).a();
                zEquals = gg1Var.equals((conversationA == null || (me2 = conversationA.getMe()) == null || (externalId = me2.getExternalId()) == null) ? Boolean.FALSE : mqa.b(externalId));
            }
            if (zEquals) {
                ((ir1) ie1Var.s0.getValue()).k(false);
            } else {
                pnf.o(el1Var.M0, pj1.D);
            }
        } else if (j == y7a.r) {
            pnf.o(el1Var.M0, ij1.D);
        } else if (j == y7a.G) {
            pnf.o(el1Var.M0, hj1.D);
        } else if (j == y7a.b1) {
            pnf.o(el1Var.M0, new bj1(nnf.c));
        } else if (j == y7a.c1) {
            pnf.o(el1Var.M0, new bj1(nnf.a));
        } else if (j == y7a.w) {
            s35 s35Var = el1Var.M0;
            je1.c.getClass();
            pnf.o(s35Var, new c64(":call-admin-settings"));
        }
        callMoreBottomSheet.s0(true);
    }

    @Override // defpackage.rpa
    public Object n() {
        return this.a;
    }

    @Override // defpackage.nr8
    public boolean o(wq8 wq8Var) {
        Window.Callback callback;
        if (wq8Var != wq8Var.k()) {
            return true;
        }
        dn dnVar = (dn) this.a;
        if (!dnVar.Q0 || (callback = dnVar.w0.getCallback()) == null || dnVar.b1) {
            return true;
        }
        callback.onMenuOpened(108, wq8Var);
        return true;
    }

    public void p() {
        fm6 fm6Var = (fm6) this.a;
        int i = fm6Var.E0 - 1;
        fm6Var.E0 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (tn6 tn6Var : fm6Var.G0) {
            tn6Var.d();
            i2 += tn6Var.T0.a;
        }
        rze[] rzeVarArr = new rze[i2];
        int i3 = 0;
        for (tn6 tn6Var2 : fm6Var.G0) {
            tn6Var2.d();
            int i4 = tn6Var2.T0.a;
            int i5 = 0;
            while (i5 < i4) {
                tn6Var2.d();
                rzeVarArr[i3] = tn6Var2.T0.a(i5);
                i5++;
                i3++;
            }
        }
        fm6Var.F0 = new tze(rzeVarArr);
        fm6Var.D0.e(fm6Var);
    }

    public void q(long j, final boolean z) {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        CallAdminSettingsScreen callAdminSettingsScreen = (CallAdminSettingsScreen) this.a;
        bc7[] bc7VarArr = CallAdminSettingsScreen.t0;
        k01 k01VarM0 = callAdminSettingsScreen.m0();
        int i4 = (int) j;
        k01VarM0.getClass();
        int i5 = y7a.a;
        rd8 rd8Var = rd8.c;
        rd8 rd8Var2 = rd8.a;
        if (i4 == i5) {
            final yz0 yz0Var = (yz0) k01VarM0.q();
            MediaMuteManager mediaMuteManagerE = yz0Var.e();
            if (mediaMuteManagerE != null) {
                ky7 ky7Var = new ky7();
                qd8 qd8Var = qd8.b;
                if (z) {
                    rd8Var = rd8Var2;
                }
                ky7Var.put(qd8Var, rd8Var);
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE, ky7Var.b(), null, new k56() { // from class: gz0
                    @Override // defpackage.k56
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i2) {
                            case 0:
                                yz0 yz0Var2 = yz0Var;
                                boolean z2 = z;
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, "CallAdminSettingsController", "Microphone in call was changed on " + z2 + " success", null);
                                }
                                q0e q0eVar = yz0Var2.E0;
                                do {
                                    value = q0eVar.getValue();
                                } while (!q0eVar.c(value, aa.a((aa) value, false, false, z2, false, false, false, 123)));
                                yz0Var2.C0.g(new za(true, z2));
                                break;
                            case 1:
                                yz0 yz0Var3 = yz0Var;
                                boolean z3 = z;
                                ir6 ir6Var2 = hm9.m;
                                if (ir6Var2 != null && ir6Var2.c()) {
                                    ir6Var2.d(us7.X, "CallAdminSettingsController", "Cameras in call was changed on " + z3 + " success", null);
                                }
                                q0e q0eVar2 = yz0Var3.E0;
                                do {
                                    value2 = q0eVar2.getValue();
                                } while (!q0eVar2.c(value2, aa.a((aa) value2, false, z3, false, false, false, false, 125)));
                                yz0Var3.C0.g(new xa(true, z3));
                                break;
                            default:
                                yz0 yz0Var4 = yz0Var;
                                boolean z4 = z;
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, "CallAdminSettingsController", "Screen sharing in call was changed on " + z4 + " success", null);
                                }
                                q0e q0eVar3 = yz0Var4.E0;
                                do {
                                    value3 = q0eVar3.getValue();
                                } while (!q0eVar3.c(value3, aa.a((aa) value3, false, false, false, z4, false, false, 119)));
                                yz0Var4.C0.g(new db(true, z4));
                                break;
                        }
                        return e5f.a;
                    }
                }, new m56() { // from class: hz0
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        sd8 mediaOptionsForCall$default;
                        rd8 rd8Var3;
                        sd8 mediaOptionsForCall$default2;
                        rd8 rd8Var4;
                        sd8 mediaOptionsForCall$default3;
                        rd8 rd8Var5;
                        switch (i2) {
                            case 0:
                                yz0 yz0Var2 = yz0Var;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                }
                                kld kldVar = yz0Var2.C0;
                                MediaMuteManager mediaMuteManagerE2 = yz0Var2.e();
                                kldVar.g(new za(false, (mediaMuteManagerE2 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE2, null, 1, null)) == null || (rd8Var3 = mediaOptionsForCall$default.a) == null) ? false : yz0.h(rd8Var3)));
                                break;
                            case 1:
                                yz0 yz0Var3 = yz0Var;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                ir6 ir6Var2 = hm9.m;
                                if (ir6Var2 != null && ir6Var2.c()) {
                                    ir6Var2.d(us7.X, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                }
                                kld kldVar2 = yz0Var3.C0;
                                MediaMuteManager mediaMuteManagerE3 = yz0Var3.e();
                                kldVar2.g(new xa(false, (mediaMuteManagerE3 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) == null || (rd8Var4 = mediaOptionsForCall$default2.b) == null) ? false : yz0.h(rd8Var4)));
                                break;
                            default:
                                yz0 yz0Var4 = yz0Var;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                }
                                kld kldVar3 = yz0Var4.C0;
                                MediaMuteManager mediaMuteManagerE4 = yz0Var4.e();
                                kldVar3.g(new db(false, (mediaMuteManagerE4 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE4, null, 1, null)) == null || (rd8Var5 = mediaOptionsForCall$default3.c) == null) ? false : yz0.h(rd8Var5)));
                                break;
                        }
                        return e5f.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (i4 == y7a.h) {
            final yz0 yz0Var2 = (yz0) k01VarM0.q();
            MediaMuteManager mediaMuteManagerE2 = yz0Var2.e();
            if (mediaMuteManagerE2 != null) {
                ky7 ky7Var2 = new ky7();
                qd8 qd8Var2 = qd8.a;
                if (z) {
                    rd8Var = rd8Var2;
                }
                ky7Var2.put(qd8Var2, rd8Var);
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE2, ky7Var2.b(), null, new k56() { // from class: gz0
                    @Override // defpackage.k56
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i) {
                            case 0:
                                yz0 yz0Var22 = yz0Var2;
                                boolean z2 = z;
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, "CallAdminSettingsController", "Microphone in call was changed on " + z2 + " success", null);
                                }
                                q0e q0eVar = yz0Var22.E0;
                                do {
                                    value = q0eVar.getValue();
                                } while (!q0eVar.c(value, aa.a((aa) value, false, false, z2, false, false, false, 123)));
                                yz0Var22.C0.g(new za(true, z2));
                                break;
                            case 1:
                                yz0 yz0Var3 = yz0Var2;
                                boolean z3 = z;
                                ir6 ir6Var2 = hm9.m;
                                if (ir6Var2 != null && ir6Var2.c()) {
                                    ir6Var2.d(us7.X, "CallAdminSettingsController", "Cameras in call was changed on " + z3 + " success", null);
                                }
                                q0e q0eVar2 = yz0Var3.E0;
                                do {
                                    value2 = q0eVar2.getValue();
                                } while (!q0eVar2.c(value2, aa.a((aa) value2, false, z3, false, false, false, false, 125)));
                                yz0Var3.C0.g(new xa(true, z3));
                                break;
                            default:
                                yz0 yz0Var4 = yz0Var2;
                                boolean z4 = z;
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, "CallAdminSettingsController", "Screen sharing in call was changed on " + z4 + " success", null);
                                }
                                q0e q0eVar3 = yz0Var4.E0;
                                do {
                                    value3 = q0eVar3.getValue();
                                } while (!q0eVar3.c(value3, aa.a((aa) value3, false, false, false, z4, false, false, 119)));
                                yz0Var4.C0.g(new db(true, z4));
                                break;
                        }
                        return e5f.a;
                    }
                }, new m56() { // from class: hz0
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        sd8 mediaOptionsForCall$default;
                        rd8 rd8Var3;
                        sd8 mediaOptionsForCall$default2;
                        rd8 rd8Var4;
                        sd8 mediaOptionsForCall$default3;
                        rd8 rd8Var5;
                        switch (i) {
                            case 0:
                                yz0 yz0Var22 = yz0Var2;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                }
                                kld kldVar = yz0Var22.C0;
                                MediaMuteManager mediaMuteManagerE22 = yz0Var22.e();
                                kldVar.g(new za(false, (mediaMuteManagerE22 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE22, null, 1, null)) == null || (rd8Var3 = mediaOptionsForCall$default.a) == null) ? false : yz0.h(rd8Var3)));
                                break;
                            case 1:
                                yz0 yz0Var3 = yz0Var2;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                ir6 ir6Var2 = hm9.m;
                                if (ir6Var2 != null && ir6Var2.c()) {
                                    ir6Var2.d(us7.X, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                }
                                kld kldVar2 = yz0Var3.C0;
                                MediaMuteManager mediaMuteManagerE3 = yz0Var3.e();
                                kldVar2.g(new xa(false, (mediaMuteManagerE3 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) == null || (rd8Var4 = mediaOptionsForCall$default2.b) == null) ? false : yz0.h(rd8Var4)));
                                break;
                            default:
                                yz0 yz0Var4 = yz0Var2;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                }
                                kld kldVar3 = yz0Var4.C0;
                                MediaMuteManager mediaMuteManagerE4 = yz0Var4.e();
                                kldVar3.g(new db(false, (mediaMuteManagerE4 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE4, null, 1, null)) == null || (rd8Var5 = mediaOptionsForCall$default3.c) == null) ? false : yz0.h(rd8Var5)));
                                break;
                        }
                        return e5f.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (i4 == y7a.j) {
            final yz0 yz0Var3 = (yz0) k01VarM0.q();
            MediaMuteManager mediaMuteManagerE3 = yz0Var3.e();
            if (mediaMuteManagerE3 != null) {
                ky7 ky7Var3 = new ky7();
                qd8 qd8Var3 = qd8.c;
                if (z) {
                    rd8Var = rd8Var2;
                }
                ky7Var3.put(qd8Var3, rd8Var);
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE3, ky7Var3.b(), null, new k56() { // from class: gz0
                    @Override // defpackage.k56
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i3) {
                            case 0:
                                yz0 yz0Var22 = yz0Var3;
                                boolean z2 = z;
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, "CallAdminSettingsController", "Microphone in call was changed on " + z2 + " success", null);
                                }
                                q0e q0eVar = yz0Var22.E0;
                                do {
                                    value = q0eVar.getValue();
                                } while (!q0eVar.c(value, aa.a((aa) value, false, false, z2, false, false, false, 123)));
                                yz0Var22.C0.g(new za(true, z2));
                                break;
                            case 1:
                                yz0 yz0Var32 = yz0Var3;
                                boolean z3 = z;
                                ir6 ir6Var2 = hm9.m;
                                if (ir6Var2 != null && ir6Var2.c()) {
                                    ir6Var2.d(us7.X, "CallAdminSettingsController", "Cameras in call was changed on " + z3 + " success", null);
                                }
                                q0e q0eVar2 = yz0Var32.E0;
                                do {
                                    value2 = q0eVar2.getValue();
                                } while (!q0eVar2.c(value2, aa.a((aa) value2, false, z3, false, false, false, false, 125)));
                                yz0Var32.C0.g(new xa(true, z3));
                                break;
                            default:
                                yz0 yz0Var4 = yz0Var3;
                                boolean z4 = z;
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, "CallAdminSettingsController", "Screen sharing in call was changed on " + z4 + " success", null);
                                }
                                q0e q0eVar3 = yz0Var4.E0;
                                do {
                                    value3 = q0eVar3.getValue();
                                } while (!q0eVar3.c(value3, aa.a((aa) value3, false, false, false, z4, false, false, 119)));
                                yz0Var4.C0.g(new db(true, z4));
                                break;
                        }
                        return e5f.a;
                    }
                }, new m56() { // from class: hz0
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        sd8 mediaOptionsForCall$default;
                        rd8 rd8Var3;
                        sd8 mediaOptionsForCall$default2;
                        rd8 rd8Var4;
                        sd8 mediaOptionsForCall$default3;
                        rd8 rd8Var5;
                        switch (i3) {
                            case 0:
                                yz0 yz0Var22 = yz0Var3;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                }
                                kld kldVar = yz0Var22.C0;
                                MediaMuteManager mediaMuteManagerE22 = yz0Var22.e();
                                kldVar.g(new za(false, (mediaMuteManagerE22 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE22, null, 1, null)) == null || (rd8Var3 = mediaOptionsForCall$default.a) == null) ? false : yz0.h(rd8Var3)));
                                break;
                            case 1:
                                yz0 yz0Var32 = yz0Var3;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                ir6 ir6Var2 = hm9.m;
                                if (ir6Var2 != null && ir6Var2.c()) {
                                    ir6Var2.d(us7.X, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                }
                                kld kldVar2 = yz0Var32.C0;
                                MediaMuteManager mediaMuteManagerE32 = yz0Var32.e();
                                kldVar2.g(new xa(false, (mediaMuteManagerE32 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE32, null, 1, null)) == null || (rd8Var4 = mediaOptionsForCall$default2.b) == null) ? false : yz0.h(rd8Var4)));
                                break;
                            default:
                                yz0 yz0Var4 = yz0Var3;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                }
                                kld kldVar3 = yz0Var4.C0;
                                MediaMuteManager mediaMuteManagerE4 = yz0Var4.e();
                                kldVar3.g(new db(false, (mediaMuteManagerE4 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE4, null, 1, null)) == null || (rd8Var5 = mediaOptionsForCall$default3.c) == null) ? false : yz0.h(rd8Var5)));
                                break;
                        }
                        return e5f.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (i4 == y7a.i) {
            if (!z) {
                lvc lvcVar = k01VarM0.b.i;
                lvcVar.getClass();
                if (((wvc) ((vvc) lvcVar).t0.getValue()).a == xvc.a) {
                    pnf.o(k01VarM0.t0, pj1.D);
                    return;
                }
            }
            ((yz0) k01VarM0.q()).i(z);
            return;
        }
        if (i4 == y7a.k) {
            yz0 yz0Var4 = (yz0) k01VarM0.q();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null) {
                yz0Var4.getClass();
                if (ir6Var.c()) {
                    ir6Var.d(us7.X, "CallAdminSettingsController", ey8.j("Waiting room change state to ", z), null);
                }
            }
            Conversation conversationA = yz0Var4.d().a();
            if (conversationA != null) {
                Conversation.setWaitingRoomEnabled$default(conversationA, z, null, 2, null);
            }
        }
    }

    public void r() {
        ((InputContentInfo) this.a).requestPermission();
    }

    @Override // defpackage.uq8
    public boolean z(wq8 wq8Var, MenuItem menuItem) {
        uq8 uq8Var = ((Toolbar) this.a).c1;
        return uq8Var != null && uq8Var.z(wq8Var, menuItem);
    }

    public wmc(int i) {
        Object objH;
        switch (i) {
            case 10:
                this.a = new i56(5, 1, (byte) 0);
                return;
            case 20:
                this.a = (ExtraCroppingQuirk) zi4.a.e(ExtraCroppingQuirk.class);
                return;
            default:
                mi9 mi9VarB = mi9.b();
                this.a = mi9VarB;
                Object objH2 = null;
                try {
                    objH = mi9VarB.h(cne.e0);
                } catch (IllegalArgumentException unused) {
                    objH = null;
                }
                Class cls = (Class) objH;
                if (cls != null && !cls.equals(ay1.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                aa0 aa0Var = cne.e0;
                mi9 mi9Var = (mi9) this.a;
                mi9Var.j(aa0Var, ay1.class);
                try {
                    objH2 = mi9Var.h(cne.d0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objH2 == null) {
                    mi9Var.j(cne.d0, ay1.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
