package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import defpackage.coa;
import defpackage.dh8;
import defpackage.dvb;
import defpackage.dy7;
import defpackage.eh8;
import defpackage.h7b;
import defpackage.iyb;
import defpackage.lh8;
import defpackage.mf8;
import defpackage.myb;
import defpackage.n1c;
import defpackage.q57;
import defpackage.qtb;
import defpackage.s63;
import defpackage.sf8;
import defpackage.syb;
import defpackage.tc;
import defpackage.tf8;
import defpackage.uf8;
import defpackage.vf8;
import defpackage.vr0;
import defpackage.vsb;
import defpackage.wf8;
import defpackage.wg8;
import defpackage.xf8;
import defpackage.yf8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d extends tc {
    public static final int z1 = (int) TimeUnit.SECONDS.toMillis(30);
    public MediaRouteExpandCollapseButton A0;
    public FrameLayout B0;
    public LinearLayout C0;
    public FrameLayout D0;
    public ImageView E0;
    public TextView F0;
    public TextView G0;
    public TextView H0;
    public final boolean I0;
    public final boolean J0;
    public LinearLayout K0;
    public RelativeLayout L0;
    public LinearLayout M0;
    public View N0;
    public OverlayListView O0;
    public c P0;
    public ArrayList Q0;
    public HashSet R0;
    public HashSet S0;
    public HashSet T0;
    public SeekBar U0;
    public vr0 V0;
    public dh8 W0;
    public int X0;
    public int Y0;
    public final eh8 Z;
    public int Z0;
    public final int a1;
    public HashMap b1;
    public MediaControllerCompat c1;
    public final yf8 d1;
    public PlaybackStateCompat e1;
    public MediaDescriptionCompat f1;
    public xf8 g1;
    public Bitmap h1;
    public Uri i1;
    public boolean j1;
    public Bitmap k1;
    public int l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public int r1;
    public final mf8 s0;
    public int s1;
    public final dh8 t0;
    public int t1;
    public final Context u0;
    public Interpolator u1;
    public boolean v0;
    public final Interpolator v1;
    public int w0;
    public final Interpolator w1;
    public Button x0;
    public final AccessibilityManager x1;
    public Button y0;
    public final q57 y1;
    public ImageButton z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        boolean z = true;
        ContextThemeWrapper contextThemeWrapperA = lh8.a(context, true);
        super(contextThemeWrapperA, lh8.b(contextThemeWrapperA));
        this.I0 = true;
        this.y1 = new q57(9, this);
        Context context2 = getContext();
        this.u0 = context2;
        this.d1 = new yf8(this);
        this.Z = eh8.d(context2);
        if (eh8.d == null) {
            z = false;
        } else {
            eh8.c().getClass();
        }
        this.J0 = z;
        this.s0 = new mf8(this, 2);
        eh8.b();
        this.t0 = eh8.c().f();
        p();
        this.a1 = context2.getResources().getDimensionPixelSize(qtb.mr_controller_volume_group_list_padding_top);
        this.x1 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.v1 = AnimationUtils.loadInterpolator(contextThemeWrapperA, myb.mr_linear_out_slow_in);
        this.w1 = AnimationUtils.loadInterpolator(contextThemeWrapperA, myb.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void o(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void h(View view, int i) {
        vf8 vf8Var = new vf8(view, view.getLayoutParams().height, i, 0);
        vf8Var.setDuration(this.r1);
        vf8Var.setInterpolator(this.u1);
        view.startAnimation(vf8Var);
    }

    public final boolean i() {
        return (this.f1 == null && this.e1 == null) ? false : true;
    }

    public final void j(boolean z) {
        HashSet hashSet;
        int firstVisiblePosition = this.O0.getFirstVisiblePosition();
        for (int i = 0; i < this.O0.getChildCount(); i++) {
            View childAt = this.O0.getChildAt(i);
            dh8 dh8Var = (dh8) this.P0.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.R0) == null || !hashSet.contains(dh8Var)) {
                ((LinearLayout) childAt.findViewById(dvb.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.O0.a.iterator();
        while (it.hasNext()) {
            coa coaVar = (coa) it.next();
            coaVar.k = true;
            coaVar.l = true;
            h7b h7bVar = coaVar.m;
            if (h7bVar != null) {
                d dVar = (d) h7bVar.c;
                dVar.T0.remove((dh8) h7bVar.b);
                dVar.P0.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        k(false);
    }

    public final void k(boolean z) {
        this.R0 = null;
        this.S0 = null;
        this.p1 = false;
        if (this.q1) {
            this.q1 = false;
            t(z);
        }
        this.O0.setEnabled(true);
    }

    public final int l(int i, int i2) {
        float f;
        float f2;
        if (i >= i2) {
            f = this.w0 * i2;
            f2 = i;
        } else {
            f = this.w0 * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public final int m(boolean z) {
        if (!z && this.M0.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.K0.getPaddingBottom() + this.K0.getPaddingTop();
        if (z) {
            paddingBottom += this.L0.getMeasuredHeight();
        }
        int measuredHeight = this.M0.getVisibility() == 0 ? this.M0.getMeasuredHeight() + paddingBottom : paddingBottom;
        return (z && this.M0.getVisibility() == 0) ? this.N0.getMeasuredHeight() + measuredHeight : measuredHeight;
    }

    public final boolean n() {
        dh8 dh8Var = this.t0;
        return dh8Var.e() && Collections.unmodifiableList(dh8Var.u).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z.a(wg8.c, this.s0, 2);
        boolean z = eh8.c;
        p();
    }

    @Override // defpackage.tc, defpackage.fn, defpackage.ac3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(syb.mr_controller_material_dialog_b);
        findViewById(R.id.button3).setVisibility(8);
        wf8 wf8Var = new wf8(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(dvb.mr_expandable_area);
        this.B0 = frameLayout;
        frameLayout.setOnClickListener(new sf8(this, 0));
        LinearLayout linearLayout = (LinearLayout) findViewById(dvb.mr_dialog_area);
        this.C0 = linearLayout;
        linearLayout.setOnClickListener(new tf8());
        int i = vsb.colorPrimary;
        Context context = this.u0;
        int iG = lh8.g(context, i);
        if (s63.d(iG, lh8.g(context, R.attr.colorBackground)) < 3.0d) {
            iG = lh8.g(context, vsb.colorAccent);
        }
        Button button = (Button) findViewById(R.id.button2);
        this.x0 = button;
        button.setText(n1c.mr_controller_disconnect);
        this.x0.setTextColor(iG);
        this.x0.setOnClickListener(wf8Var);
        Button button2 = (Button) findViewById(R.id.button1);
        this.y0 = button2;
        button2.setText(n1c.mr_controller_stop_casting);
        this.y0.setTextColor(iG);
        this.y0.setOnClickListener(wf8Var);
        this.H0 = (TextView) findViewById(dvb.mr_name);
        ((ImageButton) findViewById(dvb.mr_close)).setOnClickListener(wf8Var);
        this.D0 = (FrameLayout) findViewById(dvb.mr_default_control);
        sf8 sf8Var = new sf8(this, 1);
        ImageView imageView = (ImageView) findViewById(dvb.mr_art);
        this.E0 = imageView;
        imageView.setOnClickListener(sf8Var);
        findViewById(dvb.mr_control_title_container).setOnClickListener(sf8Var);
        this.K0 = (LinearLayout) findViewById(dvb.mr_media_main_control);
        this.N0 = findViewById(dvb.mr_control_divider);
        this.L0 = (RelativeLayout) findViewById(dvb.mr_playback_control);
        this.F0 = (TextView) findViewById(dvb.mr_control_title);
        this.G0 = (TextView) findViewById(dvb.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(dvb.mr_control_playback_ctrl);
        this.z0 = imageButton;
        imageButton.setOnClickListener(wf8Var);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(dvb.mr_volume_control);
        this.M0 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(dvb.mr_volume_slider);
        this.U0 = seekBar;
        dh8 dh8Var = this.t0;
        seekBar.setTag(dh8Var);
        vr0 vr0Var = new vr0(this);
        this.V0 = vr0Var;
        this.U0.setOnSeekBarChangeListener(vr0Var);
        this.O0 = (OverlayListView) findViewById(dvb.mr_volume_group_list);
        this.Q0 = new ArrayList();
        c cVar = new c(this, this.O0.getContext(), this.Q0);
        this.P0 = cVar;
        this.O0.setAdapter((ListAdapter) cVar);
        this.T0 = new HashSet();
        LinearLayout linearLayout3 = this.K0;
        OverlayListView overlayListView = this.O0;
        boolean zN = n();
        int iG2 = lh8.g(context, vsb.colorPrimary);
        int iG3 = lh8.g(context, vsb.colorPrimaryDark);
        if (zN && lh8.c(context) == -570425344) {
            iG3 = iG2;
            iG2 = -1;
        }
        linearLayout3.setBackgroundColor(iG2);
        overlayListView.setBackgroundColor(iG3);
        linearLayout3.setTag(Integer.valueOf(iG2));
        overlayListView.setTag(Integer.valueOf(iG3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.U0;
        LinearLayout linearLayout4 = this.K0;
        int iC = lh8.c(context);
        if (Color.alpha(iC) != 255) {
            iC = s63.g(iC, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(iC, iC);
        HashMap map = new HashMap();
        this.b1 = map;
        map.put(dh8Var, this.U0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(dvb.mr_group_expand_collapse);
        this.A0 = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.w0 = new sf8(this, 2);
        this.u1 = this.o1 ? this.v1 : this.w1;
        this.r1 = context.getResources().getInteger(iyb.mr_controller_volume_group_list_animation_duration_ms);
        this.s1 = context.getResources().getInteger(iyb.mr_controller_volume_group_list_fade_in_duration_ms);
        this.t1 = context.getResources().getInteger(iyb.mr_controller_volume_group_list_fade_out_duration_ms);
        this.v0 = true;
        s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.Z.f(this.s0);
        p();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.tc, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.J0 || !this.o1) {
            this.t0.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // defpackage.tc, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void p() {
        MediaControllerCompat mediaControllerCompat = this.c1;
        yf8 yf8Var = this.d1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(yf8Var);
            this.c1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r13) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.q(boolean):void");
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f1;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f1;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        xf8 xf8Var = this.g1;
        Bitmap bitmap = xf8Var == null ? this.h1 : xf8Var.a;
        Uri uri = xf8Var == null ? this.i1 : xf8Var.b;
        if (bitmap == iconBitmap) {
            if (bitmap != null) {
                return;
            }
            if (uri != null && uri.equals(iconUri)) {
                return;
            }
            if (uri == null && iconUri == null) {
                return;
            }
        }
        if (!n() || this.J0) {
            xf8 xf8Var2 = this.g1;
            if (xf8Var2 != null) {
                xf8Var2.cancel(true);
            }
            xf8 xf8Var3 = new xf8(this);
            this.g1 = xf8Var3;
            xf8Var3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.u0;
        int iV = dy7.v(context);
        getWindow().setLayout(iV, -2);
        View decorView = getWindow().getDecorView();
        this.w0 = (iV - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.X0 = resources.getDimensionPixelSize(qtb.mr_controller_volume_group_list_item_icon_size);
        this.Y0 = resources.getDimensionPixelSize(qtb.mr_controller_volume_group_list_item_height);
        this.Z0 = resources.getDimensionPixelSize(qtb.mr_controller_volume_group_list_max_height);
        this.h1 = null;
        this.i1 = null;
        r();
        q(false);
    }

    public final void t(boolean z) {
        this.D0.requestLayout();
        this.D0.getViewTreeObserver().addOnGlobalLayoutListener(new uf8(this, z));
    }

    public final void u(boolean z) {
        int i = 0;
        this.N0.setVisibility((this.M0.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.K0;
        if (this.M0.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
