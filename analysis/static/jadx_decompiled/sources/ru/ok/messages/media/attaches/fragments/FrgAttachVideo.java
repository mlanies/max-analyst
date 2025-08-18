package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.b;
import defpackage.a14;
import defpackage.ad;
import defpackage.ai3;
import defpackage.au8;
import defpackage.azb;
import defpackage.b24;
import defpackage.bq7;
import defpackage.c37;
import defpackage.c54;
import defpackage.cba;
import defpackage.cqc;
import defpackage.cu8;
import defpackage.d20;
import defpackage.die;
import defpackage.dlf;
import defpackage.e52;
import defpackage.ed3;
import defpackage.ef7;
import defpackage.ema;
import defpackage.esb;
import defpackage.fef;
import defpackage.glc;
import defpackage.hj8;
import defpackage.hle;
import defpackage.hm9;
import defpackage.j10;
import defpackage.j1e;
import defpackage.j46;
import defpackage.jg5;
import defpackage.jpc;
import defpackage.jyc;
import defpackage.k20;
import defpackage.k46;
import defpackage.k4a;
import defpackage.kj9;
import defpackage.kk5;
import defpackage.kk9;
import defpackage.l20;
import defpackage.l46;
import defpackage.l6f;
import defpackage.lj9;
import defpackage.lze;
import defpackage.m46;
import defpackage.mg;
import defpackage.mpf;
import defpackage.mqb;
import defpackage.mze;
import defpackage.n46;
import defpackage.nd7;
import defpackage.ngg;
import defpackage.nqb;
import defpackage.nse;
import defpackage.o20;
import defpackage.o45;
import defpackage.oag;
import defpackage.omf;
import defpackage.oz;
import defpackage.p0b;
import defpackage.p7b;
import defpackage.pk;
import defpackage.q5;
import defpackage.qqb;
import defpackage.r20;
import defpackage.r5;
import defpackage.s5c;
import defpackage.s8g;
import defpackage.sd7;
import defpackage.ti4;
import defpackage.tpa;
import defpackage.u7;
import defpackage.uae;
import defpackage.us;
import defpackage.vl;
import defpackage.wdg;
import defpackage.we8;
import defpackage.wk9;
import defpackage.wmd;
import defpackage.xe8;
import defpackage.xpb;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.ydf;
import defpackage.yn6;
import defpackage.yyb;
import defpackage.zmf;
import defpackage.zqe;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.http.HttpStatus;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public class FrgAttachVideo extends FrgAttachView implements kj9 {
    public Map I1;
    public ImageButton J1;
    public r20 K1;
    public we8 L1;
    public wk9 M1;
    public lj9 N1;
    public VideoThumbnailView O1;
    public die P1;
    public ad Q1;
    public jg5 R1;

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView
    public final void C1() {
        K1();
    }

    public final void D1() {
        if (this.D1.i()) {
            this.q1.n().t(this.C1.a, this.D1.r, new hj8(13));
        }
        q1().F1 = new k46(this, 3);
        die dieVarA = ((oz) ((y8a) vl.b()).getAccessor().c(oz.class)).a(this.D1);
        this.P1 = dieVarA;
        dieVarA.T(new k46(this, 1), new k46(this, 2));
    }

    public final void E1(boolean z) {
        if (z) {
            a14.N(0, d0(), h0(jpc.n3));
        } else if (wmd.l(d0())) {
            D1();
        } else {
            wmd.D(this, wmd.s(), 110);
        }
    }

    public final void F1() {
        J1();
        G1();
        if (s5c.R(this.D1)) {
            return;
        }
        ed3 ed3Var = (ed3) this.p1.b;
        wk9 wk9Var = this.M1;
        we8 we8Var = this.L1;
        y8a y8aVar = (y8a) ed3Var;
        dlf dlfVarS = y8aVar.s();
        hle hleVarQ = y8aVar.q();
        ef7 ef7Var = (ef7) y8aVar.getAccessor().c(ef7.class);
        o20 o20VarD = y8aVar.d();
        au8 au8VarL = y8aVar.l();
        p7b p7bVarN = y8aVar.n();
        o45 o45VarG = y8aVar.g();
        ti4 ti4VarF = y8aVar.f();
        n46 n46VarU1 = r1();
        this.N1 = new lj9(wk9Var, we8Var, dlfVarS, hleVarQ, ef7Var, o20VarD, au8VarL, p7bVarN, this, o45VarG, ti4VarF, n46VarU1 == null ? true : ((ActAttachesView) n46VarU1).b1, false);
        ((View) this.M1.c).setVisibility(0);
        VideoThumbnailView videoThumbnailView = this.O1;
        if (videoThumbnailView != null) {
            videoThumbnailView.setVisibility(8);
        }
        e52 e52VarT1 = t1();
        long j = e52VarT1 != null ? e52VarT1.b.a : 0L;
        hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Bind %s", this.D1.r);
        this.N1.Z1(this.D1, j, this.C1.a, 4, false);
    }

    @Override // defpackage.kj9
    public final void G() {
    }

    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        n46 n46VarU1;
        MenuItem menuItemE;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            n1();
        } else if (itemId != xxb.menu_attachments__open_all_media) {
            long j = 0;
            if (itemId == xxb.menu_attachments__forward) {
                n46 n46VarU12 = r1();
                if (n46VarU12 != null) {
                    ((ActAttachesView) n46VarU12).m1.s(this.C1, 0L);
                }
            } else if (itemId == xxb.menu_attachments__share) {
                if (this.o1) {
                    if (this.D1.i()) {
                        glc glcVarL = c37.l(this.D1);
                        String str = (String) glcVarL.b;
                        if (str != null) {
                            hm9.e0(d0(), str);
                        } else {
                            File file = (File) glcVarL.c;
                            if (file == null) {
                                Boolean bool = (Boolean) glcVarL.o;
                                if (bool != null) {
                                    E1(bool.booleanValue());
                                }
                            } else if (wmd.l(d0())) {
                                hm9.f0(b0(), file, ((y8a) ((ed3) this.p1.b)).h());
                            } else {
                                wmd.D(this, wmd.s(), 112);
                            }
                        }
                    } else if (s5c.P(this.D1)) {
                        E1(false);
                    }
                }
            } else if (itemId == xxb.menu_attach_video__download) {
                I1();
            } else if (itemId == xxb.menu_attach_video__download_cancel) {
                this.q1.n().u(this.C1.a, this.D1.r, d20.b);
                L1();
            } else if (itemId == xxb.menu_attachments__to_pip_mode) {
                Context contextD0 = d0();
                String[] strArr = wmd.d;
                if (contextD0 == null ? false : Settings.canDrawOverlays(contextD0)) {
                    H1(false);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.P1);
                    bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.Z1);
                    bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.X1);
                    ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                    confirmationDialog.X0(bundle);
                    confirmationDialog.b1(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
                    confirmationDialog.k1(this.F0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
                }
            } else if (itemId == xxb.menu_attachments__open_in) {
                if (s5c.P(this.D1)) {
                    this.R1.b(this.C1, this.D1, this, true, false, 4);
                } else if (this.D1.i()) {
                    hm9.V(b0(), this.D1.d.h);
                }
            } else if (itemId != xxb.menu_attach_video__go_to_message) {
                if (itemId == xxb.menu_attachments__rotate_screen) {
                    B1();
                } else if (itemId == xxb.menu_attach_video__audio_tracks) {
                    hm9.n("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Open audio tracks");
                    lj9 lj9Var = this.N1;
                    if (lj9Var != null) {
                        List listA2 = lj9Var.a2();
                        if (listA2.size() < 2) {
                            ((cba) ((y8a) ((ed3) this.p1.b)).g()).c(new HandledException(new IllegalStateException("Audio tracks count less then 2")), true);
                            ai3 ai3VarV1 = v1();
                            if (ai3VarV1 != null && (menuItemE = ai3VarV1.e(xxb.menu_attach_video__audio_tracks)) != null) {
                                menuItemE.setVisible(false);
                            }
                        } else {
                            this.Q1.d(listA2.size(), "OPEN_AUDIO_TRACKS_DIALOG");
                            this.N1.l2();
                            lze lzeVarE = ((bq7) this.N1.c).e();
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(listA2);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS", arrayList);
                            bundle2.putParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK", lzeVarE);
                            FrgDlgAudioTracksPicker frgDlgAudioTracksPicker = new FrgDlgAudioTracksPicker();
                            frgDlgAudioTracksPicker.X0(bundle2);
                            frgDlgAudioTracksPicker.k1(c0(), "ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker");
                        }
                    }
                } else if (itemId == xxb.menu_attach_video__send_video && (n46VarU1 = r1()) != null) {
                    if (this.D1.i()) {
                        j = this.D1.d.a;
                    } else if (s5c.P(this.D1)) {
                        j = this.D1.j.a;
                    }
                    ((ActAttachesView) n46VarU1).m1.s(this.C1, j);
                }
            }
        } else if (g1() != null) {
            b bVarB0 = b0();
            long j2 = this.C1.a.t0;
            int i = r5.U0;
            Intent intent = new Intent(bVarB0, (Class<?>) r5.class);
            intent.addFlags(67108864);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j2);
            bVarB0.startActivity(intent);
            e1();
        }
        return true;
    }

    public final void G1() {
        if (this.N1 == null) {
            return;
        }
        hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Release %s", this.D1.r);
        this.N1.l1(false);
        this.N1 = null;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void H0() {
        super.H0();
        die dieVar = this.P1;
        if (dieVar != null) {
            cqc.b((sd7) dieVar.o);
        }
        G1();
    }

    public final void H1(boolean z) {
        VideoView videoView = this.M1.Y;
        Rect rect = mpf.a;
        mpf.d(rect, videoView);
        lj9 lj9Var = this.N1;
        if (lj9Var != null) {
            lj9Var.F1();
            j10 j10VarJ = this.D1.j();
            tpa.I(j10VarJ, this.N1.k(), this.N1.c(), this.N1.c0());
            this.D1 = j10VarJ.a();
        }
        G1();
        ((y8a) ((ed3) this.p1.b)).k().u0.d(d0(), t1(), this.C1, this.D1, rect, !z);
        if (z) {
            b bVarB0 = b0();
            if (bVarB0 != null) {
                bVarB0.finish();
                bVarB0.overridePendingTransition(0, esb.fullscreen_to_pip);
                return;
            }
            return;
        }
        if (((y8a) ((ed3) this.p1.b)).c().p()) {
            if (this.O1 != null) {
                ((y8a) ((ed3) this.p1.b)).c().g(this.O1);
            }
            wk9 wk9Var = this.M1;
            if (wk9Var != null && ((View) wk9Var.c) != null) {
                ((y8a) ((ed3) this.p1.b)).c().g((View) this.M1.c);
            }
        }
        nd7.R(new j46(this, 2), 400L);
    }

    public final void I1() {
        if (this.D1.i()) {
            if (!wmd.l(d0())) {
                wmd.D(this, wmd.s(), 111);
                return;
            }
            ((y8a) ((ed3) this.p1.b)).b().f("EXO_VIDEO_DOWNLOAD");
            this.q1.n().t(this.C1.a, this.D1.r, new hj8(13));
            this.q1.n().u(this.C1.a, this.D1.r, d20.X);
            e52 e52VarT1 = t1();
            pk pkVarC = this.q1.c();
            l20 l20Var = this.D1;
            k20 k20Var = l20Var.d;
            long j = k20Var.a;
            long j2 = e52VarT1.b.a;
            cu8 cu8Var = this.C1.a;
            ((k4a) pkVarC).L(true, j, j2, cu8Var.c, cu8Var.b, l20Var.r, true, true, k20Var.m);
            L1();
        }
    }

    public final void J1() {
        if (!s5c.R(this.D1) || this.E1) {
            this.J1.setVisibility(8);
            return;
        }
        this.K1.setLevel((int) (this.D1.q * 100.0f));
        this.J1.setVisibility(0);
        VideoThumbnailView videoThumbnailView = this.O1;
        if (videoThumbnailView != null) {
            videoThumbnailView.setVisibility(0);
        }
        lj9 lj9Var = this.N1;
        if (lj9Var == null || !lj9Var.b()) {
            return;
        }
        this.N1.pause();
    }

    @Override // defpackage.kj9
    public final void K() {
        L1();
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        die dieVar = this.P1;
        if (dieVar != null) {
            dieVar.T(new k46(this, 1), new k46(this, 2));
        }
        K1();
    }

    public final void K1() {
        if (this.N1 == null) {
            return;
        }
        if (r1() != null) {
            n46 n46VarU1 = r1();
            if ((n46VarU1 == null ? true : ((ActAttachesView) n46VarU1).b1) && !s5c.R(this.D1)) {
                this.N1.k1(true);
                return;
            }
        }
        this.N1.k1(false);
    }

    @Override // defpackage.kj9
    public final void L() {
        lj9 lj9Var = this.N1;
        if (lj9Var == null) {
            return;
        }
        lj9Var.l2();
        bq7 bq7Var = (bq7) this.N1.c;
        List<mze> listEmptyList = bq7Var.f == null ? Collections.emptyList() : (List) bq7Var.b.b.o;
        bq7 bq7Var2 = (bq7) this.N1.c;
        mze mzeVarB = bq7Var2.f == null ? mze.c : bq7Var2.b.b.b();
        HashMap map = new HashMap();
        for (mze mzeVar : listEmptyList) {
            lze lzeVar = mzeVar.a;
            mqb mqbVarH = j1e.H(lzeVar.o, lzeVar.X);
            map.put(mzeVar, new nqb(mqbVarH, mqbVarH.c, mqbVarH.o, mqbVarH.X, 0L, false));
        }
        this.I1 = new us(0);
        for (Map.Entry entry : map.entrySet()) {
            this.I1.put((mze) entry.getKey(), (nqb) entry.getValue());
        }
        mqb mqbVar = mzeVarB != mze.c ? ((nqb) this.I1.get(mzeVarB)).a : null;
        fef fefVar = ((bq7) this.N1.c).f;
        if (fefVar != null && !(fefVar instanceof b24)) {
            boolean z = fefVar instanceof yn6;
        }
        VideoQualityPickerDialog.n1(new ArrayList(this.I1.values()), mqbVar, false).k1(c0(), "ru.ok.messages.media.attaches.fragments.FrgAttachVideo");
        c0().f0("VideoQualityPickerDialog:result:request", this, new ydf(new wdg(4), new m46(this, map), 1));
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        die dieVar = this.P1;
        if (dieVar != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER", (ArrayList) dieVar.c);
        }
        jg5 jg5Var = this.R1;
        if (jg5Var != null) {
            long j = jg5Var.h;
            if (j != 0) {
                bundle.putLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", j);
            }
            if (!oag.t(jg5Var.j)) {
                bundle.putString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", jg5Var.j);
                bundle.putBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", jg5Var.k);
            }
            int i = jg5Var.l;
            if (i != 0) {
                bundle.putInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", i);
            }
            long j2 = jg5Var.i;
            if (j2 != 0) {
                bundle.putLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", j2);
            }
            if (jg5Var.m) {
                bundle.putBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", true);
            }
        }
        if (this.I1 != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (Map.Entry entry : this.I1.entrySet()) {
                arrayList.add((mze) entry.getKey());
                arrayList2.add(new qqb((nqb) entry.getValue()));
            }
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.VIDEO_FORMATS", arrayList);
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.QUALITIES", arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L1() {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachVideo.L1():void");
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView, ru.ok.messages.views.fragments.FrgSlideOut, defpackage.tsd
    public final void M(int i) {
        nd7.R(new j46(this, 1), 500L);
        super.M(i);
    }

    @Override // defpackage.ik9
    public final void T() {
        n46 n46VarU1 = r1();
        if (n46VarU1 != null) {
            ((ActAttachesView) n46VarU1).e();
        }
    }

    @Override // defpackage.ik9
    public final void X() {
        n46 n46VarU1 = r1();
        if (n46VarU1 == null) {
            return;
        }
        ((ActAttachesView) n46VarU1).c(true, true, false);
    }

    @Override // defpackage.ik9
    public final void Y(Throwable th) {
        Context contextD0 = d0();
        if (contextD0 != null) {
            a14.N(0, contextD0, zqe.b(contextD0, th));
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void i1() {
        lj9 lj9Var = this.N1;
        if (lj9Var == null) {
            return;
        }
        kk9 kk9Var = (kk9) lj9Var.b;
        if (kk9Var instanceof nse) {
            ((nse) kk9Var).c();
        }
    }

    @Override // defpackage.kj9
    public final void k(String str) {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean k1() {
        return this.o1;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void l1(int i, int i2, Intent intent) {
        if (i2 != -1) {
            if (i == 102) {
                Context contextD0 = d0();
                String[] strArr = wmd.d;
                if (contextD0 == null ? false : Settings.canDrawOverlays(contextD0)) {
                    H1(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 101) {
            if (i == 102) {
                H1(true);
            }
        } else {
            String[] strArr2 = wmd.d;
            d1(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + d0().getPackageName())), HttpStatus.SC_PROCESSING, null);
        }
    }

    @Override // defpackage.kj9
    public final void n() {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean n1() {
        q5 q5VarG1 = g1();
        if (q5VarG1 == null) {
            return false;
        }
        nd7.R(new j46(this, 1), 400L);
        if (this.F1) {
            u7.a(q5VarG1);
            return true;
        }
        q5VarG1.finish();
        return true;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void o1(int i, String[] strArr, int[] iArr) {
        if (i == 110) {
            if (wmd.O(this, strArr, iArr, wmd.s(), jpc.i2, jpc.f2)) {
                View view = this.U0;
                if (view != null) {
                    view.post(new j46(this, 0));
                }
                D1();
                return;
            }
            return;
        }
        if (i == 111) {
            if (wmd.O(this, strArr, iArr, wmd.s(), jpc.h2, jpc.f2)) {
                I1();
            }
        } else if (i == 112 && wmd.O(this, strArr, iArr, wmd.s(), jpc.i2, jpc.f2)) {
            glc glcVarL = c37.l(this.D1);
            hm9.f0(b0(), (File) glcVarL.c, ((y8a) ((ed3) this.p1.b)).h());
        }
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.M1.Z;
        pinchToZoomVideoViewWrapper.c = p0b.b;
        pinchToZoomVideoViewWrapper.s0 = 1.0f;
    }

    @uae
    public void onEvent(l6f l6fVar) {
        if (l6fVar.c == this.C1.a.b) {
            w1(l6fVar, new l46(this, 0));
        }
    }

    @Override // defpackage.kj9
    public final void r(boolean z) {
        n46 n46VarU1 = r1();
        if (n46VarU1 == null) {
            return;
        }
        ((ActAttachesView) n46VarU1).c(z, true, false);
    }

    @Override // defpackage.kj9
    public final void s() {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        z1();
        if (s5c.P(this.D1)) {
            ad adVarB = this.q1.b();
            s8g s8gVarU = this.q1.u();
            kk5 kk5Var = (kk5) this.q1.j();
            Context contextD0 = d0();
            if (this.x1 == null) {
                this.x1 = new xpb();
            }
            jg5 jg5Var = new jg5(adVarB, s8gVarU, kk5Var, contextD0, this, this.x1, ((y8a) ((ed3) this.p1.b)).l());
            this.R1 = jg5Var;
            ((jyc) jg5Var.b).e().d(jg5Var);
            if (bundle != null) {
                jg5Var.h = bundle.getLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", 0L);
                jg5Var.j = bundle.getString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", null);
                jg5Var.k = bundle.getBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", false);
                jg5Var.l = bundle.getInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", 0);
                jg5Var.m = bundle.getBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", false);
                jg5Var.i = bundle.getLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", 0L);
            }
            this.R1.d = this;
        }
        this.Q1 = ((y8a) ((ed3) this.p1.b)).b();
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView, androidx.fragment.app.a
    public final void w0(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemE;
        if (this.C1.a.s() || this.Z.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            return;
        }
        menu.clear();
        menuInflater.inflate(azb.menu_attach_video, menu);
        ngg.g(this.r1, menu, null);
        L1();
        ai3 ai3VarV1 = v1();
        e52 e52VarT1 = t1();
        if ((this.C1.a.C() || e52VarT1 == null) && ai3VarV1 != null && (menuItemE = ai3VarV1.e(xxb.menu_attachments__open_all_media)) != null) {
            menuItemE.setVisible(false);
        }
        super.w0(menu, menuInflater);
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        View viewInflate = layoutInflater.inflate(yyb.frg_video_view, viewGroup, false);
        nd7.h(viewInflate.findViewById(xxb.frg_video_view__rl_root), new l46(this, 1));
        c54.c(viewInflate);
        ed3 ed3Var = (ed3) this.p1.b;
        this.L1 = ((xe8) b0()).b();
        y8a y8aVar = (y8a) ed3Var;
        this.M1 = new wk9(d0(), viewInflate.findViewById(xxb.frg_video_view__player), y8aVar.c(), y8aVar.b());
        if (this.F1 && bundle == null && !s5c.R(this.D1)) {
            wk9 wk9Var = this.M1;
            we8 we8Var = this.L1;
            dlf dlfVarS = y8aVar.s();
            hle hleVarQ = y8aVar.q();
            ef7 ef7Var = (ef7) y8aVar.getAccessor().c(ef7.class);
            o20 o20VarD = y8aVar.d();
            au8 au8VarL = y8aVar.l();
            p7b p7bVarN = y8aVar.n();
            o45 o45VarG = y8aVar.g();
            ti4 ti4VarF = y8aVar.f();
            n46 n46VarU1 = r1();
            view = viewInflate;
            this.N1 = new lj9(wk9Var, we8Var, dlfVarS, hleVarQ, ef7Var, o20VarD, au8VarL, p7bVarN, this, o45VarG, ti4VarF, n46VarU1 == null ? true : ((ActAttachesView) n46VarU1).b1, false);
            e52 e52VarT1 = t1();
            this.N1.Z1(this.D1, e52VarT1 != null ? e52VarT1.b.a : 0L, this.C1.a, 4, true);
            hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Bind %s", this.D1.r);
            view2 = s5c.b0(y8aVar.n(), this.D1) ? this.M1.D0 : this.M1.w0;
        } else {
            view = viewInflate;
            view.findViewById(xxb.frg_video_view__player).setVisibility(8);
            this.O1 = (VideoThumbnailView) view.findViewById(xxb.frg_video_view__vt_transition);
            this.O1.o(s5c.P(this.D1) ? this.D1.j.d.d : this.D1.d, y8aVar.d().a(this.D1));
            view2 = this.O1;
        }
        A1((SlideOutLayout) view, view2);
        this.J1 = (ImageButton) view.findViewById(xxb.frg_video_view__btn_cancel);
        r20 r20Var = new r20(d0());
        this.K1 = r20Var;
        this.J1.setImageDrawable(r20Var);
        nd7.h(this.J1, new l46(this, 2));
        View view3 = view;
        if (bundle != null) {
            this.P1 = ema.B((oz) y8aVar.getAccessor().c(oz.class), bundle, "ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER");
        }
        if (bundle != null && this.I1 == null) {
            this.I1 = new HashMap();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("ru.ok.tamtam.extra.VIDEO_FORMATS");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
            if (parcelableArrayList != null && parcelableArrayList2 != null) {
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    this.I1.put((mze) parcelableArrayList.get(i), ((qqb) parcelableArrayList2.get(i)).a);
                }
            }
        }
        if (!this.E1) {
            k46 k46Var = new k46(this, 0);
            WeakHashMap weakHashMap = zmf.a;
            omf.u(view3, k46Var);
            view3.post(new mg(view3, 4));
        }
        J1();
        return view3;
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView
    public final void x1(boolean z) {
        lj9 lj9Var = this.N1;
        if (lj9Var == null) {
            return;
        }
        if (!z) {
            lj9Var.l2();
        } else if (lj9Var.b()) {
            this.N1.j2();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void y0() {
        super.y0();
        jg5 jg5Var = this.R1;
        if (jg5Var != null) {
            jg5Var.d = null;
            ((jyc) jg5Var.b).e().f(jg5Var);
            cqc.b(jg5Var.n);
            cqc.b(jg5Var.o);
        }
        G1();
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView
    public final void y1(boolean z) {
    }
}
