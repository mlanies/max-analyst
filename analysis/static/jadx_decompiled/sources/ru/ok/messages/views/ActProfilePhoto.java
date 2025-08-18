package ru.ok.messages.views;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.ai3;
import defpackage.an9;
import defpackage.b56;
import defpackage.c5;
import defpackage.du8;
import defpackage.dy7;
import defpackage.e6;
import defpackage.ed3;
import defpackage.ee4;
import defpackage.epc;
import defpackage.fk4;
import defpackage.gpc;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.r5;
import defpackage.sme;
import defpackage.spa;
import defpackage.tg;
import defpackage.wuc;
import defpackage.xw0;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import java.lang.reflect.InvocationTargetException;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* loaded from: classes2.dex */
public class ActProfilePhoto extends r5 implements b56, nwe {
    public static final /* synthetic */ int Y0 = 0;
    public View V0;
    public ai3 W0;
    public tg X0;

    @Override // defpackage.q5
    public final String Z() {
        return null;
    }

    @Override // defpackage.nwe
    public final ai3 a() {
        return this.W0;
    }

    @Override // defpackage.b56
    public final void c(boolean z, boolean z2, boolean z3) {
        if (z) {
            g0(null);
        } else {
            b0(null);
        }
        this.V0.setVisibility(z ? 0 : 4);
        if (z) {
            this.X0.e((Toolbar) this.W0.b);
        } else {
            this.X0.o((Toolbar) this.W0.b);
        }
    }

    @Override // defpackage.b56
    public final void e() {
        c(((Toolbar) this.W0.b).getVisibility() != 0, true, false);
    }

    @Override // defpackage.b56
    public final boolean f() {
        return ((Toolbar) this.W0.b).getVisibility() == 0;
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        this.X0 = ((y8a) ((ed3) this.K0.b)).c();
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.W0 = j0(yyb.act_profile_photo);
        g0(null);
        int i = epc.b;
        f0(getResources().getColor(i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        ai3 ai3Var = this.W0;
        xw0 xw0Var = new xw0(14);
        Toolbar toolbar = (Toolbar) ai3Var.b;
        if (toolbar != null) {
            toolbar.setOnMenuItemClickListener(xw0Var);
        }
        Toolbar toolbar2 = (Toolbar) this.W0.b;
        if (toolbar2 != null) {
            toolbar2.setBackgroundResource(i);
        }
        ai3 ai3Var2 = this.W0;
        Drawable drawableU = ngg.u(gpc.k, -1, this);
        Toolbar toolbar3 = (Toolbar) ai3Var2.b;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(drawableU);
        }
        ai3 ai3Var3 = this.W0;
        c5 c5Var = new c5(3, this);
        Toolbar toolbar4 = (Toolbar) ai3Var3.b;
        if (toolbar4 != null) {
            toolbar4.setNavigationOnClickListener(c5Var);
        }
        TextView textView = (TextView) this.W0.o;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        this.W0.h();
        Drawable navigationIcon = ((Toolbar) this.W0.b).getNavigationIcon();
        if (navigationIcon != null) {
            ngg.G(navigationIcon, -1);
        }
        ai3 ai3Var4 = this.W0;
        Drawable drawableU2 = ngg.u(gpc.R, -1, this);
        Toolbar toolbar5 = (Toolbar) ai3Var4.b;
        if (toolbar5 != null) {
            toolbar5.setOverflowIcon(drawableU2);
        }
        if (bundle == null) {
            e6 e6Var = (e6) getIntent().getParcelableExtra("ru.ok.tamtam.extra.PHOTO_HOLDER");
            du8 du8Var = (du8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_CONTROL_MESSAGE_DB");
            if (e6Var == null) {
                throw new IllegalArgumentException("PhotoContentHolder must be non null");
            }
            FrgProfilePhoto frgProfilePhoto = new FrgProfilePhoto();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER", e6Var);
            if (du8Var != null) {
                bundle2.putParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC", du8Var);
            }
            frgProfilePhoto.X0(bundle2);
            dy7.e(S(), xxb.act_profile_photo__container, frgProfilePhoto, "ru.ok.messages.views.fragments.FrgProfilePhoto");
        }
        this.V0 = findViewById(xxb.act_profile_photo__vw_top_bg);
        this.V0.getLayoutParams().height = fk4.a(this) * 2;
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        super.onResume();
        an9 an9VarM = ((y8a) ((ed3) this.K0.b)).m();
        wuc wucVar = wuc.AVATAR_VIEWER;
        spa spaVar = spa.f;
        an9VarM.f(wucVar, spa.f);
    }

    @Override // defpackage.q5, defpackage.ase
    public final sme u() {
        return ee4.e0;
    }
}
