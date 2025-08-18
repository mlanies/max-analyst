package ru.ok.messages.media.trim;

import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import defpackage.b;
import defpackage.bq7;
import defpackage.cl8;
import defpackage.dy7;
import defpackage.ed3;
import defpackage.hm9;
import defpackage.nd7;
import defpackage.q5;
import defpackage.s36;
import defpackage.sme;
import defpackage.we8;
import defpackage.x50;
import defpackage.xe8;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.ye8;
import defpackage.yyb;
import defpackage.ze8;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class ActTrimVideo extends q5 implements xe8 {
    public cl8 U0;
    public we8 V0;

    @Override // defpackage.q5
    public final String Z() {
        return null;
    }

    @Override // defpackage.xe8
    public final we8 b() {
        if (this.V0 == null) {
            this.V0 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.c, new x50(true, false, false));
        }
        return this.V0;
    }

    @Override // defpackage.xe8
    public final we8 i() {
        hm9.p("ru.ok.messages.media.trim.ActTrimVideo", "Trim is only for video", null);
        ye8 ye8VarK = ((y8a) ((ed3) this.K0.b)).k();
        ze8 ze8Var = ze8.a;
        ye8VarK.getClass();
        return ye8VarK.n(ze8Var, new x50(false, false, true));
    }

    @Override // defpackage.im, defpackage.yb3, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        nd7.R(new b(6, this), 300L);
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.V0 = b();
        setContentView(yyb.act_trim_video);
        f0(u().L);
        if (bundle != null) {
            bq7 bq7Var = (bq7) this.V0;
            bq7Var.h = bundle.getFloat(bq7Var.b("MediaPlayerController.Volume"));
            bq7Var.i = bundle.getBoolean(bq7Var.b("MediaPlayerController.Looping"));
            bq7Var.j = bundle.getBoolean(bq7Var.b("MediaPlayerController.PlayWhenReady"));
            return;
        }
        Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.VIDEO_URI");
        long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0L);
        long longExtra2 = getIntent().getLongExtra("ru.ok.tamtam.extra.END_POSITION", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.MUTE", false);
        if (longExtra2 == -1) {
            longExtra2 = s36.s(this, uri);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("ru.ok.tamtam.extra.VIDEO_URI", uri);
        bundle2.putLong("ru.ok.tamtam.extra.START_POSITION", longExtra);
        bundle2.putLong("ru.ok.tamtam.extra.END_POSITION", longExtra2);
        bundle2.putBoolean("ru.ok.tamtam.extra.MUTE", booleanExtra);
        FrgTrimVideo frgTrimVideo = new FrgTrimVideo();
        frgTrimVideo.X0(bundle2);
        dy7.e(S(), xxb.act_trim_video__container, frgTrimVideo, "ru.ok.messages.media.trim.FrgTrimVideo");
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.V0 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.V0);
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.V0 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.V0);
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.V0 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.V0);
        }
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        we8 we8Var = this.V0;
        if (we8Var != null) {
            bq7 bq7Var = (bq7) we8Var;
            bundle.putFloat(bq7Var.b("MediaPlayerController.Volume"), bq7Var.h);
            bundle.putBoolean(bq7Var.b("MediaPlayerController.Looping"), bq7Var.i);
            bundle.putBoolean(bq7Var.b("MediaPlayerController.PlayWhenReady"), bq7Var.j);
        }
    }

    @Override // defpackage.q5, defpackage.ase
    public final sme u() {
        if (this.U0 == null) {
            this.U0 = cl8.e0;
        }
        return this.U0;
    }
}
