package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import defpackage.d10;
import defpackage.jpc;
import defpackage.oc;
import defpackage.s08;
import defpackage.xxb;

/* loaded from: classes2.dex */
public class LoadMediaDialog extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        s08 s08Var = new s08(U0());
        oc ocVar = s08Var.a;
        ocVar.n = this;
        int i = T0().getInt("ru.ok.tamtam.extra.SETTING_ID");
        if (i == xxb.setting_media_photo) {
            s08Var.e(h0(jpc.p1));
        } else if (i == xxb.setting_media_video) {
            s08Var.e(h0(jpc.w1));
        } else if (i == xxb.setting_media_gif) {
            s08Var.e(h0(jpc.n1));
        } else if (i == xxb.setting_media_audio) {
            s08Var.e(h0(jpc.X0));
        } else if (i == xxb.setting_media_stickers) {
            s08Var.e(h0(jpc.v1));
        } else if (i == xxb.setting_media_auto_play_video) {
            s08Var.e(h0(jpc.c1));
        }
        CharSequence[] charSequenceArr = {h0(jpc.W0), h0(jpc.o1), i == xxb.setting_media_auto_play_video ? h0(jpc.b1) : h0(jpc.l1)};
        d10 d10Var = new d10(3, this);
        ocVar.p = charSequenceArr;
        ocVar.r = d10Var;
        return s08Var.a();
    }
}
