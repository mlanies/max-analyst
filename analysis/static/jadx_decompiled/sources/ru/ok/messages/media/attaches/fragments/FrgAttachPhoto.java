package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException;
import defpackage.ai3;
import defpackage.au8;
import defpackage.azb;
import defpackage.bq7;
import defpackage.cqc;
import defpackage.cu8;
import defpackage.d20;
import defpackage.die;
import defpackage.e52;
import defpackage.ed3;
import defpackage.ema;
import defpackage.es8;
import defpackage.fl9;
import defpackage.fn4;
import defpackage.g46;
import defpackage.ge2;
import defpackage.h46;
import defpackage.hm9;
import defpackage.ik9;
import defpackage.jpc;
import defpackage.k8g;
import defpackage.kk5;
import defpackage.kk9;
import defpackage.l01;
import defpackage.l20;
import defpackage.l6f;
import defpackage.lz7;
import defpackage.nd7;
import defpackage.ngg;
import defpackage.one;
import defpackage.oz;
import defpackage.pl9;
import defpackage.pne;
import defpackage.q5;
import defpackage.qj9;
import defpackage.r00;
import defpackage.rf5;
import defpackage.s5c;
import defpackage.sd7;
import defpackage.uae;
import defpackage.vi4;
import defpackage.vl;
import defpackage.wc6;
import defpackage.we8;
import defpackage.x10;
import defpackage.xe8;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.z16;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.views.dialogs.ProgressDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgAttachPhoto extends FrgAttachView implements r00, ik9 {
    public FrameLayout I1;
    public AttachPhotoView J1;
    public qj9 K1;
    public int L1 = 0;
    public die M1;
    public int N1;

    public final void D1(int i) {
        ProgressDialog progressDialogQ1 = q1();
        if (progressDialogQ1 == null) {
            return;
        }
        progressDialogQ1.F1 = new z16(2, this);
        die dieVarA = ((oz) ((y8a) vl.b()).getAccessor().c(oz.class)).a(this.D1);
        this.M1 = dieVarA;
        this.N1 = i;
        dieVarA.T(new g46(this, i, 0), new g46(this, i, 1));
    }

    public final void E1(boolean z) {
        if (!z) {
            if (r1() != null) {
                ((ActAttachesView) r1()).e();
            }
        } else {
            au8 au8VarL = ((y8a) ((ed3) this.p1.b)).l();
            cu8 cu8Var = this.C1.a;
            l20 l20Var = this.D1;
            au8VarL.getClass();
            au8VarL.t(cu8Var, l20Var.r, new l01());
        }
    }

    public final void F1(boolean z) {
        File fileK;
        if (this.D1.f()) {
            l20 l20Var = this.D1;
            if (l20Var.b.X && !s5c.U(l20Var, this.C1)) {
                if (TextUtils.isEmpty(this.D1.b.u0)) {
                    fileK = null;
                } else {
                    fileK = ((kk5) this.q1.j()).n(this.D1.b.u0);
                }
                if (fileK == null || !fileK.exists()) {
                    fileK = ((kk5) this.q1.j()).k(this.D1.b.s0);
                }
                if (this.D1.o.c() && fileK.exists()) {
                    hm9.n("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif exists start play");
                    G1();
                    return;
                }
                if ((!z && !((ge2) this.q1.getAccessor().c(ge2.class)).b(true)) || this.D1.o.d()) {
                    hm9.n("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists, do nothing, autoload disabled or loading in progress");
                    return;
                }
                hm9.n("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists start download");
                this.q1.n().u(this.C1.a, this.D1.r, d20.X);
                l20 l20Var2 = this.D1;
                rf5 rf5Var = (rf5) this.q1.getAccessor().c(rf5.class);
                long j = this.C1.a.b;
                one oneVar = new one();
                oneVar.a = j;
                oneVar.b = l20Var2.r;
                x10 x10Var = l20Var2.b;
                oneVar.e = x10Var.s0;
                oneVar.g = x10Var.t0;
                oneVar.h = true;
                rf5Var.a(new pne(oneVar));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // androidx.fragment.app.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G0(android.view.MenuItem r6) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.G0(android.view.MenuItem):boolean");
    }

    public final void G1() {
        hm9.n("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "playGif");
        q5 q5VarG1 = g1();
        if (q5VarG1 == null) {
            return;
        }
        qj9 qj9Var = this.K1;
        if (qj9Var != null) {
            qj9Var.l1(false);
            this.K1 = null;
        }
        we8 we8VarI = ((xe8) b0()).i();
        fl9 fl9Var = new fl9(q5VarG1, null);
        this.K1 = new qj9(fl9Var, we8VarI, ((y8a) ((ed3) this.p1.b)).h(), this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.I1.addView((View) fl9Var.c, layoutParams);
        qj9 qj9Var2 = this.K1;
        wc6 wc6Var = new wc6(qj9Var2.o, this.D1);
        qj9Var2.Y = wc6Var;
        ((bq7) qj9Var2.c).s(wc6Var, qj9Var2);
        ((pl9) ((kk9) qj9Var2.b)).b(qj9Var2);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void H0() {
        super.H0();
        die dieVar = this.M1;
        if (dieVar != null) {
            cqc.b((sd7) dieVar.o);
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        int i = this.N1;
        die dieVar = this.M1;
        if (dieVar == null) {
            return;
        }
        this.N1 = i;
        dieVar.T(new g46(this, i, 0), new g46(this, i, 1));
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        String str;
        super.L0(bundle);
        bundle.putInt("ru.ok.tamtam.extra.GIF_ERRORS_COUNT", this.L1);
        die dieVar = this.M1;
        if (dieVar != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER", (ArrayList) dieVar.c);
        }
        int i = this.N1;
        if (i != 0) {
            if (i == 1) {
                str = "SET_AS_BG";
            } else if (i == 2) {
                str = "SHARE";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "OPEN";
            }
            bundle.putString("ru.ok.tamtam.extra.DOWNLOAD_ACTION", str);
        }
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView, ru.ok.messages.views.fragments.FrgSlideOut, defpackage.tsd
    public final void M(int i) {
        this.J1.setWrapContentMeasure(true);
        super.M(i);
    }

    @Override // defpackage.ik9
    public final void T() {
        E1(false);
    }

    @Override // defpackage.ik9
    public final void X() {
    }

    @Override // defpackage.ik9
    public final void Y(Throwable th) {
        if (th.getCause() == null || !(th.getCause() instanceof FileDataSource$FileDataSourceException)) {
            return;
        }
        int i = this.L1 + 1;
        this.L1 = i;
        View view = this.U0;
        if (view == null) {
            return;
        }
        if (i > 2) {
            final int i2 = 0;
            view.post(new Runnable(this) { // from class: i46
                public final /* synthetic */ FrgAttachPhoto b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FrgAttachPhoto frgAttachPhoto = this.b;
                    switch (i2) {
                        case 0:
                            Context contextD0 = frgAttachPhoto.d0();
                            if (contextD0 != null) {
                                int i3 = jpc.E;
                                Handler handler = a14.i;
                                a14.N(0, contextD0, contextD0.getString(i3));
                                break;
                            }
                            break;
                        default:
                            frgAttachPhoto.F1(false);
                            break;
                    }
                }
            });
            return;
        }
        File fileK = ((kk5) this.q1.j()).k(this.D1.b.s0);
        File fileN = ((kk5) this.q1.j()).n(this.D1.b.u0);
        if (fileK.delete() || fileN.delete()) {
            final int i3 = 1;
            view.post(new Runnable(this) { // from class: i46
                public final /* synthetic */ FrgAttachPhoto b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FrgAttachPhoto frgAttachPhoto = this.b;
                    switch (i3) {
                        case 0:
                            Context contextD0 = frgAttachPhoto.d0();
                            if (contextD0 != null) {
                                int i32 = jpc.E;
                                Handler handler = a14.i;
                                a14.N(0, contextD0, contextD0.getString(i32));
                                break;
                            }
                            break;
                        default:
                            frgAttachPhoto.F1(false);
                            break;
                    }
                }
            });
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void l1(int i, int i2, Intent intent) {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean n1() {
        this.J1.getZoomableController().reset();
        this.J1.setWrapContentMeasure(true);
        return false;
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        this.J1.getZoomableController().reset();
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        if (this.o1 && this.W0 && this.D1.f() && TextUtils.equals(this.D1.b.t0, fn4Var.b)) {
            G1();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        z1();
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView, androidx.fragment.app.a
    public final void w0(Menu menu, MenuInflater menuInflater) {
        if (this.C1.a.s() || this.Z.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            return;
        }
        menu.clear();
        menuInflater.inflate(azb.menu_attach_photo, menu);
        ngg.g(this.r1, menu, null);
        boolean zY = this.C1.a.y();
        boolean zC = this.C1.a.C();
        boolean z = this.D1.f() && this.D1.b.X;
        e52 e52VarT1 = t1();
        ai3 ai3VarV1 = v1();
        if (ai3VarV1 != null) {
            MenuItem menuItemE = ai3VarV1.e(xxb.menu_attachments__open_in);
            if (menuItemE != null && !zY) {
                menuItemE.setVisible(false);
            }
            MenuItem menuItemE2 = ai3VarV1.e(xxb.menu_attachments__save_to_gallery);
            if (menuItemE2 != null && zY) {
                menuItemE2.setVisible(false);
            }
            MenuItem menuItemE3 = ai3VarV1.e(xxb.menu_attachments__open_all_media);
            if (menuItemE3 != null && (zC || zY || e52VarT1 == null)) {
                menuItemE3.setVisible(false);
            }
            MenuItem menuItemE4 = ai3VarV1.e(xxb.menu_attachments__go_to_message);
            if (menuItemE4 != null) {
                menuItemE4.setVisible(e52VarT1 != null);
            }
            MenuItem menuItemE5 = ai3VarV1.e(xxb.menu_attachments__rotate_screen);
            if (menuItemE5 != null) {
                Context contextD0 = d0();
                if (contextD0 != null) {
                    Settings.System.getInt(contextD0.getContentResolver(), "accelerometer_rotation", 0);
                }
                menuItemE5.setVisible(false);
            }
            MenuItem menuItemE6 = ai3VarV1.e(xxb.menu_attachments__send_photo);
            if (z) {
                menuItemE6.setTitle(jpc.B2);
            } else {
                menuItemE6.setTitle(jpc.L2);
            }
        }
        super.w0(menu, menuInflater);
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        k8g k8gVar;
        View viewInflate = layoutInflater.inflate(yyb.frg_photo_view, viewGroup, false);
        this.I1 = (FrameLayout) viewInflate.findViewById(xxb.frg_photo_view__fl_photo);
        this.J1 = (AttachPhotoView) viewInflate.findViewById(xxb.frg_photo_view__iv_photo);
        boolean z = this.E1 && (k8gVar = this.C1.a.z0) != null && (k8gVar.i() > 1 || lz7.q(vl.o) == vi4.c);
        AttachPhotoView attachPhotoView = this.J1;
        e52 e52VarT1 = t1();
        l20 l20Var = this.D1;
        es8 es8Var = this.C1;
        attachPhotoView.N0 = this.G1;
        attachPhotoView.O0 = z;
        attachPhotoView.R0 = e52VarT1;
        attachPhotoView.r(l20Var, es8Var);
        this.J1.setListener(this);
        this.J1.setZoomEnabled(true);
        A1((SlideOutLayout) viewInflate, this.J1);
        if (this.E1) {
            this.J1.setWrapContentMeasure(true);
        }
        if (bundle != null) {
            this.L1 = bundle.getInt("ru.ok.tamtam.extra.GIF_ERRORS_COUNT", 0);
            this.M1 = ema.B((oz) ((y8a) vl.b()).getAccessor().c(oz.class), bundle, "ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER");
            if (bundle.containsKey("ru.ok.tamtam.extra.DOWNLOAD_ACTION")) {
                String string = bundle.getString("ru.ok.tamtam.extra.DOWNLOAD_ACTION");
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("SET_AS_BG")) {
                    i = 1;
                } else if (string.equals("SHARE")) {
                    i = 2;
                } else {
                    if (!string.equals("OPEN")) {
                        throw new IllegalArgumentException("No enum constant ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.DownloadAction.".concat(string));
                    }
                    i = 3;
                }
                this.N1 = i;
            }
        }
        nd7.h(viewInflate, new h46(this, 1));
        return viewInflate;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void y0() {
        super.y0();
        qj9 qj9Var = this.K1;
        if (qj9Var == null) {
            return;
        }
        qj9Var.l1(false);
        this.K1 = null;
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView
    public final void y1(boolean z) {
        if (this.E1) {
            return;
        }
        hm9.k("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "setUserVisibleHintExtended: " + z);
        if (z) {
            F1(false);
        }
    }

    @uae
    public void onEvent(l6f l6fVar) {
        if (this.o1 && l6fVar.c == this.C1.a.b) {
            w1(l6fVar, new h46(this, 0));
        }
    }
}
