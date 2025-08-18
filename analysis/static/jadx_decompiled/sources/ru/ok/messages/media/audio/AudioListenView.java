package ru.ok.messages.media.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.du4;
import defpackage.e50;
import defpackage.ee4;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fm9;
import defpackage.gpc;
import defpackage.i4f;
import defpackage.i9g;
import defpackage.je7;
import defpackage.k56;
import defpackage.khe;
import defpackage.kqe;
import defpackage.kre;
import defpackage.m;
import defpackage.ngg;
import defpackage.ote;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.rh4;
import defpackage.s70;
import defpackage.sme;
import defpackage.tu0;
import defpackage.uc3;
import defpackage.xxb;
import defpackage.y20;
import defpackage.yyb;
import defpackage.z20;
import kotlin.Metadata;
import ru.ok.messages.media.audio.AudioListenView;
import ru.ok.messages.views.widgets.audiowave.AudioWaveView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ok/messages/media/audio/AudioListenView;", "Landroid/widget/LinearLayout;", "Lkre;", "Ls70;", "", "isScheduledSend", "Le5f;", "setScheduledSend", "(Z)V", "playing", "setPlayButtonState", "Le50;", "listener", "setListener", "(Le50;)V", "Landroid/graphics/drawable/Drawable;", "u0", "Lje7;", "getPlayDrawable", "()Landroid/graphics/drawable/Drawable;", "playDrawable", "v0", "getPauseDrawable", "pauseDrawable", "Landroid/graphics/drawable/GradientDrawable;", "x0", "getInputBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "inputBackgroundDrawable", "z0", "getArrowDrawable", "arrowDrawable", "Landroid/graphics/drawable/LayerDrawable;", "A0", "getSendIcon", "()Landroid/graphics/drawable/LayerDrawable;", "sendIcon", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class AudioListenView extends LinearLayout implements kre, s70 {
    public static final /* synthetic */ int B0 = 0;

    /* renamed from: A0, reason: from kotlin metadata */
    public final je7 sendIcon;
    public final TextView a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView o;
    public final ProgressBar s0;
    public final GradientDrawable t0;

    /* renamed from: u0, reason: from kotlin metadata */
    public final je7 playDrawable;

    /* renamed from: v0, reason: from kotlin metadata */
    public final je7 pauseDrawable;
    public final LayerDrawable w0;

    /* renamed from: x0, reason: from kotlin metadata */
    public final je7 inputBackgroundDrawable;
    public final GradientDrawable y0;

    /* renamed from: z0, reason: from kotlin metadata */
    public final je7 arrowDrawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioListenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 2;
        final int i2 = 3;
        final int i3 = 0;
        final int i4 = 1;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(100.0f);
        this.t0 = gradientDrawable;
        this.playDrawable = tu0.r(3, new k56(this) { // from class: d50
            public final /* synthetic */ AudioListenView b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                AudioListenView audioListenView = this.b;
                switch (i3) {
                    case 0:
                        int i5 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.I1);
                    case 1:
                        int i6 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.x1);
                    case 2:
                        int i7 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.U0);
                    default:
                        return AudioListenView.c(audioListenView);
                }
            }
        });
        this.pauseDrawable = tu0.r(3, new k56(this) { // from class: d50
            public final /* synthetic */ AudioListenView b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                AudioListenView audioListenView = this.b;
                switch (i4) {
                    case 0:
                        int i5 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.I1);
                    case 1:
                        int i6 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.x1);
                    case 2:
                        int i7 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.U0);
                    default:
                        return AudioListenView.c(audioListenView);
                }
            }
        });
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, getPlayDrawable()});
        float f = 4;
        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        this.w0 = layerDrawable;
        this.inputBackgroundDrawable = tu0.r(3, new m(14));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(100.0f);
        this.y0 = gradientDrawable2;
        this.arrowDrawable = tu0.r(3, new k56(this) { // from class: d50
            public final /* synthetic */ AudioListenView b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                AudioListenView audioListenView = this.b;
                switch (i) {
                    case 0:
                        int i5 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.I1);
                    case 1:
                        int i6 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.x1);
                    case 2:
                        int i7 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.U0);
                    default:
                        return AudioListenView.c(audioListenView);
                }
            }
        });
        this.sendIcon = tu0.r(3, new k56(this) { // from class: d50
            public final /* synthetic */ AudioListenView b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                AudioListenView audioListenView = this.b;
                switch (i2) {
                    case 0:
                        int i5 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.I1);
                    case 1:
                        int i6 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.x1);
                    case 2:
                        int i7 = AudioListenView.B0;
                        return kt3.b(audioListenView.getContext(), woc.U0);
                    default:
                        return AudioListenView.c(audioListenView);
                }
            }
        });
        View.inflate(context, yyb.view_audio_listen, this);
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        setPadding(iG, iG, iG, iG);
        setOrientation(0);
        setMinimumHeight(tu0.G(36 * fk4.d().getDisplayMetrics().density));
        View viewFindViewById = findViewById(xxb.view_audio_listen__container);
        AudioWaveView audioWaveView = (AudioWaveView) findViewById(xxb.view_audio_listen__wave);
        this.a = (TextView) findViewById(xxb.view_audio_listen__tv_duration);
        ImageView imageView = (ImageView) findViewById(xxb.view_audio_listen__btn_play);
        this.b = imageView;
        ImageView imageView2 = (ImageView) findViewById(xxb.view_audio_listen__btn_close);
        this.c = imageView2;
        ImageView imageView3 = (ImageView) findViewById(xxb.view_audio_listen__btn_send);
        this.o = imageView3;
        ProgressBar progressBar = (ProgressBar) findViewById(xxb.view_audio_listen__progress);
        this.s0 = progressBar;
        progressBar.setBackground(gradientDrawable);
        viewFindViewById.setBackground(getInputBackgroundDrawable());
        imageView.setImageDrawable(layerDrawable);
        int iG2 = tu0.G(10 * getContext().getResources().getDisplayMetrics().density);
        post(new uc3(imageView, iG2, iG2, iG2, iG2, this, 1));
        audioWaveView.setListener(this);
        tu0.K(imageView2, 300L, new y20(1));
        tu0.K(imageView, 300L, new y20(1));
        tu0.K(imageView3, 300L, new y20(1));
        imageView3.setOnLongClickListener(new z20(1));
        onThemeChanged(qp4.u0.j(this));
    }

    public static LayerDrawable c(AudioListenView audioListenView) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{audioListenView.y0, audioListenView.getArrowDrawable()});
        float f = 4;
        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.arrowDrawable.getValue();
    }

    private final GradientDrawable getInputBackgroundDrawable() {
        return (GradientDrawable) this.inputBackgroundDrawable.getValue();
    }

    private final Drawable getPauseDrawable() {
        return (Drawable) this.pauseDrawable.getValue();
    }

    private final Drawable getPlayDrawable() {
        return (Drawable) this.playDrawable.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.sendIcon.getValue();
    }

    @Override // defpackage.s70
    public final void b() {
    }

    @Override // defpackage.s70
    public final void d(float f) {
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        pq9 pq9Var = qp4.u0;
        i9g i9gVarH = pq9Var.j(this).a().h();
        setBackgroundColor(i9gVarH.a.d);
        this.c.setColorFilter(fkaVar.getIcon().c);
        this.t0.setColor(fkaVar.b().a.g);
        getInputBackgroundDrawable().setColor(fkaVar.b().k);
        getInputBackgroundDrawable().setStroke(4, ote.b0(i9gVarH.c.b, 0.06f));
        kqe kqeVar = i4f.p;
        TextView textView = this.a;
        kqeVar.b(textView, du4.b);
        textView.setTextColor(pq9Var.j(this).getText().g);
        ngg.G(getArrowDrawable(), -1);
        this.y0.setColor(fkaVar.b().a.m);
        ngg.H(this.s0, fkaVar.getIcon().f);
        ngg.G(getPlayDrawable(), fkaVar.getIcon().f);
        ngg.G(getPauseDrawable(), fkaVar.getIcon().f);
        this.b.invalidate();
    }

    public final void setListener(e50 listener) {
    }

    public final void setPlayButtonState(boolean playing) {
        this.w0.setDrawable(1, playing ? getPauseDrawable() : getPlayDrawable());
        this.b.invalidate();
        pq9 pq9Var = qp4.u0;
        this.a.setTextColor(playing ? pq9Var.j(this).getText().j : pq9Var.j(this).getText().g);
    }

    public final void setScheduledSend(boolean isScheduledSend) {
        sme smeVarR;
        ImageView imageView = this.o;
        if (!isScheduledSend) {
            imageView.setImageDrawable(getSendIcon());
            imageView.setPadding(0, 0, 0, 0);
            return;
        }
        imageView.setImageResource(gpc.W);
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        imageView.setColorFilter(smeVarR.k);
        rh4.p(4, fk4.d().getDisplayMetrics().density, imageView);
    }
}
