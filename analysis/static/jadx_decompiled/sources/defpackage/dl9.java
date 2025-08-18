package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import ru.ok.messages.media.mediabar.NumericCheckButton;

/* loaded from: classes2.dex */
public final class dl9 extends v2 implements nse {
    public ImageView A0;
    public View B0;
    public final bk4 X;
    public ViewGroup Y;
    public FrameLayout Z;
    public final tg o;
    public AppCompatTextView s0;
    public ProgressBar t0;
    public AppCompatImageButton u0;
    public AppCompatImageButton v0;
    public ImageView w0;
    public ImageView x0;
    public NumericCheckButton y0;
    public FrameLayout z0;

    public dl9(Context context, ViewStub viewStub, tg tgVar) throws Resources.NotFoundException {
        super(context);
        this.o = tgVar;
        this.X = bk4.b();
        viewStub.setLayoutResource(yyb.cl_local_media_toolbox);
        this.c = viewStub.inflate();
        m();
    }

    public static void D(ImageView imageView, boolean z, sme smeVar) {
        if (z) {
            imageView.setBackground(hm9.S(Integer.valueOf(smeVar.k), null, null));
            imageView.setColorFilter(smeVar.l);
        } else {
            imageView.setBackground(smeVar.a());
            imageView.setColorFilter(smeVar.w);
        }
    }

    public final void A(pq7 pq7Var) {
        int i = 1;
        B(this.s0, pq7Var.b);
        B(this.t0, pq7Var.c);
        FrameLayout frameLayout = this.Z;
        float f = pq7Var.a ? 1.0f : 0.35f;
        boolean z = pq7Var.X;
        C(frameLayout, z, f);
        FrameLayout frameLayout2 = this.z0;
        boolean z2 = pq7Var.o;
        B(frameLayout2, z2);
        B(this.A0, !z2);
        B(this.u0, z);
        boolean z3 = z && pq7Var.z0;
        B(this.v0, z3);
        if (z3) {
            this.v0.setSelected(pq7Var.y0);
        }
        B(this.w0, pq7Var.Z);
        B(this.x0, pq7Var.s0);
        this.s0.setText(pq7Var.t0.a);
        if (pq7Var.u0) {
            this.y0.setEnabled(true);
            this.y0.setNumber(pq7Var.v0);
            tu0.K(this.z0, 300L, new yk9(this, i));
        } else {
            tu0.K(this.z0, 300L, new y20(5));
            this.y0.setNumber(0);
            this.y0.setEnabled(false);
        }
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R((Context) this.b);
        D(this.w0, pq7Var.w0, smeVarR);
        D(this.x0, pq7Var.x0, smeVarR);
    }

    public final void B(View view, boolean z) {
        C(view, z, 1.0f);
    }

    public final void C(View view, boolean z, float f) {
        vof vofVarA = zmf.a(view);
        zk9 zk9Var = new zk9(0, view, z);
        WeakReference weakReference = vofVarA.a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().withStartAction(zk9Var);
        }
        if (!z) {
            f = 0.0f;
        }
        vofVarA.a(f);
        zk9 zk9Var2 = new zk9(1, view, z);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().withEndAction(zk9Var2);
        }
        vofVarA.c(this.o.a.b());
        View view4 = (View) weakReference.get();
        if (view4 != null) {
            view4.animate().start();
        }
    }

    @Override // defpackage.nse
    public final void c() {
        if (((View) this.c) == null) {
            return;
        }
        khe kheVar = sme.a0;
        Context context = (Context) this.b;
        sme smeVarR = fm9.R(context);
        this.Y.setBackgroundColor(smeVarR.m);
        this.B0.setBackgroundColor(smeVarR.K);
        AppCompatImageButton appCompatImageButton = this.u0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i = smeVarR.w;
        appCompatImageButton.setColorFilter(i, mode);
        this.u0.setBackground(smeVarR.a());
        this.v0.setColorFilter(i, mode);
        this.v0.setBackground(smeVarR.a());
        this.s0.setTextColor(i);
        Integer numValueOf = Integer.valueOf(i);
        bk4 bk4Var = this.X;
        this.Z.setBackground(hm9.b0(0, numValueOf, Integer.valueOf(bk4Var.b), bk4Var.d));
        aq4.g(this.t0.getIndeterminateDrawable(), i);
        aq4.g(this.w0.getDrawable(), i);
        aq4.g(this.x0.getDrawable(), i);
        this.w0.setBackground(smeVarR.a());
        this.x0.setBackground(smeVarR.a());
        aq4.g(this.A0.getDrawable(), smeVarR.k);
        this.A0.setBackground(smeVarR.a());
        Drawable drawableMutate = kt3.b(context, gpc.o).mutate();
        aq4.g(drawableMutate, i);
        this.y0.setUncheckedBackground(drawableMutate);
    }

    @Override // defpackage.v2
    public final void m() throws Resources.NotFoundException {
        this.Y = (ViewGroup) ((View) this.c).findViewById(xxb.local_media_toolbox__content);
        FrameLayout frameLayout = (FrameLayout) ((View) this.c).findViewById(xxb.local_media_toolbox__quality_container);
        this.Z = frameLayout;
        final int i = 0;
        frameLayout.setOnClickListener(new yk9(this, i));
        this.s0 = (AppCompatTextView) ((View) this.c).findViewById(xxb.local_media_toolbox__quality_text);
        this.t0 = (ProgressBar) ((View) this.c).findViewById(xxb.local_media_toolbox__quality_progress);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(xxb.local_media_toolbox__trim_btn);
        this.u0 = appCompatImageButton;
        nd7.h(appCompatImageButton, new f6(this) { // from class: bl9
            public final /* synthetic */ dl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.n(new al9(2));
                        break;
                    case 1:
                        this.b.n(new al9(4));
                        break;
                    case 2:
                        this.b.n(new al9(0));
                        break;
                    case 3:
                        this.b.n(new al9(3));
                        break;
                    default:
                        this.b.n(new fj0(29));
                        break;
                }
            }
        });
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(xxb.local_media_toolbox__mute_btn);
        this.v0 = appCompatImageButton2;
        Drawable drawable = ((View) this.c).getResources().getDrawable(gpc.l0);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(gpc.j0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        appCompatImageButton2.setImageDrawable(stateListDrawable);
        final int i2 = 1;
        nd7.h(this.v0, new f6(this) { // from class: bl9
            public final /* synthetic */ dl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.n(new al9(2));
                        break;
                    case 1:
                        this.b.n(new al9(4));
                        break;
                    case 2:
                        this.b.n(new al9(0));
                        break;
                    case 3:
                        this.b.n(new al9(3));
                        break;
                    default:
                        this.b.n(new fj0(29));
                        break;
                }
            }
        });
        this.w0 = (ImageView) ((View) this.c).findViewById(xxb.local_media_toolbox__photo_crop_btn);
        this.x0 = (ImageView) ((View) this.c).findViewById(xxb.local_media_toolbox__photo_edit_btn);
        final int i3 = 2;
        nd7.h(this.w0, new f6(this) { // from class: bl9
            public final /* synthetic */ dl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.n(new al9(2));
                        break;
                    case 1:
                        this.b.n(new al9(4));
                        break;
                    case 2:
                        this.b.n(new al9(0));
                        break;
                    case 3:
                        this.b.n(new al9(3));
                        break;
                    default:
                        this.b.n(new fj0(29));
                        break;
                }
            }
        });
        final int i4 = 3;
        nd7.h(this.x0, new f6(this) { // from class: bl9
            public final /* synthetic */ dl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.n(new al9(2));
                        break;
                    case 1:
                        this.b.n(new al9(4));
                        break;
                    case 2:
                        this.b.n(new al9(0));
                        break;
                    case 3:
                        this.b.n(new al9(3));
                        break;
                    default:
                        this.b.n(new fj0(29));
                        break;
                }
            }
        });
        this.y0 = (NumericCheckButton) ((View) this.c).findViewById(xxb.local_media_toolbox__btn_select);
        this.z0 = (FrameLayout) ((View) this.c).findViewById(xxb.local_media_toolbox__fl_select);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.local_media_toolbox__btn_apply);
        this.A0 = imageView;
        final int i5 = 4;
        nd7.h(imageView, new f6(this) { // from class: bl9
            public final /* synthetic */ dl9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i5) {
                    case 0:
                        this.b.n(new al9(2));
                        break;
                    case 1:
                        this.b.n(new al9(4));
                        break;
                    case 2:
                        this.b.n(new al9(0));
                        break;
                    case 3:
                        this.b.n(new al9(3));
                        break;
                    default:
                        this.b.n(new fj0(29));
                        break;
                }
            }
        });
        this.B0 = ((View) this.c).findViewById(xxb.local_media_toolbox__separator_bottom);
        c();
        ViewGroup viewGroup = this.Y;
        yt8 yt8Var = new yt8(9, this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(viewGroup, yt8Var);
        mmf.c(this.Y);
    }
}
