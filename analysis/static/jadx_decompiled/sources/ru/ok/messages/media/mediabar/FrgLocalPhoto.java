package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import defpackage.ai3;
import defpackage.awa;
import defpackage.azb;
import defpackage.bwa;
import defpackage.doa;
import defpackage.e2b;
import defpackage.ed3;
import defpackage.im;
import defpackage.j47;
import defpackage.jpc;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.oag;
import defpackage.p4d;
import defpackage.q5;
import defpackage.qg3;
import defpackage.r4d;
import defpackage.rq7;
import defpackage.s36;
import defpackage.s3a;
import defpackage.uj9;
import defpackage.up7;
import defpackage.xv6;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.zj9;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgLocalPhoto extends FrgLocalMedia implements rq7, qg3 {
    public LocalPhotoView I1;

    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            n1();
            q5 q5VarG1 = g1();
            if (q5VarG1 == null || !this.o1) {
                return true;
            }
            q5VarG1.onBackPressed();
            return true;
        }
        if (menuItem.getItemId() != xxb.menu_local_photo__clear_edit) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.k2);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.n2);
        bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.r);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.X0(bundle);
        confirmationDialog.b1(0, this);
        confirmationDialog.k1(this.F0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
        return true;
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        this.E1.b();
    }

    @Override // defpackage.qq7
    public final void N(up7 up7Var, Uri uri, int i, Uri uri2) {
        xv6 xv6VarD = xv6.d(j47.N(uri.toString()));
        if (uri2 != null) {
            xv6VarD.l = new doa(uri2);
        }
        e2b e2bVar = s36.a.get();
        e2bVar.e = xv6VarD.a();
        e2bVar.l = this.I1.getController();
        p4d p4dVar = ((y8a) ((ed3) this.p1.b)).j().f;
        if (!oag.t(up7Var.o) && !awa.b(p4dVar.e(up7Var), up7Var)) {
            xv6 xv6VarD2 = xv6.d(j47.N(up7Var.o));
            int i2 = up7Var.X;
            if (i2 != 0) {
                xv6VarD2.l = new bwa(i2, 0);
            }
            e2bVar.f = xv6VarD2.a();
        }
        this.I1.setController(e2bVar.a());
        u1();
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.tsd
    public final void O() {
        super.O();
        this.I1.getZoomableController().reset();
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, androidx.fragment.app.a
    public final void O0(View view, Bundle bundle) {
        super.O0(view, bundle);
        this.E1.b();
    }

    @Override // defpackage.qg3
    public final void R(Bundle bundle) {
        b bVarB0 = b0();
        if (bVarB0 instanceof ActLocalMedias) {
            zj9 zj9Var = ((ActLocalMedias) bVarB0).i1;
            zj9Var.getClass();
            zj9Var.u0 = new awa(null, null, null, null, null);
            zj9Var.b2();
            zj9Var.d2(new uj9(zj9Var, 4));
            zj9Var.d2(new uj9(zj9Var, 0));
        }
    }

    @Override // defpackage.rq7
    public final void b() {
        if (r1() != null) {
            r1().e();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean n1() {
        this.I1.getZoomableController().reset();
        return false;
    }

    public final void u1() {
        MenuItem menuItemE;
        s3a s3aVarB0 = b0();
        ai3 ai3VarA = s3aVarB0 instanceof nwe ? ((nwe) s3aVarB0).a() : null;
        if (ai3VarA == null || (menuItemE = ai3VarA.e(xxb.menu_local_photo__clear_edit)) == null) {
            return;
        }
        r4d r4dVarH = ((y8a) ((ed3) this.p1.b)).j().f.h(this.C1);
        if (r4dVarH != null) {
            menuItemE.setVisible(awa.b(r4dVarH.c, r4dVarH.a));
        } else {
            menuItemE.setVisible(false);
        }
        b bVarB0 = b0();
        if (bVarB0 instanceof im) {
            bVarB0.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.a
    public final void w0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(azb.menu_local_photo, menu);
        ngg.g(this.r1, menu, null);
        u1();
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_local_photo, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.r1.m);
        LocalPhotoView localPhotoView = (LocalPhotoView) slideOutLayout.findViewById(xxb.frg_local_photo__iv_photo);
        this.I1 = localPhotoView;
        localPhotoView.setListener(this);
        this.I1.setZoomEnabled(true);
        LocalPhotoView localPhotoView2 = this.I1;
        if (this.D1) {
            localPhotoView2.setTransitionName(this.C1.a());
        }
        return slideOutLayout;
    }
}
