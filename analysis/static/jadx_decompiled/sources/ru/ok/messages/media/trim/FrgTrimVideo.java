package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bq7;
import defpackage.cqc;
import defpackage.ed3;
import defpackage.hk9;
import defpackage.hm9;
import defpackage.kk9;
import defpackage.nl9;
import defpackage.xe8;
import defpackage.y7g;
import defpackage.y8a;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public class FrgTrimVideo extends FrgBase {
    public MediaMetadataRetriever B1;
    public hk9 C1;
    public Uri D1;

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void H0() {
        super.H0();
        hk9 hk9Var = this.C1;
        if (hk9Var != null) {
            hk9Var.pause();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        hk9 hk9Var = this.C1;
        if (hk9Var != null) {
            bundle.putLong("ru.ok.tamtam.extra.POINTER_POSITION", hk9Var.u0);
            bundle.putLong("ru.ok.tamtam.extra.START_POSITION", hk9Var.s0);
            bundle.putLong("ru.ok.tamtam.extra.END_POSITION", hk9Var.t0);
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return "TRIM_VIDEO";
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean n1() {
        r1();
        return false;
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        hk9 hk9Var = this.C1;
        ((nl9) ((kk9) hk9Var.b)).A(hk9Var.u0, hk9Var.s0, hk9Var.t0, hk9Var.Z);
    }

    public final void r1() {
        MediaMetadataRetriever mediaMetadataRetriever = this.B1;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                hm9.p("ru.ok.messages.media.trim.FrgTrimVideo", "fail to release", th);
            }
            this.B1 = null;
        }
        hk9 hk9Var = this.C1;
        if (hk9Var != null) {
            ((nl9) ((kk9) hk9Var.b)).t0.b();
            bq7 bq7Var = (bq7) hk9Var.Y;
            if (bq7Var.g == hk9Var) {
                bq7Var.u();
                bq7Var.e = null;
                bq7Var.r(null);
                bq7Var.g = null;
            }
            cqc.b(hk9Var.x0);
            hk9Var.x0 = null;
            cqc.b(hk9Var.w0);
            hk9Var.w0 = null;
            this.C1 = null;
        }
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D1 = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.VIDEO_URI");
        ((ActTrimVideo) b0()).g0(null);
        nl9 nl9Var = new nl9(layoutInflater.getContext(), viewGroup, this, new y7g(this), this, ((y8a) ((ed3) this.p1.b)).c());
        hk9 hk9Var = new hk9(nl9Var, this, ((y8a) ((ed3) this.p1.b)).b(), this.D1.toString(), ((xe8) b0()).b(), this.Z.getLong("ru.ok.tamtam.extra.START_POSITION", 0L), this.Z.getLong("ru.ok.tamtam.extra.END_POSITION", 0L), this.Z.getBoolean("ru.ok.tamtam.extra.MUTE"));
        this.C1 = hk9Var;
        if (bundle != null) {
            hk9Var.u0 = bundle.getLong("ru.ok.tamtam.extra.POINTER_POSITION");
            hk9Var.s0 = bundle.getLong("ru.ok.tamtam.extra.START_POSITION");
            long j = bundle.getLong("ru.ok.tamtam.extra.END_POSITION");
            hk9Var.t0 = j;
            nl9Var.A(hk9Var.u0, hk9Var.s0, j, hk9Var.Z);
            hk9Var.c2();
        }
        return (View) nl9Var.c;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void y0() {
        super.y0();
        r1();
    }
}
