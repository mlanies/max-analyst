package ru.ok.messages.media.attaches;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.bk4;
import defpackage.e5;
import defpackage.ed3;
import defpackage.fg5;
import defpackage.fm9;
import defpackage.gpc;
import defpackage.khe;
import defpackage.kt3;
import defpackage.la6;
import defpackage.nd7;
import defpackage.qp4;
import defpackage.r20;
import defpackage.sme;
import defpackage.ss8;
import defpackage.ssc;
import defpackage.ti3;
import defpackage.ts8;
import defpackage.tu0;
import defpackage.vl;
import defpackage.wg9;
import defpackage.wnc;
import defpackage.woc;
import defpackage.xg9;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.zmf;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.ok.messages.media.attaches.FileAttachView;

/* loaded from: classes2.dex */
public class FileAttachView extends ConstraintLayout implements wg9 {
    public static final Typeface X0 = Typeface.create("sans-serif", 0);
    public static final Typeface Y0 = Typeface.create("sans-serif", 1);
    public final ed3 G0;
    public final bk4 H0;
    public MessageAttachmentsLayout I0;
    public final ViewStub J0;
    public final ViewStub K0;
    public final AppCompatTextView L0;
    public final AppCompatTextView M0;
    public final AppCompatTextView N0;
    public final AppCompatImageView O0;
    public final AppCompatImageView P0;
    public final DraweeViewWithSensitiveWarningIcon Q0;
    public final SimpleDraweeView R0;
    public final AppCompatTextView S0;
    public final AppCompatImageView T0;
    public xg9 U0;
    public final sme V0;
    public final Barrier W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i = 1;
        final int i2 = 0;
        this.G0 = vl.b();
        getContext();
        this.H0 = bk4.b();
        ((y8a) this.G0).d();
        ((y8a) this.G0).n().getClass();
        Context context2 = getContext();
        khe kheVar = sme.a0;
        this.V0 = fm9.R(context2);
        ((y8a) this.G0).p().getClass();
        ViewStub viewStub = new ViewStub(getContext());
        this.J0 = viewStub;
        viewStub.setId(xxb.view_file_attach__attachments);
        this.J0.setInflatedId(xxb.view_file_attach__attachments);
        this.J0.setLayoutResource(yyb.ll_view_file_attach__message_attachments_layout_view);
        ti3 ti3Var = new ti3(-2, -2);
        ti3Var.i = 0;
        ti3Var.t = 0;
        ti3Var.v = 0;
        int i3 = this.H0.i;
        ((ViewGroup.MarginLayoutParams) ti3Var).rightMargin = i3;
        ((ViewGroup.MarginLayoutParams) ti3Var).leftMargin = i3;
        ti3Var.W = true;
        addView(this.J0, ti3Var);
        this.K0 = new ViewStub(getContext());
        ti3 ti3Var2 = new ti3(-2, -2);
        this.K0.setId(xxb.view_file_attach__sticker);
        this.K0.setInflatedId(xxb.view_file_attach__sticker);
        this.K0.setLayoutResource(yyb.ll_view_file_attach__sticker_view);
        ti3Var2.i = 0;
        ti3Var2.t = 0;
        ti3Var2.v = 0;
        addView(this.K0, ti3Var2);
        Barrier barrier = new Barrier(getContext());
        this.W0 = barrier;
        barrier.setId(xxb.view_file_attach__big_preview_barrier);
        this.W0.setType(3);
        this.W0.setReferencedIds(new int[]{xxb.view_file_attach__attachments, xxb.view_file_attach__sticker});
        addView(this.W0, new ti3(-2, -2));
        int i4 = this.H0.u;
        ti3 ti3Var3 = new ti3(i4, i4);
        ti3Var3.j = xxb.view_file_attach__big_preview_barrier;
        ti3Var3.l = 0;
        ti3Var3.t = 0;
        ti3Var3.setMarginStart(this.H0.i);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.R0 = simpleDraweeView;
        simpleDraweeView.setId(xxb.view_file_attach__iv_bg);
        la6 la6Var = (la6) this.R0.getHierarchy();
        float f = this.H0.j;
        wnc wncVar = new wnc();
        float[] fArr = new float[8];
        wncVar.c = fArr;
        Arrays.fill(fArr, f);
        la6Var.n(wncVar);
        this.R0.setClickable(false);
        addView(this.R0, ti3Var3);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.S0 = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.S0.setTypeface(Y0);
        this.S0.setTextSize(0, this.H0.H);
        this.S0.setTextColor(this.V0.s);
        AppCompatTextView appCompatTextView2 = this.S0;
        int i5 = this.H0.b;
        appCompatTextView2.setPadding(i5, i5, i5, i5);
        this.S0.setMaxLines(1);
        AppCompatTextView appCompatTextView3 = this.S0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        appCompatTextView3.setEllipsize(truncateAt);
        this.S0.setAllCaps(true);
        ti3 ti3Var4 = new ti3(0, 0);
        int i6 = xxb.view_file_attach__iv_bg;
        ti3Var4.i = i6;
        ti3Var4.t = i6;
        ti3Var4.v = i6;
        ti3Var4.l = i6;
        addView(this.S0, ti3Var4);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        this.T0 = appCompatImageView;
        appCompatImageView.setImageDrawable(kt3.b(getContext(), gpc.g0));
        ti3 ti3Var5 = new ti3(-2, -2);
        int i7 = xxb.view_file_attach__iv_bg;
        ti3Var5.i = i7;
        ti3Var5.t = i7;
        ti3Var5.v = i7;
        ti3Var5.l = i7;
        addView(this.T0, ti3Var5);
        DraweeViewWithSensitiveWarningIcon draweeViewWithSensitiveWarningIcon = new DraweeViewWithSensitiveWarningIcon(getContext(), null, 6);
        this.Q0 = draweeViewWithSensitiveWarningIcon;
        ((la6) draweeViewWithSensitiveWarningIcon.getHierarchy()).h(ssc.l);
        la6 la6Var2 = (la6) this.Q0.getHierarchy();
        float f2 = this.H0.f;
        wnc wncVar2 = new wnc();
        float[] fArr2 = new float[8];
        wncVar2.c = fArr2;
        Arrays.fill(fArr2, f2);
        la6Var2.n(wncVar2);
        this.Q0.setClickable(false);
        ti3 ti3Var6 = new ti3(0, 0);
        int i8 = xxb.view_file_attach__iv_bg;
        ti3Var6.i = i8;
        ti3Var6.t = i8;
        ti3Var6.v = i8;
        ti3Var6.l = i8;
        addView(this.Q0, ti3Var6);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext(), null);
        this.P0 = appCompatImageView2;
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER);
        ti3 ti3Var7 = new ti3(-2, -2);
        int i9 = xxb.view_file_attach__iv_bg;
        ti3Var7.i = i9;
        ti3Var7.t = i9;
        ti3Var7.v = i9;
        ti3Var7.l = i9;
        tu0.K(this.P0, 800L, new View.OnClickListener(this) { // from class: eg5
            public final /* synthetic */ FileAttachView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileAttachView fileAttachView = this.b;
                switch (i2) {
                    case 0:
                        FileAttachView.w(fileAttachView);
                        break;
                    default:
                        Typeface typeface = FileAttachView.X0;
                        fileAttachView.getClass();
                        break;
                }
            }
        });
        addView(this.P0, ti3Var7);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), null);
        this.L0 = appCompatTextView4;
        appCompatTextView4.setId(xxb.view_file_attach__tv_title);
        AppCompatTextView appCompatTextView5 = this.L0;
        int i10 = this.H0.i;
        WeakHashMap weakHashMap = zmf.a;
        appCompatTextView5.setPaddingRelative(i10, 0, i10, 0);
        AppCompatTextView appCompatTextView6 = this.L0;
        Typeface typeface = X0;
        appCompatTextView6.setTypeface(typeface);
        this.L0.setSingleLine();
        this.L0.setTextSize(0, this.H0.I);
        this.L0.setEllipsize(truncateAt);
        this.L0.setTextColor(this.V0.F);
        this.L0.setIncludeFontPadding(false);
        ti3 ti3Var8 = new ti3(0, -2);
        int i11 = xxb.view_file_attach__iv_bg;
        ti3Var8.i = i11;
        ti3Var8.s = i11;
        ti3Var8.u = xxb.view_file_attach__btn_load;
        ti3Var8.k = xxb.view_file_attach__tv_subtitle;
        ti3Var8.L = 1;
        ti3Var8.K = 2;
        ti3Var8.E = 0.0f;
        ti3Var8.x = this.H0.i;
        ((ViewGroup.MarginLayoutParams) ti3Var8).topMargin = 0;
        addView(this.L0, ti3Var8);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(getContext(), null);
        this.M0 = appCompatTextView7;
        appCompatTextView7.setId(xxb.view_file_attach__tv_subtitle);
        AppCompatTextView appCompatTextView8 = this.M0;
        int i12 = this.H0.i;
        appCompatTextView8.setPaddingRelative(i12, 0, i12, 0);
        this.M0.setTypeface(typeface);
        this.M0.setSingleLine();
        this.M0.setTextSize(0, this.H0.I);
        AppCompatTextView appCompatTextView9 = this.M0;
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        appCompatTextView9.setEllipsize(truncateAt2);
        this.M0.setTextColor(this.V0.v);
        this.M0.setIncludeFontPadding(false);
        ti3 ti3Var9 = new ti3(0, -2);
        ti3Var9.j = xxb.view_file_attach__tv_title;
        ti3Var9.s = xxb.view_file_attach__iv_bg;
        ti3Var9.u = xxb.view_file_attach__btn_load;
        ti3Var9.k = xxb.view_file_attach__tv_duration;
        ti3Var9.L = 1;
        ti3Var9.E = 0.0f;
        addView(this.M0, ti3Var9);
        AppCompatTextView appCompatTextView10 = new AppCompatTextView(getContext(), null);
        this.N0 = appCompatTextView10;
        appCompatTextView10.setId(xxb.view_file_attach__tv_duration);
        AppCompatTextView appCompatTextView11 = this.N0;
        int i13 = this.H0.i;
        appCompatTextView11.setPaddingRelative(i13, 0, i13, 0);
        this.N0.setTypeface(typeface);
        this.N0.setSingleLine();
        this.N0.setTextSize(0, this.H0.H);
        this.N0.setEllipsize(truncateAt2);
        this.N0.setTextColor(this.V0.v);
        this.N0.setVisibility(8);
        ti3 ti3Var10 = new ti3(0, -2);
        ti3Var10.j = xxb.view_file_attach__tv_subtitle;
        int i14 = xxb.view_file_attach__iv_bg;
        ti3Var10.s = i14;
        ti3Var10.u = xxb.view_file_attach__btn_load;
        ti3Var10.l = i14;
        ti3Var10.L = 1;
        ti3Var10.E = 0.0f;
        addView(this.N0, ti3Var10);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(getContext(), null);
        this.O0 = appCompatImageView3;
        appCompatImageView3.setId(xxb.view_file_attach__btn_load);
        this.O0.setScaleType(ImageView.ScaleType.FIT_XY);
        this.O0.setImageTintList(ColorStateList.valueOf(qp4.u0.j(this).a().d(true).b.g));
        int i15 = this.H0.s;
        ti3 ti3Var11 = new ti3(i15, i15);
        ti3Var11.j = xxb.view_file_attach__big_preview_barrier;
        ti3Var11.v = 0;
        ti3Var11.setMarginEnd(this.H0.f);
        tu0.K(this.O0, 800L, new View.OnClickListener(this) { // from class: eg5
            public final /* synthetic */ FileAttachView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileAttachView fileAttachView = this.b;
                switch (i) {
                    case 0:
                        FileAttachView.w(fileAttachView);
                        break;
                    default:
                        Typeface typeface2 = FileAttachView.X0;
                        fileAttachView.getClass();
                        break;
                }
            }
        });
        addView(this.O0, ti3Var11);
        nd7.h(this, new e5(7, this));
    }

    private xg9 getMusicAttachViewController() {
        if (this.U0 == null) {
            this.U0 = new xg9(this);
        }
        return this.U0;
    }

    private String getSubtitleForDownload() {
        throw null;
    }

    private String getSubtitleForUpload() {
        throw null;
    }

    public static void w(FileAttachView fileAttachView) {
        if (fileAttachView.U0 == null) {
            throw null;
        }
        fileAttachView.getMusicAttachViewController().getClass();
    }

    @Override // defpackage.wg9
    public final void g() {
        r20 r20Var = new r20(getContext());
        r20Var.l.setColor(0);
        r20Var.c = this.H0.v;
        r20Var.d = true;
        throw null;
    }

    public ts8 getMessageAttachmentsView() {
        if (this.I0 == null) {
            this.I0 = (MessageAttachmentsLayout) this.J0.inflate();
        }
        return this.I0.getView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.U0 != null) {
            xg9 musicAttachViewController = getMusicAttachViewController();
            getContext();
            musicAttachViewController.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U0 != null) {
            getMusicAttachViewController().g = true;
        }
    }

    public void setArtistName(CharSequence charSequence) {
        this.M0.setVisibility(0);
        this.M0.setText(charSequence);
    }

    public void setDurationText(String str) {
        this.N0.setText(str);
    }

    public void setListener(fg5 fg5Var) {
        xg9 xg9Var = this.U0;
        if (xg9Var != null) {
            xg9Var.getClass();
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
    }

    public void setPipRequestListener(ss8 ss8Var) {
        getMessageAttachmentsView().setPipRequestListener(ss8Var);
    }

    public void setPlayButtonPauseSelector(boolean z) {
        getContext();
        int i = woc.a;
        throw null;
    }

    public void setPlayButtonPlaySelector(boolean z) {
        getContext();
        int i = woc.a;
        throw null;
    }

    public void setPlayButtonPreview(String str) {
    }

    public void setTrackName(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }
}
