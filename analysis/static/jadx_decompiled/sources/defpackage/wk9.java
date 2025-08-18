package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;
import ru.ok.messages.views.widgets.VideoThumbnailView;

/* loaded from: classes2.dex */
public final class wk9 extends v2 implements pl9, nse, SeekBar.OnSeekBarChangeListener {
    public View A0;
    public View B0;
    public View C0;
    public LiveVideoPlaceHolderView D0;
    public hkf E0;
    public final ad X;
    public VideoView Y;
    public PinchToZoomVideoViewWrapper Z;
    public final tg o;
    public ImageButton s0;
    public ImageButton t0;
    public ImageView u0;
    public VideoPlayerSeekBarPreview v0;
    public VideoThumbnailView w0;
    public TextView x0;
    public TextView y0;
    public ImageButton z0;

    public wk9(Context context, View view, tg tgVar, ad adVar) {
        super(context);
        this.o = tgVar;
        this.X = adVar;
        this.c = view;
        m();
    }

    public static void B(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void A(Rect rect) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.bottomMargin = rect.bottom;
        this.A0.setLayoutParams(marginLayoutParams);
        View view = this.C0;
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, this.C0.getPaddingBottom());
    }

    @Override // defpackage.pl9
    public final void a(int i, int i2) {
        this.Y.d();
        VideoThumbnailView videoThumbnailView = this.w0;
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
        Context context = (Context) this.b;
        sme smeVarR = fm9.R(context);
        ImageButton imageButton = this.s0;
        int i = smeVarR.t;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.t0.setColorFilter(smeVarR.t, mode);
        ImageButton imageButton2 = this.s0;
        int i2 = smeVarR.r;
        imageButton2.setBackground(hm9.g0(hm9.S(Integer.valueOf(i2), null, null), hm9.S(Integer.valueOf(ote.b0(i2, 0.8f)), null, null), null));
        this.t0.setBackground(hm9.g0(hm9.S(Integer.valueOf(i2), null, null), hm9.S(Integer.valueOf(ote.b0(i2, 0.8f)), null, null), null));
        TextView textView = this.y0;
        int i3 = smeVarR.w;
        textView.setTextColor(i3);
        this.x0.setTextColor(i3);
        ImageButton imageButton3 = this.z0;
        glf glfVar = new glf(ngg.u(lpc.a, i3, context));
        glfVar.t0 = new RectF();
        glfVar.u0 = new Path();
        vl vlVar = vl.o;
        bk4 bk4VarB = bk4.b();
        glfVar.X = bk4VarB;
        Paint paint = new Paint();
        glfVar.Z = paint;
        paint.setColor(-16777216);
        paint.setTextSize(bk4VarB.G);
        paint.setStrokeWidth(bk4VarB.a);
        paint.setTypeface(glf.v0);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        glfVar.s0 = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        imageButton3.setImageDrawable(glfVar);
        this.z0.setBackground(smeVarR.a());
        this.v0.c();
        this.B0.setBackgroundColor(smeVarR.m);
    }

    @Override // defpackage.pl9
    public final void d(hkf hkfVar) {
        Drawable drawableB;
        this.E0 = hkfVar;
        tg tgVar = this.o;
        if (tgVar.p()) {
            e2f e2fVar = new e2f();
            e2fVar.R(new wa5());
            e2fVar.I(tgVar.a.b());
            e2fVar.p(xxb.view_full_screen_video_player__v_video);
            e2fVar.p(xxb.view_full_screen_video_player__iv_thumbnail);
            c2f.a((ViewGroup) ((View) this.c), e2fVar);
        }
        boolean z = hkfVar.a;
        boolean z2 = hkfVar.c;
        if (z) {
            B(this.A0, true);
            boolean z3 = hkfVar.i;
            boolean z4 = hkfVar.b;
            if (z2) {
                if (z4) {
                    B(this.t0, true);
                    this.s0.setVisibility(8);
                } else {
                    this.t0.setVisibility(8);
                    B(this.s0, !z3);
                }
                B(this.u0, true);
            } else {
                if (z4) {
                    B(this.t0, true);
                    this.s0.setVisibility(8);
                } else {
                    this.t0.setVisibility(8);
                    B(this.s0, !z3);
                }
                this.u0.setVisibility(8);
            }
            B(this.x0, true);
            if (hkfVar.g) {
                this.v0.setVisibility(8);
                int i = gpc.y0;
                TextView textView = this.x0;
                Context context = (Context) this.b;
                if (i != -1) {
                    try {
                        drawableB = kt3.b(context, i);
                    } catch (Resources.NotFoundException unused) {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else {
                    drawableB = null;
                }
                pag.I(drawableB, null, null, null, textView);
                this.x0.setText(jpc.p3);
                this.y0.setVisibility(8);
            } else {
                this.x0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                B(this.v0, true);
                VideoPlayerSeekBar videoPlayerSeekBar = this.v0.b;
                long j = hkfVar.j;
                videoPlayerSeekBar.setMax((int) j);
                long j2 = hkfVar.k;
                videoPlayerSeekBar.setProgress((int) j2);
                this.v0.setSecondaryProgress(hkfVar.l);
                if (j >= 0) {
                    TextView textView2 = this.y0;
                    String[] strArr = are.b;
                    textView2.setText(tfg.c(j));
                    this.y0.setVisibility(0);
                } else {
                    this.y0.setVisibility(8);
                }
                B(this.y0, true);
                TextView textView3 = this.x0;
                String[] strArr2 = are.b;
                textView3.setText(tfg.c(j2));
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.v0;
                int i2 = -this.x0.getWidth();
                int width = this.y0.getWidth();
                videoPlayerSeekBarPreview.C0 = i2;
                videoPlayerSeekBarPreview.D0 = width;
            }
            if (hkfVar.f) {
                B(this.z0, true);
                mqb mqbVar = hkfVar.m;
                String str = mqbVar != null ? mqbVar.a : null;
                glf glfVar = (glf) this.z0.getDrawable();
                glfVar.Y = str;
                if (!oag.t(str)) {
                    int iMeasureText = oag.t(glfVar.Y) ? 0 : (int) glfVar.Z.measureText(glfVar.Y);
                    RectF rectF = glfVar.t0;
                    int intrinsicWidth = glfVar.getIntrinsicWidth() - iMeasureText;
                    bk4 bk4Var = glfVar.X;
                    rectF.set(intrinsicWidth - bk4Var.b, (glfVar.getIntrinsicHeight() - glfVar.Z.getTextSize()) - bk4Var.d, glfVar.getIntrinsicWidth(), glfVar.getIntrinsicHeight() - bk4Var.b);
                    Path path = glfVar.u0;
                    path.reset();
                    float f = rectF.left;
                    float f2 = bk4Var.b;
                    RectF rectF2 = new RectF(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
                    float f3 = bk4Var.b;
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
                }
                glfVar.invalidateSelf();
                this.z0.requestLayout();
            } else {
                this.z0.setVisibility(8);
            }
        } else {
            this.A0.setVisibility(8);
            B(this.u0, z2);
            this.s0.setVisibility(8);
            this.t0.setVisibility(8);
            this.v0.setVisibility(8);
            this.y0.setVisibility(8);
            this.x0.setVisibility(8);
            this.z0.setVisibility(8);
        }
        k20 k20Var = hkfVar.o;
        Drawable drawable = hkfVar.p;
        if (drawable != null) {
            this.w0.n(k20Var, drawable);
        } else {
            Uri uri = hkfVar.q;
            if (uri != null) {
                this.w0.o(k20Var, uri);
            }
        }
        fef fefVar = hkfVar.n;
        if (fefVar != null) {
            this.v0.setVideoContent(fefVar);
        }
        this.Y.setVisibility(hkfVar.s ? 0 : 4);
        this.Z.setEnabled(hkfVar.t);
        if (!hkfVar.h) {
            this.D0.setVisibility(8);
            return;
        }
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.D0;
        liveVideoPlaceHolderView.L0 = k20Var;
        liveVideoPlaceHolderView.x();
        B(this.D0, true);
    }

    @Override // defpackage.pl9
    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    @Override // defpackage.v2
    public final void m() {
        this.Y = (VideoView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__v_video);
        this.Z = (PinchToZoomVideoViewWrapper) ((View) this.c).findViewById(xxb.view_full_screen_video_player__pinch_to_zoom_v_video_wrapper);
        this.s0 = (ImageButton) ((View) this.c).findViewById(xxb.view_full_screen_video_player__btn_play);
        this.t0 = (ImageButton) ((View) this.c).findViewById(xxb.view_full_screen_video_player__btn_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__progress);
        this.u0 = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        this.v0 = (VideoPlayerSeekBarPreview) ((View) this.c).findViewById(xxb.view_video_player_controls__sb_seek_preview);
        this.w0 = (VideoThumbnailView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__iv_thumbnail);
        this.x0 = (TextView) ((View) this.c).findViewById(xxb.view_video_player_controls__tv_time);
        this.y0 = (TextView) ((View) this.c).findViewById(xxb.view_video_player_controls__tv_duration);
        this.z0 = (ImageButton) ((View) this.c).findViewById(xxb.view_video_player_controls__btn_settings);
        this.A0 = ((View) this.c).findViewById(xxb.view_full_screen_video_player__controls);
        this.B0 = ((View) this.c).findViewById(xxb.view_video_player_controls__v_background);
        this.C0 = ((View) this.c).findViewById(xxb.view_video_player_controls__cl_content);
        this.D0 = (LiveVideoPlaceHolderView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__live_placeholder);
        ((ViewGroup) this.A0).setClipChildren(false);
        ((ViewGroup) this.C0).setClipChildren(false);
        final int i = 0;
        nd7.h(this.s0, new f6(this) { // from class: vk9
            public final /* synthetic */ wk9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.n(new fj0(27));
                        break;
                    case 1:
                        this.b.n(new fj0(25));
                        break;
                    default:
                        this.b.n(new fj0(26));
                        break;
                }
            }
        });
        final int i2 = 1;
        nd7.h(this.t0, new f6(this) { // from class: vk9
            public final /* synthetic */ wk9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.n(new fj0(27));
                        break;
                    case 1:
                        this.b.n(new fj0(25));
                        break;
                    default:
                        this.b.n(new fj0(26));
                        break;
                }
            }
        });
        final int i3 = 2;
        nd7.h(this.z0, new f6(this) { // from class: vk9
            public final /* synthetic */ wk9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.n(new fj0(27));
                        break;
                    case 1:
                        this.b.n(new fj0(25));
                        break;
                    default:
                        this.b.n(new fj0(26));
                        break;
                }
            }
        });
        this.v0.a.add(this);
        c();
        DoubleTapVideoViewWrapper doubleTapVideoViewWrapper = (DoubleTapVideoViewWrapper) ((View) this.c).findViewById(xxb.view_full_screen_video_player__double_tap_wrapper);
        tg tgVar = this.o;
        Context context = (Context) this.b;
        sk9 sk9Var = new sk9(context, doubleTapVideoViewWrapper, tgVar);
        qk9 qk9Var = new qk9();
        qk9Var.c = false;
        qk9Var.a = 0;
        new oj9(sk9Var, new rk9(qk9Var), context, this.X).u0 = this;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        n(new fj0(24));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        n(new cy1(4, seekBar));
    }

    @Override // defpackage.v2
    public final void release() {
        this.Y.b();
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.Z;
        pinchToZoomVideoViewWrapper.c = p0b.b;
        pinchToZoomVideoViewWrapper.s0 = 1.0f;
    }
}
