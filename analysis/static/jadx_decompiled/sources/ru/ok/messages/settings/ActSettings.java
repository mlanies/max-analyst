package ru.ok.messages.settings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import defpackage.ai3;
import defpackage.c5;
import defpackage.go9;
import defpackage.gpc;
import defpackage.he0;
import defpackage.jgd;
import defpackage.n16;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.q5;
import defpackage.sme;
import defpackage.tsd;
import defpackage.v16;
import defpackage.wg0;
import defpackage.xxb;
import defpackage.y7g;
import defpackage.yyb;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class ActSettings extends q5 implements jgd, nwe, tsd {
    public static final /* synthetic */ int V0 = 0;
    public ai3 U0;

    @Override // defpackage.tsd
    public final boolean D() {
        return true;
    }

    @Override // defpackage.tsd
    public final void M(int i) {
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // defpackage.tsd
    public final void O() {
    }

    @Override // defpackage.q5
    public final String Z() {
        return null;
    }

    @Override // defpackage.nwe
    public final ai3 a() {
        return this.U0;
    }

    @Override // defpackage.q5
    public final void a0() {
        f0(this.N0.L);
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a frgCachingSettings;
        super.onCreate(bundle);
        setContentView(yyb.act_settings);
        sme smeVar = this.N0;
        f0(smeVar.L);
        go9 go9Var = new go9(new y7g(this), (Toolbar) findViewById(xxb.toolbar));
        go9Var.c = smeVar;
        ai3 ai3Var = new ai3(go9Var);
        this.U0 = ai3Var;
        int i = gpc.k;
        int i2 = ((sme) ai3Var.c).w;
        Toolbar toolbar = (Toolbar) ai3Var.b;
        if (toolbar != null) {
            toolbar.setNavigationIcon(i);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                ngg.G(navigationIcon, i2);
            }
        }
        ai3 ai3Var2 = this.U0;
        c5 c5Var = new c5(4, this);
        Toolbar toolbar2 = (Toolbar) ai3Var2.b;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(c5Var);
        }
        ((SlideOutLayout) findViewById(xxb.act_settings__slideout)).setSlideOutListener(this);
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra("ru.ok.tamtam.extra.SETTING_ID", 0);
            if (intExtra == xxb.setting_media) {
                frgCachingSettings = new FrgMediaSettings();
            } else if (intExtra == xxb.setting_messages) {
                frgCachingSettings = new FrgMessagesSettings();
            } else if (intExtra == xxb.setting_privacy_live_location) {
                frgCachingSettings = new FrgLiveLocationSettings();
            } else {
                if (intExtra != 0 && intExtra != xxb.setting_media_caching) {
                    throw new IllegalArgumentException(wg0.g(intExtra, "Fragment for setting id: ", " not found!"));
                }
                frgCachingSettings = new FrgCachingSettings();
            }
            n16 n16VarS = S();
            n16VarS.getClass();
            he0 he0Var = new he0(n16VarS);
            int i3 = xxb.act_settings__container;
            if (i3 == 0) {
                throw new IllegalArgumentException("Must use non-zero containerViewId");
            }
            he0Var.f(i3, frgCachingSettings, "ru.ok.messages.settings.FrgBaseSettings", 2);
            c cVar = frgCachingSettings.F0;
            if (cVar == null || cVar == he0Var.q) {
                he0Var.b(new v16(8, frgCachingSettings));
                he0Var.d(false);
            } else {
                throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + frgCachingSettings.toString() + " is already attached to a FragmentManager.");
            }
        }
    }

    @Override // defpackage.tsd
    public final void q() {
    }
}
