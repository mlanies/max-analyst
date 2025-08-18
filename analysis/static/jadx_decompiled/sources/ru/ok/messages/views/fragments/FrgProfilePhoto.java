package ru.ok.messages.views.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.a14;
import defpackage.a56;
import defpackage.ai3;
import defpackage.av6;
import defpackage.azb;
import defpackage.cu8;
import defpackage.du8;
import defpackage.e2b;
import defpackage.e6;
import defpackage.ed3;
import defpackage.fn4;
import defpackage.gpc;
import defpackage.hm9;
import defpackage.hn4;
import defpackage.hv6;
import defpackage.ig5;
import defpackage.iq1;
import defpackage.iv6;
import defpackage.jle;
import defpackage.jpc;
import defpackage.jyc;
import defpackage.k4a;
import defpackage.l6f;
import defpackage.ma6;
import defpackage.mzd;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.oi0;
import defpackage.p7b;
import defpackage.q00;
import defpackage.q46;
import defpackage.r20;
import defpackage.r46;
import defpackage.rz6;
import defpackage.s36;
import defpackage.s3a;
import defpackage.ssc;
import defpackage.tp7;
import defpackage.tu0;
import defpackage.uae;
import defpackage.wv6;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgProfilePhoto extends FrgSlideOut {
    public ImageView C1;
    public ZoomableDraweeView D1;
    public e6 E1;
    public cu8 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public long J1;

    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (g1() == null) {
                return true;
            }
            b0().finish();
            return true;
        }
        if (itemId == xxb.menu_avatar_view__save_to_gallery) {
            if (g1() == null) {
                return true;
            }
            SaveToGalleryDialog.n1(this.E1.a, false).k1(this.F0, "ru.ok.messages.views.dialogs.SaveToGalleryDialog");
            return true;
        }
        if (itemId != xxb.menu_avatar_view__share || g1() == null) {
            return true;
        }
        long jO = ((p7b) ((k4a) this.q1.c()).y()).a.o();
        this.I1 = jO;
        String str = this.E1.a;
        ((av6) ((y8a) ((ed3) this.p1.b)).getAccessor().c(av6.class)).a(str, new r46(jO, str, new WeakReference(this), 1));
        return true;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID", this.I1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.J1);
        if (this.H1) {
            bundle.putParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER", this.E1);
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return "AVATAR_PHOTO";
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void l1(int i, int i2, Intent intent) {
    }

    @SuppressLint({"CheckResult"})
    @uae
    public void onEvent(l6f l6fVar) {
        cu8 cu8Var = this.F1;
        if (cu8Var != null) {
            long j = l6fVar.c;
            if (j == cu8Var.b) {
                if (!this.o1) {
                    tu0.A(this.s1, l6fVar, true);
                    return;
                }
                ((y8a) ((ed3) this.p1.b)).getClass();
                tp7 tp7VarM = jyc.a.m();
                tp7VarM.getClass();
                tp7.b(tp7VarM, j, true, 2).i(((jle) ((y8a) ((ed3) this.p1.b)).q()).b()).m(((jle) ((y8a) ((ed3) this.p1.b)).q()).a()).k(new iq1(new a56(this), 2, new ig5(18)));
            }
        }
    }

    public final void s1() {
        this.C1.setVisibility(4);
        s3a s3aVarB0 = b0();
        ai3 ai3VarA = s3aVarB0 instanceof nwe ? ((nwe) s3aVarB0).a() : null;
        if (ai3VarA != null) {
            ai3VarA.g(this.E1.c);
        }
        this.D1.setVisibility(0);
        this.D1.setListener(new a56(this));
        e2b e2bVar = s36.a.get();
        List<String> list = this.E1.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                iv6 iv6VarO = s36.o();
                wv6 wv6VarB = wv6.b(str);
                iv6VarO.getClass();
                arrayList.add(new hv6(iv6VarO, wv6VarB, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        e2bVar.g = new rz6(arrayList, true);
        e2bVar.i = true;
        e2bVar.l = this.D1.getController();
        this.D1.setController(e2bVar.a());
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle != null) {
            this.G1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG");
            e6 e6Var = (e6) bundle.getParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER");
            this.E1 = e6Var;
            if (e6Var != null) {
                this.H1 = true;
            }
            this.I1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID");
            this.J1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
        }
        if (!this.H1) {
            this.E1 = (e6) this.Z.getParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER");
        }
        du8 du8Var = (du8) this.Z.getParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC");
        if (du8Var != null) {
            this.F1 = du8Var.a;
        }
    }

    @Override // androidx.fragment.app.a
    public final void w0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(azb.menu_avatar_view, menu);
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_profile_photo, viewGroup, false);
        ImageView imageView = (ImageView) slideOutLayout.findViewById(xxb.frg_profile_photo__progress);
        this.C1 = imageView;
        imageView.setImageDrawable(new r20(d0(), 0));
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) slideOutLayout.findViewById(xxb.frg_profile_photo__iv_photo);
        this.D1 = zoomableDraweeView;
        ma6 ma6Var = new ma6(g0());
        ma6Var.l = ssc.o;
        ma6Var.j = new r20(d0(), 0);
        Context contextD0 = d0();
        int i = gpc.w;
        ma6Var.f = ngg.u(i, -1, contextD0);
        ma6Var.h = ngg.u(i, -1, d0());
        ma6Var.b = 0;
        zoomableDraweeView.setHierarchy(ma6Var.a());
        this.D1.setZoomEnabled(true);
        this.D1.setOnTouchListener(new q46(new GestureDetector(d0(), new q00(10, this)), 1));
        s1();
        slideOutLayout.setSlideOutListener(this);
        Y0(true);
        return slideOutLayout;
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        if (this.G1 == oi0Var.a) {
            if (this.o1) {
                this.C1.setVisibility(4);
                this.D1.setVisibility(0);
                this.D1.setZoomEnabled(false);
                a14.N(1, b0(), h0(jpc.G));
                return;
            }
            tu0.A(this.s1, oi0Var, true);
        }
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        long j = this.I1;
        long j2 = fn4Var.a;
        HashSet hashSet = this.s1;
        String str = fn4Var.c;
        if (j == j2) {
            if (this.o1) {
                j1();
                hm9.d0(b0(), new File(str), ((y8a) ((ed3) this.p1.b)).h());
                return;
            } else {
                tu0.A(hashSet, fn4Var, true);
                return;
            }
        }
        if (this.J1 != j2 || TextUtils.isEmpty(str)) {
            return;
        }
        if (this.o1) {
            j1();
            new mzd(((y8a) ((ed3) this.p1.b)).h(), ((y8a) ((ed3) this.p1.b)).f(), ((y8a) ((ed3) this.p1.b)).n().b).a(this, str);
        } else {
            tu0.A(hashSet, fn4Var, true);
        }
    }

    @uae
    public void onEvent(hn4 hn4Var) {
        long j = this.I1;
        long j2 = hn4Var.a;
        HashSet hashSet = this.s1;
        if (j == j2) {
            if (this.o1) {
                j1();
                a14.N(0, d0(), h0(jpc.W2));
                return;
            } else {
                tu0.A(hashSet, hn4Var, true);
                return;
            }
        }
        if (this.J1 == j2) {
            if (this.o1) {
                j1();
                a14.K(d0(), jpc.P2);
            } else {
                tu0.A(hashSet, hn4Var, false);
            }
        }
    }
}
