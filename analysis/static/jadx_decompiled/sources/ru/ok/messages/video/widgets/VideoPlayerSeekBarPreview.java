package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a38;
import defpackage.are;
import defpackage.bk4;
import defpackage.c54;
import defpackage.ce;
import defpackage.cqc;
import defpackage.e5;
import defpackage.f28;
import defpackage.fef;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.ft;
import defpackage.g0;
import defpackage.g28;
import defpackage.gkf;
import defpackage.hb3;
import defpackage.hle;
import defpackage.hm9;
import defpackage.j47;
import defpackage.jle;
import defpackage.k28;
import defpackage.khe;
import defpackage.kp7;
import defpackage.lp7;
import defpackage.lt1;
import defpackage.m28;
import defpackage.maf;
import defpackage.ml0;
import defpackage.muc;
import defpackage.n2f;
import defpackage.nse;
import defpackage.o45;
import defpackage.ok0;
import defpackage.ph4;
import defpackage.q26;
import defpackage.qj3;
import defpackage.qy9;
import defpackage.r0a;
import defpackage.r26;
import defpackage.rfc;
import defpackage.s28;
import defpackage.sd7;
import defpackage.sme;
import defpackage.sz9;
import defpackage.tfg;
import defpackage.tg;
import defpackage.ti4;
import defpackage.ty9;
import defpackage.uy;
import defpackage.vl;
import defpackage.xv6;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.z16;
import defpackage.z64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.VideoFramePreview;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* loaded from: classes2.dex */
public class VideoPlayerSeekBarPreview extends LinearLayout implements SeekBar.OnSeekBarChangeListener, nse {
    public static final /* synthetic */ int E0 = 0;
    public long A0;
    public long B0;
    public int C0;
    public int D0;
    public final HashSet a;
    public final VideoPlayerSeekBar b;
    public final VideoFramePreview c;
    public final r26 o;
    public final tg s0;
    public g28 t0;
    public sd7 u0;
    public fef v0;
    public ph4 w0;
    public ph4 x0;
    public final int y0;
    public final int z0;

    public VideoPlayerSeekBarPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new HashSet();
        bk4.b();
        this.y0 = fk4.b((int) 120.0f);
        this.z0 = fk4.b((int) 146.0f);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        View viewInflate = View.inflate(context, yyb.view_video_player_seekbar_preview, this);
        this.c = (VideoFramePreview) viewInflate.findViewById(xxb.video_frame_preview);
        VideoPlayerSeekBar videoPlayerSeekBar = (VideoPlayerSeekBar) viewInflate.findViewById(xxb.video_player_seek_bar);
        this.b = videoPlayerSeekBar;
        videoPlayerSeekBar.setOnSeekBarChangeListener(this);
        this.s0 = ((y8a) vl.b()).c();
        q26 q26Var = (q26) ((y8a) vl.b()).getAccessor().c(q26.class);
        q26Var.getClass();
        this.o = new r26((hle) q26Var.d.getValue(), (o45) q26Var.b.getValue(), q26Var.a, (ti4) q26Var.c.getValue());
        c();
    }

    public final void a() {
        ph4 ph4Var = this.w0;
        VideoFramePreview videoFramePreview = this.c;
        if (ph4Var != null) {
            ph4Var.h();
            this.w0 = null;
            videoFramePreview.setVisibility(4);
            videoFramePreview.setAlpha(1.0f);
        }
        if (videoFramePreview.getVisibility() == 0 && this.x0 == null) {
            ph4 ph4VarG = this.s0.g(videoFramePreview);
            ph4VarG.u(new gkf(this, 1));
            this.x0 = ph4VarG;
        }
    }

    @Override // defpackage.nse
    public final void c() {
        Context context = getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        int i = smeVarR.w;
        VideoPlayerSeekBar videoPlayerSeekBar = this.b;
        videoPlayerSeekBar.setProgressColor(i);
        videoPlayerSeekBar.setThumbColor(smeVarR.w);
        this.c.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cqc.b(this.t0);
        cqc.b(this.u0);
        ph4 ph4Var = this.w0;
        if (ph4Var != null) {
            ph4Var.h();
        }
        ph4 ph4Var2 = this.x0;
        if (ph4Var2 != null) {
            ph4Var2.h();
        }
        r26 r26Var = this.o;
        lp7 lp7Var = r26Var.h;
        if (lp7Var != null) {
            cqc.b(lp7Var.g);
            try {
                lp7Var.h.release();
            } catch (Throwable th) {
                hm9.p("lp7", "fail to release", th);
            }
            lp7Var.j = 0L;
            List<Bitmap> list = (List) lp7Var.f.A();
            if (list != null) {
                for (Bitmap bitmap : list) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
        }
        rfc rfcVar = r26Var.i;
        if (rfcVar != null) {
            g0 g0Var = rfcVar.g;
            if (g0Var != null) {
                g0Var.a();
                rfcVar.g = null;
            }
            g0 g0Var2 = rfcVar.h;
            if (g0Var2 != null) {
                g0Var2.a();
                rfcVar.h = null;
            }
        }
        this.a.clear();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float fMin;
        f28 s28Var;
        final int i2 = 1;
        final int i3 = 0;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onProgressChanged(seekBar, i, z);
        }
        if (z && this.v0 == null) {
            return;
        }
        if (!z) {
            a();
            return;
        }
        long j = i;
        if (this.v0 == null) {
            return;
        }
        r26 r26Var = this.o;
        if (r26Var.b() && (((ok0) this.v0).a == 0 || Math.abs(this.A0 - j) > ((ok0) this.v0).a * 0.01d)) {
            if (cqc.c(this.u0)) {
                r0a r0aVarN = qy9.u(1000L, TimeUnit.MILLISECONDS, muc.a()).n(ce.a());
                sd7 sd7Var = new sd7(new qj3(this) { // from class: fkf
                    public final /* synthetic */ VideoPlayerSeekBarPreview b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.qj3
                    public final void accept(Object obj) {
                        VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
                        switch (i3) {
                            case 0:
                                int i4 = VideoPlayerSeekBarPreview.E0;
                                videoPlayerSeekBarPreview.getClass();
                                if (System.currentTimeMillis() - videoPlayerSeekBarPreview.B0 > 1000) {
                                    videoPlayerSeekBarPreview.c.a(true);
                                    break;
                                }
                                break;
                            default:
                                int i5 = VideoPlayerSeekBarPreview.E0;
                                videoPlayerSeekBarPreview.getClass();
                                videoPlayerSeekBarPreview.B0 = System.currentTimeMillis();
                                cqc.b(videoPlayerSeekBarPreview.u0);
                                VideoFramePreview videoFramePreview = videoPlayerSeekBarPreview.c;
                                videoFramePreview.s0.setImageBitmap((Bitmap) obj);
                                videoFramePreview.a(false);
                                break;
                        }
                    }
                }, new n2f(23), ft.d);
                r0aVarN.a(sd7Var);
                this.u0 = sd7Var;
            }
            cqc.b(this.t0);
            fef fefVar = r26Var.e;
            if (fefVar == null) {
                hm9.p("r26", "You should call setVideoContent before extractFrame!", null);
                s28Var = m28.a;
            } else {
                Uri uriL = ((ok0) fefVar).l();
                int i4 = maf.a;
                String scheme = uriL.getScheme();
                if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                    lp7 lp7Var = r26Var.h;
                    int iMin = Math.min(lp7Var.i - 1, (int) Math.floor(j / (lp7Var.j / lp7Var.i)));
                    ml0 ml0Var = lp7Var.f;
                    z64 z64Var = new z64(iMin, 3);
                    ml0Var.getClass();
                    s28Var = new s28(new sz9(new ty9(ml0Var, z64Var, 1)), new z64(iMin, 4), 0);
                } else {
                    rfc rfcVar = r26Var.i;
                    g0 g0Var = rfcVar.h;
                    if (g0Var != null) {
                        g0Var.a();
                        rfcVar.h = null;
                    }
                    s28Var = new k28(new lt1(rfcVar, j, 8));
                }
            }
            a38 a38VarF = s28Var.f(ce.a());
            g28 g28Var = new g28(new qj3(this) { // from class: fkf
                public final /* synthetic */ VideoPlayerSeekBarPreview b;

                {
                    this.b = this;
                }

                @Override // defpackage.qj3
                public final void accept(Object obj) {
                    VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
                    switch (i2) {
                        case 0:
                            int i42 = VideoPlayerSeekBarPreview.E0;
                            videoPlayerSeekBarPreview.getClass();
                            if (System.currentTimeMillis() - videoPlayerSeekBarPreview.B0 > 1000) {
                                videoPlayerSeekBarPreview.c.a(true);
                                break;
                            }
                            break;
                        default:
                            int i5 = VideoPlayerSeekBarPreview.E0;
                            videoPlayerSeekBarPreview.getClass();
                            videoPlayerSeekBarPreview.B0 = System.currentTimeMillis();
                            cqc.b(videoPlayerSeekBarPreview.u0);
                            VideoFramePreview videoFramePreview = videoPlayerSeekBarPreview.c;
                            videoFramePreview.s0.setImageBitmap((Bitmap) obj);
                            videoFramePreview.a(false);
                            break;
                    }
                }
            }, new lt1(this, j, 11), new e5(23, this));
            a38VarF.a(g28Var);
            this.t0 = g28Var;
            this.A0 = j;
        }
        ph4 ph4Var = this.x0;
        VideoFramePreview videoFramePreview = this.c;
        if (ph4Var != null) {
            ph4Var.h();
            this.x0 = null;
            videoFramePreview.setVisibility(0);
            videoFramePreview.setAlpha(1.0f);
        }
        if (videoFramePreview.getVisibility() != 0 && this.w0 == null) {
            videoFramePreview.setAlpha(0.0f);
            ph4 ph4VarI = this.s0.i(videoFramePreview);
            ph4VarI.u(new gkf(this, 0));
            this.w0 = ph4VarI;
        }
        AppCompatTextView appCompatTextView = videoFramePreview.t0;
        String[] strArr = are.b;
        appCompatTextView.setText(tfg.c(j));
        boolean zK = c54.K(this);
        VideoPlayerSeekBar videoPlayerSeekBar = this.b;
        if (zK) {
            fMin = Math.min(-this.C0, Math.max((videoFramePreview.getWidth() - this.D0) - videoPlayerSeekBar.getWidth(), (videoFramePreview.getWidth() / 2.0f) + ((videoPlayerSeekBar.getThumbOffset() + (getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX())) - videoPlayerSeekBar.getWidth())));
        } else {
            fMin = Math.min((videoPlayerSeekBar.getWidth() + this.D0) - videoFramePreview.getWidth(), Math.max(this.C0, (videoPlayerSeekBar.getThumbOffset() + (getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX())) - (videoFramePreview.getWidth() / 2.0f)));
        }
        videoFramePreview.setTranslationX(fMin);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
        if (this.v0 == null) {
            return;
        }
        a();
    }

    public void setSecondaryProgress(long j) {
        this.b.setSecondaryProgress((int) j);
    }

    public void setVideoContent(fef fefVar) {
        int i;
        if (fefVar.equals(this.v0)) {
            return;
        }
        this.v0 = fefVar;
        int width = fefVar.getWidth();
        int height = fefVar.getHeight();
        int i2 = this.y0;
        if (width <= 0 || height <= 0) {
            i = i2;
        } else if (width < height) {
            int[] iArrG = j47.G(i2, i2, width, height);
            i2 = iArrG[0];
            i = iArrG[1];
        } else {
            int i3 = this.z0;
            int[] iArrG2 = j47.G(i3, i3, width, height);
            i2 = iArrG2[0];
            i = iArrG2[1];
        }
        VideoFramePreview videoFramePreview = this.c;
        ViewGroup.LayoutParams layoutParams = videoFramePreview.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i;
        videoFramePreview.setLayoutParams(layoutParams);
        r26 r26Var = this.o;
        r26Var.a(fefVar, i2, i);
        if (!r26Var.b()) {
            videoFramePreview.setPreviewEnabled(false);
            videoFramePreview.a(false);
            return;
        }
        videoFramePreview.setPreviewEnabled(true);
        if (r26Var.e == null) {
            hm9.p("r26", "You should call setVideoContent before prepare!", null);
            return;
        }
        if (r26Var.b()) {
            Uri uriL = ((ok0) r26Var.e).l();
            int i4 = maf.a;
            String scheme = uriL.getScheme();
            if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
                rfc rfcVar = r26Var.i;
                fef fefVar2 = rfcVar.e;
                if (fefVar2 == null) {
                    hm9.p("rfc", "You should call setVideoContent before prepare!", null);
                    return;
                }
                uy uyVar = ((ok0) fefVar2).f;
                if (uyVar == null) {
                    hm9.p("rfc", "Video collage is null", null);
                    return;
                } else {
                    rfcVar.g = rfcVar.f.f(xv6.d(Uri.parse((String) uyVar.Y)).a(), null);
                    return;
                }
            }
            lp7 lp7Var = r26Var.h;
            if (lp7Var.e == null) {
                hm9.p("lp7", "You should call setVideoContent before prepare!", null);
                return;
            }
            hb3 hb3Var = new hb3(2, new z16(11, lp7Var));
            hle hleVar = lp7Var.a;
            hleVar.getClass();
            jle jleVar = (jle) hleVar;
            r0a r0aVarN = hb3Var.r(jleVar.a()).n(jleVar.b());
            ml0 ml0Var = lp7Var.f;
            Objects.requireNonNull(ml0Var);
            sd7 sd7Var = new sd7(new z16(12, ml0Var), new kp7(0), ft.d);
            r0aVarN.a(sd7Var);
            lp7Var.g = sd7Var;
        }
    }
}
