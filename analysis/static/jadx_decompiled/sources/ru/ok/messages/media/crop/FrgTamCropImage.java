package ru.ok.messages.media.crop;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import defpackage.a14;
import defpackage.c56;
import defpackage.ed3;
import defpackage.hm9;
import defpackage.jpc;
import defpackage.nd7;
import defpackage.nz3;
import defpackage.q5;
import defpackage.qqd;
import defpackage.sme;
import defpackage.wa6;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.zn0;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public class FrgTamCropImage extends FrgBase {
    public ImageCropView B1;
    public ImageButton C1;
    public ImageButton D1;
    public ImageButton E1;
    public ImageButton F1;
    public TextView G1;

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putParcelable("ru.ok.tamtam.extra.CROP_STATE", this.B1.getCropState());
    }

    @Override // androidx.fragment.app.a
    public final void O0(View view, Bundle bundle) {
        ImageCropView imageCropView = (ImageCropView) view.findViewById(xxb.frg_tam_crop_image__iv_crop);
        this.B1 = imageCropView;
        int i = 1;
        imageCropView.setFreestyleCropMode(1);
        int i2 = 0;
        this.B1.setRotateEnabled(false);
        this.B1.setMaxScaleMultiplier(4.0f);
        ImageCropView imageCropView2 = this.B1;
        ((y8a) ((ed3) this.p1.b)).n().b.getClass();
        imageCropView2.setMinImageSize((int) r3.q(PmsKey.f83minimagesidesize, 64));
        this.C1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__rotate);
        this.D1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__flip);
        this.G1 = (TextView) view.findViewById(xxb.frg_tam_crop_image__btn_clear);
        this.E1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__btn_done);
        this.F1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__btn_close);
        Uri uri = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.SOURCE_URI");
        Uri uri2 = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
        hm9.m("ru.ok.messages.media.crop.FrgTamCropImage", "onViewCreated:\nsourceUri: %s\nresultUri: %s", uri.toString(), uri2.toString());
        nz3 nz3Var = bundle != null ? (nz3) bundle.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : this.Z.containsKey("ru.ok.tamtam.extra.CROP_STATE") ? (nz3) this.Z.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : null;
        try {
            wa6 wa6Var = this.B1.a;
            int maxBitmapSize = wa6Var.getMaxBitmapSize();
            new zn0(wa6Var.getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new qqd(28, wa6Var)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            wa6Var.H0 = nz3Var;
        } catch (Exception e) {
            hm9.p("ru.ok.messages.media.crop.FrgTamCropImage", "fail to setImageUri", e);
            q5 q5VarG1 = g1();
            if (q5VarG1 != null) {
                q5VarG1.setResult(0);
                int i3 = jpc.E;
                Handler handler = a14.i;
                a14.N(0, q5VarG1, q5VarG1.getString(i3));
                e1();
            }
        }
        nd7.h(this.C1, new c56(this, i2));
        nd7.h(this.D1, new c56(this, i));
        nd7.h(this.G1, new c56(this, 2));
        nd7.h(this.F1, new c56(this, 3));
        nd7.h(this.E1, new c56(this, 4));
        this.C1.setBackground(this.r1.a());
        this.D1.setBackground(this.r1.a());
        this.G1.setBackground(hm9.L(0, this.r1.i));
        this.E1.setBackground(this.r1.a());
        this.F1.setBackground(this.r1.a());
        this.C1.setColorFilter(this.r1.w);
        this.D1.setColorFilter(this.r1.w);
        this.E1.setColorFilter(this.r1.k);
        this.F1.setColorFilter(this.r1.w);
        TextView textView = this.G1;
        sme smeVar = this.r1;
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{smeVar.M, smeVar.w}));
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return "CROP_IMAGE";
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(yyb.frg_tam_crop_image, viewGroup, false);
    }
}
