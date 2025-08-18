package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.e2b;
import defpackage.j47;
import defpackage.la6;
import defpackage.oag;
import defpackage.r20;
import defpackage.rq7;
import defpackage.s36;
import defpackage.tu0;
import defpackage.up7;
import defpackage.wv6;
import defpackage.xx5;
import defpackage.xxb;
import defpackage.yyb;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgLocalGif extends FrgLocalMedia implements rq7 {
    public SimpleDraweeView I1;

    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.o1) {
            return true;
        }
        e1();
        return true;
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        this.E1.b();
    }

    @Override // defpackage.qq7
    public final void N(up7 up7Var, Uri uri, int i, Uri uri2) {
        e2b e2bVar = s36.a.get();
        e2bVar.c(j47.N(uri.toString()));
        e2bVar.l = this.I1.getController();
        e2bVar.j = true;
        if (!oag.t(up7Var.o)) {
            e2bVar.f = wv6.a(j47.N(up7Var.o));
        }
        this.I1.setController(e2bVar.a());
    }

    @Override // defpackage.rq7
    public final void b() {
        if (r1() != null) {
            r1().e();
        }
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_local_gif, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(xxb.frg_local_gif__drawee);
        this.I1 = simpleDraweeView;
        ((la6) simpleDraweeView.getHierarchy()).i(new r20(d0(), -1), 3);
        tu0.K(this.I1, 300L, new xx5(2, this));
        SimpleDraweeView simpleDraweeView2 = this.I1;
        if (this.D1) {
            simpleDraweeView2.setTransitionName(this.C1.a());
        }
        return slideOutLayout;
    }
}
