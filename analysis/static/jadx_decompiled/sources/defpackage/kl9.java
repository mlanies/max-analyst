package defpackage;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* loaded from: classes2.dex */
public final class kl9 extends v2 implements pl9, nse {
    public final float[] X;
    public VideoView Y;
    public ImageButton Z;
    public final tg o;
    public ImageButton s0;
    public ImageView t0;
    public ImageButton u0;
    public ImageButton v0;
    public ImageButton w0;
    public VideoPlayerSeekBar x0;
    public VideoThumbnailView y0;
    public LayerDrawable z0;

    public kl9(Context context, tg tgVar, float[] fArr) {
        super(context);
        this.o = tgVar;
        this.X = fArr;
        l(null, yyb.view_small_video_player);
    }

    public static StateListDrawable A(sme smeVar) {
        int i = smeVar.r;
        return hm9.g0(hm9.S(Integer.valueOf(i), null, null), hm9.S(Integer.valueOf(ote.b0(i, 0.8f)), null, null), null);
    }

    public static void B(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.pl9
    public final void a(int i, int i2) {
        this.Y.d();
        VideoThumbnailView videoThumbnailView = this.y0;
        videoThumbnailView.z0 = i;
        videoThumbnailView.A0 = i2;
        videoThumbnailView.requestLayout();
    }

    @Override // defpackage.pl9
    public final void b(slf slfVar) {
        this.Y.a(slfVar);
    }

    @Override // defpackage.nse
    public final void c() {
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R((Context) this.b);
        ngg.G(this.z0.findDrawableByLayerId(R.id.background), smeVarR.r);
        Drawable drawableFindDrawableByLayerId = this.z0.findDrawableByLayerId(R.id.progress);
        int i = smeVarR.t;
        ngg.G(drawableFindDrawableByLayerId, i);
        ngg.G(this.z0.findDrawableByLayerId(R.id.secondaryProgress), ote.b0(i, 0.3f));
        ImageButton imageButton = this.Z;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.s0.setColorFilter(i, mode);
        this.u0.setColorFilter(i, mode);
        this.v0.setColorFilter(i, mode);
        this.w0.setColorFilter(i, mode);
        this.Z.setBackground(A(smeVarR));
        this.s0.setBackground(A(smeVarR));
        this.u0.setBackground(A(smeVarR));
        this.v0.setBackground(A(smeVarR));
        this.w0.setBackground(A(smeVarR));
    }

    @Override // defpackage.pl9
    public final void d(hkf hkfVar) {
        tg tgVar = this.o;
        if (tgVar.p()) {
            e2f e2fVar = new e2f();
            e2fVar.R(new wa5());
            e2fVar.I(tgVar.a.b());
            e2fVar.p(xxb.view_small_video_player__v_video);
            e2fVar.p(xxb.view_small_video_player__iv_thumbnail);
            c2f.a((ViewGroup) ((View) this.c), e2fVar);
        }
        boolean z = hkfVar.a;
        boolean z2 = hkfVar.c;
        if (z) {
            if (z2) {
                this.s0.setVisibility(8);
                this.Z.setVisibility(8);
            } else if (hkfVar.b) {
                B(this.s0, true);
                this.Z.setVisibility(8);
            } else {
                this.s0.setVisibility(8);
                B(this.Z, true);
            }
            B(this.v0, true);
            if (hkfVar.d) {
                B(this.w0, true);
                this.u0.setVisibility(8);
            } else {
                this.w0.setVisibility(8);
                B(this.u0, true);
            }
        } else {
            this.s0.setVisibility(8);
            this.Z.setVisibility(8);
            this.w0.setVisibility(8);
            this.u0.setVisibility(8);
            this.v0.setVisibility(8);
        }
        B(this.t0, z2);
        if (hkfVar.g) {
            this.x0.setVisibility(8);
        } else {
            B(this.x0, true);
            VideoPlayerSeekBar videoPlayerSeekBar = this.x0;
            videoPlayerSeekBar.setMax((int) hkfVar.j);
            videoPlayerSeekBar.setProgress((int) hkfVar.k);
            this.x0.setSecondaryProgress((int) hkfVar.l);
        }
        k20 k20Var = hkfVar.o;
        Drawable drawable = hkfVar.p;
        if (drawable != null) {
            this.y0.n(k20Var, drawable);
            return;
        }
        Uri uri = hkfVar.q;
        if (uri != null) {
            this.y0.o(k20Var, uri);
        }
    }

    @Override // defpackage.pl9
    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    @Override // defpackage.v2
    public final void m() {
        float[] fArr = this.X;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        this.Y = (VideoView) ((View) this.c).findViewById(xxb.view_small_video_player__v_video);
        this.Z = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_play);
        this.s0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.view_small_video_player__progress);
        this.t0 = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        this.x0 = (VideoPlayerSeekBar) ((View) this.c).findViewById(xxb.view_small_video_player__sb_seek);
        LayerDrawable layerDrawable = (LayerDrawable) ((Context) this.b).getResources().getDrawable(gpc.R0);
        this.z0 = layerDrawable;
        this.x0.setProgressDrawable(layerDrawable);
        this.u0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_pip);
        this.v0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_full_screen);
        this.w0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_close);
        this.y0 = (VideoThumbnailView) ((View) this.c).findViewById(xxb.view_small_video_player__iv_thumbnail);
        final int i = 0;
        nd7.h(this.Y, new f6(this) { // from class: jl9
            public final /* synthetic */ kl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.n(new fj0(18));
                        break;
                    case 1:
                        this.b.n(new fj0(27));
                        break;
                    case 2:
                        this.b.n(new fj0(25));
                        break;
                    case 3:
                        this.b.n(new al9(7));
                        break;
                    case 4:
                        this.b.n(new al9(6));
                        break;
                    case 5:
                        this.b.n(new al9(5));
                        break;
                    default:
                        this.b.n(new fj0(18));
                        break;
                }
            }
        });
        final int i2 = 1;
        nd7.h(this.Z, new f6(this) { // from class: jl9
            public final /* synthetic */ kl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.n(new fj0(18));
                        break;
                    case 1:
                        this.b.n(new fj0(27));
                        break;
                    case 2:
                        this.b.n(new fj0(25));
                        break;
                    case 3:
                        this.b.n(new al9(7));
                        break;
                    case 4:
                        this.b.n(new al9(6));
                        break;
                    case 5:
                        this.b.n(new al9(5));
                        break;
                    default:
                        this.b.n(new fj0(18));
                        break;
                }
            }
        });
        final int i3 = 2;
        nd7.h(this.s0, new f6(this) { // from class: jl9
            public final /* synthetic */ kl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.n(new fj0(18));
                        break;
                    case 1:
                        this.b.n(new fj0(27));
                        break;
                    case 2:
                        this.b.n(new fj0(25));
                        break;
                    case 3:
                        this.b.n(new al9(7));
                        break;
                    case 4:
                        this.b.n(new al9(6));
                        break;
                    case 5:
                        this.b.n(new al9(5));
                        break;
                    default:
                        this.b.n(new fj0(18));
                        break;
                }
            }
        });
        final int i4 = 3;
        nd7.h(this.u0, new f6(this) { // from class: jl9
            public final /* synthetic */ kl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.n(new fj0(18));
                        break;
                    case 1:
                        this.b.n(new fj0(27));
                        break;
                    case 2:
                        this.b.n(new fj0(25));
                        break;
                    case 3:
                        this.b.n(new al9(7));
                        break;
                    case 4:
                        this.b.n(new al9(6));
                        break;
                    case 5:
                        this.b.n(new al9(5));
                        break;
                    default:
                        this.b.n(new fj0(18));
                        break;
                }
            }
        });
        final int i5 = 4;
        nd7.h(this.v0, new f6(this) { // from class: jl9
            public final /* synthetic */ kl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i5) {
                    case 0:
                        this.b.n(new fj0(18));
                        break;
                    case 1:
                        this.b.n(new fj0(27));
                        break;
                    case 2:
                        this.b.n(new fj0(25));
                        break;
                    case 3:
                        this.b.n(new al9(7));
                        break;
                    case 4:
                        this.b.n(new al9(6));
                        break;
                    case 5:
                        this.b.n(new al9(5));
                        break;
                    default:
                        this.b.n(new fj0(18));
                        break;
                }
            }
        });
        final int i6 = 5;
        nd7.h(this.w0, new f6(this) { // from class: jl9
            public final /* synthetic */ kl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i6) {
                    case 0:
                        this.b.n(new fj0(18));
                        break;
                    case 1:
                        this.b.n(new fj0(27));
                        break;
                    case 2:
                        this.b.n(new fj0(25));
                        break;
                    case 3:
                        this.b.n(new al9(7));
                        break;
                    case 4:
                        this.b.n(new al9(6));
                        break;
                    case 5:
                        this.b.n(new al9(5));
                        break;
                    default:
                        this.b.n(new fj0(18));
                        break;
                }
            }
        });
        final int i7 = 6;
        nd7.h(this.y0, new f6(this) { // from class: jl9
            public final /* synthetic */ kl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.n(new fj0(18));
                        break;
                    case 1:
                        this.b.n(new fj0(27));
                        break;
                    case 2:
                        this.b.n(new fj0(25));
                        break;
                    case 3:
                        this.b.n(new al9(7));
                        break;
                    case 4:
                        this.b.n(new al9(6));
                        break;
                    case 5:
                        this.b.n(new al9(5));
                        break;
                    default:
                        this.b.n(new fj0(18));
                        break;
                }
            }
        });
        this.Y.setOnLongClickListener(new zl0(7, this));
        c();
    }

    @Override // defpackage.v2
    public final void release() {
        this.Y.b();
    }
}
