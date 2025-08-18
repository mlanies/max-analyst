package ru.ok.messages.media.crop;

import android.net.Uri;
import android.os.Bundle;
import defpackage.cl8;
import defpackage.dy7;
import defpackage.nz3;
import defpackage.q5;
import defpackage.sme;
import defpackage.xxb;
import defpackage.yyb;

/* loaded from: classes2.dex */
public class ActTamCropImage extends q5 {
    public cl8 U0;

    @Override // defpackage.q5
    public final String Z() {
        return null;
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(yyb.act_tam_crop_image);
        f0(this.U0.L);
        findViewById(xxb.act_tam_crop_image__root).setBackgroundColor(u().m);
        if (bundle == null) {
            Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.SOURCE_URI");
            Uri uri2 = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI");
            nz3 nz3Var = (nz3) getIntent().getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE");
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.SOURCE_URI", uri);
            bundle2.putParcelable("ru.ok.tamtam.extra.RESULT_URI", uri2);
            bundle2.putParcelable("ru.ok.tamtam.extra.CROP_STATE", nz3Var);
            bundle2.putBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG", booleanExtra);
            FrgTamCropImage frgTamCropImage = new FrgTamCropImage();
            frgTamCropImage.X0(bundle2);
            dy7.e(S(), xxb.act_tam_crop_image__container, frgTamCropImage, "ru.ok.messages.media.crop.FrgTamCropImage");
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
