package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
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
public final class mk9 extends v2 implements pl9, nse {
    public final float[] X;
    public VideoView Y;
    public VideoPlayerSeekBar Z;
    public final tg o;
    public VideoThumbnailView s0;
    public ImageButton t0;
    public ImageView u0;
    public LayerDrawable v0;

    public mk9(Context context, tg tgVar, float[] fArr) {
        super(context);
        this.o = tgVar;
        this.X = fArr;
        l(null, yyb.view_auto_play_video_player);
    }

    public static void A(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.pl9
    public final void a(int i, int i2) {
        this.Y.d();
        VideoThumbnailView videoThumbnailView = this.s0;
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
        ngg.G(this.v0.findDrawableByLayerId(R.id.background), smeVarR.r);
        Drawable drawableFindDrawableByLayerId = this.v0.findDrawableByLayerId(R.id.progress);
        int i = smeVarR.t;
        ngg.G(drawableFindDrawableByLayerId, i);
        ngg.G(this.v0.findDrawableByLayerId(R.id.secondaryProgress), ote.b0(i, 0.3f));
        this.t0.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        ImageButton imageButton = this.t0;
        int i2 = smeVarR.r;
        imageButton.setBackground(hm9.g0(hm9.S(Integer.valueOf(i2), null, null), hm9.S(Integer.valueOf(ote.b0(i2, 0.8f)), null, null), null));
    }

    @Override // defpackage.pl9
    public final void d(hkf hkfVar) {
        tg tgVar = this.o;
        if (tgVar.p()) {
            e2f e2fVar = new e2f();
            e2fVar.R(new wa5());
            e2fVar.I(tgVar.a.b());
            e2fVar.p(xxb.view_auto_play_video_player__v_video);
            e2fVar.p(xxb.view_auto_play_video_player__iv_thumbnail);
            c2f.a((ViewGroup) ((View) this.c), e2fVar);
        }
        A(this.u0, hkfVar.c);
        if (hkfVar.g) {
            this.Z.setVisibility(8);
        } else {
            A(this.Z, true);
            VideoPlayerSeekBar videoPlayerSeekBar = this.Z;
            videoPlayerSeekBar.setMax((int) hkfVar.j);
            videoPlayerSeekBar.setProgress((int) hkfVar.k);
            this.Z.setSecondaryProgress((int) hkfVar.l);
        }
        VideoPlayerSeekBar videoPlayerSeekBar2 = this.Z;
        boolean z = hkfVar.b;
        A(videoPlayerSeekBar2, z);
        if (hkfVar.r) {
            this.t0.setVisibility(8);
        } else {
            this.t0.setSelected(hkfVar.e);
            A(this.t0, z);
        }
        k20 k20Var = hkfVar.o;
        Drawable drawable = hkfVar.p;
        if (drawable != null) {
            this.s0.n(k20Var, drawable);
            return;
        }
        Uri uri = hkfVar.q;
        if (uri != null) {
            this.s0.o(k20Var, uri);
        }
    }

    @Override // defpackage.pl9
    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    @Override // defpackage.v2
    public final void m() throws Resources.NotFoundException {
        float[] fArr = this.X;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        this.Y = (VideoView) ((View) this.c).findViewById(xxb.view_auto_play_video_player__v_video);
        this.Z = (VideoPlayerSeekBar) ((View) this.c).findViewById(xxb.view_auto_play_video_player__sb_seek);
        this.v0 = (LayerDrawable) ((Context) this.b).getResources().getDrawable(gpc.R0);
        this.s0 = (VideoThumbnailView) ((View) this.c).findViewById(xxb.view_auto_play_video_player__iv_thumbnail);
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(xxb.view_auto_play_video_player__ib_sound);
        this.t0 = imageButton;
        Drawable drawable = ((View) this.c).getResources().getDrawable(gpc.i0);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(gpc.k0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        imageButton.setImageDrawable(stateListDrawable);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.view_auto_play_video_player__progress);
        this.u0 = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        final int i = 0;
        nd7.h(this.Y, new f6(this) { // from class: lk9
            public final /* synthetic */ mk9 b;

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
                        this.b.n(new fj0(18));
                        break;
                    default:
                        this.b.n(new fj0(20));
                        break;
                }
            }
        });
        final int i2 = 1;
        nd7.h(this.s0, new f6(this) { // from class: lk9
            public final /* synthetic */ mk9 b;

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
                        this.b.n(new fj0(18));
                        break;
                    default:
                        this.b.n(new fj0(20));
                        break;
                }
            }
        });
        final int i3 = 2;
        nd7.h(this.t0, new f6(this) { // from class: lk9
            public final /* synthetic */ mk9 b;

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
                        this.b.n(new fj0(18));
                        break;
                    default:
                        this.b.n(new fj0(20));
                        break;
                }
            }
        });
        this.Y.setOnLongClickListener(new zl0(5, this));
        c();
    }

    @Override // defpackage.v2
    public final void release() {
        this.Y.b();
    }
}
