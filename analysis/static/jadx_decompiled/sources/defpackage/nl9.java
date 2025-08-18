package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.ActTrimVideo;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoView;

/* loaded from: classes2.dex */
public final class nl9 extends v2 implements nse, u3a, kk9 {
    public TextView A0;
    public AppCompatImageButton B0;
    public AppCompatImageButton C0;
    public ProgressBar D0;
    public sme E0;
    public final y7g X;
    public final FrgTrimVideo Y;
    public final tg Z;
    public final FrgTrimVideo o;
    public ai3 s0;
    public VideoView t0;
    public ImageButton u0;
    public ImageButton v0;
    public TextView w0;
    public TextView x0;
    public RangeSeekBarView y0;
    public ViewGroup z0;

    public nl9(Context context, ViewGroup viewGroup, FrgTrimVideo frgTrimVideo, y7g y7gVar, FrgTrimVideo frgTrimVideo2, tg tgVar) {
        super(context);
        this.o = frgTrimVideo;
        this.X = y7gVar;
        this.Y = frgTrimVideo2;
        this.Z = tgVar;
        l(viewGroup, yyb.cl_trim_video);
    }

    public final void A(long j, long j2, long j3, long j4) {
        RangeSeekBarView rangeSeekBarView = this.y0;
        rangeSeekBarView.E0 = j4;
        rangeSeekBarView.I0 = this.o;
        float f = j4;
        rangeSeekBarView.D0 = j / f;
        rangeSeekBarView.B0 = j2 / f;
        rangeSeekBarView.C0 = j3 / f;
        rangeSeekBarView.z0 = 1000.0f / f;
        rangeSeekBarView.A0 = 1.0f;
        rangeSeekBarView.F0 = true;
        RangeSeekBarView.R0 = 1.0f;
        RangeSeekBarView.S0 = 1.0f;
        rangeSeekBarView.invalidate();
        TextView textView = this.w0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        textView.setText(ay7.l(timeUnit.toSeconds(j2)));
        this.x0.setText(ay7.l(timeUnit.toSeconds(j3)));
    }

    public final void B(boolean z) {
        if (z) {
            this.A0.setAlpha(1.0f);
            this.A0.setBackground(this.E0.a());
        } else {
            this.A0.setAlpha(0.3f);
            this.A0.setBackground(null);
        }
    }

    public final void C(boolean z, boolean z2) {
        tg tgVar = this.Z;
        if (z) {
            tgVar.i((Toolbar) this.s0.b);
            tgVar.i(this.z0);
        } else {
            tgVar.g((Toolbar) this.s0.b);
            tgVar.g(this.z0);
        }
        FrgTrimVideo frgTrimVideo = this.Y;
        if (z) {
            if (frgTrimVideo.b0() != null) {
                ((ActTrimVideo) frgTrimVideo.b0()).g0(null);
            }
        } else if (frgTrimVideo.b0() != null) {
            ((ActTrimVideo) frgTrimVideo.b0()).b0(null);
        }
        if (!z2) {
            if (z) {
                tgVar.i(this.u0);
            }
        } else if (z) {
            tgVar.i(this.v0);
        } else {
            tgVar.g(this.v0);
        }
    }

    @Override // defpackage.nse
    public final void c() {
        String strH0;
        if (((View) this.c) == null) {
            return;
        }
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R((Context) this.b);
        this.E0 = smeVarR;
        ((View) this.c).setBackgroundColor(smeVarR.m);
        View view = (View) this.c;
        sme smeVar = this.E0;
        Toolbar toolbar = (Toolbar) view.findViewById(xxb.trim_video__toolbar);
        int i = bk4.b().p;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
        if (marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            toolbar.setLayoutParams(marginLayoutParams);
        }
        go9 go9Var = new go9(this.X, toolbar);
        go9Var.c = smeVar;
        ai3 ai3Var = new ai3(go9Var);
        this.s0 = ai3Var;
        Toolbar toolbar2 = (Toolbar) ai3Var.b;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon((Drawable) null);
        }
        ai3 ai3Var2 = this.s0;
        int i2 = jpc.e3;
        y7g y7gVar = (y7g) ai3Var2.a;
        if (i2 == 0) {
            y7gVar.getClass();
            strH0 = "";
        } else if (((WeakReference) y7gVar.c).get() != null) {
            strH0 = ((im) ((WeakReference) y7gVar.c).get()).getString(i2);
        } else {
            WeakReference weakReference = (WeakReference) y7gVar.b;
            if (weakReference.get() == null) {
                throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
            }
            strH0 = ((a) weakReference.get()).h0(i2);
        }
        TextView textView = (TextView) ai3Var2.o;
        if (textView != null && i2 != -1) {
            textView.setText(strH0);
        }
        ai3 ai3Var3 = this.s0;
        View view2 = (View) ai3Var3.Y;
        if (view2 != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.gravity = 17;
            ((View) ai3Var3.Y).setLayoutParams(layoutParams);
        } else {
            TextView textView2 = (TextView) ai3Var3.o;
            if (textView2 != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams2.gravity = 17;
                ((TextView) ai3Var3.o).setLayoutParams(layoutParams2);
            }
        }
        TextView textView3 = (TextView) ai3Var3.X;
        if (textView3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView3.getLayoutParams();
            layoutParams3.gravity = 17;
            ((TextView) ai3Var3.X).setLayoutParams(layoutParams3);
        }
        this.u0.setColorFilter(this.E0.t);
        this.v0.setColorFilter(this.E0.t);
        ImageButton imageButton = this.u0;
        sme smeVar2 = this.E0;
        imageButton.setBackground(hm9.g0(hm9.S(Integer.valueOf(smeVar2.r), null, null), hm9.S(Integer.valueOf(ote.b0(smeVar2.r, 0.8f)), null, null), null));
        ImageButton imageButton2 = this.v0;
        sme smeVar3 = this.E0;
        imageButton2.setBackground(hm9.g0(hm9.S(Integer.valueOf(smeVar3.r), null, null), hm9.S(Integer.valueOf(ote.b0(smeVar3.r, 0.8f)), null, null), null));
        this.w0.setTextColor(this.E0.M);
        this.x0.setTextColor(this.E0.M);
        aq4.g(this.B0.getDrawable(), this.E0.w);
        aq4.g(this.C0.getDrawable(), this.E0.k);
        this.B0.setBackground(this.E0.a());
        this.C0.setBackground(this.E0.a());
        this.A0.setTextColor(this.E0.w);
        if (this.A0.getAlpha() == 1.0f) {
            this.A0.setBackground(this.E0.a());
        }
        this.A0.setBackground(this.E0.a());
        this.z0.setBackgroundColor(this.E0.m);
        aq4.g(this.D0.getIndeterminateDrawable(), this.E0.k);
    }

    @Override // defpackage.v2
    public final void m() {
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(xxb.trim_video__btn_play);
        this.u0 = imageButton;
        final int i = 0;
        nd7.h(imageButton, new f6(this) { // from class: ml9
            public final /* synthetic */ nl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.n(new al9(12));
                        break;
                    case 1:
                        this.b.n(new al9(9));
                        break;
                    case 2:
                        this.b.n(new al9(11));
                        break;
                    case 3:
                        this.b.n(new al9(10));
                        break;
                    case 4:
                        this.b.n(new al9(8));
                        break;
                    default:
                        this.b.n(new al9(13));
                        break;
                }
            }
        });
        ImageButton imageButton2 = (ImageButton) ((View) this.c).findViewById(xxb.trim_video__btn_pause);
        this.v0 = imageButton2;
        final int i2 = 1;
        nd7.h(imageButton2, new f6(this) { // from class: ml9
            public final /* synthetic */ nl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.n(new al9(12));
                        break;
                    case 1:
                        this.b.n(new al9(9));
                        break;
                    case 2:
                        this.b.n(new al9(11));
                        break;
                    case 3:
                        this.b.n(new al9(10));
                        break;
                    case 4:
                        this.b.n(new al9(8));
                        break;
                    default:
                        this.b.n(new al9(13));
                        break;
                }
            }
        });
        RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) ((View) this.c).findViewById(xxb.trim_video__range_seek_bar_view);
        this.y0 = rangeSeekBarView;
        rangeSeekBarView.setOnChangeRangeSeekBarListener(this);
        this.w0 = (TextView) ((View) this.c).findViewById(xxb.trim_video__startTime);
        this.x0 = (TextView) ((View) this.c).findViewById(xxb.trim_video__endTime);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(xxb.trim_video__close);
        this.B0 = appCompatImageButton;
        final int i3 = 2;
        nd7.h(appCompatImageButton, new f6(this) { // from class: ml9
            public final /* synthetic */ nl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.n(new al9(12));
                        break;
                    case 1:
                        this.b.n(new al9(9));
                        break;
                    case 2:
                        this.b.n(new al9(11));
                        break;
                    case 3:
                        this.b.n(new al9(10));
                        break;
                    case 4:
                        this.b.n(new al9(8));
                        break;
                    default:
                        this.b.n(new al9(13));
                        break;
                }
            }
        });
        TextView textView = (TextView) ((View) this.c).findViewById(xxb.trim_video__reset);
        this.A0 = textView;
        final int i4 = 3;
        nd7.h(textView, new f6(this) { // from class: ml9
            public final /* synthetic */ nl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.n(new al9(12));
                        break;
                    case 1:
                        this.b.n(new al9(9));
                        break;
                    case 2:
                        this.b.n(new al9(11));
                        break;
                    case 3:
                        this.b.n(new al9(10));
                        break;
                    case 4:
                        this.b.n(new al9(8));
                        break;
                    default:
                        this.b.n(new al9(13));
                        break;
                }
            }
        });
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(xxb.trim_video__apply);
        this.C0 = appCompatImageButton2;
        final int i5 = 4;
        nd7.h(appCompatImageButton2, new f6(this) { // from class: ml9
            public final /* synthetic */ nl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i5) {
                    case 0:
                        this.b.n(new al9(12));
                        break;
                    case 1:
                        this.b.n(new al9(9));
                        break;
                    case 2:
                        this.b.n(new al9(11));
                        break;
                    case 3:
                        this.b.n(new al9(10));
                        break;
                    case 4:
                        this.b.n(new al9(8));
                        break;
                    default:
                        this.b.n(new al9(13));
                        break;
                }
            }
        });
        this.D0 = (ProgressBar) ((View) this.c).findViewById(xxb.trim_video__apply_progress);
        this.z0 = (ViewGroup) ((View) this.c).findViewById(xxb.trim_video__bottom_group);
        VideoView videoView = (VideoView) ((View) this.c).findViewById(xxb.trim_video__view_video);
        this.t0 = videoView;
        final int i6 = 5;
        nd7.h(videoView, new f6(this) { // from class: ml9
            public final /* synthetic */ nl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i6) {
                    case 0:
                        this.b.n(new al9(12));
                        break;
                    case 1:
                        this.b.n(new al9(9));
                        break;
                    case 2:
                        this.b.n(new al9(11));
                        break;
                    case 3:
                        this.b.n(new al9(10));
                        break;
                    case 4:
                        this.b.n(new al9(8));
                        break;
                    default:
                        this.b.n(new al9(13));
                        break;
                }
            }
        });
        c();
        ViewGroup viewGroup = this.z0;
        yt8 yt8Var = new yt8(11, this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(viewGroup, yt8Var);
        mmf.c(this.z0);
    }

    @Override // defpackage.v2
    public final void r(Object obj) {
        hk9 hk9Var = (hk9) obj;
        super.r(hk9Var);
        this.t0.a(hk9Var);
    }
}
