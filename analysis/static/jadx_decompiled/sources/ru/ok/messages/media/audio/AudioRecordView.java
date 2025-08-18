package ru.ok.messages.media.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.c54;
import defpackage.du4;
import defpackage.e5;
import defpackage.fka;
import defpackage.hm9;
import defpackage.i4f;
import defpackage.i9g;
import defpackage.jtb;
import defpackage.khe;
import defpackage.kqe;
import defpackage.kre;
import defpackage.nd7;
import defpackage.ngg;
import defpackage.ote;
import defpackage.p60;
import defpackage.qp4;
import defpackage.sme;
import defpackage.vl;
import defpackage.x3;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;

/* loaded from: classes2.dex */
public class AudioRecordView extends ConstraintLayout implements kre {
    public static final /* synthetic */ int O0 = 0;
    public final TextView G0;
    public final TextView H0;
    public final TextView I0;
    public final ImageView J0;
    public final View K0;
    public final View L0;
    public final ImageView M0;
    public final View N0;

    public AudioRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c54.c(this);
        c54.K(this);
        getContext();
        ((y8a) vl.b()).c();
        LayoutInflater.from(getContext()).inflate(yyb.view_audio_record, (ViewGroup) this, true);
        this.G0 = (TextView) findViewById(xxb.view_audio_record__tv_duration);
        this.H0 = (TextView) findViewById(xxb.view_audio_record__tv_swipe_cancel);
        this.J0 = (ImageView) findViewById(xxb.frg_chat__iv_icon);
        TextView textView = (TextView) findViewById(xxb.view_audio_record__tv_click_cancel);
        this.I0 = textView;
        findViewById(xxb.view_audio_record__duration_panel);
        View viewFindViewById = findViewById(xxb.view_audio_record__static_circle);
        this.K0 = viewFindViewById;
        this.L0 = findViewById(xxb.view_audio_record__audio_circle);
        View viewFindViewById2 = findViewById(xxb.view_audio_record__slide_panel);
        ImageView imageView = (ImageView) findViewById(xxb.view_audio_record__im_arrow);
        this.M0 = imageView;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        this.N0 = findViewById(xxb.view_audio_record__root_panel);
        nd7.h(viewFindViewById2, new e5(1, this));
        nd7.h(viewFindViewById, new e5(1, this));
        nd7.h(textView, new e5(1, this));
        onThemeChanged(qp4.u0.j(this));
    }

    private int getStaticCircleSize() {
        int width = this.K0.getWidth();
        return width == 0 ? getResources().getDimensionPixelSize(jtb.audio_record_static_circle_size) : width;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        i9g i9gVarH = qp4.u0.j(this).a().h();
        kqe kqeVar = i4f.l;
        TextView textView = this.G0;
        kqeVar.b(textView, du4.b);
        textView.setTextColor(fkaVar.getText().e);
        this.J0.setColorFilter(fkaVar.getIcon().b);
        this.K0.setBackground(hm9.S(Integer.valueOf(fkaVar.f().c), null, null));
        x3 x3VarF = fkaVar.f();
        khe kheVar = sme.a0;
        this.L0.setBackground(hm9.S(Integer.valueOf(ote.b0(x3VarF.c, 0.2f)), null, null));
        ngg.G(this.M0.getDrawable(), fkaVar.getText().g);
        kqe kqeVar2 = i4f.p;
        TextView textView2 = this.H0;
        kqeVar2.b(textView2, du4.b);
        textView2.setTextColor(fkaVar.getText().g);
        TextView textView3 = this.I0;
        kqeVar2.b(textView3, du4.b);
        textView3.setTextColor(fkaVar.getText().b);
        this.N0.setBackgroundColor(i9gVarH.a.d);
    }

    public void setListener(p60 p60Var) {
    }
}
